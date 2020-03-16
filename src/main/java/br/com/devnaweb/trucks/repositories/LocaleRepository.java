package br.com.devnaweb.trucks.repositories;

import br.com.devnaweb.trucks.entities.Locale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocaleRepository extends JpaRepository<Locale, Long> {
}
