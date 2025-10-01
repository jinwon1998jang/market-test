package kr.co.sboard.dto.market;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderItemDTO {
    private Long itemNo;
    private String ordNo;
    private String prodNo;
    private String itemName;
    private Integer itemCnt;
    private Integer itemStat;
}
