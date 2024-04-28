package br.gov.sp.etec.kmelo.iot.domain.exceptions;

import java.util.Map;

public class NotFoundException extends DomainException{
    public NotFoundException() {
        super(type = "NOT_FOUND", message = "Informed username not found", details = null);
    }
}
