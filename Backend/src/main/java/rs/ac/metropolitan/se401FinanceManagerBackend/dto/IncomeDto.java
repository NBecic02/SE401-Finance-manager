package rs.ac.metropolitan.se401FinanceManagerBackend.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
@Data
public class IncomeDto {
    private Integer incomeId;
    private OffsetDateTime date;
    private String source;
    private BigDecimal earning;
    private UserDto userDto;
}
