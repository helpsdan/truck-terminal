package br.com.devnaweb.trucks.gateways.base;

import br.com.devnaweb.trucks.gateways.database.domain.TruckData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TruckRepository extends JpaRepository<TruckData, Long> {
}
