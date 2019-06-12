package control;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.ModelCurso;
import view.PainelCurso;
import view.PainelMoldura;

import banco.CursoBanco;


public class ControlCurso implements ActionListener{
	
    PainelMoldura frame;
    PainelCurso PainelCurso;
	ModelCurso modelcurso;
	
	public ControlCurso(PainelCurso PainelCurso) {

		this.PainelCurso = PainelCurso;
		

		
		addEventos();
		
	}
	
		private void addEventos() {
				
			PainelCurso().getjButtonCadastrar().addActionListener(this);
		}
			

		

		public void actionPerformed(ActionEvent e) {
			
			boolean nome = Modelcurso().TesteNome();
			boolean quantidade  = Modelcurso().TesteQuantidadeSemestre();
			boolean tipocurso = Modelcurso().TesteTipodeCurso();
			boolean modalidadensino = Modelcurso().ModalidadeDeEnsino();
			
			if (e.getSource() == PainelCurso().getjButtonCadastrar()) {
			
				if (!(nome)) {
					PainelCurso.displayErrorMessage("Digite um nome válido");
	
				}
				if (!(quantidade)) {
					PainelCurso.displayErrorMessage("Preencha o campo de quantidade de semestre");
				}
				if (!(tipocurso)) {
					PainelCurso.displayErrorMessage("Escolha um tipo de curso");
				}
				if (!(modalidadensino)) {
					PainelCurso.displayErrorMessage("Escolha uma modalidade de ensino");
				}
				else if(nome && quantidade && tipocurso && modalidadensino )
				{
					Modelcurso().GuardandoDados();
					Modelcurso().limpaCampos();
					
					JOptionPane.showMessageDialog(null, "Curso cadastrado com sucesso!");
				}
			
				
			}
			
			
		}

	

	private PainelCurso PainelCurso() {
		if(PainelCurso == null)
		{
			PainelCurso = new PainelCurso();
		}
		return PainelCurso;
	}
	
	private ModelCurso Modelcurso() {
		if(modelcurso == null)
		{
			modelcurso = new ModelCurso(PainelCurso);
		}
		return modelcurso;
	}


}
