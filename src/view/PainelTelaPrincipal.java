package view;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import control.ControlPainelTelaPrincipal;

//import control.ControlJFramePrincipal;

//import visao.PainelMenuPrincipal;

import java.awt.Color;
import java.awt.SystemColor;

public class PainelTelaPrincipal extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private PainelMoldura JPanelimagem;
	private PainelTelaPrincipal jPainelTelaPrincipal;
	private JLabel labelImagem;  
	private ImageIcon marca;
	private JPanel imagem;
	private ControlPainelTelaPrincipal controlPainelTelaPrincipal;
	 
	
	
	public PainelTelaPrincipal() {
	
		setLayout(null);
		setVisible(true);
		setSize(998, 672);
		setBackground(new Color(198,232,245));
		add(LabelImagem());
		 
		
	}


	
	public PainelMoldura getJPanelImagem() {
		if(JPanelimagem == null)
		{
			JPanelimagem = new PainelMoldura();
		}
			
		
		return JPanelimagem;
	}

	public void setImagem(PainelMoldura imagem) {
		this.JPanelimagem = imagem;
	}
	
	public JLabel LabelImagem() {
        if(labelImagem == null){
            labelImagem = new JLabel();
            labelImagem.setIcon(new ImageIcon(PainelTelaPrincipal.class.getResource("marca.jpg")));
            labelImagem.setBounds(353,75,800,411);
        }
        return labelImagem;
    }
	public ControlPainelTelaPrincipal getControlPainelTelaPrincipal() {
		if(controlPainelTelaPrincipal == null)
		{
			controlPainelTelaPrincipal = new ControlPainelTelaPrincipal(null);
		}
		
		return controlPainelTelaPrincipal;
	}

}


