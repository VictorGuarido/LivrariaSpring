package br.com.mastertech.livraria.model;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="Livro")
public class LivrariaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id; // Tipo da variável deve ser igual a no Repository

    @Column
    private String nome;

    @Column
    private String autor;

    @Column
    private String descricao;

//    @Column
//    private boolean ativo = true;
//
//    @Column
//    private LocalDate dataCriacao;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

//    public boolean isAtivo() {
//        return ativo;
//    }
//
//    public void setAtivo(boolean ativo) {
//        this.ativo = ativo;
//    }
//
//    public LocalDate getDataCriacao() {
//        return dataCriacao;
//    }
//
//    public void setDataCriacao(LocalDate dataCriacao) {
//        this.dataCriacao = dataCriacao;
//    }
}
