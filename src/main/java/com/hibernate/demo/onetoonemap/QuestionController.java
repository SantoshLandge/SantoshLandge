package com.hibernate.demo.onetoonemap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @PostMapping("/add")
    public ResponseEntity<QuestionEntity> createQuestionWithAnswer(@RequestBody QuestionEntity question) {
        QuestionEntity createdQuestion = questionService.createQuestionWithAnswer(question);
        return new ResponseEntity<>(createdQuestion, HttpStatus.CREATED);
    }

    @GetMapping("/get")
    public ResponseEntity<List<QuestionEntity>> getQuestionWithAnswer(){
        List<QuestionEntity> questions = questionService.getQuestionWithAnswer();
        if (questions.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(questions);
    }

    @GetMapping("/get/{question_id}")
    public ResponseEntity<QuestionEntity> getQuestionByIdWithAnswer(@PathVariable Long question_id){
        Optional<QuestionEntity> question = questionService.getQuestionByIdWithAnswer(question_id);
        return question.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

}
