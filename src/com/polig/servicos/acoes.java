package com.polig.servicos;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

import com.polig.componentes.Componentes;

public class acoes {
	static int anguloX = 50;
	static int anguloY = 50;
	static String formaGeometrica;
	static int corA = 128;
	static int corB = 128;
	static int corC = 128;
	static int dimensaoX;
	static int dimensaoY;
	static int grauInicio = 0;
	static int grauFim = 0;
	
	static String degradeSelected = "não";

	static RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

	public static void acoes() {
		getAngulo();
		toggleButtonArco();
		acoesDesenhar();
		acoesLimpar();
		acaofechar();

	}

	private static void acaofechar() {
		Componentes.framePrincipal.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent evt) {
				System.exit(0);
			}
		});
	}

	private static void acoesLimpar() {
		Componentes.btLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				Componentes.panel.repaint();
			}
		});
	}

	private static void toggleButtonArco() {
		Componentes.btArco.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(MouseEvent evt) {
				Componentes.inicio.setVisible(true);
				Componentes.fim.setVisible(true);
				Componentes.lInicio.setVisible(true);
				Componentes.lFim.setVisible(true);
				Componentes.btRetangulo.setSelected(false);
				Componentes.btCirculo.setSelected(false);

			}

		});
		Componentes.btRetangulo.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(MouseEvent evt) {
				Componentes.inicio.setVisible(false);
				Componentes.fim.setVisible(false);
				Componentes.lInicio.setVisible(false);
				Componentes.lFim.setVisible(false);
				Componentes.btArco.setSelected(false);
				Componentes.btCirculo.setSelected(false);
			}

		});
		Componentes.btCirculo.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(MouseEvent evt) {
				Componentes.inicio.setVisible(false);
				Componentes.fim.setVisible(false);
				Componentes.lInicio.setVisible(false);
				Componentes.lFim.setVisible(false);
				Componentes.btRetangulo.setSelected(false);
				Componentes.btArco.setSelected(false);

			}

		});

	}

	private static void formaGeometrica() {

		try {
			if (Componentes.btCirculo.isSelected()) {
				formaGeometrica = "circulo";
			} else if (Componentes.btArco.isSelected()) {
				formaGeometrica = "arco";
			} else if (Componentes.btRetangulo.isSelected()) {
				formaGeometrica = "retangulo";
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Selecione uma, e apenas uma, forma geométrica");
		}

	}

	private static void getAngulo() {
		Componentes.panel.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(MouseEvent evt) {
				anguloX = evt.getX();
				anguloY = evt.getY();

			}

		});
	}

	private static void getDimensao() {
		dimensaoX = Integer.parseInt(Componentes.largura.getText());
		dimensaoY = Integer.parseInt(Componentes.altura.getText());
		grauInicio = Integer.parseInt(Componentes.inicio.getText());
		grauFim = Integer.parseInt(Componentes.fim.getText());

	}

	private static void acoesDesenhar() {
		Componentes.panel.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(MouseEvent evt) {
				colorir();
			}

		});
	}

	public static void colorir() {
		try {
			cor();
			formaGeometrica();
			getDimensao();

			rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
			Graphics2D g2d = (Graphics2D) Componentes.panel.getGraphics();

			switch (degradeSelected){
			case "sim":
				
				Color color1 = new Color(corA, corB, corC);
				GradientPaint gfx = new GradientPaint(10, 20, color1, 40, 30, Color.white, true);
				g2d.setPaint(gfx);
				break;
				
			default:
				
				
				g2d.setColor(new Color(corA, corB, corC));
					break;
			}
			
			g2d.addRenderingHints(rh);

			switch (formaGeometrica) {
			case "retangulo":
				g2d.fillRect(anguloX-(dimensaoX/2), anguloY-(dimensaoY/2), dimensaoX, dimensaoY);
				break;
			case "arco":
				g2d.fillArc(anguloX-(dimensaoX/2), anguloY-(dimensaoY/2), dimensaoX, dimensaoY, grauInicio, grauFim);
				break;
			case "circulo":
				g2d.fillOval(anguloX-(dimensaoX/2), anguloY-(dimensaoY/2), dimensaoX, dimensaoY);
				break;

			default:
				JOptionPane.showMessageDialog(null,
						"Selecione adequadamente a Cor, Forma geomética e Dimensão desejada!");
				break;
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Selecione adequadamente a Cor, Forma geomética e Dimensão desejada!");
		}
	}

	private static void cor() {
		try {
			if (Componentes.cyan.isSelected()) {
				corA = 0;
				corB = 255;
				corC = 255;
			} else if (Componentes.blue.isSelected()) {
				corA = 0;
				corB = 0;
				corC = 255;
			} else if (Componentes.gold.isSelected()) {
				corA = 255;
				corB = 215;
				corC = 0;
			} else if (Componentes.gray.isSelected()) {
				corA = 156;
				corB = 156;
				corC = 156;
			} else if (Componentes.green.isSelected()) {
				corA = 0;
				corB = 255;
				corC = 0;
			} else if (Componentes.lightGray.isSelected()) {
				corA = 207;
				corB = 207;
				corC = 207;
			} else if (Componentes.magenta.isSelected()) {
				corA = 255;
				corB = 0;
				corC = 255;
			} else if (Componentes.orange.isSelected()) {
				corA = 255;
				corB = 165;
				corC = 0;
			} else if (Componentes.pink.isSelected()) {
				corA = 255;
				corB = 192;
				corC = 203;
			} else if (Componentes.purple.isSelected()) {
				corA = 160;
				corB = 32;
				corC = 240;
			} else if (Componentes.red.isSelected()) {
				corA = 255;
				corB = 0;
				corC = 0;
			} else if (Componentes.sienna.isSelected()) {
				corA = 255;
				corB = 130;
				corC = 71;
			} else if (Componentes.turquoise.isSelected()) {
				corA = 64;
				corB = 224;
				corC = 208;
			} else if (Componentes.white.isSelected()) {
				corA = 255;
				corB = 255;
				corC = 255;
			} else if (Componentes.yellow.isSelected()) {
				corA = 255;
				corB = 255;
				corC = 0;
			} else if (Componentes.black.isSelected()) {
				corA = 0;
				corB = 0;
				corC = 0;
			} else {
				JOptionPane.showMessageDialog(null, "Escolha uma cor");
			}
			
			if (Componentes.degrade.isSelected()){
				degradeSelected = "sim";
			}else{
				degradeSelected = "nao";
			}
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao Definir Cor");
		}

	}

}
