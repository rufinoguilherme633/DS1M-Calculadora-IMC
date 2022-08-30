package br.senai.sp.jandira;

import java.awt.Color;
import java.awt.Font;
import java.time.LocalDate;
import java.time.Period;

import br.senai.sp.jandira.gui.FrameCalculoImc;
import br.senai.sp.jandira.model.Cliente;

public class AppAcademia {

	public static void main(String[] args) {
		
		FrameCalculoImc tela = new FrameCalculoImc();
		tela.titulo = "Calculadora IMC";
		tela.altura = 500;
		tela.largura = 400;
		tela.corDeFundoDaTela = new Color(255, 0, 0);
		tela.fonteDosLabels = new Font("Cooper Black", Font.ITALIC, 16);
		tela.corDoTextoDoBotao = new Color(0, 200, 80);
		tela.corDoBotao = new Color(50, 0, 200);
		tela.criarTela();
		
//		FrameCalculoImc tela2 = new FrameCalculoImc();
//		tela2.titulo = "Teste de alguma coisa";
//		tela2.altura = 500;
//		tela2.largura = 400;
//		tela2.corDeFundoDaTela = new Color(10, 100, 100);
//		tela2.fonteDosLabels = new Font("Gabriola", Font.PLAIN, 24);
//		tela2.corDoBotao = new Color(50, 50, 50);
//		tela2.criarTela();
		
		Cliente maria = new Cliente();
		maria.nome = "Maria Antonieta";
		maria.peso = 57;
		maria.altura = 1.67;
		maria.dataNascimento = LocalDate.of(2004, 1, 10);
		
		System.out.println(maria.getImc());
		System.out.println(maria.getIdade());
		System.out.println(maria.getStatusImc());
		
		if (maria.getIdade() >= 21) {
			System.out.printf("%s está autorizada(o), já tem %s anos de idade.\n\n", maria.nome, maria.getIdade());
		} else {
			System.out.println("Não pode\n participar!!");
		}
		
		Cliente pedro = new Cliente();
		pedro.nome = "Pedro Alvares Cabral";
		pedro.peso = 78.5;
		pedro.altura = 1.74;
		pedro.dataNascimento = LocalDate.of(1996, 9, 30);
		
		System.out.println(pedro.getImc());
		System.out.println(pedro.getIdade());
		
	}

}
