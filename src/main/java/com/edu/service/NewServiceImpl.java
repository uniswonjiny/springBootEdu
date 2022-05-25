package com.edu.service;

import java.util.HashMap;
import java.util.List;

import com.edu.domain.NewsMainDTO;
import com.edu.mapper.NewMainMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewServiceImpl implements NewService{

  @Autowired
  NewMainMapper mainMapper;

  @Override
  public List<NewsMainDTO> mainNewsList(String newsType , int pageNumer) throws Exception {
    HashMap<String, Object> map = new HashMap<>();
    map.put("newsType",  newsType);

    // 페이지 크기는 10개식한다.
    map.put("startNum", (pageNumer-1) * 10+1);
    map.put("endNum", (pageNumer) * 10);
    return mainMapper.mainNewsList(map);
  }
}
