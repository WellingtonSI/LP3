package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
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
import javax.swing.DefaultListModel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.EtchedBorder;
import java.awt.Color;

import banco.CursoBanco;
import banco.DisciplinaBanco;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import java.awt.event.ActionEvent;

public class PainelDisciplina extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textFieldNome;
	private JLabel lblNome;
	private JButton jButtonCadastrar;
	private JLabel lblCadastroDisciplina;
	private JComboBox <String> jcomboboxCargaHoraria;
	private JComboBox <String> jcomboboxCurso;
	private JComboBox<String> comboBox;
	private JLabel lblSemestre;
	private JTextField textFieldSemestre;
	private JComboBox<String> jcomboBoxPreRequisito;
	private JComboBox<String> jcomboBoxTipo;
	private DefaultListModel<String> defaultListModelPreRequisito;
	private JScrollPane  JScrollPanePreRequisito;
	private JList<String> jListPreRequisito;
	private JButton jButtonAdicionarPreRequisito;
	private JSeparator separator;
	private JComboBox<String> jComboBoxPesquisa;
	private JTextField jTextFieldPesquisa;
	private JButton jButtonPesquisa;
	private JButton jButtonExcluir;
	private JButton jButtonAlterar;
	private JButton jButtonConfirmar;
	private JButton jButtonCancelar;
	private JTable jTableDisciplina;
	private DefaultTableModel defaulTableModelDisciplina ;
	private JScrollPane jSCrollPaneDisciplina;
	private JComboBox<String> jComboboxArea;
	
	


	/**
	 * Create the panel.
	 */
	public PainelDisciplina() {
		
		setLayout(null);
		setVisible(true);
		setBackground(new Color(198,232,245));
		add(getTextFieldNome());
		add(getLblNome());
		add(getjButtonCadastrar());
		add(getLblCadastroDisciplina());
		add(getJcomboboxCargaHoraria());
		add(getJComboBoxCurso());
		add(getLblSemestre());
		add(getTextFieldSemestre());
		add(getJcomboBoxPreRequisito());
		add(getJcomboBoxTipo());
		add(getJScrollPanePreRequisito());
		add(getjButtonAdicionarPreRequisito());
		add(getJComboBoxPesquisa());
		add(getJTextFieldPesquisa());
		add(getJButtonPesquisa());
		add(getJButtonExcluir());
		add(getJButtonAlterar());
		add(getJButtonConfirmar());
		add(getJButtonCancelar());
		add(getSeparator());
		add(getjTableDisciplina());
		add(getjSCrollPaneDisciplina());

	}
	
	public JTextField getTextFieldNome() {
		
		if(textFieldNome == null) {
			textFieldNome = new JTextField();
			textFieldNome.setBounds(166, 91, 257, 20);
		}
		
		return textFieldNome;
	}
	
	public JLabel getLblNome() {
		if(lblNome == null) {
			lblNome = new JLabel();
			lblNome.setText("Nome");
			lblNome.setBounds(100, 94, 46, 14);
		}
		return lblNome;
	}
	
	public JButton getjButtonCadastrar() {
		if(jButtonCadastrar == null) {
			jButtonCadastrar = new JButton("Cadastrar");
			jButtonCadastrar.setForeground(Color.WHITE);
			jButtonCadastrar.setBackground(Color.BLUE);
			jButtonCadastrar.setBounds(312, 326, 114, 23);
			
		}
		return jButtonCadastrar;
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
			jcomboboxCargaHoraria.setBackground(new Color(198,232,245));
			jcomboboxCargaHoraria.setModel(new DefaultComboBoxModel(new String[] {"Selecione", "30 (2 / semana)", "45 (3 / semana)", "60 (4 / semana)", "75 (5 / semana)", "90 (6 / semana)"}));
			jcomboboxCargaHoraria.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Carga Hor\u00E1ria", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			jcomboboxCargaHoraria.setBounds(100, 134, 147, 50);

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
			jcomboboxCurso.setBackground(new Color(198,232,245));
			jcomboboxCurso.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Curso", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			jcomboboxCurso.setBounds(100, 195, 147, 50);
		}
		return jcomboboxCurso;
	}
	public JLabel getLblSemestre() {
		if (lblSemestre == null) {
			lblSemestre = new JLabel();
			lblSemestre.setText("Semestre");
			lblSemestre.setBounds(448, 83, 82, 35);
		}
		return lblSemestre;
	}
	public JTextField getTextFieldSemestre() {
		if (textFieldSemestre == null) {
			textFieldSemestre = new JTextField();
			textFieldSemestre.setBounds(514, 90, 231, 20);
		}
		return textFieldSemestre;
	}
	public JComboBox<String> getJcomboBoxPreRequisito() {
		if (jcomboBoxPreRequisito == null) {
			jcomboBoxPreRequisito = new JComboBox<String>();
			jcomboBoxPreRequisito.setBackground(new Color(198,232,245));
			DisciplinaBanco d = new DisciplinaBanco();
			jcomboBoxPreRequisito.setModel(new DefaultComboBoxModel(d.listarDisciplinas("%").toArray()));
			
			jcomboBoxPreRequisito.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Escolha os Pr\u00E9-Requisitos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			jcomboBoxPreRequisito.setBounds(260, 134, 179, 50);
		}
		return jcomboBoxPreRequisito;
	}
	
	public JComboBox<String> getJcomboBoxTipo() {
		if (jcomboBoxTipo == null) {
			jcomboBoxTipo = new JComboBox<String>();
			jcomboBoxTipo.setBackground(new Color(198,232,245));
			jcomboBoxTipo.setModel(new DefaultComboBoxModel(new String[] {"Selecione","Teórica", "Teórica-Prática","Estágio"}));
			jcomboBoxTipo.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Tipo da Disciplina", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			jcomboBoxTipo.setBounds(257, 195, 179, 50);
		}
		return jcomboBoxTipo;
	}
	
	public void displayErrorMessage(String errorMessage){

		 JOptionPane.showMessageDialog(this, errorMessage);

	}
	
	public JList<String> getjListPreRequisito() {
		if (jListPreRequisito == null) {
			jListPreRequisito = new JList<String>(getdefaultListModelPreRequisito());
			jListPreRequisito.setBackground(new Color(238, 238, 238));
			jListPreRequisito.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Lista de disiciplinas Pr\u00E9-Requisito", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		}
		return jListPreRequisito;
	}

	

	public DefaultListModel<String> getdefaultListModelPreRequisito() {
		if (defaultListModelPreRequisito == null) {
			defaultListModelPreRequisito = new DefaultListModel<String>();
		}
		return defaultListModelPreRequisito;
	}

	public JScrollPane getJScrollPanePreRequisito() {
		if (JScrollPanePreRequisito == null) {
			JScrollPanePreRequisito = new JScrollPane();
			JScrollPanePreRequisito.setBounds(561, 134, 224, 100);
			JScrollPanePreRequisito.setViewportView(getjListPreRequisito());
		}
		return JScrollPanePreRequisito;
	}
	
	public JButton getjButtonAdicionarPreRequisito() {
		if (jButtonAdicionarPreRequisito == null) {
			jButtonAdicionarPreRequisito = new JButton("Adicionar");
			jButtonAdicionarPreRequisito.setBounds(448, 153, 97, 23);
		}
		return jButtonAdicionarPreRequisito;
	}
	
	public JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setForeground(Color.WHITE);
			separator.setBackground(Color.BLACK);
			separator.setBounds(0, 375, 1000, 2);
		}
		return separator;
	}
	
	public JComboBox<String> getJComboBoxPesquisa() {
		if (jComboBoxPesquisa == null) {
			jComboBoxPesquisa = new JComboBox<String>();
			jComboBoxPesquisa.setModel(new DefaultComboBoxModel(new String[] {"--", "Nome", "Código da Disciplina"}));
			jComboBoxPesquisa.setBounds(39, 399, 125, 22);
		}
		return jComboBoxPesquisa;
	}

	public JTextField getJTextFieldPesquisa() {
		if (jTextFieldPesquisa == null) {
			jTextFieldPesquisa = new JTextField();
			jTextFieldPesquisa.setColumns(10);
			jTextFieldPesquisa.setBounds(175, 400, 570, 22);
		}
		return jTextFieldPesquisa;
	}

	public JButton getJButtonPesquisa() {
		if (jButtonPesquisa == null) {
			jButtonPesquisa = new JButton("Pesquisar");
			jButtonPesquisa.setBounds(755, 400, 116, 23);
			jButtonPesquisa.setBackground(Color.YELLOW);
		}
		return jButtonPesquisa;
	}
	
	public JButton getJButtonExcluir() {
		if (jButtonExcluir == null) {
			jButtonExcluir = new JButton("Excluir");
			jButtonExcluir.setForeground(Color.WHITE);
			jButtonExcluir.setBackground(Color.RED);
			jButtonExcluir.setBounds(171, 602, 111, 23);
		}
		return jButtonExcluir;
	}

	public JButton getJButtonAlterar() {
		if (jButtonAlterar == null) {
			jButtonAlterar = new JButton("Alterar");
			jButtonAlterar.setForeground(Color.WHITE);
			jButtonAlterar.setBackground(Color.BLACK);
			jButtonAlterar.setBounds(304, 602, 111, 23);
		}
		return jButtonAlterar;
	}

	public JButton getJButtonConfirmar() {
		if (jButtonConfirmar == null) {
			jButtonConfirmar = new JButton("Confirmar");
			jButtonConfirmar.setBackground(new Color(102, 204, 0));
			jButtonConfirmar.setForeground(Color.WHITE);
			jButtonConfirmar.setBounds(436, 602, 111, 23);
		}
		return jButtonConfirmar;
	}

	public JButton getJButtonCancelar() {
		if (jButtonCancelar == null) {
			jButtonCancelar = new JButton("Cancelar");
			jButtonCancelar.setBackground(Color.GRAY);
			jButtonCancelar.setForeground(Color.WHITE);
			jButtonCancelar.setBounds(567, 602, 98, 23);
		}
		return jButtonCancelar;
	}
	
	public DefaultTableModel getDefaultTableModel() {
		if (defaulTableModelDisciplina == null) {
			defaulTableModelDisciplina = new DefaultTableModel(new Object[][] {},
					new String[] {  "Nome", "Código da Disciplina" }) {
				public boolean isCellEditable(int row, int column) {
					return false;

				}
			};
		}
		return defaulTableModelDisciplina;
	}
	
	public JTable getjTableDisciplina() {
		if (jTableDisciplina == null) {
			jTableDisciplina = new JTable(getDefaultTableModel());
			jTableDisciplina.getTableHeader().setReorderingAllowed(false);
			jTableDisciplina.setRowSelectionAllowed(true);
			jTableDisciplina.getColumnModel().getColumn(0).setPreferredWidth(500);
			jTableDisciplina.getColumnModel().getColumn(1).setPreferredWidth(100);
			jTableDisciplina.setLocation(79, 384);
			jTableDisciplina.setSize(913, 317);
		}
		return jTableDisciplina;
	}
	
	public JScrollPane getjSCrollPaneDisciplina() {
		if (jSCrollPaneDisciplina == null) {
			jSCrollPaneDisciplina = new JScrollPane(getjTableDisciplina());
			jSCrollPaneDisciplina.setLocation(39, 431);
			jSCrollPaneDisciplina.setSize(832, 148);
		}
		return jSCrollPaneDisciplina;
	}
	
	public JComboBox <String> getjComboboxArea() {
		
		if(jComboboxArea == null) {
			jComboboxArea = new JComboBox<String>();
			jComboboxArea.setBackground(new Color(198,232,245));
			jComboboxArea.setModel(new DefaultComboBoxModel<String>(new String[] {"Selecione"}));
			jComboboxArea.addItem("Artes");
			jComboboxArea.addItem("Ciências agrárias");
			jComboboxArea.addItem("Ciências da saúde");
			jComboboxArea.addItem("Ciências exatas e da terra");
			jComboboxArea.addItem("Ciências humanas");
			jComboboxArea.addItem("Ciências sociais aplicadas");
			jComboboxArea.addItem("Engenharias");
			jComboboxArea.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Área", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			jComboboxArea.setBounds(391, 167, 177, 50);

		}
		return jComboboxArea;
	}
}
