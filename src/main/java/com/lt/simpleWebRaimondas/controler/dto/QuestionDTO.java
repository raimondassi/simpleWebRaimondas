package com.lt.simpleWebRaimondas.controler.dto;

import com.lt.simpleWebRaimondas.domain.AnswerType;

import java.util.List;

public class QuestionDTO {
    private String text;
    private AnswerType answerType;
    private List<AnswerDTO> answerDTO;
    private AnswerType[] posibleAnswerTypes;


    public AnswerType[] getPosibleAnswerTypes() {
        return posibleAnswerTypes;
    }


    public void setPosibleAnswerTypes(AnswerType[] posibleAnswerTypes) {
        this.posibleAnswerTypes = posibleAnswerTypes;
    }


    public String getText() {
        return text;
    }


    public List<AnswerDTO> getAnswerDTO() {
        return answerDTO;
    }


    public void setText(String text) {
        this.text = text;
    }


    public void setAnswerType(AnswerType answerType) {
        this.answerType = answerType;
    }


    public void setAnswerDTO(List<AnswerDTO> answerDTO) {
        this.answerDTO = answerDTO;
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
