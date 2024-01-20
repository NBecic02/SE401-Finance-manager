package rs.ac.metropolitan.se401FinanceManagerBackend.domain;

import javax.persistence.*;
import lombok.Data;
import java.util.List;


@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private Integer userId;
    private String firstName;
    private String lastName;
    private String username;
    private String password;

    @OneToMany(mappedBy="user")
    List<Expense> userExpenses;

    @OneToMany(mappedBy="user")
    List<Income> userIncomes;
}
