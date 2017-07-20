// 코드 11-4 com.apress.spring.repository.PersonRepository 클래스

package com.apress.spring.repository;

import org.springframework.data.repository.CrudRepository;

import com.apress.spring.domain.Person;

public interface PersonRepository extends CrudRepository<Person, Long> { }
