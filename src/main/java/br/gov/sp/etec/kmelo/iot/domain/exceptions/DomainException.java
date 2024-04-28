package br.gov.sp.etec.kmelo.iot.domain.exceptions;

import java.util.Map;

public class DomainException extends Exception {
    static String type;
    static String message;
    static Map<String, String> details;

    public DomainException(String type, String message, Map<String, String> details) {
        DomainException.type = type;
        DomainException.message = message;
        DomainException.details = details;
    }
}
