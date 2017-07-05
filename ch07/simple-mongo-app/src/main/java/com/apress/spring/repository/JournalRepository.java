// 코드 7-16 com.apress.spring.repository.JournalRepository 클래스

package com.apress.spring.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.apress.spring.domain.Journal;

public interface JournalRepository extends MongoRepository<Journal, String> {
  public List<Journal> findByTitleLike(String word);
}
