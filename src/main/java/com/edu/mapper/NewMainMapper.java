package com.edu.mapper;

import java.util.List;

import com.edu.domain.NewsMainDTO;

public interface NewMainMapper {
  public List<NewsMainDTO> mainNewsList() throws Exception;
}
