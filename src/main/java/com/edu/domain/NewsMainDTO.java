package com.edu.domain;

import java.sql.Timestamp;

import lombok.Data;
// 화면에 전달할 뉴스 자료형

@Data
public class NewsMainDTO {
  public int seq;
  public String new_type;
  public int id;
  public String title;
  public int point;
  public String user;
  public Timestamp CREATED_AT;
  public int comments_count;
  public String type;
  public String url;
  public String domain;
}
