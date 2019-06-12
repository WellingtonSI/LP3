package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import control.controller_professor;
import control.controller_disciplina;
import control.controller_aluno;
import control.Controller_classe;
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
	private PainelTelaPrincipal TeladeInicio = new PainelTelaPrincipal();
	private PainelAluno tela_aluno;
	private PainelProfessor tela_professor;
	private PainelDisciplina tela_disciplina;
	private PainelTurma tela_classe;
	private PainelCurso tela_curso;
	private PainelMoldura imagem;
	
	
	public ControlJFramePrincipal() {
			
			jFramPrincipal().repaint();
			jFramPrincipal().validate();
			jFramPrincipal.setTitle("Home");
			addEventos();
		
	}

	private void addEventos() {
		// TODO Auto-generated method stub
		jFramPrincipal.getMenuItemInicio().addActionListener(this);
		jFramPrincipal.menuItemProfessor().addActionListener(this);
		jFramPrincipal.getmenuItemDisciplina().addActionListener(this);
		jFramPrincipal.getmenuItemAluno().addActionListener(this);
		jFramPrincipal.getmenuItemTurma().addActionListener(this);
		jFramPrincipal.getmenuItemCurso().addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == jFramPrincipal.menuItemProfessor()) {
			tela_professor = new PainelProfessor();
			controller_professor cont = new controller_professor(null, tela_professor);
			
			jFramPrincipal.setContentPane(tela_professor);
			jFramPrincipal.setTitle("Cadastro de professores");
			jFramPrincipal.repaint();
			jFramPrincipal.validate();
		}
		else if(e.getSource() == jFramPrincipal.getmenuItemDisciplina()) {
			tela_disciplina = new PainelDisciplina();
			controller_disciplina cont = new controller_disciplina(null, tela_disciplina);
			
			jFramPrincipal.setContentPane(tela_disciplina);
			jFramPrincipal.setTitle("Cadastro de disciplinas");
			jFramPrincipal.repaint();
			jFramPrincipal.validate();
		}
		else if(e.getSource() == jFramPrincipal.getmenuItemAluno()) { 
			try {
				tela_aluno = new PainelAluno();
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			controller_aluno cont = new controller_aluno(null, null, tela_aluno);
			
			jFramPrincipal.setContentPane(tela_aluno);
			jFramPrincipal.setTitle("Cadastro De Alunos");
			jFramPrincipal.repaint();
			jFramPrincipal.validate();
		}
		else if(e.getSource() == jFramPrincipal.getmenuItemCurso()) { 
			tela_curso = new PainelCurso();
			ControlCurso cont = new ControlCurso(null, tela_curso);
			
			jFramPrincipal.setContentPane(tela_curso);
			jFramPrincipal.setTitle("Cadastro De Cursos");
			jFramPrincipal.repaint();
			jFramPrincipal.validate();
		}
		else if(e.getSource() == jFramPrincipal.getmenuItemTurma()) { 
			tela_classe = new PainelTurma();
			Controller_classe cont = new Controller_classe(null, tela_classe);
			
			jFramPrincipal.setContentPane(tela_classe);
			jFramPrincipal.setTitle("Cadastro De Turma");
			jFramPrincipal.repaint();
			jFramPrincipal.validate();
		}
		else if(e.getSource() == jFramPrincipal.getMenuItemInicio()) { 
			TeladeInicio = new PainelTelaPrincipal();
			ControlPainelTelaPrincipal cont = new ControlPainelTelaPrincipal(jFramPrincipal);
			jFramPrincipal.setContentPane(TeladeInicio);
			jFramPrincipal.setTitle("Home");
			jFramPrincipal.repaint();
			jFramPrincipal.validate();
			
		}
		
	}
	
	public JFramePrincipal jFramPrincipal() {
		if(jFramPrincipal == null) {
			jFramPrincipal = new JFramePrincipal();
		}
		return jFramPrincipal;
	}
	
	
	public static void main(String[] args) {
		new ControlJFramePrincipal();
	}
	
}
