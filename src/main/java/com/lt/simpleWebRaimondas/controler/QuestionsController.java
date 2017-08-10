package com.lt.simpleWebRaimondas.controler;

import com.lt.simpleWebRaimondas.domain.Question;
import com.lt.simpleWebRaimondas.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;


@RestController
public class QuestionsController {


    private QuestionService questionService;

    @Autowired
    public QuestionsController(QuestionService questionService) {
        this.questionService = questionService;

        @RequestMapping(value = '/question', method = RequestMethod.GET)
        @ResponseStatus(HttpStatus.OK)

        public List<Question> getAllQuestions() {
            return questionService.getAllQuestions();
        }


    }
