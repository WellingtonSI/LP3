package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import control.controller_aluno.AlunoListener;

import model.ModelCurso;
import view.PainelCurso;
import view.PainelMoldura;

import banco.CursoBanco;

public class ControlCurso{
	
    PainelMoldura frame;
    PainelCurso painelcurso;
	ModelCurso modelcurso;
	
	public ControlCurso(ModelCurso modelcurso  , PainelCurso painelcurso ) {
		this.modelcurso = modelcurso;
		this.painelcurso = painelcurso;
		
		this.painelcurso.addCadastrarListener(new AlunoListener());
		
		
		
	}
	
	class AlunoListener implements ActionListener{
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			
			
				Modelcurso().GuardandoDados();
				Modelcurso().limpaCampos();
				
				JOptionPane.showMessageDialog(null, "Curso cadastrado com sucesso!");
			
			
			
		}

	}
	

	private PainelCurso Painelcurso() {
		if(painelcurso == null)
		{
			painelcurso = new PainelCurso();
		}
		return painelcurso;
	}
	
	private ModelCurso Modelcurso() {
		if(modelcurso == null)
		{
			modelcurso = new ModelCurso(painelcurso);
		}
		return modelcurso;
	}


}
