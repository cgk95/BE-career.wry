package kr.co.careerwry.domain

import jakarta.persistence.EntityListeners
import jakarta.persistence.MappedSuperclass
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import org.springframework.data.annotation.CreatedBy
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedBy
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.ZonedDateTime

@MappedSuperclass
@EntityListeners(AuditingEntityListener::class)
open class AbstractEntity {

    @CreatedDate
    val createdAt: ZonedDateTime? = null

    @CreatedBy
    val createdBy: String? = null

    @LastModifiedDate
    var modifiedAt: ZonedDateTime? = null
        private set

    @LastModifiedBy
    var modifiedBy: String? = null
        private set

}
