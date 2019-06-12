package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import view.JFramePrincipal;
import view.PainelAluno;
import view.PainelCurso;
import view.PainelDisciplina;
import view.PainelMoldura;
import view.PainelProfessor;
import view.PainelTelaPrincipal;
import view.PainelTurma;

public class ControlPainelTelaPrincipal implements ActionListener {

	static JFramePrincipal jframePrincipal;
	private static PainelTelaPrincipal painelTelaPrincipal;
	private ControlProfessor controlProfessor;
	private ControlAluno controlAluno;
	private ControlDisciplina controlDisciplina;
	private ControlTurma controlTurma;
	private ControlCurso controlCurso;
	private ControlPainelTelaPrincipal controlPainelTelaPrincipal;

	private PainelAluno painelAluno;
	private PainelProfessor telaProfessor;
	private PainelDisciplina telaDisciplina;
	private PainelTurma painelTurma;
	private PainelCurso telaCurso;
	private PainelMoldura imagem;

	public static void main(String[] args) {
		new ControlPainelTelaPrincipal(getjFramePrincipal());
	}

	public ControlPainelTelaPrincipal(JFramePrincipal jframeprincipal) {

		this.jframePrincipal = jframeprincipal;

		getjFramePrincipal().setContentPane(getPainelTelaPrincipal());
		// getjFramePrincipal().removeAll();
		getjFramePrincipal().getJMenuBar().add(getjFramePrincipal().getJMenu());
		getjFramePrincipal().repaint();
		getjFramePrincipal().validate();

		addEventos();

	}

	private void addEventos() {
		getjFramePrincipal().getMenuItemInicio().addActionListener(this);
		getjFramePrincipal().menuItemProfessor().addActionListener(this);
		getjFramePrincipal().getmenuItemDisciplina().addActionListener(this);
		getjFramePrincipal().getmenuItemAluno().addActionListener(this);
		getjFramePrincipal().getmenuItemTurma().addActionListener(this);
		getjFramePrincipal().getmenuItemCurso().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == getjFramePrincipal().menuItemProfessor()) {
			getjFramePrincipal().setContentPane(getPainelProfessor());
			getjFramePrincipal().setTitle("Cadastro de professores");
			getjFramePrincipal().repaint();
			getjFramePrincipal().validate();
			getControlProfessor();
		} else if (e.getSource() == getjFramePrincipal().getmenuItemDisciplina()) {

			getjFramePrincipal().setContentPane(getTela_disciplina());
			getjFramePrincipal().setTitle("Cadastro de disciplinas");
			getjFramePrincipal().repaint();
			getjFramePrincipal().validate();
			getControlDisciplina();
		} else if (e.getSource() == getjFramePrincipal().getmenuItemAluno()) {

			getjFramePrincipal().setContentPane(getPainelAluno());
			getjFramePrincipal().setTitle("Cadastro De Alunos");
			getjFramePrincipal().repaint();
			getjFramePrincipal().validate();
			getControlAluno();
		} else if (e.getSource() == getjFramePrincipal().getmenuItemCurso()) {
			// ControlCurso cont = new ControlCurso(null, getTela_curso());

			getjFramePrincipal().setContentPane(getTela_curso());
			getjFramePrincipal().setTitle("Cadastro De Cursos");
			getjFramePrincipal().repaint();
			getjFramePrincipal().validate();
			getControlCurso();
		} else if (e.getSource() == getjFramePrincipal().getmenuItemTurma()) {
			// ControlTurma cont = new ControlTurma(null, getPainelTurma());

			getjFramePrincipal().setContentPane(getPainelTurma());
			getjFramePrincipal().setTitle("Cadastro De Turma");
			getjFramePrincipal().repaint();
			getjFramePrincipal().validate();
			getControlTurma();
		} else if (e.getSource() == getjFramePrincipal().getMenuItemInicio()) {
			// ControlPainelTelaPrincipal cont = new
			// ControlPainelTelaPrincipal(getjFramePrincipal());

			getjFramePrincipal().setContentPane(getPainelTelaPrincipal());
			getjFramePrincipal().setTitle("Home");
			getjFramePrincipal().repaint();
			getjFramePrincipal().validate();
			getControlPainelTelaPrincipal();

		}

	}

	public static JFramePrincipal getjFramePrincipal() {
		if (jframePrincipal == null) {
			jframePrincipal = new JFramePrincipal();
		}
		return jframePrincipal;
	}

	public static PainelTelaPrincipal getPainelTelaPrincipal() {
		if (painelTelaPrincipal == null) {
			painelTelaPrincipal = new PainelTelaPrincipal();
		}
		return painelTelaPrincipal;
	}

	public PainelProfessor getPainelProfessor() {
		if (telaProfessor == null) {
			telaProfessor = new PainelProfessor();
		}
		return telaProfessor;
	}

	public PainelDisciplina getTela_disciplina() {
		if (telaDisciplina == null) {
			telaDisciplina = new PainelDisciplina();
		}
		return telaDisciplina;
	}

	public PainelTurma getPainelTurma() {
		if (painelTurma == null) {
			painelTurma = new PainelTurma();
		}
		return painelTurma;
	}

	public PainelAluno getPainelAluno() {
		if (painelAluno == null) {
			painelAluno = new PainelAluno();
		}
		return painelAluno;
	}

	public PainelCurso getTela_curso() {
		if (telaCurso == null) {
			telaCurso = new PainelCurso();
		}
		return telaCurso;
	}

	public PainelMoldura getImagem() {
		if (imagem == null) {
			imagem = new PainelMoldura();
		}
		return imagem;
	}

	public ControlProfessor getControlProfessor() {
		if (controlProfessor == null) {
			controlProfessor = new ControlProfessor(getjFramePrincipal(),getPainelProfessor());
		}
		return controlProfessor;
	}

	public ControlAluno getControlAluno() {
		if (controlAluno == null) {
			controlAluno = new ControlAluno(getPainelAluno());
		}
		return controlAluno;
	}

	public ControlDisciplina getControlDisciplina() {
		if (controlDisciplina == null) {
			controlDisciplina = new ControlDisciplina(getTela_disciplina());
		}
		return controlDisciplina;
	}

	public ControlCurso getControlCurso() {
		if (controlCurso == null) {
			controlCurso = new ControlCurso(getTela_curso());
		}
		return controlCurso;
	}

	public ControlTurma getControlTurma() {
		if (controlTurma == null) {
			controlTurma = new ControlTurma(getjFramePrincipal(), getPainelTurma());
		}
		return controlTurma;
	}

	public ControlPainelTelaPrincipal getControlPainelTelaPrincipal() {
		if (controlPainelTelaPrincipal == null) {
			controlPainelTelaPrincipal = new ControlPainelTelaPrincipal(getjFramePrincipal());
		}
		return controlPainelTelaPrincipal;
	}

}
