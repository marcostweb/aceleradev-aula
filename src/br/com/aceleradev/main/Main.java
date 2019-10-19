package br.com.aceleradev.main;

import br.com.aceleradev.domain.Aluno;

public class Main {

    public static void main(String[] args) {

        Aluno aluno = new Aluno(
                "Marcos Teixeira",
                "marcostweb",
                "123.456.789-12",
                 33);;

        System.out.println(aluno);

    }

}
