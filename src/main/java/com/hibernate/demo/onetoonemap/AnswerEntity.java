package com.hibernate.demo.onetoonemap;

import jakarta.persistence.*;

@Entity
@Table(name = "Answer")
public class AnswerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long answer_id;
    private String answer;

    public AnswerEntity() {
    }

    public AnswerEntity(Long answer_id, String answer) {
        this.answer_id = answer_id;
        this.answer = answer;
    }

    public Long getAnswer_id() {
        return answer_id;
    }

    public void setAnswer_id(Long answer_id) {
        this.answer_id = answer_id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

}
