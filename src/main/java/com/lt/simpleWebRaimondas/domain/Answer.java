package com.lt.simpleWebRaimondas.domain;

import javax.persistence.*;

@Entity
@Table(name = "answers")
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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


    public Answer() {
    }


    public int getQuestionId() {
        return questionId;
    }
}
