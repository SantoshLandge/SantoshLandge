package com.hibernate.demo.onetoonemap;

import jakarta.persistence.*;

@Entity
@Table(name = "Question")
public class QuestionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long question_id;
    private String question;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "answer_id")
    private AnswerEntity answerEntity;

    public QuestionEntity() {
    }

    public QuestionEntity(Long question_id, String question, AnswerEntity answerEntity) {
        this.question_id = question_id;
        this.question = question;
        this.answerEntity = answerEntity;
    }

    public Long getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(Long question_id) {
        this.question_id = question_id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public AnswerEntity getAnswerEntity() {
        return answerEntity;
    }

    public void setAnswerEntity(AnswerEntity answerEntity) {
        this.answerEntity = answerEntity;
    }
}
