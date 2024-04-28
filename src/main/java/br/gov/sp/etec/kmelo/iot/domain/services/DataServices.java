package br.gov.sp.etec.kmelo.iot.domain.services;

import br.gov.sp.etec.kmelo.iot.domain.entities.Data;
import br.gov.sp.etec.kmelo.iot.domain.exceptions.DataAlreadyRegisteredException;
import br.gov.sp.etec.kmelo.iot.domain.exceptions.NotFoundException;
import br.gov.sp.etec.kmelo.iot.domain.utils.DataUtils;
import br.gov.sp.etec.kmelo.iot.resources.dto.DataDTO;
import br.gov.sp.etec.kmelo.iot.resources.jdbc.repository.DataRepositoryJdbc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

@Service
public class DataServices {

    @Autowired
    private DataRepositoryJdbc dataRepository;

    public List<DataDTO> findAll() {
        List<Data> listData = dataRepository.findAll();
        return listData.stream().map(DataDTO::new).toList();
    }

    public Data findOne(String username) throws NotFoundException {
        Data data = dataRepository.findByUsername(username);
        if (!dataExists(data)) throw new NotFoundException();

        return data;
    }

    public Data postData(Data data) throws DataAlreadyRegisteredException {
        if (dataExists(data)) throw new DataAlreadyRegisteredException();

        dataRepository.save(data);
        return data;
    }

    public Data changeData(String username, Data updatedData) throws NotFoundException {
        Data currentData = this.dataRepository.findByUsername(username);

        if (!dataExists(currentData)) throw new NotFoundException();

        DataUtils.copyNonNullProperties(updatedData, currentData);
        return this.dataRepository.save(currentData);
    }

    public void deleteData(String username) throws NotFoundException {
        Data data = this.dataRepository.findByUsername(username);
        if (!dataExists(data)) throw new NotFoundException();
        dataRepository.delete(data);
    }

    private Boolean dataExists(Data data) {
        AtomicBoolean dataExits = new AtomicBoolean(false);

        List<Data> listData = dataRepository.findAll();
        listData.forEach(d -> {
            if (Objects.equals(d.getUsername(), data.getUsername())) {
                dataExits.set(true);
            }
        });

        return dataExits.get();
    }
}
