// 코드 7-8 com.apress.spring.service.JournalService 클래스

package com.apress.spring.service;

import java.text.ParseException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apress.spring.domain.Journal;
import com.apress.spring.repository.JournalRepository;

@Service
public class JournalService {
  private static final Logger log = LoggerFactory.getLogger(JournalService.class);

  @Autowired
  JournalRepository repo;

  public void insertData() throws ParseException {
    log.info("> 데이터 생성...");
    repo.save(new Journal("스프링 부트 입문","오늘부터 스프링 부트를 배웠다","01/01/2016"));
    repo.save(new Journal("간단한 스프링 부트 프로젝트","스프링 부트 프로젝트를 처음 만들어보았다","01/02/2016"));
    repo.save(new Journal("스프링 부트 해부","스프링 부트를 자세히 살펴보았다","02/01/2016"));
    repo.save(new Journal("스프링 부트 클라우드","클라우드 파운드리를 응용한 스프링 부트를 공부했다","03/01/2016"));
    log.info("> 완료");
  }

  public List<Journal> findAll() {
    return repo.findAll();
  }
  
}
