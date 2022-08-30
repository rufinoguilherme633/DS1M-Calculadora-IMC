package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Cliente;

public class FrameCalculoImc {
	
	public String titulo;
	public int altura;
	public int largura;
	public Color corDeFundoDaTela;
	public Font fonteDosLabels;
	public Color corDoTextoDoBotao;
	public Color corDoBotao;
	
	public void criarTela() {
		
		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
		// Pegar o container para colocar componentes dentro dele
		Container painel = tela.getContentPane();
		painel.setBackground(corDeFundoDaTela);
		
		// Criar os componentes que serão colocados no container(painel)
		JLabel labelImc = new JLabel();
		labelImc.setText("IMC");
		labelImc.setBounds(30, 10, 100, 30);
		labelImc.setFont(new Font("Courier new", Font.BOLD, 32));
		labelImc.setForeground(new Color(113, 32, 61));
		
		JLabel labelNome = new JLabel();
		labelNome.setText("Nome:");
		labelNome.setBounds(30, 50, 100, 30);
		labelNome.setFont(fonteDosLabels);
		
		JTextField textFieldNome = new JTextField();
		textFieldNome.setBounds(30, 80, 310, 30);
		
		JLabel labelPeso = new JLabel();
		labelPeso.setText("Peso:");
		labelPeso.setBounds(30, 120, 100, 30);
		labelPeso.setFont(fonteDosLabels);
		
		JTextField textFieldPeso = new JTextField();
		textFieldPeso.setBounds(30, 150, 100, 30);
		
		JLabel labelAltura = new JLabel();
		labelAltura.setText("Altura:");
		labelAltura.setBounds(30, 190, 100, 30);
		labelAltura.setFont(fonteDosLabels);
		
		JTextField textFieldAltura = new JTextField();
		textFieldAltura.setBounds(30, 220, 100, 30);
		
		JLabel labelDataNascimento = new JLabel();
		labelDataNascimento.setText("Data Nascimento:");
		labelDataNascimento.setBounds(30, 260, 100, 30);
		labelDataNascimento.setFont(fonteDosLabels);
		
		JTextField textFieldDataNascimento = new JTextField();
		textFieldDataNascimento.setBounds(30, 290, 100, 30);
		
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(240, 290, 100, 30);
		buttonCalcular.setForeground(corDoTextoDoBotao);
		buttonCalcular.setBackground(corDoBotao);
		
		JLabel labelResultadoImc = new JLabel();
		labelResultadoImc.setText("Seu IMC é xxxx");
		labelResultadoImc.setBounds(30, 340, 300, 30);
		
		JLabel labelStatusImc = new JLabel();
		labelStatusImc.setText("Seu Status IMC é xxxx");
		labelStatusImc.setBounds(30, 380, 300, 30);
		
		// Eventos
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Cliente cliente = new Cliente();
				cliente.nome = textFieldNome.getText();
				cliente.peso = Double.parseDouble(textFieldPeso.getText());
				cliente.altura = Double.parseDouble(textFieldAltura.getText());
				
				labelResultadoImc.setText(cliente.nome + ", seu IMC é " + cliente.getImc());
				labelStatusImc.setText("Status IMC: " + cliente.getStatusImc());
			}
		});
		
		textFieldPeso.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {

						
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				
				textFieldPeso.setText(textFieldPeso.getText().replaceAll("[^0-9]", ""));
				
			}
			
			/**
			 *
			 */
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println(e.getKeyCode());
				if (e.getKeyCode() ==10) {
				  textFieldAltura.requestFocus();
				}
			}
		});
		
		// Colocar os componentes no container
		painel.add(labelImc);
		painel.add(labelNome);
		painel.add(textFieldNome);
		painel.add(labelPeso);
		painel.add(textFieldPeso);
		painel.add(labelAltura);
		painel.add(textFieldAltura);
		painel.add(labelDataNascimento);
		painel.add(textFieldDataNascimento);
		painel.add(buttonCalcular);
		painel.add(labelResultadoImc);
		painel.add(labelStatusImc);
		
		tela.setVisible(true);
	
		
		
	}

}











































