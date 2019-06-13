package view;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

import banco.CursoBanco;
import model.FormataMascaras;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;

public class PainelAluno extends JPanel  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textFieldmatricula;
	private JTextField textFieldnome;
	private JLabel lblmatricula;
	private JLabel lblnome;
	private JLabel lblcpf;
	private JLabel lblrg;
	private JLabel lbltitulo;
	private JButton jButtonCadastrar;
	private JComboBox<String> jcomboboxCurso;
	private JPanel painelAluno;
	private FormataMascaras formataMascaras;
	private MaskFormatter mascaraCPF;
	private JFormattedTextField formattedTextFieldRG;
	private JFormattedTextField formattedTextFieldCPF;
	private JSeparator separator;
	private JComboBox<String> jComboBoxPesquisa;
	private JTextField jTextFieldPesquisa;
	private JButton jButtonPesquisa;
	private JButton jButtonExcluir;
	private JButton jButtonAlterar;
	private JButton jButtonConfirmar;
	private JButton jButtonCancelar;
	private JTable jTableAluno;
	private DefaultTableModel defaulTableModelAluno ;
	private JScrollPane jSCrollPaneAluno;
	
	 


	/**
	 * Create the panel.
	 * @return 
	 * @throws ParseException 
	 */
	public  PainelAluno()  {

			setLayout(null);
			setVisible(true);
			setBackground(new Color(198,232,245));
			add(getTextFieldmatricula());
			add(getTextFieldnome());
			add(lblmatricula());
			add(getLblnome());
			add(getLblcpf());
			add(getLblrg());
			add(getjButtonCadastrar());
			add(getLbltitulo());
			add(getJComboBoxCurso());
			add(getFormattedTextFieldRG());
			add(getFormattedTextFieldCPF());
			add(getJComboBoxPesquisa());
			add(getJTextFieldPesquisa());
			add(getJButtonPesquisa());
			add(getJButtonExcluir());
			add(getJButtonAlterar());
			add(getJButtonConfirmar());
			add(getJButtonCancelar());
			add(getSeparator());
			add(getjTableAluno());
			add(getjSCrollPaneAluno());

		
	}


	public JFormattedTextField getFormattedTextFieldRG() {
		if (formattedTextFieldRG == null) {
			formattedTextFieldRG = new JFormattedTextField();
			formattedTextFieldRG.setFormatterFactory(formataMascaras().getRG());
			formattedTextFieldRG.setBounds(218, 148, 207, 20);
		}
		return formattedTextFieldRG;
	}
	public JFormattedTextField getFormattedTextFieldCPF() {
		if (formattedTextFieldCPF == null) {
			formattedTextFieldCPF = new JFormattedTextField();
			formattedTextFieldCPF.setFormatterFactory(formataMascaras().getCPF());
			/*try {
				formattedTextFieldCPF.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("###.###.###-##")));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			formattedTextFieldCPF.setBounds(538, 117, 207, 20);
		}
		return formattedTextFieldCPF;
	}
	public JTextField getTextFieldmatricula() {
		
		if(textFieldmatricula == null) {
			textFieldmatricula = new JTextField();
			textFieldmatricula.setBounds(538, 148, 207, 20);
		}
		
		return textFieldmatricula;
	}
	
	public JTextField getTextFieldnome() {
		
		if(textFieldnome == null) {
			textFieldnome = new JTextField();
			textFieldnome.setBounds(218, 117, 234, 20);
		}
		
		return textFieldnome;
	}

	public JLabel lblmatricula() {
		if(lblmatricula == null) {
			lblmatricula = new JLabel();
			lblmatricula.setText("Matricula");
			lblmatricula.setBounds(470, 151, 62, 14);
		}
		return lblmatricula;
	}
	
	public JLabel getLblnome() {
		if(lblnome == null) {
			lblnome = new JLabel();
			lblnome.setText("Nome");
			lblnome.setBounds(171, 110, 35, 35);
		}
		return lblnome;
	}
	
	public JLabel getLblcpf() {
		if(lblcpf == null) {
			lblcpf = new JLabel();
			lblcpf.setText("Cpf");
			lblcpf.setBounds(492, 120, 46, 14);
		}
		return lblcpf;
	}
	
	public JLabel getLblrg() {
		if(lblrg == null) {
			lblrg = new JLabel();
			lblrg.setText("Rg");
			lblrg.setBounds(171, 141, 35, 35);
		}
		return lblrg;
	}
	
	public JButton getjButtonCadastrar() {
		if(jButtonCadastrar == null) {
			jButtonCadastrar = new JButton("Cadastrar");
			jButtonCadastrar.setBounds(374, 312, 123, 23);
			jButtonCadastrar.setForeground(Color.WHITE);
			jButtonCadastrar.setBackground(Color.BLUE);
			
		}
		return jButtonCadastrar;
	}

	public JLabel getLbltitulo() {
		if(lbltitulo==null)
		{
		lbltitulo = new JLabel("Cadastro aluno");
		lbltitulo.setFont(new Font("Tahoma", Font.BOLD, 23));
		lbltitulo.setBounds(171, 32, 207, 35);
		add(lbltitulo);
		}
		return lbltitulo;
	}
	  public FormataMascaras formataMascaras() {
	        if (formataMascaras == null) {
	            formataMascaras = new FormataMascaras();
	        }
	        return formataMascaras;
	    }
	
	public JComboBox<String> getJComboBoxCurso() {
		if (jcomboboxCurso == null) {
			jcomboboxCurso = new JComboBox<String>();
			jcomboboxCurso.setBackground(new Color(198,232,245));
			CursoBanco c = new CursoBanco();
			
			jcomboboxCurso.setModel(new DefaultComboBoxModel(c.listarCursos("%").toArray()));
			
			jcomboboxCurso.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Curso", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			jcomboboxCurso.setBounds(218, 193, 147, 50);
		}
		return jcomboboxCurso;
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
		if (defaulTableModelAluno == null) {
			defaulTableModelAluno = new DefaultTableModel(new Object[][] {},
					new String[] {  "Nome", "Matrícula", "CPF" }) {
				public boolean isCellEditable(int row, int column) {
					return false;

				}
			};
		}
		return defaulTableModelAluno;
	}
	
	public JTable getjTableAluno() {
		if (jTableAluno == null) {
			jTableAluno = new JTable(getDefaultTableModel());
			jTableAluno.getTableHeader().setReorderingAllowed(false);
			jTableAluno.setRowSelectionAllowed(true);
			jTableAluno.getColumnModel().getColumn(0).setPreferredWidth(400);
			jTableAluno.getColumnModel().getColumn(1).setPreferredWidth(100);
			jTableAluno.getColumnModel().getColumn(1).setPreferredWidth(100);
			jTableAluno.setLocation(79, 384);
			jTableAluno.setSize(913, 317);
		}
		return jTableAluno;
	}
	
	public JScrollPane getjSCrollPaneAluno() {
		if (jSCrollPaneAluno == null) {
			jSCrollPaneAluno = new JScrollPane(getjTableAluno());
			jSCrollPaneAluno.setLocation(39, 431);
			jSCrollPaneAluno.setSize(832, 148);
		}
		return jSCrollPaneAluno;
	}
	
}
