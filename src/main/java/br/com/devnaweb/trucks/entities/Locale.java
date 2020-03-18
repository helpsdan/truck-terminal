package br.com.devnaweb.trucks.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LOCALE")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Locale {

    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic
    @Column(name = "DRIVER_ID", nullable = false)
    private Long driverId;

    @Basic
    @Column(name = "ORIGIN", nullable = false)
    private boolean origin;

    @Basic
    @Column(name = "DESTINY", nullable = false)
    private boolean destiny;

    @Basic
    @Column(name = "LONGITUDE", nullable = false)
    private Long longitude;

    @Column(name = "LATITUDE", nullable = false)
    private Long latitude;
}
