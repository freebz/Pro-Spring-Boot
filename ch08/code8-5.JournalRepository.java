// 코드 8-5 com.apress.spring.repository.JournalRepository 클래스

package com.apress.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.apress.spring.domain.JournalEntry;

public interface JournalRepository extends JpaRepository<JournalEntry, Long> { }
