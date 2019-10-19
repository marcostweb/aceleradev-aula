package br.com.aceleradev.domain;

public class Aluno extends Usuario{

    private Integer numeroMatricula;
    int idade;

    public Aluno(String nome, String login, String cpf, int dataNascimento) {
        super(nome, login, cpf, dataNascimento);
    }

    public Integer getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(Integer numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

}
