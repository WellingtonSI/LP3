package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;
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
	private JButton btnCadastrar;
	private JTextField textFieldNome;
	private JLabel lblQuantidadeDeSemestres;
	private JTextField JtextFieldQuantidadeDeSemestre;
	private JComboBox<String> JcomboBoxTipodeCurso;
	private JComboBox<String> JcomboBoxModalidadeDeEnsino;
	
	
	
	public PainelCurso() {
		this.setLayout(null);
		add(getLbltitulo());
		add(getLblNome());
		add(getBtnFluxograma());
		add(getBtnCadastrar());
		add(getTextFieldNome());
		add(getLblQuantidadeDeSemestres());
		add(getJtextFieldQuantidadeDeSemestre());
		add(getJcomboBoxTipodeCurso());
		add(getJcomboBoxModalidadeDeEnsino());
		
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
			lblNome.setBounds(202, 129, 58, 23);
		}
		return lblNome;
	}
	public JButton getBtnFluxograma() {
		if (btnFluxograma == null) {
			btnFluxograma = new JButton("Fluxograma");
			btnFluxograma.setBounds(202, 322, 108, 23);
		}
		return btnFluxograma;
	}
	public JButton getBtnCadastrar() {
		if (btnCadastrar == null) {
			btnCadastrar = new JButton("Cadastrar");
			btnCadastrar.setBounds(427, 472, 97, 23);
		}
		return btnCadastrar;
	}
	public JTextField getTextFieldNome() {
		if (textFieldNome == null) {
			textFieldNome = new JTextField();
			textFieldNome.setBounds(375, 131, 228, 20);
			textFieldNome.setColumns(10);
		}
		return textFieldNome;
	}
	public JLabel getLblQuantidadeDeSemestres() {
		if (lblQuantidadeDeSemestres == null) {
			lblQuantidadeDeSemestres = new JLabel("Quantidade de semestres");
			lblQuantidadeDeSemestres.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblQuantidadeDeSemestres.setBounds(202, 163, 160, 14);
		}
		return lblQuantidadeDeSemestres;
	}
	public JTextField getJtextFieldQuantidadeDeSemestre() {
		if (JtextFieldQuantidadeDeSemestre == null) {
			JtextFieldQuantidadeDeSemestre = new JTextField();
			JtextFieldQuantidadeDeSemestre.setBounds(375, 161, 228, 20);
			JtextFieldQuantidadeDeSemestre.setColumns(10);
		}
		return JtextFieldQuantidadeDeSemestre;
	}
	public JComboBox<String> getJcomboBoxTipodeCurso() {
		if (JcomboBoxTipodeCurso == null) {
			JcomboBoxTipodeCurso = new JComboBox<String>();
			JcomboBoxTipodeCurso.setModel(new DefaultComboBoxModel(new String[] {"Selecione","Bacharelado", "Licenciatura",}));
			JcomboBoxTipodeCurso.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Tipo de curso", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			JcomboBoxTipodeCurso.setBounds(202, 220, 147, 50);
		}
		return JcomboBoxTipodeCurso;
	}
	public JComboBox<String> getJcomboBoxModalidadeDeEnsino() {
		if (JcomboBoxModalidadeDeEnsino == null) {
			JcomboBoxModalidadeDeEnsino = new JComboBox<String>();
			JcomboBoxModalidadeDeEnsino.setModel(new DefaultComboBoxModel(new String[] {"Selecione","Presencial", "Distância",}));
			JcomboBoxModalidadeDeEnsino.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Modalidade de ensino", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			JcomboBoxModalidadeDeEnsino.setBounds(456, 220, 147, 50);
		}
		return JcomboBoxModalidadeDeEnsino;
	}
	
	public void addCadastrarListener(ActionListener listenForCadastButton){

			btnCadastrar.addActionListener(listenForCadastButton);

	}
	 
	public void displayErrorMessage(String errorMessage){

		 JOptionPane.showMessageDialog(this, errorMessage);

	}
}
