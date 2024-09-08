package com.hibernate.demo.onetoonemap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepo questionRepo;

    @Autowired
    private AnswerRepo answerRepo;

    public QuestionEntity createQuestionWithAnswer(QuestionEntity question) {
        // Save the Answer entity first, if it’s not managed yet
        if (question.getAnswerEntity() != null) {
            answerRepo.save(question.getAnswerEntity());
        }
        // Save the Question entity
        return questionRepo.save(question);
    }

    public Optional<QuestionEntity> getQuestionByIdWithAnswer(Long question_id){
        return questionRepo.findById(question_id);
    }

    public List<QuestionEntity> getQuestionWithAnswer() {
        return questionRepo.findAll();
    }
}
