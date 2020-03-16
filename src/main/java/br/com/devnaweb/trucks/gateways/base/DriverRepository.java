package br.com.devnaweb.trucks.gateways.base;

import br.com.devnaweb.trucks.gateways.database.domain.DriverData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<DriverData, Long> {
}
