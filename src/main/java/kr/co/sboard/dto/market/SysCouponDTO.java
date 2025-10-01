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
public class SysCouponDTO {
    private String cpCode;
    private String cpName;
    private Integer cpType;
    private Integer cpValue;
    private Integer cpMinPrice;
    private Date cpIssueDate;
    private Date cpExpDate;
}
