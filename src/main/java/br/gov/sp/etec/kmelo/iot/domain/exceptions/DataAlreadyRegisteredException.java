package br.gov.sp.etec.kmelo.iot.domain.exceptions;

public class DataAlreadyRegisteredException extends DomainException{
    public DataAlreadyRegisteredException() {
        super(type = "ALREADY_EXISTS", message = "Informed username already exists", details = null);
    }
}
