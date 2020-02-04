package br.com.mastertech.financeduc.financeduc.model;

import javax.persistence.*;

@Entity
@Table(name="Quiz")  // Tabela do resultado do quiz
public class QuizModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idQuiz;

    @Column
    private String resultado;

    public QuizModel(long idQuiz, String resultado) {
        this.idQuiz = idQuiz;
        this.resultado = resultado;
    }

    public long getIdQuiz() {
        return idQuiz;
    }

    public void setIdQuiz(long idQuiz) {
        this.idQuiz = idQuiz;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}
