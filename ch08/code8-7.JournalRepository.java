// 코드 8-7 com.apress.spring.repository.JournalRepository 클래스

package com.apress.spring.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.apress.spring.domain.JournalEntry;

public interface JournalRepository extends JpaRepository<JournalEntry, Long> {

  List<JournalEntry> findByCreatedAfter(@Param("after") @DateTimeFormat(iso = ISO.DATE) Date date);
  List<JournalEntry> findByCreatedBetween(@Param("after") @DateTimeFormat(iso = ISO.DATE) Date after, @Param("before") @DateTimeFormat(iso = ISO.DATE) Date before);
  List<JournalEntry> findByTitleContaining(@Param("word") String word);
  List<JournalEntry> findBySummaryContaining(@Param("word") String word);

}
