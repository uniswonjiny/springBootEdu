package com.edu.service;

import java.util.List;

import com.edu.domain.NewsMainDTO;

public interface NewService {
  public  List<NewsMainDTO> mainNewsList(String newsType , int pageNumer ) throws Exception;
}
