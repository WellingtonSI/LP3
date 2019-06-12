/*package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import control.controller_professor;
import control.controller_disciplina;
import control.controller_aluno;
import control.ControlTurma;
import view.PainelTelaPrincipal;
import view.JFramePrincipal;
import view.PainelAluno;
import view.PainelCurso;
import view.PainelProfessor;
import view.PainelTurma;
import view.PainelMoldura;
import view.PainelDisciplina;


public class ControlJFramePrincipal implements ActionListener {
	
	static JFramePrincipal jFramPrincipal;
	private static PainelTelaPrincipal TeladeInicio;
	private PainelAluno tela_aluno;
	private PainelProfessor tela_professor;
	private PainelDisciplina tela_disciplina;
	private PainelTurma tela_classe;
	private PainelCurso tela_curso;
	private PainelMoldura imagem;
	
	
	public ControlJFramePrincipal(JFramePrincipal jFramePrincipal, PainelTelaPrincipal painelTelaPrincipal) {
			this.jFramPrincipal = jFramePrincipal;
			this.TeladeInicio = painelTelaPrincipal;

			addEventos();
		
	}

	private void addEventos() {
		// TODO Auto-generated method stub
		getjFramPrincipal().getMenuItemInicio().addActionListener(this);
		getjFramPrincipal().menuItemProfessor().addActionListener(this);
		getjFramPrincipal().getmenuItemDisciplina().addActionListener(this);
		getjFramPrincipal().getmenuItemAluno().addActionListener(this);
		getjFramPrincipal().getmenuItemTurma().addActionListener(this);
		getjFramPrincipal().getmenuItemCurso().addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == getjFramPrincipal().menuItemProfessor()) {
			
			//jFramPrincipal = null;
			TeladeInicio = null;
			
			getjFramPrincipal().setContentPane(getTela_professor());
			getjFramPrincipal().setTitle("Cadastro de professores");
			getjFramPrincipal().repaint();
			getjFramPrincipal().validate();
			controller_professor cont = new controller_professor(null, getjFramPrincipal(), getTela_professor());
		}
		else if(e.getSource() == getjFramPrincipal().getmenuItemDisciplina()) {
			controller_disciplina cont = new controller_disciplina(null, getTela_disciplina());
			
			getjFramPrincipal().setContentPane(getTela_disciplina());
			getjFramPrincipal().setTitle("Cadastro de disciplinas");
			getjFramPrincipal().repaint();
			getjFramPrincipal().validate();
		}
		else if(e.getSource() == getjFramPrincipal().getmenuItemAluno()) { 
		
			try {
				controller_aluno cont = new controller_aluno(null, null, getTela_aluno());
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			try {
				getjFramPrincipal().setContentPane(getTela_aluno());
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			getjFramPrincipal().setTitle("Cadastro De Alunos");
			getjFramPrincipal().repaint();
			getjFramPrincipal().validate();
		}
		else if(e.getSource() == getjFramPrincipal().getmenuItemCurso()) { 
			ControlCurso cont = new ControlCurso(null, getTela_curso());
			
			getjFramPrincipal().setContentPane(getTela_curso());
			getjFramPrincipal().setTitle("Cadastro De Cursos");
			getjFramPrincipal().repaint();
			getjFramPrincipal().validate();
		}
		else if(e.getSource() == getjFramPrincipal().getmenuItemTurma()) { 
			ControlTurma cont = new ControlTurma(null, getTela_classe());
			
			getjFramPrincipal().setContentPane(getTela_classe());
			getjFramPrincipal().setTitle("Cadastro De Turma");
			getjFramPrincipal().repaint();
			getjFramPrincipal().validate();
		}
		else if(e.getSource() == getjFramPrincipal().getMenuItemInicio()) { 
			//ControlPainelTelaPrincipal cont = new ControlPainelTelaPrincipal(getjFramPrincipal());
			getjFramPrincipal().setContentPane(getTeladeInicio());
			getjFramPrincipal().setTitle("Home");
			getjFramPrincipal().repaint();
			getjFramPrincipal().validate();
			
		}
		
	}
	
	public static JFramePrincipal getjFramPrincipal() {
		if(jFramPrincipal == null) {
			jFramPrincipal = new JFramePrincipal();
		}
		return jFramPrincipal;
	}

	public static PainelTelaPrincipal getTeladeInicio() {
		if(TeladeInicio == null) {
			TeladeInicio = new PainelTelaPrincipal();
		}
		return TeladeInicio;
	}

	public PainelAluno getTela_aluno() throws ParseException {
		if(tela_aluno == null) {
			tela_aluno = new PainelAluno();
		}
		return tela_aluno;
	}

	public PainelProfessor getTela_professor() {
		if(tela_professor == null) {
			tela_professor = new PainelProfessor();
		}
		return tela_professor;
	}

	public PainelDisciplina getTela_disciplina() {
		if(tela_disciplina == null) {
			tela_disciplina = new PainelDisciplina();
		}
		return tela_disciplina;
	}

	public PainelTurma getTela_classe() {
		if(tela_classe == null) {
			tela_classe = new PainelTurma();
		}
		return tela_classe;
	}

	public PainelCurso getTela_curso() {
		if(tela_curso == null) {
			tela_curso = new PainelCurso();
		}
		return tela_curso;
	}

	public PainelMoldura getImagem() {
		if(imagem == null) {
			imagem = new PainelMoldura();
		}
		return imagem;
	}

	public static void main(String[] args) {
		getjFramPrincipal().setContentPane(getTeladeInicio());
		getjFramPrincipal().repaint();
		getjFramPrincipal().validate();
		getjFramPrincipal().setTitle("Home");
		new ControlJFramePrincipal(getjFramPrincipal(),  getTeladeInicio());
	}
	
}*/
