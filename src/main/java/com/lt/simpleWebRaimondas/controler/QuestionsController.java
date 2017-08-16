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
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;
//what is Rest or Restfull web services, here we have RestController

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
        for (Question question : questionService.getAllQuestions()) {
            List<AnswerDTO> answerDTO = new ArrayList<AnswerDTO>();
            for (Answer answer : question.getAnswers()) {
                answerDTO.add(new AnswerDTO(answer.getAnswer(), answer.getId()));
            }
            elements.add(new QuizElementDTO((question.getQuestion()), answerDTO));
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

}
