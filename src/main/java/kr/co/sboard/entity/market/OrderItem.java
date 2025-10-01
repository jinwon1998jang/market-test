package kr.co.sboard.entity.market;

import jakarta.persistence.*;
import lombok.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Builder // 이 어노테이션을 추가하는 경우
@ToString
@Entity
@Table(name = "order_item")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_item_seq")
    @SequenceGenerator(name = "order_item_seq", sequenceName = "ORDER_ITEM_ITEM_NO_SEQ", allocationSize = 1)
    @Column(name = "item_no")
    private Long itemNo;

    @Column(name = "ord_no", length = 11, nullable = false)
    private String ordNo;

    @Column(name = "prod_no", length = 9, nullable = false)
    private String prodNo;

    @Column(name = "item_name", length = 30)
    private String itemName;

    @Column(name = "item_cnt")
    private Integer itemCnt;

    @Column(name = "item_stat")
    private Integer itemStat;

    // @Builder가 사용할 생성자를 명시적으로 정의합니다.
    public OrderItem(String ordNo, String prodNo, String itemName, Integer itemCnt, Integer itemStat) {
        this.ordNo = ordNo;
        this.prodNo = prodNo;
        this.itemName = itemName;
        this.itemCnt = itemCnt;
        this.itemStat = itemStat;
    }
}