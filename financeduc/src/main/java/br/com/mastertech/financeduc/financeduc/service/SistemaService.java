package br.com.mastertech.financeduc.financeduc.service;

import br.com.mastertech.financeduc.financeduc.model.UsuarioModel;
import br.com.mastertech.financeduc.financeduc.repository.SistemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SistemaService {
    @Autowired
    private SistemaRepository repository;

}
