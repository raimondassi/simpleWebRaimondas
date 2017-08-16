package com.lt.simpleWebRaimondas.controler.dto;

import com.lt.simpleWebRaimondas.domain.Answer;

public class AnswerDTO {
    private String answer;


    public AnswerDTO() {

    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "AnswerDTO{" +
                "answer=" + answer + '\'' +
                '}';
    }
}


