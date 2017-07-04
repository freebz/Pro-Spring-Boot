// 코드 6-6 com.apress.spring.controller.JournalController 클래스

package com.apress.spring.controller;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apress.spring.domain.JournalEntry;

@RestController
public class JournalController {

  private static List<JournalEntry> entries = new ArrayList<JournalEntry>();
  static {
    try {
      entries.add(new JournalEntry("스프링 부트 입문", "오늘부터 스프링 부트를 배웠다", "01/01/2016"));
      entries.add(new JournalEntry("간단한 스프링 부트 프로젝트", "스프링 부트 프로젝트를 처음 만들어보았다", "01/02/2016"));
      entries.add(new JournalEntry("스프링 부트 해부", "스프링 부트를 자세히 살펴보았다", "02/01/2016"));
      entries.add(new JournalEntry("스프링 부트 클라우드", "클라우드 파운드리를 응용한 스프링 부트를 공부했다", "03/01/2016"));
    } catch (ParseException e) {
      e.printStackTrace();
    }
  }

  @RequestMapping("/journal/all")
  public List<JournalEntry> getAll() throws ParseException {
    return entries;
  }

  @RequestMapping("/journal/findBy/title/{title}")
  public List<JournalEntry> findByTitleContains(@PathVariable String title) throws ParseException {
    return entries
      .stream()
      .filter(entry -> entry.getTitle().toLowerCase().contains(title.toLowerCase()))
      .collect(Collectors.toList());
  }

  @RequestMapping(value="/journal",method = RequestMethod.POST )
  public JournalEntry add(@RequestBody JournalEntry entry) {
    entries.add(entry);
    return entry;
  }

}
