package control;

import java.awt.event.ActionEvent;


import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


import view.PainelTurma;
import view.JFramePrincipal;
import view.PainelCurso;
import view.PainelMoldura;
import model.ModelCurso;
import model.ModelAluno;
import model.ModelTurma;
import banco.TurmaBanco;

public class ControlTurma implements ActionListener, KeyListener {

	JFramePrincipal frame;
	PainelTurma painelturma;

	ModelTurma modelTurma;

	public ControlTurma(JFramePrincipal frame, PainelTurma cadastro) {
		this.frame = frame;
		this.painelturma = cadastro;
		addEventos();
	}

	private void addEventos() {
		Painelturma().getJListAluno().addKeyListener(this);
		Painelturma().getJListProfessor().addKeyListener(this);
		Painelturma().getJButtonCadastrar().addActionListener(this);
		Painelturma().getJButtonAdicionarAluno().addActionListener(this);
		Painelturma().getJButtonAdicionarProfessor().addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e) {

		boolean horario = ModelTurma().TesteHorario();
		boolean dia = ModelTurma() .TesteDia();
		
		if(e.getSource() == Painelturma().getJButtonAdicionarAluno() )
		{
			
			String nome  = Painelturma().getJComboBoxAluno().getSelectedItem().toString();
			Painelturma().getJComboBoxAluno().removeItemAt(Painelturma().getJComboBoxAluno().getSelectedIndex());
			Painelturma().getDefaultListModelAluno().addElement(nome);
		}
		
		if(e.getSource() == Painelturma().getJButtonAdicionarProfessor() )
		{
			String nome  = Painelturma().getJComboBoxProfessor().getSelectedItem().toString();
			Painelturma().getJComboBoxProfessor().removeItemAt(Painelturma().getJComboBoxProfessor().getSelectedIndex());
			Painelturma().getDefaultListModelProfessor().addElement(nome);
		}
		
		if(e.getSource() == Painelturma().getJButtonCadastrar() )
		{
			
			if(Painelturma().getDefaultListModelAluno().size()<=5)
			{
				JOptionPane.showMessageDialog(null, "A quantidade alunos está abaixo do mínimo, que é de 5 alunos");
			}
			else if( Painelturma().getDefaultListModelAluno().size()>33)
			{
				JOptionPane.showMessageDialog(null, "A quantidade alunos está acima do máximo, que é de 33 alunos");
			}
			else if (!(horario))
				JOptionPane.showMessageDialog(null, "selecione um inicio e final de horário válidos");
			else if (!(dia))
				JOptionPane.showMessageDialog(null, "selecione um dia");
			else if (horario && dia) {
				ModelTurma().GuardandoDados();
			}

		}

	
	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_DELETE) {
			
			if(Painelturma().getJListAluno().getSelectedIndex() != -1)
			{
				String nome  = Painelturma().getJListAluno().getSelectedValue();
				Painelturma().getJComboBoxAluno().addItem(nome);
				Painelturma().getDefaultListModelAluno().remove(Painelturma().getJListAluno().getSelectedIndex());
			}
			else {
				
				String nome  = Painelturma().getJListProfessor().getSelectedValue();
				Painelturma().getJComboBoxProfessor().addItem(nome);
				Painelturma().getDefaultListModelProfessor().remove(Painelturma().getJListProfessor().getSelectedIndex());
				
			}
			
		}

	}

	private PainelTurma Painelturma() {
		if (painelturma == null) {
			painelturma = new PainelTurma();
		}
		return painelturma;
	}

	private ModelTurma ModelTurma() {
		if (modelTurma == null) {
			modelTurma = new ModelTurma(Painelturma());
		}
		return modelTurma;
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

}
