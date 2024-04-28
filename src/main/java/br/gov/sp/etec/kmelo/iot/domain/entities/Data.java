package br.gov.sp.etec.kmelo.iot.domain.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "datas")
public class Data {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @NotEmpty
    private String username;

    private Integer air_humidity;

    private Integer temperature;

    private Float illumination;

    public Data() {
    }

    public Data(String username, Integer air_humidity, Integer temperature, Float illumination) {
        this.username = username;
        this.air_humidity = air_humidity;
        this.temperature = temperature;
        this.illumination = illumination;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAir_humidity() {
        return air_humidity;
    }

    public void setAir_humidity(Integer air_humidity) {
        this.air_humidity = air_humidity;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public Float getIllumination() {
        return illumination;
    }

    public void setIllumination(Float illumination) {
        this.illumination = illumination;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
