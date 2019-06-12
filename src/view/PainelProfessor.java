package view;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JSeparator;
import javax.swing.JTable;

public class PainelProfessor extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtNome;
	private JTextField txtMatricula;
	private JComboBox <String> jcomboboxarea;
	private JComboBox <String> jcomboboxFormaTrabalho;
	private JLabel lblnome;
	private JLabel lblmatricula;
	private JButton jButtonCadastrar;
	private JLabel lblCadastroProfessor;
	private JTable jTableProfessor;
	private DefaultTableModel defaulTableModelProfessor ;
	private JScrollPane jSCrollPaneProfessor;
	private JSeparator separator;
	private JComboBox<String> jComboBoxPesquisa;
	private JTextField jTextFieldPesquisa;
	private JButton jButtonPesquisa;
	private JTable jTableProduto;
	private JButton jButtonExcluir;
	private JButton jButtonAlterar;
	private JButton jButtonConfirmar;
	private JButton jButtonCancelar;

	/**
	 * Create the panel.
	 */
	public PainelProfessor() {
		
		setLayout(null);
		setVisible(true);
		setBackground(new Color(198,232,245));
		add(getTxtNome());
		add(getTxtMatricula());
		add(getJcomboboxarea());
		add(getJcomboboxFormaTrabalho());
		add(getLblnome());
		add(getLblmatricula());
		add(getjButtonCadastrar());
		add(getLblCadastroProfessor());
		add(getSeparator());
		add(getJTableProfessor());
		add(getjSCrollPaneProfessor());
		add(getJComboBoxPesquisa());
		add(getJTextFieldPesquisa());
		add(getJButtonPesquisa());
		add(getJButtonExcluir());
		add(getJButtonAlterar());
		add(getJButtonConfirmar());
		add(getJButtonCancelar());
		 
		
	}

	public JLabel getLblnome() {
		if(lblnome == null) {
			lblnome = new JLabel("Nome");
			lblnome.setBounds(214, 93, 62, 14);
		}
		return lblnome;
	}
	
	public JLabel getLblmatricula() {
		if(lblmatricula == null) {
			lblmatricula = new JLabel("Matricula");
			lblmatricula.setBounds(214, 106, 78, 50);
		}
		return lblmatricula;
	}

	public JTextField getTxtNome() {
		if(txtNome == null) {
			txtNome = new JTextField();
			txtNome.setBounds(277, 90, 229, 20);
		}
		return txtNome;
	}
	
	public JTextField getTxtMatricula() {
		if(txtMatricula == null) {
			txtMatricula = new JTextField();
			txtMatricula.setBounds(277, 121, 229, 20);
		}
		return txtMatricula;
	}
	
	public JButton getjButtonCadastrar() {
		if(jButtonCadastrar == null) {
			jButtonCadastrar = new JButton("Cadastrar");
			jButtonCadastrar.setBounds(289, 261, 109, 23);
			jButtonCadastrar.setForeground(Color.WHITE);
			jButtonCadastrar.setBackground(Color.BLUE);
			
		}
		return jButtonCadastrar;
	}

	public JComboBox <String> getJcomboboxarea() {
		if(jcomboboxarea == null) {
			jcomboboxarea = new JComboBox<String>();
			jcomboboxarea.setBackground(new Color(198,232,245));
			jcomboboxarea.setModel(new DefaultComboBoxModel<String>(new String[] {"Selecione"}));
			jcomboboxarea.addItem("Artes");
			jcomboboxarea.addItem("Ciências agrárias");
			jcomboboxarea.addItem("Ciências da saúde");
			jcomboboxarea.addItem("Ciências exatas e da terra");
			jcomboboxarea.addItem("Ciências humanas");
			jcomboboxarea.addItem("Ciências sociais aplicadas");
			jcomboboxarea.addItem("Engenharias");
			jcomboboxarea.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Área", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			jcomboboxarea.setBounds(391, 167, 177, 50);

		}
		return jcomboboxarea;
	}
	
	public JComboBox <String> getJcomboboxFormaTrabalho() {
		if(jcomboboxFormaTrabalho == null) {
			jcomboboxFormaTrabalho = new JComboBox<String>();
			jcomboboxFormaTrabalho.setForeground(new Color(0, 0, 0));
			jcomboboxFormaTrabalho.setBackground(new Color(198,232,245));
			jcomboboxFormaTrabalho.setModel(new DefaultComboBoxModel(new String[] {"Selecione", "16 (D.E.)", "16 (40 h)", "8 (20 h)"}));
			
			jcomboboxFormaTrabalho.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Forma De Trabalho", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			
			jcomboboxFormaTrabalho.setBounds(214, 167, 124, 50);

		}
		return jcomboboxFormaTrabalho;
	}
	private JLabel getLblCadastroProfessor() {
		if (lblCadastroProfessor == null) {
			lblCadastroProfessor = new JLabel("Cadastro professor");
			lblCadastroProfessor.setFont(new Font("Tahoma", Font.BOLD, 23));
			lblCadastroProfessor.setBounds(210, 11, 252, 34);
		}
		return lblCadastroProfessor;
	
	}
	
	public DefaultTableModel getDefaultTableModel() {
		if (defaulTableModelProfessor == null) {
			defaulTableModelProfessor = new DefaultTableModel(new Object[][] {},
					new String[] {  "Nome", "Matrícula" }) {
				public boolean isCellEditable(int row, int column) {
					return false;

				}
			};
		}
		return defaulTableModelProfessor;
	}
	
	public JTable getJTableProfessor() {
		if (jTableProfessor == null) {
			jTableProfessor = new JTable(getDefaultTableModel());
			jTableProfessor.getTableHeader().setReorderingAllowed(false);
			jTableProfessor.setRowSelectionAllowed(true);
			jTableProfessor.getColumnModel().getColumn(0).setPreferredWidth(500);
			jTableProfessor.getColumnModel().getColumn(1).setPreferredWidth(100);
			jTableProfessor.setLocation(79, 384);
			jTableProfessor.setSize(913, 317);
		}
		return jTableProfessor;
	}
	
	public JScrollPane getjSCrollPaneProfessor() {
		if (jSCrollPaneProfessor == null) {
			jSCrollPaneProfessor = new JScrollPane(getJTableProfessor());
			jSCrollPaneProfessor.setLocation(40, 408);
			jSCrollPaneProfessor.setSize(832, 148);
		}
		return jSCrollPaneProfessor;
	}

	

	

	 
	public void displayErrorMessage(String errorMessage){

		 JOptionPane.showMessageDialog(this, errorMessage);

	}
	public JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setForeground(Color.WHITE);
			separator.setBackground(Color.BLACK);
			separator.setBounds(0, 335, 1000, 2);
		}
		return separator;
	}
	
	public JComboBox<String> getJComboBoxPesquisa() {
		if (jComboBoxPesquisa == null) {
			jComboBoxPesquisa = new JComboBox<String>();
			jComboBoxPesquisa.setModel(new DefaultComboBoxModel(new String[] {"--", "Nome", "Matricula"}));
			jComboBoxPesquisa.setBounds(40, 375, 119, 22);
		}
		return jComboBoxPesquisa;
	}

	public JTextField getJTextFieldPesquisa() {
		if (jTextFieldPesquisa == null) {
			jTextFieldPesquisa = new JTextField();
			jTextFieldPesquisa.setColumns(10);
			jTextFieldPesquisa.setBounds(169, 375, 570, 22);
		}
		return jTextFieldPesquisa;
	}

	public JButton getJButtonPesquisa() {
		if (jButtonPesquisa == null) {
			jButtonPesquisa = new JButton("Pesquisar");
			jButtonPesquisa.setBounds(749, 375, 123, 23);
			jButtonPesquisa.setBackground(Color.YELLOW);
		}
		return jButtonPesquisa;
	}
	
	public JButton getJButtonExcluir() {
		if (jButtonExcluir == null) {
			jButtonExcluir = new JButton("Excluir");
			jButtonExcluir.setForeground(Color.WHITE);
			jButtonExcluir.setBackground(Color.RED);
			jButtonExcluir.setBounds(191, 579, 111, 23);
		}
		return jButtonExcluir;
	}

	public JButton getJButtonAlterar() {
		if (jButtonAlterar == null) {
			jButtonAlterar = new JButton("Alterar");
			jButtonAlterar.setForeground(Color.WHITE);
			jButtonAlterar.setBackground(Color.BLACK);
			jButtonAlterar.setBounds(328, 579, 111, 23);
		}
		return jButtonAlterar;
	}

	public JButton getJButtonConfirmar() {
		if (jButtonConfirmar == null) {
			jButtonConfirmar = new JButton("Confirmar");
			jButtonConfirmar.setBackground(new Color(102, 204, 0));
			jButtonConfirmar.setForeground(Color.WHITE);
			jButtonConfirmar.setBounds(468, 579, 111, 23);
		}
		return jButtonConfirmar;
	}

	public JButton getJButtonCancelar() {
		if (jButtonCancelar == null) {
			jButtonCancelar = new JButton("Cancelar");
			jButtonCancelar.setBackground(Color.GRAY);
			jButtonCancelar.setForeground(Color.WHITE);
			jButtonCancelar.setBounds(602, 579, 98, 23);
		}
		return jButtonCancelar;
	}
}
