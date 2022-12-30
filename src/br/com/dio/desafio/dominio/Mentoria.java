package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

	// Atributos
	LocalDate data;

	// Construtor

	public Mentoria() {

	}

	@Override
	public double calcularXP() {
		return XP_PADRAO + 20d;
	}

	// Getters e Setters

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	// Metodo toString
	@Override
	public String toString() {
		return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]";
	}

}
