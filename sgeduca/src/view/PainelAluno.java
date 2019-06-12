package view;

import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
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
	private JFormattedTextField formattedTextFieldCPF;
	private JFormattedTextField formattedtextFieldRG;
	private JLabel lblmatricula;
	private JLabel lblnome;
	private JLabel lblcpf;
	private JLabel lblrg;
	private JLabel lbltitulo;
	private JButton btncadastrar;
	private JComboBox<String> jcomboboxTurma;
	private JComboBox<String> jcomboboxCurso;
	private JPanel painelAluno;
	 private FormataMascaras formataMascaras;

	/**
	 * Create the panel.
	 * @return 
	 * @throws 
	 */
	public  PainelAluno() throws ParseException {

			setLayout(null);
			setVisible(true);
			add(getTextFieldmatricula());
			add(getTextFieldnome());
			add(getFormattedTextFieldCPF());
			add(lblmatricula());
			add(getLblnome());
			add(getLblcpf());
			add(getLblrg());
			add(getFormattedTextFieldRg());
			add(getBtncadastrar());
			add(getLbltitulo());
			add(getJComboBoxCurso());
			add(getJcomboboxTurma());
		
	}

	public JTextField getTextFieldmatricula() {
		
		if(textFieldmatricula == null) {
			textFieldmatricula = new JTextField();
			textFieldmatricula.setBounds(353, 202, 207, 20);
		}
		
		return textFieldmatricula;
	}
	
	public JTextField getTextFieldnome() {
		
		if(textFieldnome == null) {
			textFieldnome = new JTextField();
			textFieldnome.setBounds(353, 121, 207, 20);
		}
		
		return textFieldnome;
	}
	
	public JFormattedTextField getFormattedTextFieldCPF()  {
		if (formattedTextFieldCPF == null) {
			formattedTextFieldCPF = new JFormattedTextField();
			formattedTextFieldCPF.setFormatterFactory(formataMascaras().getCPF());
			/*try {
				formattedTextFieldCPF.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("###.###.###-##")));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			formattedTextFieldCPF.setBounds(353, 160, 207, 20);
		}
		
		return formattedTextFieldCPF;


	}
	
	
	public JLabel lblmatricula() {
		if(lblmatricula == null) {
			lblmatricula = new JLabel();
			lblmatricula.setText("Matricula");
			lblmatricula.setBounds(281, 205, 62, 14);
		}
		return lblmatricula;
	}
	
	public JFormattedTextField getFormattedTextFieldRg()  {
		
		if(formattedtextFieldRG == null) {
			formattedtextFieldRG = new JFormattedTextField();
			formattedtextFieldRG.setFormatterFactory(formataMascaras().getRG());
			//formattedtextFieldRG.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("##.###.###-##")));
			formattedtextFieldRG.setBounds(353, 240, 207, 20);
		}
		
		return formattedtextFieldRG;
	}
	
	 public FormataMascaras formataMascaras() {
	        if (formataMascaras == null) {
	            formataMascaras = new FormataMascaras();
	        }
	        return formataMascaras;
	    }

	
	public JLabel getLblnome() {
		if(lblnome == null) {
			lblnome = new JLabel();
			lblnome.setText("Nome");
			lblnome.setBounds(281, 114, 35, 35);
		}
		return lblnome;
	}
	
	public JLabel getLblcpf() {
		if(lblcpf == null) {
			lblcpf = new JLabel();
			lblcpf.setText("Cpf");
			lblcpf.setBounds(281, 163, 46, 14);
		}
		return lblcpf;
	}
	
	public JLabel getLblrg() {
		if(lblrg == null) {
			lblrg = new JLabel();
			lblrg.setText("Rg");
			lblrg.setBounds(281, 233, 35, 35);
		}
		return lblrg;
	}
	
	public JButton getBtncadastrar() {
		if(btncadastrar == null) {
			btncadastrar = new JButton("Cadastrar");
			btncadastrar.setBounds(437, 465, 123, 23);
			
		}
		return btncadastrar;
	}

	public JLabel getLbltitulo() {
		if(lbltitulo==null)
		{
		lbltitulo = new JLabel("Cadastro aluno");
		lbltitulo.setFont(new Font("Tahoma", Font.BOLD, 23));
		lbltitulo.setBounds(201, 34, 207, 35);
		add(lbltitulo);
		}
		return lbltitulo;
	}
	
	public JComboBox<String> getJComboBoxCurso() {
		if (jcomboboxCurso == null) {
			jcomboboxCurso = new JComboBox<String>();
			//jcomboboxCurso.setModel(new DefaultComboBoxModel<String>(new String[] {"Selecione", "curso1", "curso2"}));
			
			CursoBanco c = new CursoBanco();
			
			jcomboboxCurso.setModel(new DefaultComboBoxModel(c.listarCursos("%").toArray()));
			
			jcomboboxCurso.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Curso", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			jcomboboxCurso.setBounds(277, 303, 147, 50);
		}
		return jcomboboxCurso;
	}
	
	public JComboBox <String> getJcomboboxTurma() {
		if(jcomboboxTurma == null) {
			jcomboboxTurma = new JComboBox<String>();
			jcomboboxTurma.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
			jcomboboxTurma.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Turma", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			jcomboboxTurma.setBounds(281, 388, 147, 50);

		}
		return jcomboboxTurma;
	}
	
	public void addCadastrarListener(ActionListener listenForCadastButton){

		 btncadastrar.addActionListener(listenForCadastButton);

		}
	 
	public void displayErrorMessage(String errorMessage){

		 JOptionPane.showMessageDialog(this, errorMessage);

	}

	

	

}
