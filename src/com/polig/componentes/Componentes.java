//	www.flextool.com.br/tabela_cores.html */

package com.polig.componentes;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class Componentes {

	public static JFrame framePrincipal = new JFrame("|Frame");
	public static JPanel panel = new JPanel();
	public static JButton btLimpar = new JButton("Limpar");
	
	public static JToggleButton btRetangulo = new JToggleButton("Quadrado/Retangulo");
	public static JToggleButton btCirculo = new JToggleButton("Circulo");
	public static JToggleButton btArco = new JToggleButton("Arco");
	
	public static JToggleButton cyan = new JToggleButton();
	public static JToggleButton black = new JToggleButton();
	public static JToggleButton blue = new JToggleButton();
	public static JToggleButton orange = new JToggleButton();
	public static JToggleButton green = new JToggleButton();
	public static JToggleButton gray = new JToggleButton();
	public static JToggleButton lightGray = new JToggleButton();
	public static JToggleButton magenta = new JToggleButton();
	public static JToggleButton pink = new JToggleButton();
	public static JToggleButton turquoise = new JToggleButton();
	public static JToggleButton purple = new JToggleButton();
	public static JToggleButton red = new JToggleButton();
	public static JToggleButton gold = new JToggleButton();
	public static JToggleButton sienna = new JToggleButton();
	public static JToggleButton white = new JToggleButton();
	public static JToggleButton yellow = new JToggleButton();
	
	public static JToggleButton degrade = new JToggleButton("Degradê");
	
	public static JLabel lLargura = new JLabel("Largura:");
	public static JLabel lAltura = new JLabel("Altura:");
	public static JLabel lInicio = new JLabel("°Início:");
	public static JLabel lFim = new JLabel("°Fim:");
	public static JLabel lMensagemDesenhar = new JLabel("Click no painel de desenho abaixo para inserir a Figura :)");
	
	public static JTextField largura = new JTextField();
	public static JTextField altura = new JTextField();
	public static JTextField inicio = new JTextField("0");
	public static JTextField fim = new JTextField("0");
	
	public static void telaPrincipal() {
		
			framePrincipal.setVisible(true);
			framePrincipal.setSize(800, 600);
			framePrincipal.setLayout(null);
			framePrincipal.getContentPane().setBackground(Color.DARK_GRAY);
			framePrincipal.setLocationRelativeTo(null);
			framePrincipal.setResizable(false);
			
			panel.setVisible(true);
			panel.setBounds(20,50,500,450);
			panel.setLayout(null);
			panel.setBackground(Color.gray);
			
			btLimpar.setVisible(true);
			btLimpar.setBounds(600, 450, 100, 40);
			btLimpar.setBackground(Color.white);
			
			framePrincipal.add(panel);
			framePrincipal.add(btLimpar);
			
			largura.setVisible(true);
			largura.setBounds(600, 100, 40, 20);
			framePrincipal.add(largura);
			
			altura.setVisible(true);
			altura.setBounds(710, 100, 40, 20);
			framePrincipal.add(altura);
			
			inicio.setVisible(true);
			inicio.setBounds(600, 150, 40, 20);
			framePrincipal.add(inicio);
			
			fim.setVisible(true);
			fim.setBounds(710, 150, 40, 20);
			framePrincipal.add(fim);
			
			lLargura.setVisible(true);
			lLargura.setBounds(550, 95, 50, 30);
			lLargura.setForeground(Color.white);
			framePrincipal.add(lLargura);
			
			lAltura.setVisible(true);
			lAltura.setBounds(670, 95, 40, 30);
			lAltura.setForeground(Color.white);
			framePrincipal.add(lAltura);
			
			lInicio.setVisible(true);
			lInicio.setBounds(550, 145, 50, 30);
			lInicio.setForeground(Color.white);
			framePrincipal.add(lInicio);
			
			lFim.setVisible(true);
			lFim.setBounds(670, 145, 40, 30);
			lFim.setForeground(Color.white);
			framePrincipal.add(lFim);
			
			lMensagemDesenhar.setVisible(true);
			lMensagemDesenhar.setBounds(30, 20, 450, 30);
			lMensagemDesenhar.setForeground(Color.white);
			framePrincipal.add(lMensagemDesenhar);
						
			toggleButtons();
			
		}

	public static void toggleButtons() {
		
		btCirculo.setBounds(550, 20, 80, 20);
		btCirculo.setVisible(true);
		framePrincipal.add(btCirculo);
		
		btArco.setBounds(650, 20, 80, 20);
		btArco.setVisible(true);
		framePrincipal.add(btArco);
		
		btRetangulo.setBounds(565, 45, 150, 20);
		btRetangulo.setVisible(true);
		framePrincipal.add(btRetangulo);
		
		
		 cyan.setVisible(true);
		 cyan.setBounds(550, 200, 40, 40);
		 cyan.setBackground(Color.cyan);
		 framePrincipal.add(cyan);
		 cyan.setName("cyan");
		 
		 black.setVisible(true);
		 black.setBounds(600, 200, 40, 40);
		 black.setBackground(Color.black);
		 framePrincipal.add(black);
		 black.setName("black");
		 
		 blue.setVisible(true);
		 blue.setBounds(650, 200, 40, 40);
		 blue.setBackground(Color.blue);
		 framePrincipal.add(blue);
		 blue.setName("blue");
		 
		 orange.setVisible(true);
		 orange.setBounds(700, 200, 40, 40);
		 orange.setBackground(Color.orange);
		 framePrincipal.add(orange);
		 orange.setName("orange");
		 
		 green.setVisible(true);
		 green.setBounds(550, 250, 40, 40);
		 green.setBackground(Color.green);
		 framePrincipal.add(green);
		 green.setName("green");
		 
		 gray.setVisible(true);
		 gray.setBounds(600, 250, 40, 40);
		 gray.setBackground(Color.gray);
		 framePrincipal.add(gray);
		 gray.setName("gray");
		 
		 lightGray.setVisible(true);
		 lightGray.setBounds(650, 250, 40, 40);
		 lightGray.setBackground(Color.LIGHT_GRAY);
		 framePrincipal.add(lightGray);
		 lightGray.setName("lightGray");
		 
		 magenta.setVisible(true);
		 magenta.setBounds(700, 250, 40, 40);
		 magenta.setBackground(Color.magenta);
		 framePrincipal.add(magenta);
		 magenta.setName("magenta");
		 
		 pink.setVisible(true);
		 pink.setBounds(550, 300, 40, 40);
		 pink.setBackground(Color.pink);
		 framePrincipal.add(pink);
		 pink.setName("pink");
		 
		 turquoise.setVisible(true);
		 turquoise.setBounds(600, 300, 40, 40);
		 turquoise.setBackground( new Color(64, 224 ,208));
		 framePrincipal.add(turquoise);
		 turquoise.setName("turquoise");
		 
		 purple.setVisible(true);
		 purple.setBounds(650, 300, 40, 40);
		 purple.setBackground(new Color(160,32,240));
		 framePrincipal.add(purple);
		 purple.setName("purple");
		 
		 red.setVisible(true);
		 red.setBounds(700, 300, 40, 40);
		 red.setBackground(Color.red);
		 framePrincipal.add(red);
		 red.setName("red");
		 
		 gold.setVisible(true);
		 gold.setBounds(550, 350, 40, 40);
		 gold.setBackground(new Color(205, 173, 0 ));
		 framePrincipal.add(gold);
		 gold.setName("gold");
		 
		 sienna.setVisible(true);
		 sienna.setBounds(600, 350, 40, 40);
		 sienna.setBackground(new Color(255, 130, 71));
		 framePrincipal.add(sienna);
		 sienna.setName("sienna");
		 
		 white.setVisible(true);
		 white.setBounds(650, 350, 40, 40);
		 white.setBackground(Color.white);
		 framePrincipal.add(white);
		 white.setName("white");
		 
		 yellow.setVisible(true);
		 yellow.setBounds(700, 350, 40, 40);
		 yellow.setBackground(Color.yellow);
		 framePrincipal.add(yellow);
		 yellow.setName("yellow");
		 
		 degrade.setVisible(true);
		 degrade.setBounds(600, 400, 100, 20);
		 framePrincipal.add(degrade);
		 
	}		
	}


