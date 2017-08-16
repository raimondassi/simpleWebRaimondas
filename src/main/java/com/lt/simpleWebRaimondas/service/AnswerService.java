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

//susikuriame 2 lentas vartotoja, ir Atsakymu lenta kurioje yra atsakymo id, vartotoja, questionValueId, input (kai
// pasirinktas input tipas), t.y. rankele iraso
//pasiskaityt apie DB OneToMany, OneToOne, ManyToMany, index, ProimaryKey, ForeignKey,
//Html formas, formu tagus
//http post, get
