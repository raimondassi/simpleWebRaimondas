package com.lt.simpleWebRaimondas.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "questions")
public class Question implements Serializable {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "question")
    private String question;
    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private AnswerType answerType;


    public String getQuestion() {
        return question;
    }


    public AnswerType getType() {
        return answerType;
    }
}
