package kr.co.careerwrymember.domain;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.ZonedDateTime;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AbstractEntity {
  @CreatedDate
  ZonedDateTime createdAt;

  @CreatedBy
  String createdBy;

  @LastModifiedDate
  ZonedDateTime modifiedAt;

  @LastModifiedBy
  String modifiedBy;

}
