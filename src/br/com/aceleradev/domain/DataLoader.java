package br.com.aceleradev.domain;

import br.com.aceleradev.domain.Disciplina;
import br.com.aceleradev.repositories.UsuarioRepository;

public final class DataLoader {

	public static void main (String[] args) {

		UsuarioRepository usuarioRepository = new UsuarioRepository();

		Aluno aluno = new Aluno(
				"Marcos",
				"marcostweb",
				"123.456.789-23",
				 44);

		Professor professor = new Professor(
				"Jose",
				"josemaria2010",
				"123.456.789-23",
				 22);
		
		Disciplina disciplina = new Disciplina("Matematica", professor);

		usuarioRepository.insere(aluno);
		usuarioRepository.insere(professor);
		
		disciplina.matricular(aluno);
		System.out.println(aluno);

	}

}
