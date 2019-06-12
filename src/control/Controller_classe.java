package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.PainelTurma;
import view.PainelMoldura;

public class Controller_classe implements ActionListener {
	
	PainelMoldura frame;
	PainelTurma cadastro;
	
	public Controller_classe(PainelMoldura  frame, PainelTurma cadastro) {
		this.frame = frame;
		this.cadastro = cadastro;
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
	}

}
