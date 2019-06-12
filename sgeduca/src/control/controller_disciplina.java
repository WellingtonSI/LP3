package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import control.controller_aluno.AlunoListener;
import model.ModelAluno;
import model.model_disciplina;
import view.PainelDisciplina;
import view.PainelAluno;
import view.PainelMoldura;

import banco.DisciplinaBanco;

public class controller_disciplina {
	
	 //implements ActionListener
	PainelMoldura frame;
	PainelDisciplina paineldisciplina;
	model_disciplina modeldisciplina;
	
	public controller_disciplina(model_disciplina modeldisciplina , PainelDisciplina paineldisciplina ) {
		this.modeldisciplina = modeldisciplina;
		this.paineldisciplina = paineldisciplina;
		
		this.paineldisciplina.addCadastrarListener(new AlunoListener());
		
		
		
		
	}
	
	class AlunoListener implements ActionListener{
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
				modeldisciplina().GuardandoDados();
				modeldisciplina.limpaCampos();
			
				JOptionPane.showMessageDialog(null, "Disciplina cadastrada com sucesso!");
			
			
		}

		

	}


	private PainelDisciplina paineldisciplina() {
		if(paineldisciplina == null)
		{
			paineldisciplina = new PainelDisciplina();
		}
		return paineldisciplina;
	}
	
	private model_disciplina  modeldisciplina() {
		if(modeldisciplina == null)
		{
			modeldisciplina = new model_disciplina(paineldisciplina);
		}
		return modeldisciplina;
	} 

}