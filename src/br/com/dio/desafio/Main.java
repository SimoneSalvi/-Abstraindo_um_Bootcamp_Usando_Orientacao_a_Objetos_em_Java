package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setCargaHoraria(8);
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição curso Java");

		Curso curso2 = new Curso();
		curso2.setCargaHoraria(4);
		curso2.setTitulo("Curso HTML");
		curso2.setDescricao("Descrição curso HTML");

		
		/*
		//exemplo de polimorfismo, instanciar um objeto de diferentes formas
		//novo curso a partir da classe Conteudo
		Conteudo conteudo =  new Curso();
		COnteudo conteudo = new Mentoria();
*/		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria de Java");
		mentoria1.setDescricao("Descrição de mentoria");
		mentoria1.setData(LocalDate.now());

/*		System.out.println(curso1);
		System.out.println(mentoria1);
*/
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devSimone = new Dev();
		devSimone.setNome("Simone");
		devSimone.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos Simone: " + devSimone.getConteudosInscritos()) ;
		devSimone.progredir();
		devSimone.progredir();
		devSimone.progredir();
		System.out.println("Conteudos inscritos Simone: " + devSimone.getConteudosConcluidos()) ;
		System.out.println("XP: " + devSimone.calcularTotalXp());

		System.out.println(" --*--##--*--");
		
		Dev devMaria = new Dev();
		devMaria.setNome("Maria");
		devMaria.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos Maria: " + devMaria.getConteudosInscritos()) ;
		devMaria.progredir();
		devMaria.progredir();
		devMaria.progredir();
		System.out.println("Conteudos inscritos Maria: " + devMaria.getConteudosConcluidos()) ;
		System.out.println("XP: " + devMaria.calcularTotalXp());

	}

}
