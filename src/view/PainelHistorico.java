package view;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpringLayout;
import javax.swing.JSpinner;
import javax.swing.UIManager;

public class PainelHistorico extends JPanel {

	private SpringLayout springLayout;
	private JSpinner JspinnerMedia;
	private SpinnerModel valor;
	private JButton jButtonCadastrar;
	private JSeparator separator;
	private JComboBox<String> jComboBoxPesquisa;
	private JTextField jTextFieldPesquisa;
	private JButton jButtonPesquisa;
	private JButton jButtonExcluir;
	private JButton jButtonAlterar;
	private JButton jButtonConfirmar;
	private JButton jButtonCancelar;
	private JTable jTableHistórico;
	private DefaultTableModel defaulTableModelHistorico ;
	private JScrollPane jSCrollPaneHistorico;
	private JLabel jLabelHistrico;
	private JComboBox<String> jComboBoxCurso;
	private JComboBox<String> jComboBoxAluno;
	private JComboBox<String> jComboBoxSemestre;
	private JComboBox jComboBoxDisciplina;
	private JSpinner jSpinnerMedia;
	private JLabel jLabelMedia;
	
	
	
	
	public PainelHistorico() {
	
		setLayout(null);
		setVisible(true);
		add(getJComboBoxPesquisa());
		add(getJTextFieldPesquisa());
		add(getJButtonPesquisa());
		add(getJButtonExcluir());
		add(getJButtonAlterar());
		add(getJButtonConfirmar());
		add(getJButtonCancelar());
		add(getSeparator());
		add(getjTableHistórico());
		add(getjSCrollPaneHistorico());
		add(getjLabelHistrico());
		add(getJComboBoxCurso());
		add(getComboBoxAluno());
		add(getJComboBoxSemestre());
		add(getJComboBoxDisciplina());
		add(getJSpinnerMedia());
		add(getJLabelMedia());
		add(getjButtonCadastrar());
		
	}
	
	
	public JLabel getjLabelHistrico() {
		if (jLabelHistrico == null) {
			jLabelHistrico = new JLabel("Hist\u00F3rico");
			jLabelHistrico.setFont(new Font("Tahoma", Font.PLAIN, 25));
			jLabelHistrico.setBounds(90, 38, 116, 22);
		}
		return jLabelHistrico;
	}
	
	
	
	
	public JButton getjButtonCadastrar() {
		if(jButtonCadastrar == null) {
			jButtonCadastrar = new JButton("Cadastrar");
			jButtonCadastrar.setForeground(Color.WHITE);
			jButtonCadastrar.setBackground(Color.BLUE);
			jButtonCadastrar.setBounds(379, 322, 114, 23);
			
		}
		return jButtonCadastrar;
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
			jComboBoxPesquisa.setModel(new DefaultComboBoxModel(new String[] {"--", "Nome", "Matricula","CPF"}));
			jComboBoxPesquisa.setBounds(39, 399, 125, 22);
		}
		return jComboBoxPesquisa;
	}

	public JTextField getJTextFieldPesquisa() {
		if (jTextFieldPesquisa == null) {
			jTextFieldPesquisa = new JTextField();
			jTextFieldPesquisa.setColumns(10);
			jTextFieldPesquisa.setBounds(175, 400, 616, 22);
		}
		return jTextFieldPesquisa;
	}

	public JButton getJButtonPesquisa() {
		if (jButtonPesquisa == null) {
			jButtonPesquisa = new JButton("Pesquisar");
			jButtonPesquisa.setBounds(801, 399, 116, 23);
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
		if (defaulTableModelHistorico == null) {
			defaulTableModelHistorico = new DefaultTableModel(new Object[][] {},
					new String[] {  "Nome", "Matricula","Disciplina","Situação" }) {
				public boolean isCellEditable(int row, int column) {
					return false;

				}
			};
		}
		return defaulTableModelHistorico;
	}
	
	public JTable getjTableHistórico() {
		if (jTableHistórico == null) {
			jTableHistórico = new JTable(getDefaultTableModel());
			jTableHistórico.getTableHeader().setReorderingAllowed(false);
			jTableHistórico.setRowSelectionAllowed(true);
			jTableHistórico.getColumnModel().getColumn(0).setPreferredWidth(400);
			jTableHistórico.getColumnModel().getColumn(1).setPreferredWidth(50);
			jTableHistórico.getColumnModel().getColumn(1).setPreferredWidth(100);
			jTableHistórico.getColumnModel().getColumn(1).setPreferredWidth(100);
			jTableHistórico.setLocation(79, 384);
			jTableHistórico.setSize(913, 317);
		}
		return jTableHistórico;
	}
	
	public JScrollPane getjSCrollPaneHistorico() {
		if (jSCrollPaneHistorico == null) {
			jSCrollPaneHistorico = new JScrollPane(getjTableHistórico());
			jSCrollPaneHistorico.setLocation(39, 431);
			jSCrollPaneHistorico.setSize(878, 148);
		}
		return jSCrollPaneHistorico;
	}
	public JComboBox<String> getJComboBoxCurso() {
		if (jComboBoxCurso == null) {
			jComboBoxCurso = new JComboBox();
			jComboBoxCurso.setFont(new Font("Tahoma", Font.PLAIN, 11));
			jComboBoxCurso.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Curso", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			jComboBoxCurso.setBounds(90, 101, 325, 52);
		}
		return jComboBoxCurso;
	}
	public JComboBox<String> getComboBoxAluno() {
		if (jComboBoxAluno == null) {
			jComboBoxAluno = new JComboBox();
			jComboBoxAluno.setFont(new Font("Tahoma", Font.PLAIN, 11));
			jComboBoxAluno.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Aluno", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			jComboBoxAluno.setBounds(478, 101, 418, 52);
			jComboBoxAluno.setEnabled(false);
		}
		return jComboBoxAluno;
	}
	public JComboBox<String> getJComboBoxSemestre() {
		if (jComboBoxSemestre == null) {
			jComboBoxSemestre = new JComboBox();
			jComboBoxSemestre.setBounds(90, 179, 325, 52);
			jComboBoxSemestre.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Semestre", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			jComboBoxSemestre.setEnabled(false);
		}
		return jComboBoxSemestre;
	}
	public JComboBox<String> getJComboBoxDisciplina() {
		if (jComboBoxDisciplina == null) {
			jComboBoxDisciplina = new JComboBox();
			jComboBoxDisciplina.setBounds(478, 179, 418, 52);
			jComboBoxDisciplina.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Disciplina", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			jComboBoxDisciplina.setEnabled(false);
		}
		return jComboBoxDisciplina;
	}
	public JSpinner getJSpinnerMedia() {
		if (jSpinnerMedia == null) {
			SpinnerModel value =  new SpinnerNumberModel(0.1,0.0,10.0,0.1); 
			jSpinnerMedia = new JSpinner(value);
			jSpinnerMedia.setBounds(614, 257, 282, 33);
		}
		return jSpinnerMedia;
	}
	public JLabel getJLabelMedia() {
		if (jLabelMedia == null) {
			jLabelMedia = new JLabel("M\u00E9dia");
			jLabelMedia.setFont(new Font("Tahoma", Font.PLAIN, 17));
			jLabelMedia.setBounds(481, 266, 66, 24);
		}
		return jLabelMedia;
	}
}
