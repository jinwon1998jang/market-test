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
public class OrderDTO {
    private String ordNo;
    private String memId;
    private String ordName;
    private String ordHp;
    private String ordZip;
    private String ordAddr1;
    private String ordAddr2;
    private Integer ordTotal;
    private Date ordDate;
    private String ordPayment;
}
