// 코드 7-7 com.apress.spring.domain.Journal 클래스

package com.apress.spring.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Journal {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;
  private String title;
  private Date created;
  private String summary;

  @Transient
  private SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
  
  public Journal(String title, String summary, String date) throws ParseException {
    this.title = title;
    this.summary = summary;
    this.created = format.parse(date);
  }
  
  Journal() {}
  
  public Long getId() {
    return id;
  }
  
  public void setId(Long id) {
    this.id = id;
  }
  
  public String getTitle() {
    return title;
  }
  
  public void setTitle(String title) {
    this.title = title;
  }
  
  public Date getCreated() {
    return created;
  }

  public void setCreated(Date created) {
    this.created = created;
  }

  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public String getCreatedAsShort() {
    return format.format(created);
  }

  public String toString() {
    StringBuilder value = new StringBuilder("JournalEntity(");
    value.append("Id: ");
    value.append(id);
    value.append(",제목: ");
    value.append(title);
    value.append(",요약: ");
    value.append(summary);
    value.append(",작성일자: ");
    value.append(getCreatedAsShort());
    value.append(")");
    
    return value.toString();
  }
}
