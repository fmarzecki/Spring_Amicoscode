package pl.example.demo.student;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository // odpowiedzialny za dostep do danych takie samo jak @Component
public interface StudentRepository extends JpaRepository<Student,Long>{
    
    // SELECT * FROM student WHERE email = ?
    @Query("SELECT s from Student s WHERE s.email = ?1")
    Optional<Student> findStudentByEmail(String email);
}
