package bankApp.account.model

import org.hibernate.annotations.Fetch
import org.hibernate.annotations.GenericGenerator
import org.springframework.data.annotation.Id
import java.math.BigDecimal
import java.time.LocalDateTime
import java.util.*
import javax.persistence.*
import javax.persistence.FetchType.LAZY

@Entity
data class Account(
        @Id
        @GeneratedValue(generator = "UUID")//hashcode generate edir
        @GenericGenerator(name = "UUID",strategy = "org.hibernate.id.UUIDGenerator")
        val id:String?,
        val balance:BigDecimal?=BigDecimal.ZERO,
        val creationDate:LocalDateTime,

        @ManyToOne(fetch =FetchType.LAZY , cascade = [CascadeType.ALL])
        @JoinColumn(name = "customer_id",nullable = false)









)



