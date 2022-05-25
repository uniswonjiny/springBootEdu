package com.edu.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.edu.domain.NewsMainDTO;
import com.edu.service.NewService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/json1")
@CrossOrigin(origins={"*"})
public class JsonController {
  @Autowired
  NewService newService;

  @GetMapping("/user/{userId}")
  @ResponseBody
  public HashMap<String, Object> userIdInfo( @PathVariable("userId") String userId){
    log.info("사용자 아이디 해당 사용자 정보 확인 : " + userId);
    ArrayList<String> list = new ArrayList<>();
    list.add("기타사항1");
    list.add("기타사항2");
    list.add("기타사항3");
    HashMap<String, Object> returnMap = new HashMap<>();
    returnMap.put("user_id", userId);
    returnMap.put("user_name", "사용자이름");
    returnMap.put("user_phone", "02-1234-5678");
    returnMap.put("user_mobile", "010-1234-5678");
    returnMap.put("user_age", 99);
    returnMap.put("user_etc", list);
    return returnMap;
  }

  @GetMapping("/base")
  public String baseHtml(){
    return "json/base";
  }

  @ResponseBody
  @GetMapping("/news/{newsType}/{pageNumer}")
  public ResponseEntity<List<NewsMainDTO>> newJson( @PathVariable("newsType")String newsType,  @PathVariable("pageNumer") int pageNumer) throws Exception{
    // 페이지 크기는 10개식 전달
    return new ResponseEntity<List<NewsMainDTO>>(newService.mainNewsList(newsType, pageNumer), HttpStatus.OK);
  }
  
}
