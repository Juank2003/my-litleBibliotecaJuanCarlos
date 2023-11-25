package io.bootify.my_litle_biblioteca_juan_carlos.repos;

import io.bootify.my_litle_biblioteca_juan_carlos.domain.Lector;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LectorRepository extends JpaRepository<Lector, Long> {
}
