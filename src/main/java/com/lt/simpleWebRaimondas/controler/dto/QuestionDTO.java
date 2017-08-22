package com.lt.simpleWebRaimondas.controler.dto;

import com.lt.simpleWebRaimondas.domain.Answer;
import com.lt.simpleWebRaimondas.domain.AnswerType;
import com.lt.simpleWebRaimondas.domain.Question;

import java.util.List;

public class QuestionDTO {
    private String text;
    private AnswerType answerType;
    private List<AnswerDTO> answerDTO;


    public String getText() {
        return text;
    }


    public List<AnswerDTO> getAnswerDTO() {
        return answerDTO;
    }


    public AnswerType getAnswerType() {
        return answerType;
    }


    @Override
    public String toString() {
        return "QuestionDTO{" +
                "text='" + text + '\'' +
                ", answerType=" + answerType +
                ", answerDTO=" + answerDTO +
                '}';
    }
    //pasipildyti dar atsakymus galimus
}
