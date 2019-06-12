package view;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;

import banco.CursoBanco;
import banco.DisciplinaBanco;
import banco.ProfessorBanco;
import banco.AlunoBanco;

public class PainelTurma extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private JButton btnadicionar;
	private JLabel lblCadastroClasse;
	private JRadioButton radioButtonPeriodoLetivo;
	
	String [] titulosAluno= {"Nome","Matricula"};
	Object [][] dadosAluno = {
			{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},
			{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},
			{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},
			{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""}	
	};
	String [] titulosProfessor= {"Professor","Matricula"};
	Object [][] dadosProfessor = {{"",""},{"",""}};
			
	
	private JTable tableAluno = new JTable(dadosAluno, titulosAluno);
	JScrollPane barraRolagemAluno = new JScrollPane(tableAluno);
	private JTable tableProfessor = new JTable(dadosProfessor,titulosProfessor);
	JScrollPane barraRolagemProfessor = new JScrollPane();
	private JComboBox<String> comboBox;
	private JButton btnCancelar;
	private JComboBox<String> comboBox_1;
	private JButton btnConfirmar;
	private JButton button_3;
	private JComboBox<String> jcomboBoxProfessor;
	private JButton button;
	private JButton button_1;
	private JComboBox<String> jcomboBoxDia;
	private JComboBox<String> comboBox_2;
	private JComboBox<String> comboBox_3;
	private JButton button_2;
	private JButton button_4;
	private JComboBox<String> comboBox_4;
	private JButton jbuttonAdicionar;
	
	

	public PainelTurma() {
		
		setLayout(null);
		setVisible(true);
		add(getbtnadicionar());
		add(getlblCadastroClasse());
		barraRolagemAluno.setBounds(53, 117, 450, 400);
		add(barraRolagemAluno);
		barraRolagemProfessor.setBounds(53, 554, 450, 55);
		add(barraRolagemProfessor);
		barraRolagemProfessor.setViewportView(tableProfessor);
		add(getComboBox());
		add(getBtnCancelar());
		add(getComboBox_1());
		add(getBtnConfirmar());
		add(getButton_3());
		add(getJcomboBoxProfessor());
		add(getButton());
		add(getButton_1());
		add(getJcomboBoxDia());
		add(getComboBox_2());
		add(getComboBox_3());
		add(getButton_2());
		add(getButton_4());
		add(getComboBox_4());
		add(getJbuttonAdicionar());
		
	
		
	}
	
	public JButton getbtnadicionar() {
		if(btnadicionar == null) {
			btnadicionar = new JButton("Confirmar");
			btnadicionar.setBounds(716, 114, 97, 23);
			
		}
		return btnadicionar;
	}
	

	private JLabel getlblCadastroClasse() {
		if (lblCadastroClasse == null) {
			lblCadastroClasse = new JLabel("Cadastro turma");
			lblCadastroClasse.setFont(new Font("Tahoma", Font.BOLD, 23));
			lblCadastroClasse.setBounds(147, 44, 245, 35);
		}
		return lblCadastroClasse;
	}
	
	public JComboBox<String> getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox<String>();
			
			CursoBanco c = new CursoBanco();
			
			comboBox.setModel(new DefaultComboBoxModel(c.listarCursos("%").toArray()));
			
			comboBox.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Curso", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			comboBox.setBounds(548, 95, 147, 50);
		}
		return comboBox;
	}
	public JButton getBtnCancelar() {
		if (btnCancelar == null) {
			btnCancelar = new JButton("Cancelar");
			btnCancelar.setBounds(821, 114, 97, 23);
		}
		return btnCancelar;
	}
	public JComboBox<String> getComboBox_1() {
		if (comboBox_1 == null) {
			comboBox_1 = new JComboBox<String>();
			DisciplinaBanco d = new DisciplinaBanco();
			comboBox_1.setModel(new DefaultComboBoxModel(d.listarDisciplinas("%").toArray()));
			
			comboBox_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Disciplina", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			comboBox_1.setBounds(548, 181, 147, 50);
		}
		return comboBox_1;
	}
	public JButton getBtnConfirmar() {
		if (btnConfirmar == null) {
			btnConfirmar = new JButton("Confirmar");
			btnConfirmar.setBounds(716, 204, 97, 23);
		}
		return btnConfirmar;
	}
	public JButton getButton_3() {
		if (button_3 == null) {
			button_3 = new JButton("Cancelar");
			button_3.setBounds(821, 204, 97, 23);
		}
		return button_3;
	}
	public JComboBox<String> getJcomboBoxProfessor() {
		if (jcomboBoxProfessor == null) {
			jcomboBoxProfessor = new JComboBox<String>();
			ProfessorBanco p = new ProfessorBanco();
			jcomboBoxProfessor.setModel(new DefaultComboBoxModel(p.listarProfessor("%").toArray()));
			
			jcomboBoxProfessor.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Professor", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			jcomboBoxProfessor.setBounds(548, 261, 147, 50);
		}
		return jcomboBoxProfessor;
	}
	public JButton getButton() {
		if (button == null) {
			button = new JButton("Confirmar");
			button.setBounds(716, 284, 97, 23);
		}
		return button;
	}
	public JButton getButton_1() {
		if (button_1 == null) {
			button_1 = new JButton("Cancelar");
			button_1.setBounds(821, 284, 97, 23);
		}
		return button_1;
	}
	public JComboBox<String> getJcomboBoxDia() {
		if (jcomboBoxDia == null) {
			jcomboBoxDia = new JComboBox<String>();
			jcomboBoxDia.setModel(new DefaultComboBoxModel(new String[] {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sabado"}));
			jcomboBoxDia.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Dia", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			jcomboBoxDia.setBounds(548, 356, 147, 50);
		}
		return jcomboBoxDia;
	}
	public JComboBox<String> getComboBox_2() {
		if (comboBox_2 == null) {
			comboBox_2 = new JComboBox<String>();
			comboBox_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Hora inicial", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			comboBox_2.setBounds(548, 417, 147, 50);
		}
		return comboBox_2;
	}
	public JComboBox<String> getComboBox_3() {
		if (comboBox_3 == null) {
			comboBox_3 = new JComboBox<String>();
			comboBox_3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Hora final", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			comboBox_3.setBounds(548, 478, 147, 50);
		}
		return comboBox_3;
	}
	public JButton getButton_2() {
		if (button_2 == null) {
			button_2 = new JButton("Confirmar");
			button_2.setBounds(716, 430, 97, 23);
		}
		return button_2;
	}
	public JButton getButton_4() {
		if (button_4 == null) {
			button_4 = new JButton("Cancelar");
			button_4.setBounds(821, 430, 97, 23);
		}
		return button_4;
	}
	public JComboBox<String> getComboBox_4() {
		if (comboBox_4 == null) {
			comboBox_4 = new JComboBox<String>();
			AlunoBanco a = new AlunoBanco();
			comboBox_4 .setModel(new DefaultComboBoxModel(a.listarAlunos("%").toArray()));
			
			comboBox_4.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Aluno", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			comboBox_4.setBounds(548, 575, 147, 50);
		}
		return comboBox_4;
	}
	public JButton getJbuttonAdicionar() {
		if (jbuttonAdicionar == null) {
			jbuttonAdicionar = new JButton("Adicionar");
			jbuttonAdicionar.setBounds(716, 594, 97, 23);
		}
		return jbuttonAdicionar;
	}
}
