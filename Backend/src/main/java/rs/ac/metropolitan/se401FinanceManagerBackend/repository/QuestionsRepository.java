package rs.ac.metropolitan.se401FinanceManagerBackend.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.ac.metropolitan.se401FinanceManagerBackend.domain.Question;

@Repository
public interface QuestionsRepository extends JpaRepository<Question, Integer> {
}
