package io.bootify.my_litle_biblioteca_juan_carlos.repos;

import io.bootify.my_litle_biblioteca_juan_carlos.domain.Libro;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LibroRepository extends JpaRepository<Libro, Long> {
}
