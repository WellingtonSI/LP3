package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

import java.awt.Font;
import java.awt.event.ActionListener;


import javax.swing.JComboBox;
import javax.swing.JRadioButtonMenuItem;
import java.awt.Choice;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;

import banco.CursoBanco;
import banco.DisciplinaBanco;

public class PainelDisciplina extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textFieldDepartamento;
	private JTextField textFieldNome;
	private JLabel lblNome;
	private JLabel lblDepartamento;
	private JButton btncadastrar;
	private JLabel lblCadastroDisciplina;
	private JComboBox <String> jcomboboxCargaHoraria;
	private JComboBox <String> jcomboboxCurso;
	private JComboBox<String> comboBox;
	private JLabel lblCodigo;
	private JTextField textFieldCodigo;
	private JLabel lblSemestre;
	private JTextField textFieldSemestre;
	private JComboBox<String> jcomboBoxPreRequisito;
	private JComboBox<String> jcomboBoxTipo;
	private Object paineldisciplina;
	


	/**
	 * Create the panel.
	 */
	public PainelDisciplina() {
		
		setLayout(null);
		setVisible(true);
		add(getTextFieldDepartamento());
		add(getTextFieldNome());
		add(getLblNome());
		add(getLblDepartamento());
		add(getBtncadastrar());
		add(getLblCadastroDisciplina());
		add(getJcomboboxCargaHoraria());
		add(getJComboBoxCurso());
		add(getLblCodigo());
		add(getTextFieldCodigo());
		add(getLblSemestre());
		add(getTextFieldSemestre());
		add(getJcomboBoxPreRequisito());
		add(getJcomboBoxTipo());
		
	}
	
	public JTextField getTextFieldDepartamento() {
		
		if(textFieldDepartamento == null) {
			textFieldDepartamento = new JTextField();
			textFieldDepartamento.setBounds(327, 150, 231, 20);
		}
		
		return textFieldDepartamento;
	}
	
	public JTextField getTextFieldNome() {
		
		if(textFieldNome == null) {
			textFieldNome = new JTextField();
			textFieldNome.setBounds(326, 112, 231, 20);
		}
		
		return textFieldNome;
	}
	
	public JLabel getLblNome() {
		if(lblNome == null) {
			lblNome = new JLabel();
			lblNome.setText("Nome");
			lblNome.setBounds(198, 112, 46, 14);
		}
		return lblNome;
	}
	
	
	
	public JLabel getLblDepartamento() {
		if(lblDepartamento == null) {
			lblDepartamento = new JLabel();
			lblDepartamento.setText("Departamento");
			lblDepartamento.setBounds(198, 140, 86, 35);
		}
		return lblDepartamento;
	}
	
	public JButton getBtncadastrar() {
		if(btncadastrar == null) {
			btncadastrar = new JButton("Cadastrar");
			btncadastrar.setBounds(336, 601, 114, 23);
			
		}
		return btncadastrar;
	}
	

	private JLabel getLblCadastroDisciplina() {
		if (lblCadastroDisciplina == null) {
			lblCadastroDisciplina = new JLabel("Cadastro disciplina");
			lblCadastroDisciplina.setFont(new Font("Tahoma", Font.BOLD, 23));
			lblCadastroDisciplina.setBounds(131, 26, 245, 35);
		}
		return lblCadastroDisciplina;
	}

	public JComboBox <String> getJcomboboxCargaHoraria() {
		if(jcomboboxCargaHoraria == null) {
			jcomboboxCargaHoraria = new JComboBox<String>();
			jcomboboxCargaHoraria.setModel(new DefaultComboBoxModel(new String[] {"Selecione", "30 (2 / semana)", "45 (3 / semana)", "60 (4 / semana)", "75 (5 / semana)", "90 (6 / semana)"}));
			jcomboboxCargaHoraria.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Carga Hor\u00E1ria", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			jcomboboxCargaHoraria.setBounds(180, 307, 147, 50);

		}
		return jcomboboxCargaHoraria;
	}
	public JComboBox<String> getJComboBoxCurso() {
		if (jcomboboxCurso == null) {
			jcomboboxCurso = new JComboBox<String>();
			//jcomboboxCurso.setModel(new DefaultComboBoxModel<String>(new String[] {"Selecione", "curso1", "curso2"}));
			
			CursoBanco c = new CursoBanco();
			
			//this.paineldisciplina.getJComboBoxCurso().setModel(new DefaultComboBoxModel(c.listarCursos("%").toArray()));
			
			//Object c;
			jcomboboxCurso.setModel(new DefaultComboBoxModel(c.listarCursos("%").toArray()));
			
			jcomboboxCurso.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Curso", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			jcomboboxCurso.setBounds(180, 387, 147, 50);
		}
		return jcomboboxCurso;
	}
	public JLabel getLblCodigo() {
		if (lblCodigo == null) {
			lblCodigo = new JLabel();
			lblCodigo.setText("C\u00F3digo da disciplina");
			lblCodigo.setBounds(198, 186, 129, 35);
		}
		return lblCodigo;
	}
	public JTextField getTextFieldCodigo() {
		if (textFieldCodigo == null) {
			textFieldCodigo = new JTextField();
			textFieldCodigo.setBounds(327, 196, 231, 20);
		}
		return textFieldCodigo;
	}
	public JLabel getLblSemestre() {
		if (lblSemestre == null) {
			lblSemestre = new JLabel();
			lblSemestre.setText("Semestre");
			lblSemestre.setBounds(198, 232, 82, 35);
		}
		return lblSemestre;
	}
	public JTextField getTextFieldSemestre() {
		if (textFieldSemestre == null) {
			textFieldSemestre = new JTextField();
			textFieldSemestre.setBounds(327, 242, 231, 20);
		}
		return textFieldSemestre;
	}
	public JComboBox<String> getJcomboBoxPreRequisito() {
		if (jcomboBoxPreRequisito == null) {
			jcomboBoxPreRequisito = new JComboBox<String>();
			
			DisciplinaBanco d = new DisciplinaBanco();
			jcomboBoxPreRequisito.setModel(new DefaultComboBoxModel(d.listarDisciplinas("%").toArray()));
			
			jcomboBoxPreRequisito.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Pré-requisito", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			jcomboBoxPreRequisito.setBounds(411, 307, 147, 50);
		}
		return jcomboBoxPreRequisito;
	}
	
	public JComboBox<String> getJcomboBoxTipo() {
		if (jcomboBoxTipo == null) {
			jcomboBoxTipo = new JComboBox<String>();
			jcomboBoxTipo.setModel(new DefaultComboBoxModel(new String[] {"Teorica", "Teorica-Pratica", "Teorica-Estagio", "Teorica-Pratica-Estagio"}));
			jcomboBoxTipo.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Tipo da Disciplina", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			jcomboBoxTipo.setBounds(411, 387, 147, 50);
		}
		return jcomboBoxTipo;
	}
	
	public void addCadastrarListener(ActionListener listenForCadastButton){

		 btncadastrar.addActionListener(listenForCadastButton);

		}
	 
	public void displayErrorMessage(String errorMessage){

		 JOptionPane.showMessageDialog(this, errorMessage);

	}
}
