package com.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Slf4j
@Controller
@RequestMapping("/pat")
public class PathController {
  @RequestMapping(value="/register", method=RequestMethod.GET)
  public String registerGet(@RequestParam(value="message", required=false) String message, Model model) {
    log.info(String.format("register get 방식 호출및 요청데이터 받아서 다시 화면에 전달 : %s" , message ));
    model.addAttribute("test", "일단테스트합니다");
    if(message != null && message.length() > 0 ){
      model.addAttribute("test", message);
    }
      return "pat/register";
  }
  
  @RequestMapping(value="/register", method=RequestMethod.POST)
  public String registerPost(@RequestParam(value="message", required=false) String message, Model model) {
    log.info(String.format("register post 방식 호출및 요청데이터 받아서 다시 화면에 전달 : %s" , message ));
    model.addAttribute("test", "일단테스트합니다");
    if(message != null && message.length() > 0 ){
      model.addAttribute("test", message);
    }
      return "pat/register";
  }
}
