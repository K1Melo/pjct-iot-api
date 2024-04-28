package br.gov.sp.etec.kmelo.iot.resources.dto;

import br.gov.sp.etec.kmelo.iot.domain.entities.Data;

public class DataDTO {
    private Integer id;
    private Integer air_humidity;
    private Integer temperature;
    private Float illumination;

    public DataDTO() {
    }

    public DataDTO(Data data) {
        id = data.getId();
        air_humidity = data.getAir_humidity();
        temperature = data.getTemperature();
        illumination = data.getIllumination();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}
