package lt.zvaliauskas.samplespringproject.controller;

import lt.zvaliauskas.samplespringproject.controller.dto.QuizElementDTO;
import lt.zvaliauskas.samplespringproject.domain.Question;
import lt.zvaliauskas.samplespringproject.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class QuestionsController {

    private QuestionService questionService;

    @Autowired
    public QuestionsController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @RequestMapping(value = "/question", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @RequestMapping(value = "/quiz", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<QuizElementDTO> getQuizElements() {
        List<QuizElementDTO> elements = new ArrayList<QuizElementDTO>();

        for(Question question : questionService.getAllQuestions()) {
            elements.add(new QuizElementDTO(question.getText(), new ArrayList<String>()));
        }

        return elements;
    }

}
