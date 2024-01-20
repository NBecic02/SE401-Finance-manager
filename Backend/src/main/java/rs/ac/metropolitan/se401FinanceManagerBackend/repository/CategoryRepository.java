package rs.ac.metropolitan.se401FinanceManagerBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.ac.metropolitan.se401FinanceManagerBackend.domain.Category;
@Repository
public interface CategoryRepository  extends JpaRepository<Category, Integer> {
}
