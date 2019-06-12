package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import control.controller_aluno.AlunoListener;
import model.ModelAluno;
import model.ModelProfessor;
import view.PainelProfessor;
import view.PainelAluno;
import view.PainelMoldura;

import banco.ProfessorBanco;

public class controller_professor {
	
	 //implements ActionListener
	PainelMoldura frame;
	PainelProfessor painelprofessor;
	ModelProfessor modelprofessor;
	
	public controller_professor(ModelProfessor modelprofessor , PainelProfessor painelprofessor ) {
		this.modelprofessor = modelprofessor;
		this.painelprofessor = painelprofessor;
		
		this.painelprofessor.addCadastrarListener(new AlunoListener());
		
		
		
		
	}
	
	class AlunoListener implements ActionListener{
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			
			boolean nome =  Modelprofessor().TesteNome();
			boolean matricula =  Modelprofessor().TesteMatricula();
			boolean formatrabalho = Modelprofessor().TesteComboBoxFormadeTrabalho();
			String formadetrabalho = Modelprofessor().getFormaTrabalho();
			
			// Ainda falta fazer a a��o na op��o de adicionar  um forma de trabalho 
			// Combobox de �rea n�o tem nenhuma fun��o ainda
			
			if(!(nome))
			{
				painelprofessor.displayErrorMessage("Digite um nome v�lido");
			}
			if(!(matricula))
			{
				painelprofessor.displayErrorMessage("Digite uma matricula v�lida");
			}
			if(!(formatrabalho))
			{
				painelprofessor.displayErrorMessage("Selecione uma op��o no campo de forma de trabalho");
			}
			else if( nome && matricula && formadetrabalho!="Selecione" && formadetrabalho!="Adicionar"   )
			{
				Modelprofessor().GuardandoDados();
				Modelprofessor().limpaCampos();
				
				JOptionPane.showMessageDialog(null, "Professor cadastrado com sucesso!");
				
			}
			
			
			
		}

	}


	private PainelProfessor Painelprofessor() {
		if(painelprofessor == null)
		{
			painelprofessor = new PainelProfessor();
		}
		return painelprofessor;
	}
	
	private ModelProfessor  Modelprofessor() {
		if(modelprofessor == null)
		{
			modelprofessor = new ModelProfessor(painelprofessor);
		}
		return modelprofessor;
	}

}