package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import model.ModelAluno;
import model.ModelProfessor;
import view.PainelProfessor;
import view.PainelTelaPrincipal;
import view.JFramePrincipal;
import view.PainelAluno;
import view.PainelMoldura;

import banco.ProfessorBanco;

public class ControlProfessor implements ActionListener {


	private PainelMoldura frame;
	private PainelProfessor painelprofessor;
	private ModelProfessor modelprofessor;
	private PainelTelaPrincipal painelTelaPrincipal;
	private JFramePrincipal jFramePrincipal;


	public ControlProfessor(JFramePrincipal jFramePrincipal, PainelProfessor painelprofessor) {
		
		this.jFramePrincipal = jFramePrincipal;
		this.painelprofessor = painelprofessor;
		addEventos();
		
		
	}
	
	private void addEventos() {
		Painelprofessor().getjButtonCadastrar().addActionListener(this);
	}


	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == Painelprofessor().getjButtonCadastrar()) {
			boolean nome = Modelprofessor().TesteNome();
			boolean matricula = Modelprofessor().TesteMatricula();
			boolean formatrabalho = Modelprofessor().TesteComboBoxFormadeTrabalho();
			String formadetrabalho = Modelprofessor().getFormaTrabalho();

			// Ainda falta fazer a a��o na op��o de adicionar um forma de trabalho
			// Combobox de �rea n�o tem nenhuma fun��o ainda

			if (!(nome)) {
				Painelprofessor().displayErrorMessage("Digite um nome v�lido");
			}
			if (!(matricula)) {
				Painelprofessor().displayErrorMessage("Digite uma matricula v�lida");
			}
			if (!(formatrabalho)) {
				Painelprofessor().displayErrorMessage("Selecione uma op��o no campo de forma de trabalho");
				
			} 
			else if (nome && matricula && formadetrabalho != "Selecione" && formadetrabalho != "Adicionar") {
				Modelprofessor().GuardandoDados();
				Modelprofessor().limpaCampos();
				JOptionPane.showMessageDialog(null, "Professor cadastrado com sucesso!");
			//	getjFramePrincipal().setContentPane(getPainelTelaPrincipal());
			//	getjFramePrincipal().repaint();
			//	getjFramePrincipal().validate();
	
			}
		}

	}

	private PainelProfessor Painelprofessor() {
		if (painelprofessor == null) {
			painelprofessor = new PainelProfessor();
		}
		return painelprofessor;
	}

	private ModelProfessor Modelprofessor() {
		if (modelprofessor == null) {
			modelprofessor = new ModelProfessor(Painelprofessor());
		}
		return modelprofessor;
	}

	public JFramePrincipal getjFramePrincipal() {
		if (jFramePrincipal == null) {
			jFramePrincipal = new JFramePrincipal();
		}
		return jFramePrincipal;
	}



	public PainelTelaPrincipal getPainelTelaPrincipal() {
		if (painelTelaPrincipal == null) {
			painelTelaPrincipal = new PainelTelaPrincipal();
		}
		return painelTelaPrincipal;
	}

}