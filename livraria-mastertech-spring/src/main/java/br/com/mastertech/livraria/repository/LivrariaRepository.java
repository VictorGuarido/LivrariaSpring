package br.com.mastertech.livraria.repository;


import br.com.mastertech.livraria.model.LivrariaModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface LivrariaRepository extends CrudRepository<LivrariaModel, Integer> { //Altera o tipo de parametro para o tipo do que esta sendo procurado

}
