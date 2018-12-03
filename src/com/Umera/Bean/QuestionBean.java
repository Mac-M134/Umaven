package com.Umera.Bean;
 
public class QuestionBean {
 
   int q_no;
 
   String q_title;
 
   String q_text;
 
   String q_postedBy;
 
   String q_datePosted;
 
   public QuestionBean() {
   }
 
   public int getQ_no() {
      return this.q_no;
   }
 
   public void setQ_no(int value) {
      this.q_no = value;
   }
 
   public String getQ_title() {
      return this.q_title;
   }
 
   public void setQ_title(String value) {
      this.q_title = value;
   }
 
   public String getQ_text() {
      return this.q_text;
   }
 
   public void setQ_text(String value) {
      this.q_text = value;
   }
 
   public String getQ_postedBy() {
      return this.q_postedBy;
   }
 
   public void setQ_postedBy(String value) {
      this.q_postedBy = value;
   }
 
   public String getQ_datePosted() {
      return this.q_datePosted;
   }
 
   public void setQ_datePosted(String value) {
      this.q_datePosted = value;
   }
}