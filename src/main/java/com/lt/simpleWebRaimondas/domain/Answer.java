package com.lt.simpleWebRaimondas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "answers")
public class Answer {
    @Id
    @Column(name = "ID")
    private Integer id;
    @Column(name = "ANSWER")
    private String answer;
    @Column(name = "QUESTION_ID")
    private int questionId;


    public String getAnswer() {
        return answer;
    }


    public int getId() {
        return id;
    }


    public Answer(String answer, int questionId) {
        this.answer = answer;
        this.questionId = questionId;
    }


    public int getQuestionId() {
        return questionId;
    }
}
