package com.edu.domain;

import lombok.Data;
// 화면에 전달할 뉴스 자료형

@Data
public class NewMainVo {
  public int id;
  public String title;
  public int points;
  public String user;
  public int time;
  public String time_ago;
  public int comments_count;
  public String type;
  public String url;
  public String domain;
}
