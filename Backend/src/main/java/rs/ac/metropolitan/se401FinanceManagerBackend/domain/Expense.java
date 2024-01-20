package rs.ac.metropolitan.se401FinanceManagerBackend.domain;
import javax.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Entity
@Data
@Table(name = "expenses")
public class Expense {
    @Id
    @GeneratedValue(generator = "ExpenseSeq")
    @SequenceGenerator(name = "ExpenseSeq", sequenceName = "expense_sequence")
    private Integer expenseId;
    private OffsetDateTime date;
    private String shop;
    private BigDecimal cost;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
