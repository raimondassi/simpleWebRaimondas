package com.lt.simpleWebRaimondas.service;

import com.lt.simpleWebRaimondas.domain.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class QuestionService{

    private QuestionRepository questionRepository;
    @Autowired
    public QuestionService (QuestionRepository questionRepository){
        this.questionRepository=questionRepository;
    }

    @Transactional(readOnly=true)
    public List<Question> getAllQuestions(){
        return questionRepository.findAll();
    }



}
