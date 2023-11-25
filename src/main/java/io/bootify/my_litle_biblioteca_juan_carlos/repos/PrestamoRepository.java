package io.bootify.my_litle_biblioteca_juan_carlos.repos;

import io.bootify.my_litle_biblioteca_juan_carlos.domain.Bibliotecario;
import io.bootify.my_litle_biblioteca_juan_carlos.domain.Lector;
import io.bootify.my_litle_biblioteca_juan_carlos.domain.Libro;
import io.bootify.my_litle_biblioteca_juan_carlos.domain.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PrestamoRepository extends JpaRepository<Prestamo, Long> {

    Prestamo findFirstByLibro(Libro libro);

    Prestamo findFirstByLector(Lector lector);

    Prestamo findFirstByBibliotecario(Bibliotecario bibliotecario);

}
