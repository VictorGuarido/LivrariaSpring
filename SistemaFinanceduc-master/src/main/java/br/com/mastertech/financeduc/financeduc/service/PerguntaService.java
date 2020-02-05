package br.com.mastertech.financeduc.financeduc.service;

import br.com.mastertech.financeduc.financeduc.model.Pergunta;
import br.com.mastertech.financeduc.financeduc.repository.PerguntaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PerguntaService {
    @Autowired
    private PerguntaRepository repository;

    public Pergunta cadastrarPergunta(Pergunta pergunta){
        return repository.save(pergunta);
    }

}
