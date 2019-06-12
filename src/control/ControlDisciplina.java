package control;

import java.awt.event.ActionEvent;


import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;

//import control.controller_aluno.AlunoListener;
import model.ModelAluno;
import model.ModelDisciplina;
import view.PainelDisciplina;
import view.PainelAluno;
import view.PainelMoldura;

import banco.DisciplinaBanco;

public class ControlDisciplina implements  ActionListener,KeyListener  {
	

	PainelMoldura frame;
	PainelDisciplina PainelDisciplina;
	ModelDisciplina modeldisciplina;
	
	public ControlDisciplina(PainelDisciplina PainelDisciplina ) {
		this.PainelDisciplina = PainelDisciplina;
		
		//this.PainelDisciplina.addCadastrarListener(new AlunoListener());
		addEventos();
	}
	
	private void addEventos() {
		PainelDisciplina().getjButtonCadastrar().addActionListener(this);
		PainelDisciplina().getjButtonAdicionarPreRequisito().addActionListener(this);
		PainelDisciplina().getjListPreRequisito().addKeyListener(this);
	}
	

		
		public void actionPerformed(ActionEvent e) {
			
			boolean nome = modeldisciplina().TesteNome();
			boolean departamento = modeldisciplina().TesteDepartamento();
			boolean codigodisciplina = modeldisciplina().TesteCodigoDisciplina();
			boolean semestre = modeldisciplina().TesteSemestre();
			boolean cargahoraria = modeldisciplina().TesteComboBoxCargaHoraria();
			boolean tipodisciplina = modeldisciplina().TesteComboBoxTipoDisciplina();
			
			if (e.getSource() == PainelDisciplina().getjButtonCadastrar()) {
				if(!(nome))
				{
					PainelDisciplina().displayErrorMessage("Digite um nome válido");
				}
				if(!(departamento))
				{
					PainelDisciplina().displayErrorMessage("Digite um nome de departamento válido");
				}
				if(!(codigodisciplina))
				{
					PainelDisciplina().displayErrorMessage("Digite um código de disciplina válido");
				}
				if(!(semestre))
				{
					PainelDisciplina().displayErrorMessage("Digite uma quantidade de semestre válida");
				}
				if(!(cargahoraria))
				{
					PainelDisciplina().displayErrorMessage("Selecione uma carga horária");
				}
				if(!(tipodisciplina))
				{
					PainelDisciplina().displayErrorMessage("Selecione um tipo de disciplina");
				}
				else if(nome && departamento && codigodisciplina && semestre && cargahoraria && tipodisciplina)
				{	
					modeldisciplina().GuardandoDados();
					modeldisciplina().limpaCampos();
				
					JOptionPane.showMessageDialog(null, "Disciplina cadastrada com sucesso!");
				}
			
			}
			
			if (e.getSource() == PainelDisciplina().getjButtonAdicionarPreRequisito()) {
				
				String nomeDisciplina  = PainelDisciplina().getJcomboBoxPreRequisito().getSelectedItem().toString();
				PainelDisciplina().getJcomboBoxPreRequisito().removeItemAt(PainelDisciplina().getJcomboBoxPreRequisito().getSelectedIndex());
				PainelDisciplina().getdefaultListModelPreRequisito().addElement(nomeDisciplina);
				
				
				
			}
		}
		
		public void keyPressed(KeyEvent e) {
			
			if (e.getKeyCode() == KeyEvent.VK_DELETE) {
				
				if(PainelDisciplina().getjListPreRequisito().getSelectedIndex() != -1)
				{
					String nome  = PainelDisciplina().getjListPreRequisito().getSelectedValue();
					PainelDisciplina().getJcomboBoxPreRequisito().addItem(nome);
					PainelDisciplina().getdefaultListModelPreRequisito().remove(PainelDisciplina().getjListPreRequisito().getSelectedIndex());
				}
				
				
			}
			
		}

		

	


	private PainelDisciplina PainelDisciplina() {
		if(PainelDisciplina == null)
		{
			PainelDisciplina = new PainelDisciplina();
		}
		return PainelDisciplina;
	}
	
	private ModelDisciplina  modeldisciplina() {
		if(modeldisciplina == null)
		{
			modeldisciplina = new ModelDisciplina(PainelDisciplina);
		}
		return modeldisciplina;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	} 

}