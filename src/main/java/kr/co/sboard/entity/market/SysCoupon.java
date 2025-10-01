package kr.co.sboard.entity.market;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Builder // 이 어노테이션을 추가하는 경우
@Table(name = "sys_coupon")
public class SysCoupon {
    @Id
    @Column(name = "cp_code", length = 11)
    private String cpCode;

    @Column(name = "cp_name", length = 50) // nullable = true (default)
    private String cpName;

    @Column(name = "cp_type")
    private Integer cpType;

    @Column(name = "cp_value")
    private Integer cpValue;

    @Column(name = "cp_min_price")
    private Integer cpMinPrice;

    @Column(name = "cp_issue_date", nullable = false)
    private Date cpIssueDate;

    @Column(name = "cp_exp_date")
    private Date cpExpDate;
}