package com.lt.simpleWebRaimondas.controler.dto;

import com.lt.simpleWebRaimondas.domain.AnswerType;

import java.util.List;

public class QuestionDTO {
    private String text;
    private AnswerType answerType;
    private List<AnswerDTO> answerDTO;

    private AnswerType[] possibleAnswerTypes;


    public AnswerType[] getPossibleAnswerTypes() {
        return possibleAnswerTypes;
    }




    public AnswerType[] getPosibleAnswerTypes() {
        return possibleAnswerTypes;
    }


    public void setPossibleAnswerTypes(AnswerType[] possibleAnswerTypes) {
        this.possibleAnswerTypes = possibleAnswerTypes;
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

    public static final class QuestioDTOBuilder {
        private String text;
        private AnswerType answerType;
        AnswerType[] possibleAnswerTypes;


        public QuestioDTOBuilder() {
        }


        public static QuestioDTOBuilder questioDTOBuilder() {
            return new QuestioDTOBuilder();
        }


        public QuestioDTOBuilder withText(String text) {
            this.text = text;
            return this;
        }


        public QuestioDTOBuilder withAnswerType(AnswerType answerType) {
            this.answerType = answerType;
            return this;
        }


        public QuestioDTOBuilder withPossibleAnswerTypes(AnswerType[] possibleAnswerTypes) {
            this.possibleAnswerTypes = possibleAnswerTypes;
            return this;
        }


        public QuestionDTO build() {
            QuestionDTO questionDTO = new QuestionDTO();
            questionDTO.setText(text);
            questionDTO.setAnswerType(answerType);
            questionDTO.setPossibleAnswerTypes(possibleAnswerTypes);
            return questionDTO;
        }
    }
}




