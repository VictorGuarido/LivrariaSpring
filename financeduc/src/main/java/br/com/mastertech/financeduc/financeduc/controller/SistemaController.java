package br.com.mastertech.financeduc.financeduc.controller;

import br.com.mastertech.financeduc.financeduc.service.SistemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SistemaController {

    @Autowired
    private SistemaService service;

    @GetMapping
    public String mostrarHome(){
        return "index";
    }



}
