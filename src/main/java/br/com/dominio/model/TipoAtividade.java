package br.com.dominio.model;

import java.io.Serializable;

public enum TipoAtividade {

	APRESENTACAO("Apresentacao"), CURSO("Curso"), MINICURSO("Minicurso"), PALESTRA("Palestra"), SAMINARIO("Seminário"),
	SIMPOSIO("Simpósio"), OUTRAS("Outras");

	private String descricao;

	TipoAtividade(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return this.descricao;
	}
}
