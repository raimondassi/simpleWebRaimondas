package com.lt.simpleWebRaimondas.controler;

import com.lt.simpleWebRaimondas.controler.dto.QuestionDTO;
import com.lt.simpleWebRaimondas.controler.dto.QuizElementDTO;
import com.lt.simpleWebRaimondas.controler.dto.UserDTO;
import com.lt.simpleWebRaimondas.domain.Answer;
import com.lt.simpleWebRaimondas.domain.AnswerType;
import com.lt.simpleWebRaimondas.domain.Question;
import com.lt.simpleWebRaimondas.domain.Submission;
import com.lt.simpleWebRaimondas.service.QuestionService;
import com.lt.simpleWebRaimondas.service.SubmissionService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class QuestionControllerJSP {
    private QuestionService questionService;
    private SubmissionService submissionService;


    public QuestionControllerJSP(QuestionService questionService, SubmissionService submissionService) {
        this.questionService = questionService;
        this.submissionService = submissionService;
    }


    @RequestMapping(value = "/jsptest", method = RequestMethod.GET)
    public String welcome(Map<String, Object> model) {
        model.put("message", "Labas VCS");
        return "welcome";
    }


    @RequestMapping(value = "/quizjsp", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView getQuizElements() {
        List<QuizElementDTO> elements = new ArrayList<QuizElementDTO>();
        for (Question question : questionService.getAllQuestions()) {
            List<String> answerText = new ArrayList<String>();
            for (Answer value : question.getAnswers()) {
                answerText.add(value.getAnswer());
            }
            elements.add(new QuizElementDTO(question.getQuestion(), answerText));
        }
        ModelAndView modelAndView = new ModelAndView("quizjsp");
        modelAndView.addObject("elements", elements);
        UserDTO userDTO = new UserDTO();
        userDTO.setName("Vardenis");
        userDTO.setLastname("Pavardenis");
        List<String> possibleGenders = new ArrayList<String>();
        possibleGenders.add("Vyras");
        possibleGenders.add("Morteris");
        possibleGenders.add("Belytis");
        userDTO.setPossibleGenders(possibleGenders);
        modelAndView.addObject("user", userDTO);
        return modelAndView;
    }


    @PostMapping("/submitQuizAnswers")
    public ModelAndView submitQuizAnswers(@ModelAttribute("user") UserDTO user,
                                          BindingResult result, ModelMap model) {
        submissionService.saveSubmissionToDB(new Submission(user.getName(), user.getLastname()));
        return new ModelAndView("youAreWrittenToDB");
    }


    @RequestMapping(value = "/createQuestion", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView createQueetion() {
        ModelAndView modelAndView = new ModelAndView("createQuestion");
       // QuestionDTO questionDTO = new QuestionDTO();

        //questionDTO.setText("");
        AnswerType[] possibleAnswerTypes = AnswerType.values();
        //questionDTO.setPosibleAnswerTypes(possibleAnswerType);
       // modelAndView.addObject("question", questionDTO);
        modelAndView.addObject("question",
                new QuestionDTO.QuestioDTOBuilder()
                .withText("")
                .withPossibleAnswerTypes(possibleAnswerTypes)
                .build());
        return modelAndView;
    }


    @PostMapping("/submitQuestion")
    public ModelAndView submitQuestion(@ModelAttribute("question") QuestionDTO questionDTO,
                                       BindingResult result, ModelMap model) {

        questionService.saveQuestionToDB(new Question(questionDTO.getText(), questionDTO.getAnswerType()));
        return new ModelAndView("yourQuestionIsWrittenToDB");
    }
}
