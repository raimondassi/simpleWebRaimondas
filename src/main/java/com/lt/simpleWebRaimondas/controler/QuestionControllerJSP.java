package com.lt.simpleWebRaimondas.controler;

import com.lt.simpleWebRaimondas.controler.dto.AnswerDTO;
import com.lt.simpleWebRaimondas.controler.dto.QuestionDTO;
import com.lt.simpleWebRaimondas.controler.dto.QuizElementDTO;
import com.lt.simpleWebRaimondas.domain.Answer;
import com.lt.simpleWebRaimondas.domain.Question;
import com.lt.simpleWebRaimondas.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class QuestionControllerJSP {
    private QuestionService questionService;


    public QuestionControllerJSP(QuestionService questionService) {
        this.questionService = questionService;
    }


    @RequestMapping(value = "/jsptest", method = RequestMethod.GET)
    public String welcome(Map<String, Object> model) {
        model.put("message", "Labas VCS");
        return "welcome";
    }
/*

    @RequestMapping(value = "/quizjsp", method = RequestMethod.GET)


    public String quizJSP(Map<String, Object> model) {

        model.put("message", "Labas VCS");
        return "quizJSP";
    }

*/
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
        ModelAndView modelAndView=new ModelAndView("quizjsp");
        modelAndView.addObject( "elements", elements);
        return modelAndView;
    }



/*



    @RequestMapping(value = "/quiz", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<QuizElementDTO> getQuizElements() {
        List<QuizElementDTO> elements = new ArrayList<QuizElementDTO>();
        for (Question question : questionService.getAllQuestions()) {
            List<String> answerText = new ArrayList<String>();
            for (Answer value : question.getAnswers()) {
                answerText.add(value.getAnswer());
            }
            elements.add(new QuizElementDTO(question.getQuestion(), answerText));
        }
        return elements;
    }



    //write question to db
    @RequestMapping(value = "/question", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> createQuestion(@RequestBody QuestionDTO questionDTO) {
        Question question = new Question(questionDTO.getText(), questionDTO.getAnswerType());
        questionService.saveQuestionToDB(question);
        return ResponseEntity.ok(HttpStatus.OK);
    }


    ;


    @RequestMapping(value = "/answers", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> createQuestionWithAnswers(@RequestBody QuestionDTO questionDTO) {
        List<String> answerList = new ArrayList<String>();
        for (AnswerDTO answerDTO : questionDTO.getAnswerDTO()) {
            answerList.add(answerDTO.getAnswer());
        }
        questionService.saveQuestionsAndAnswersToDB(questionDTO.getText(), questionDTO.getAnswerType(), answerList);
        return ResponseEntity.ok(HttpStatus.OK);
    }
    */
}
