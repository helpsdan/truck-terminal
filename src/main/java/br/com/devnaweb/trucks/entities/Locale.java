package br.com.devnaweb.trucks.entities;

import br.com.devnaweb.trucks.entities.enums.LocaleType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
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
    @Enumerated
    @Column(name = "LOCALE_TYPE", nullable = false)
    private LocaleType localeType;

    @Basic
    @Column(name = "LONGITUDE", nullable = false)
    private Long longitude;

    @Column(name = "LATITUDE", nullable = false)
    private Long latitude;
}
