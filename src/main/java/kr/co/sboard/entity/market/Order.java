package kr.co.sboard.entity.market;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

@Getter // 읽기는 허용
@NoArgsConstructor(access = AccessLevel.PROTECTED) // JPA를 위한 기본 생성자
@AllArgsConstructor // Builder를 위한 전체 생성자
@Builder // 안전한 객체 생성을 위한 빌더 패턴
@ToString // 로그 및 디버깅 용이
@Entity
@Table(name = "\"order\"")
public class Order {
    @Id
    @Column(name = "ord_no", length = 11)
    private String ordNo;

    @Column(name = "mem_id", length = 30, nullable = false)
    private String memId;

    @Column(name = "ord_name", length = 30)
    private String ordName;

    @Column(name = "ord_hp", length = 13)
    private String ordHp;

    @Column(name = "ord_zip", length = 30)
    private String ordZip;

    @Column(name = "ord_addr1", length = 50)
    private String ordAddr1;

    @Column(name = "ord_addr2", length = 50)
    private String ordAddr2;

    @Column(name = "ord_total")
    private Integer ordTotal;

    @Column(name = "ord_date", nullable = false)
    private Date ordDate;

    @Column(name = "ord_payment", length = 50)
    private String ordPayment;
}
