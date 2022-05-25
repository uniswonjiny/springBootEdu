package com.edu.mapper;

import java.util.HashMap;
import java.util.List;

import com.edu.domain.NewsMainDTO;

public interface NewMainMapper {
  public List<NewsMainDTO> mainNewsList(HashMap<String, Object> map) throws Exception;
}
