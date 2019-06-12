package control;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.text.ParseException;


import javax.swing.JOptionPane;
//import javax.swing.JPanel;

import model.ModelAluno;
import view.PainelAluno;
import view.PainelMoldura;
import view.PainelTelaPrincipal;

public class ControlAluno implements ActionListener{

	// implements ActionListener
	private PainelTelaPrincipal paineltelaprincipal;
	//private JPanel PainelTelaPrincipal;
	private ModelAluno modelaluno;
	private PainelAluno painelaluno;
	private PainelMoldura imagem;

	public ControlAluno(PainelAluno painelaluno) {


		this.painelaluno = painelaluno;
		//this.paineltelaprincipal = paineltelaprincipal;
		//this.PainelTelaPrincipal = PainelTelaPrincipal;

		//this.painelaluno.addCadastrarListener(new AlunoListener());
		addEventos();
	}
	
	private void addEventos() {
		
		Painelaluno().getjButtonCadastrar().addActionListener(this);
	}
	



	
		public void actionPerformed(ActionEvent e) {

			boolean nome = Modelaluno().TesteNome();
			boolean matricula = Modelaluno().TesteMatricula();
			
			

			if (e.getSource() == Painelaluno().getjButtonCadastrar()) {
			// modelaluno.carregandodados();
			
				if (!(nome)) {
					painelaluno.displayErrorMessage("Digite um nome válido");
	
				}
				if (!(matricula)) {
					painelaluno.displayErrorMessage("Digite um valor válido na matricula");
				}
				/*if (!(cpf)) {
					painelaluno.displayErrorMessage("Digite um valor válido no CPF");
				}
				if (!(rg)) {
					painelaluno.displayErrorMessage("Digite um valor válido no RG");
				}*/ else if (nome && matricula ) {
	
					try {
						modelaluno.GuardandoDados();
						modelaluno.limpaCampos();
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
	
					JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");
	
				}
			}
		}

	

	private PainelAluno Painelaluno() {
		if (painelaluno == null) {
			painelaluno = new PainelAluno();
		}
		return painelaluno;
	}

	private ModelAluno Modelaluno() {
		if (modelaluno == null) {
			modelaluno = new ModelAluno(painelaluno);
		}
		return modelaluno;
	}

	public PainelTelaPrincipal Paineltelaprincipal() {
		if (paineltelaprincipal == null) {
			paineltelaprincipal = new PainelTelaPrincipal();
		}
		return paineltelaprincipal;
	}

	public PainelMoldura getImagem() {
		if (imagem == null) {
			imagem = new PainelMoldura();
		}

		return imagem;
	}

}
