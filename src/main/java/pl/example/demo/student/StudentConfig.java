package pl.example.demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
           Student mariam =  new Student( "Filip", "icloud", LocalDate.of(2000, 05, 26));
           Student alex =  new Student( "Alex", "gmail", LocalDate.of(2002, 01, 06));

           repository.saveAll(List.of(mariam,alex));
        };
    }
}
