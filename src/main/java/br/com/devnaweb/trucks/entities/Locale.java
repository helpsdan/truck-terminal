package br.com.devnaweb.trucks.entities;

import br.com.devnaweb.trucks.entities.enums.LocaleType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "LOCALE")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Locale {

    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "DRIVER_ID")
    private Driver driver;

    @Basic
    @Enumerated
    private LocaleType localeType;

    @Basic
    @Column(name = "LONGITUDE", nullable = false)
    private Long longitude;

    @Column(name = "LATITUDE", nullable = false)
    private Long latitude;
}
