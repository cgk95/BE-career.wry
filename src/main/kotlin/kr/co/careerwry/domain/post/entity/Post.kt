package kr.co.careerwry.domain.post.entity

import jakarta.persistence.*
import kr.co.careerwry.domain.AbstractEntity
import lombok.extern.slf4j.Slf4j

@Slf4j
@Entity
@Table(name = "posts")
class Post(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    val id: Long? = null,

    @Column(nullable = false)
    val postToken: String? = null,

    @Column(nullable = false)
    var title: String? = null,

    @Column(nullable = false)
    var content: String? = null,

    ) : AbstractEntity() {

    fun update(title: String, content: String) {
        this.title = title
        this.content = content
    }

}
