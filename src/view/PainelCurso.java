package view;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import model.FormataMascaras;

import javax.swing.border.EtchedBorder;
import java.awt.Color;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTextField;

public class PainelCurso extends JPanel{
	private JLabel lbltitulo;
	private JLabel lblNome;
	private JButton btnFluxograma;
	private JButton jButtonCadastrar;
	private JTextField textFieldNome;
	private JLabel lblQuantidadeDeSemestres;
	private JFormattedTextField JtextFieldQuantidadeDeSemestre;
	private JComboBox<String> JcomboBoxTipodeCurso;
	private JComboBox<String> JcomboBoxModalidadeDeEnsino;
	private FormataMascaras formataMascaras;
	private JSeparator separator;
	private JComboBox<String> jComboBoxPesquisa;
	private JTextField jTextFieldPesquisa;
	private JButton jButtonPesquisa;
	private JButton jButtonExcluir;
	private JButton jButtonAlterar;
	private JButton jButtonConfirmar;
	private JButton jButtonCancelar;
	private JTable jTableCurso;
	private DefaultTableModel defaulTableModelCurso ;
	private JScrollPane jSCrollPaneCurso;
	
	
	
	public PainelCurso() {
		this.setLayout(null);
		setBackground(new Color(198,232,245));
		add(getLbltitulo());
		add(getLblNome());
		add(getBtnFluxograma());
		add(getjButtonCadastrar());
		add(getTextFieldNome());
		add(getLblQuantidadeDeSemestres());
		add(getJtextFieldQuantidadeDeSemestre());
		add(getJcomboBoxTipodeCurso());
		add(getJcomboBoxModalidadeDeEnsino());
		add(getJComboBoxPesquisa());
		add(getJTextFieldPesquisa());
		add(getJButtonPesquisa());
		add(getJButtonExcluir());
		add(getJButtonAlterar());
		add(getJButtonConfirmar());
		add(getJButtonCancelar());
		add(getSeparator());
		add(getjTableCurso());
		add(getjSCrollPaneCurso());
		
	}
	public JLabel getLbltitulo() {
		if (lbltitulo == null) {
			lbltitulo = new JLabel("Cadastro curso");
			lbltitulo.setFont(new Font("Tahoma", Font.BOLD, 23));
			lbltitulo.setBounds(272, 27, 252, 34);
		}
		return lbltitulo;
	}
	public JLabel getLblNome() {
		if (lblNome == null) {
			lblNome = new JLabel("Nome");
			lblNome.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNome.setBounds(202, 109, 58, 23);
		}
		return lblNome;
	}
	public JButton getBtnFluxograma() {
		if (btnFluxograma == null) {
			btnFluxograma = new JButton("Fluxograma");
			btnFluxograma.setBounds(202, 261, 108, 23);
		}
		return btnFluxograma;
	}
	public JButton getjButtonCadastrar() {
		if (jButtonCadastrar == null) {
			jButtonCadastrar = new JButton("Cadastrar");
			jButtonCadastrar.setForeground(Color.WHITE);
			jButtonCadastrar.setBackground(Color.BLUE);
			jButtonCadastrar.setBounds(427, 318, 97, 23);
		}
		return jButtonCadastrar;
	}
	public JTextField getTextFieldNome() {
		if (textFieldNome == null) {
			textFieldNome = new JTextField();
			textFieldNome.setBounds(375, 111, 228, 20);
			textFieldNome.setColumns(10);
		}
		return textFieldNome;
	}
	public JLabel getLblQuantidadeDeSemestres() {
		if (lblQuantidadeDeSemestres == null) {
			lblQuantidadeDeSemestres = new JLabel("Quantidade de semestres");
			lblQuantidadeDeSemestres.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblQuantidadeDeSemestres.setBounds(202, 143, 160, 14);
		}
		return lblQuantidadeDeSemestres;
	}
	public JFormattedTextField getJtextFieldQuantidadeDeSemestre() {
		if (JtextFieldQuantidadeDeSemestre == null) {
			JtextFieldQuantidadeDeSemestre = new JFormattedTextField();
			//JtextFieldQuantidadeDeSemestre.setFormatterFactory(formataMascaras().getQuantidadeSemestre());
			JtextFieldQuantidadeDeSemestre.setBounds(375, 141, 228, 20);
			JtextFieldQuantidadeDeSemestre.setColumns(10);
		}
		return JtextFieldQuantidadeDeSemestre;
	}
	 public FormataMascaras formataMascaras() {
	        if (formataMascaras == null) {
	            formataMascaras = new FormataMascaras();
	        }
	        return formataMascaras;
	    }
	
	public JComboBox<String> getJcomboBoxTipodeCurso() {
		if (JcomboBoxTipodeCurso == null) {
			JcomboBoxTipodeCurso = new JComboBox<String>();
			JcomboBoxTipodeCurso.setBackground(new Color(198,232,245));
			JcomboBoxTipodeCurso.setModel(new DefaultComboBoxModel(new String[] {"Selecione","Bacharelado", "Licenciatura",}));
			JcomboBoxTipodeCurso.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Tipo de curso", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			JcomboBoxTipodeCurso.setBounds(202, 183, 147, 50);
		}
		return JcomboBoxTipodeCurso;
	}
	public JComboBox<String> getJcomboBoxModalidadeDeEnsino() {
		if (JcomboBoxModalidadeDeEnsino == null) {
			JcomboBoxModalidadeDeEnsino = new JComboBox<String>();
			JcomboBoxModalidadeDeEnsino.setBackground(new Color(198,232,245));
			JcomboBoxModalidadeDeEnsino.setModel(new DefaultComboBoxModel(new String[] {"Selecione","Presencial", "Distância",}));
			JcomboBoxModalidadeDeEnsino.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Modalidade de ensino", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			JcomboBoxModalidadeDeEnsino.setBounds(456, 183, 147, 50);
		}
		return JcomboBoxModalidadeDeEnsino;
	}
	
	public void addCadastrarListener(ActionListener listenForCadastButton){

			jButtonCadastrar.addActionListener(listenForCadastButton);

	}
	 
	public void displayErrorMessage(String errorMessage){

		 JOptionPane.showMessageDialog(this, errorMessage);

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
		if (defaulTableModelCurso == null) {
			defaulTableModelCurso = new DefaultTableModel(new Object[][] {},
					new String[] {  "Nome", "Tipo de Curso", "Modalidade de ensino"  }) {
				public boolean isCellEditable(int row, int column) {
					return false;

				}
			};
		}
		return defaulTableModelCurso;
	}
	
	public JTable getjTableCurso() {
		if (jTableCurso == null) {
			jTableCurso = new JTable(getDefaultTableModel());
			jTableCurso.getTableHeader().setReorderingAllowed(false);
			jTableCurso.setRowSelectionAllowed(true);
			jTableCurso.getColumnModel().getColumn(0).setPreferredWidth(400);
			jTableCurso.getColumnModel().getColumn(1).setPreferredWidth(100);
			jTableCurso.getColumnModel().getColumn(1).setPreferredWidth(150);
			jTableCurso.setLocation(79, 384);
			jTableCurso.setSize(913, 317);
		}
		return jTableCurso;
	}
	
	public JScrollPane getjSCrollPaneCurso() {
		if (jSCrollPaneCurso == null) {
			jSCrollPaneCurso = new JScrollPane(getjTableCurso());
			jSCrollPaneCurso.setLocation(39, 431);
			jSCrollPaneCurso.setSize(832, 148);
		}
		return jSCrollPaneCurso;
	}
}
