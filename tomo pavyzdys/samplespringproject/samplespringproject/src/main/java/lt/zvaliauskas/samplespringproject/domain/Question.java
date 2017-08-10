package lt.zvaliauskas.samplespringproject.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "QUESTIONS")
public class Question implements Serializable {
    @Id
    private Integer id;

    @Column(name = "TEXT")
    private String text;

    @Enumerated(EnumType.STRING)
    @Column(name = "TYPE")
    private AnswerType type;

    public Integer getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public AnswerType getType() {
        return type;
    }
}
