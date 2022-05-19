package com.edu.service;

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
  public List<NewsMainDTO> mainNewsList() throws Exception {
    return mainMapper.mainNewsList();
  }
  
}
