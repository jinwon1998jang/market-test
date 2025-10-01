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
public class UserCouopnDTO {
    private String cpNo;
    private String cpCode;
    private String memId;
    private Date cpIssuedDate;
    private Date cpUsedDate;
    private Integer cpStat;
}
