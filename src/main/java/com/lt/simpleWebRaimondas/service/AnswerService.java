package com.lt.simpleWebRaimondas.service;

import com.lt.simpleWebRaimondas.domain.Answer;

import java.util.List;

public class AnswerService {

    private AnswerRepository answerRepository;



    public AnswerService(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
    }


public void createAnswersForQuestions(List<String> answers, int questionId ){
    for (String answerValue:answers){
        Answer answer=new Answer(answerValue, questionId);
        answerRepository.save(answer);
    }
}
}


