package br.com.devnaweb.trucks.gateways.base;

import br.com.devnaweb.trucks.gateways.database.domain.LocaleData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocaleRepository extends JpaRepository<LocaleData, Long> {
}
