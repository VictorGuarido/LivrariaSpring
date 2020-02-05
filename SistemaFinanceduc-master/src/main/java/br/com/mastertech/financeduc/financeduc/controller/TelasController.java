package br.com.mastertech.financeduc.financeduc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TelasController {

    @GetMapping
    public String mostrarHome(){
        return "index";
    }

    @GetMapping("/telaRecomendacoes")
    public String mostrarRecomendacoes(){
        return "recomendacoes";
    }

    @GetMapping("/sobrenos")
    public String mostrarSobreNos(){
        return "sobrenos";
    }

    @GetMapping("/nutrir")
    public String mostrarNutrir(){
        return "nutrir";
    }

}
