package com.lt.simpleWebRaimondas.domain;

import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "answers")
public class Answer {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "answer")
    private String answer;
    @Column(name = "question_id")
    private int questionId;


    public String getAnswer() {
        return answer;
    }


    public int getQuestionId() {
        return questionId;
    }
}
