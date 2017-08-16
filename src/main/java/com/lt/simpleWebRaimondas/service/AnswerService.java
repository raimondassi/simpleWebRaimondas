package com.lt.simpleWebRaimondas.service;

import com.lt.simpleWebRaimondas.domain.Answer;

public class AnswerService {

    private QuestionService questionService;
    private Answer answer;

    Answer answerObject=new Answer(answer.getAnswer(), questionService.saveQuestionsAndAnswersToDB());
}

//susikuriame 2 lentas vartotoja, ir Atsakymu lenta kurioje yra atsakymo id, vartotoja, questionValueId, input (kai pasirinktas input tipas), t.y. rankele iraso
//pasiskaityt apie DB OneToMany, OneToOne, ManyToMany, index, ProimaryKey, ForeignKey,
//Html formas, formu tagus
//http post, get
