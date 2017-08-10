package com.lt.simpleWebRaimondas.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="questions")
public class Question implements Serializable {
    @Id
    private Integer id;

    @Column(name = "QUESTION")
    private String question;

    @Enumerated(EnumType.STRING)
    @Column(name="TYPE")
    private AnswerType type;


}
