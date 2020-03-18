package br.com.devnaweb.trucks.repositories;

import br.com.devnaweb.trucks.entities.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {

    List<Driver> findAllByCreationDateBetween(final Timestamp start, final Timestamp end);
}
