package com.app.domain.vo;

import java.util.Objects;

public class FeedVO {
   private Long id;
   private String createDate;
   private String updateDate;
   private String feedContent;
   
   public FeedVO() {;}

   public Long getId() {
      return id;
   }

   public String getCreateDate() {
      return createDate;
   }

   public String getUpdateDate() {
      return updateDate;
   }

   public String getFeedContent() {
      return feedContent;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public void setCreateDate(String createDate) {
      this.createDate = createDate;
   }

   public void setUpdateDate(String updateDate) {
      this.updateDate = updateDate;
   }

   public void setFeedContent(String feedContent) {
      this.feedContent = feedContent;
   }

   @Override
   public String toString() {
      return "FeedVO [id=" + id + ", createDate=" + createDate + ", updateDate=" + updateDate + ", feedContent="
            + feedContent + "]";
   }

   @Override
   public int hashCode() {
      return Objects.hash(id);
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      FeedVO other = (FeedVO) obj;
      return Objects.equals(id, other.id);
   }
   
}
