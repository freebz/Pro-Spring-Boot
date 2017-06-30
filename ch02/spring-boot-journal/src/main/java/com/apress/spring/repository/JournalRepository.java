// 코드 2-6 com.apress.spring.repository.JournalRepository 클래스

package com.apress.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.apress.spring.domain.Journal;

public interface JournalRepository extends JpaRepository<Journal, Long> { }
