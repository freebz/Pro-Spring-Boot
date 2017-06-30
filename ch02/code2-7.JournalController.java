// 코드 2-7 com.apress.spring.web.JournalController 클래스

package com.apress.spring.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.apress.spring.repository.JournalRepository;

@Controller
public class JournalController {

  @Autowired
  JournalRepository repo;

  @RequestMapping("/")
  public String index(Model model) {
    model.addAttribute("journal", repo.findAll());
    return "index";
  }
}
