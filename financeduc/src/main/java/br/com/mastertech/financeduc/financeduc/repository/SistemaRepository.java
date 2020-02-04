package br.com.mastertech.financeduc.financeduc.repository;

import br.com.mastertech.financeduc.financeduc.model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

public interface SistemaRepository extends CrudRepository<UsuarioModel, String> {

}
