package view;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import java.awt.Color;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;

public class PainelProfessor extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtNome;
	private JTextField txtMatricula;
	private JComboBox <String> jcomboboxarea;
	private JComboBox <String> jcomboboxFormaTrabalho;
	private JLabel lblnome;
	private JLabel lblmatricula;
	private JButton btncadastrar;
	private JLabel lblCadastroProfessor;

	/**
	 * Create the panel.
	 */
	public PainelProfessor() {
		
		setLayout(null);
		setVisible(true);
		add(getTxtNome());
		add(getTxtMatricula());
		add(getJcomboboxarea());
		add(getJcomboboxFormaTrabalho());
		add(getLblnome());
		add(getLblmatricula());
		add(getBtncadastrar());
		add(getLblCadastroProfessor());
		 
		
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
	
	public JButton getBtncadastrar() {
		if(btncadastrar == null) {
			btncadastrar = new JButton("Cadastrar");
			btncadastrar.setBounds(289, 261, 109, 23);
			
		}
		return btncadastrar;
	}

	public JComboBox <String> getJcomboboxarea() {
		if(jcomboboxarea == null) {
			jcomboboxarea = new JComboBox<String>();
			jcomboboxarea.setModel(new DefaultComboBoxModel<String>(new String[] {"Selecione", "Adicionar"}));
			jcomboboxarea.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Area", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			jcomboboxarea.setBounds(391, 167, 109, 50);

		}
		return jcomboboxarea;
	}
	
	public JComboBox <String> getJcomboboxFormaTrabalho() {
		if(jcomboboxFormaTrabalho == null) {
			jcomboboxFormaTrabalho = new JComboBox<String>();
			jcomboboxFormaTrabalho.setModel(new DefaultComboBoxModel(new String[] {"Selecione", "16 (D.E.)", "16 (40 h)", "8 (20 h)", "Adicionar"}));
			jcomboboxFormaTrabalho.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Forma De Trabalho", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
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
	
	
	public void addCadastrarListener(ActionListener listenForCadastButton){

		 btncadastrar.addActionListener(listenForCadastButton);

		}
	 
	public void displayErrorMessage(String errorMessage){

		 JOptionPane.showMessageDialog(this, errorMessage);

	}

}
