package br.com.devnaweb.trucks.entities;

import br.com.devnaweb.trucks.entities.enums.DriversLicenseType;
import br.com.devnaweb.trucks.entities.enums.Gender;
import br.com.devnaweb.trucks.entities.enums.TruckType;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "DRIVER")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Driver {

    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic
    @Column(name = "NAME", nullable = false)
    private String name;

    @Basic
    @Column(name = "AGE", nullable = false)
    private Long age;

    @Basic
    @Enumerated
    private Gender gender;

    @Basic
    @Column(name = "HAS_OWN_TRUCK")
    private boolean hasOwnTruck;

    @Basic
    @Enumerated
    private DriversLicenseType driversLicenseType;

    @Basic
    @Column(name = "IS_LOADED")
    private boolean isLoaded;

    @Basic
    @Enumerated
    private TruckType truckType;

    @Basic
    @Column(name = "CREATION_DATE")
    private Timestamp creationDate;

    @Basic
    @Column(name = "LAST_UPDATE_DATE")
    private Timestamp lastUpdateDate;

    @OneToMany(mappedBy = "driverId")
    private List<Locale> locales;
}
