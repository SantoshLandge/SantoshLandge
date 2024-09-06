package com.hibernate.demo.onetoonemap;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepo extends JpaRepository<QuestionEntity, Long> {
}
