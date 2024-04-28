package br.gov.sp.etec.kmelo.iot.application.web.controllers;

import br.gov.sp.etec.kmelo.iot.domain.entities.Data;
import br.gov.sp.etec.kmelo.iot.domain.exceptions.DataAlreadyRegisteredException;
import br.gov.sp.etec.kmelo.iot.domain.exceptions.NotFoundException;
import br.gov.sp.etec.kmelo.iot.domain.services.DataServices;
import br.gov.sp.etec.kmelo.iot.resources.dto.DataDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/data")
public class DataController {

    @Autowired
    private DataServices dataServices;

    @GetMapping
    public List<DataDTO> findAll() {
        return dataServices.findAll();
    }

    @GetMapping(path = "/{username}")
    public Data findOne(@PathVariable String username) throws NotFoundException {
        return dataServices.findOne(username);
    }

    @PostMapping
    public Data postData(@RequestBody Data data) throws DataAlreadyRegisteredException {
        return dataServices.postData(data);
    }

    @PutMapping(path = "/{username}")
    public Data putData(@PathVariable String username, @RequestBody Data data) throws NotFoundException {
        return dataServices.changeData(username, data);
    }
}
