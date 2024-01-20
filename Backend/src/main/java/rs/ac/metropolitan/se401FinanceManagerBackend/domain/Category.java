package rs.ac.metropolitan.se401FinanceManagerBackend.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(generator = "CategorySeq")
    @SequenceGenerator(name = "CategorySeq", sequenceName = "category_sequence")
    private Integer categoryId;
    private String categoryName;
    private String categoryDescription;

}
