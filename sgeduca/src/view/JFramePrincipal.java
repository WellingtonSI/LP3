package view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.BorderLayout;

public class JFramePrincipal extends JFrame {
	
	private JMenuBar menuBarra = null;
	private JMenu menu = null;
	private JMenuItem menuItemInicio = null;
	private JMenuItem menuItemProfessor = null;
	private JMenuItem menuItemDisciplina = null;
	private JMenuItem menuItemAluno = null;
	private JMenuItem menuItemTurma = null;
	private JMenuItem menuItemCurso = null;
	
	private JLabel fundo;
	
	
	public JFramePrincipal() {
		super();
	
		this.setSize(1000, 700);
		this.setVisible(true);
		this.setJMenuBar(getMenuBarra());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		fundo = new JLabel();
		fundo.setIcon(new ImageIcon(JFramePrincipal.class.getResource("/view/marca.jpg")));
		fundo.setBounds(253, 0, 984, 640); // 1275, 730
		getContentPane().add(fundo);

		repaint();
		validate();
	}
	
	public JMenuBar getMenuBarra() {
		if(menuBarra == null) {
			menuBarra = new JMenuBar();
			menuBarra.add(getMenu());
		}
		return menuBarra;
	}

	public JMenu getMenu() {
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
	
	


}
