package br.gov.sp.etec.kmelo.iot.resources.jdbc.repository;

import br.gov.sp.etec.kmelo.iot.domain.entities.Data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepositoryJdbc extends JpaRepository<Data, Integer> {
    Data findByUsername(String username);
}
