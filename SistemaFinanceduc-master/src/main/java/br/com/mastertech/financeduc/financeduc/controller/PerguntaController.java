package br.com.mastertech.financeduc.financeduc.controller;

import br.com.mastertech.financeduc.financeduc.model.Pergunta;
import br.com.mastertech.financeduc.financeduc.service.PerguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PerguntaController {
    @Autowired
    private PerguntaService service;

    @GetMapping("/cadastrarPergunta")
    public String telaCadastrarPergunta(){
        return "CadastroPergunta";
    }

    @PostMapping("/cadastrarPergunta")
    public String cadastrarPergunta(Pergunta pergunta){
        service.cadastrarPergunta(pergunta);
        return "CadastroPergunta";
    }
}
