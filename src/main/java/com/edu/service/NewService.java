package com.edu.service;

import java.util.List;

import com.edu.domain.NewsMainDTO;

import org.springframework.stereotype.Service;

public interface NewService {
  public  List<NewsMainDTO> mainNewsList() throws Exception;
}
