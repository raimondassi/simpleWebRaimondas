package com.lt.simpleWebRaimondas.controler.dto;

import com.lt.simpleWebRaimondas.domain.Answer;

public class AnswerDTO {
    private String answer;
    private int answerId;


    public AnswerDTO(String answer, int answerId) {
        this.answer = answer;
        this.answerId = answerId;
    }


    public String getAnswer() {
        return answer;
    }


    public int getAnswerId() {
        return answerId;
    }
}

