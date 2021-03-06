package com.lt.simpleWebRaimondas.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "questions")
public class Question implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "question")
    private String question;
    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private AnswerType type;
    @OneToMany(mappedBy = "questionId")
    private List<Answer> answers;


    public List<Answer> getAnswers() {
        return answers;
    }


    public String getQuestion() {
        return question;
    }


    public AnswerType getType() {
        return type;
    }


    public Integer getId() {
        return id;
    }


    public Question(String question, AnswerType type) {
        this.question = question;
        this.type = type;
    }


    public Question() {
    }
}
