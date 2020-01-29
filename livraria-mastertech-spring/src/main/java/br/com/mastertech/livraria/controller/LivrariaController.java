package br.com.mastertech.livraria.controller;

import br.com.mastertech.livraria.model.LivrariaModel;
import br.com.mastertech.livraria.service.LivrariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class LivrariaController {

    @Autowired
    private LivrariaService service;

    @GetMapping
    public String mostrarHome(){                                                   // Exibe a primeira pagina
        return "index";
    }

    @PostMapping("/cadastrar")
    public String cadastrarLivro(LivrariaModel livro){                          // Envia os dados digitados para o banco usando o metodo no LivrariaService, e retorna para a mesma pagina (principal)
        service.cadastrarLivro(livro);
        return "index";
    }

    @GetMapping("/livros")
    public ModelAndView listarLivros(){                                        // Método para listar todos os dados, usando ModelAndView para comunicar a model com a view No controller
        ModelAndView pagina = new ModelAndView("listarLivros");     // Instancia a pagina HTML listarLivros e guarda na variavel "pagina" do tipo ModelAndView
        Iterable<LivrariaModel> livros = service.listarLivros();             // Lista criada para guardar os dados da lista feita na classe LivrariaService numa variavel "livros"
        pagina.addObject("livros", livros);                     // Adiciona na pagina os dados que estão na variavel livro
        return pagina;                                                      // Retorna a pagina com os dados carregados
    }

    @GetMapping("/index")                                                   // Retorna a pagina principal quando usa HREF voltada para index
    public String voltarHome(){
        return "index";
    }

    @GetMapping("/telaPesquisa")                                            // Retorna telaPesquisa chamada num HREF
    public String mostrarTelaPesquisa(){
        return "pesquisarLivro";
    }

    @GetMapping("livro")
    public String pesquisarLivro(@RequestParam("id") int id, Model model){ //Manda para a URL o valor de ID por requisição
        LivrariaModel livro = service.listarLivro(id);                      // Guarda os dados buscados pelo metodo na service na variavel livro
        if(livro != null){                                                  // Condição se caso os dados forem nulos
            model.addAttribute("livro", livro);
        }
        return "resultPesquisa";
    }

    @GetMapping("livro/{id}")
    public String pesquisarLivroPorPagina(@PathVariable ("id") int id, Model model){ //Manda para a URL o valor de ID por pagina
        LivrariaModel livro = service.listarLivro(id);
        if(livro != null){
            model.addAttribute("livro", livro);
        }
        return "resultPesquisa";
    }

}
