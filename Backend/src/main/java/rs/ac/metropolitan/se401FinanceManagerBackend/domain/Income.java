package rs.ac.metropolitan.se401FinanceManagerBackend.domain;

import javax.persistence.*;
import lombok.Data;


import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Entity
@Data
@Table(name = "incomes")
public class Income {
    @Id
    @GeneratedValue(generator = "IncomeSeq")
    @SequenceGenerator(name = "IncomeSeq", sequenceName = "income_sequence")
    private Integer incomeId;
    private OffsetDateTime date;
    private String source;
    private BigDecimal earning;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
