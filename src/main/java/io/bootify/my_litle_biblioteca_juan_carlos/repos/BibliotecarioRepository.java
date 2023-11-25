package io.bootify.my_litle_biblioteca_juan_carlos.repos;

import io.bootify.my_litle_biblioteca_juan_carlos.domain.Bibliotecario;
import io.bootify.my_litle_biblioteca_juan_carlos.domain.Lector;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BibliotecarioRepository extends JpaRepository<Bibliotecario, Long> {

    Bibliotecario findFirstByLector(Lector lector);

    boolean existsByLectorId(Long id);

}
