package br.com.mastertech.livraria.service;

import br.com.mastertech.livraria.model.LivrariaModel;
import br.com.mastertech.livraria.repository.LivrariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LivrariaService{

    @Autowired
    private LivrariaRepository repository;

    public LivrariaModel cadastrarLivro(LivrariaModel livro) { //Cadastra o livro, usando save do repository
        return repository.save(livro);
    }

    public Iterable<LivrariaModel> listarLivros(){ //Busca todos os dados usando o findAll do repository
        Iterable<LivrariaModel> livros = repository.findAll(); //Cria uma lista Iterable to tipo model
        return livros;
    }

    public LivrariaModel listarLivro(int id) { //Busca os dados usando findById, passando int id como parametro, e cria lista Optional para guardar os dados encontrados pelo metodo do repository
        Optional<LivrariaModel> livro = repository.findById(id);
        return livro.get(); //.GET para transferir para o dado da variavel livro para o Controller
    }
}
