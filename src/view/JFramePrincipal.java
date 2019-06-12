package view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import control.ControlCurso;
import control.ControlPainelTelaPrincipal;
import control.ControlTurma;
import control.ControlAluno;
import control.ControlDisciplina;
import control.ControlProfessor;

//import control.ControlJFramePrincipal;

import java.awt.BorderLayout;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class JFramePrincipal extends JFrame  {
	
	private JMenuBar menuBar = null;
	private JMenu menu = null;
	private JMenuItem menuItemInicio = null;
	private JMenuItem menuItemProfessor = null;
	private JMenuItem menuItemDisciplina = null;
	private JMenuItem menuItemAluno = null;
	private JMenuItem menuItemTurma = null;
	private JMenuItem menuItemCurso = null;
	private static JFramePrincipal jframPrincipal;
	private static PainelTelaPrincipal painelTelaPrincipal;
	
	
	private PainelAluno telaAluno;
	private PainelProfessor telaProfessor;
	private PainelDisciplina telaDisciplina;
	private PainelTurma telaClasse;
	private PainelCurso telaCurso;
	private PainelMoldura imagem;
	
	private JLabel fundo;
	
	
	public JFramePrincipal() {
		setSize(1000, 700);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setJMenuBar(getJMenuBar());
		repaint();
		validate();
		
		
		
	}
	
	public JMenuBar getJMenuBar() {
		if(menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getJMenu());
		}
		return menuBar;
	}

	public JMenu getJMenu() {
		if(menu == null) {
			menu = new JMenu("Menu");
			menu.add(getMenuItemInicio());
			menu.add(menuItemProfessor());
			menu.add(getmenuItemDisciplina());
			menu.add(getmenuItemAluno());
			menu.add(getmenuItemTurma());
			menu.add(getmenuItemCurso());
			

			
		}
		return menu;
	}
	


	
	public JMenuItem getMenuItemInicio() {
		if(menuItemInicio == null) {
			menuItemInicio = new JMenuItem("Inicio");
		}
		return menuItemInicio;
	}

	public JMenuItem menuItemProfessor() {
		if(menuItemProfessor == null) {
			menuItemProfessor = new JMenuItem("Professor");
		}
		return menuItemProfessor;
	}
	public JMenuItem getmenuItemDisciplina(){
		if(menuItemDisciplina == null) {
			menuItemDisciplina = new JMenuItem("Disciplina");
		}
		return menuItemDisciplina;
	}
	
	public JMenuItem getmenuItemAluno(){
		if(menuItemAluno == null) {
			menuItemAluno = new JMenuItem("Aluno");
		}
		return menuItemAluno;
	}
	
	public JMenuItem getmenuItemTurma(){
		if(menuItemTurma == null) {
			menuItemTurma = new JMenuItem("Turma");
		}
		return menuItemTurma;
	}
	public JMenuItem getmenuItemCurso(){
		if(menuItemCurso == null) {
			menuItemCurso = new JMenuItem("Curso");
		}
		return menuItemCurso;
	}
	
	public static JFramePrincipal getjFramPrincipal() {
		if(jframPrincipal == null) {
			jframPrincipal = new JFramePrincipal();
		}
		return jframPrincipal;
	}
	
	public static PainelTelaPrincipal getPainelTelaPrincipal() {
		if(painelTelaPrincipal == null) {
			painelTelaPrincipal = new PainelTelaPrincipal();
		}
		return painelTelaPrincipal;
	}
	

	

	public static void main(String[] args) {
		getjFramPrincipal().setContentPane(getPainelTelaPrincipal());
		getjFramPrincipal().repaint();
		getjFramPrincipal().validate();
		getjFramPrincipal().setTitle("Home");
		//new ControlJFramePrincipal(getjFramPrincipal(),  getPainelTelaPrincipal());
	}

}
