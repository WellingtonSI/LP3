package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class GerenciarDepartamento extends JPanel {
	private JLabel jLabelGerenciarDepartamento;
	private JTextField jTextFieldDados;
	private JButton jButtonConfirmar;
	private JButton jButtonCancelar;
	
	
	
	public GerenciarDepartamento(){
		
		setLayout(null);
		add(getJLabelGerenciarDepartamento());
		add(getJTextFieldDados());
		add(getJButtonConfirmar());
		add(getJButtonCancelar());
		setVisible(true);
		
	}
	public JLabel getJLabelGerenciarDepartamento() {
		if (jLabelGerenciarDepartamento == null) {
			jLabelGerenciarDepartamento = new JLabel("Gerenciar Departamento");
			jLabelGerenciarDepartamento.setFont(new Font("Tahoma", Font.BOLD, 20));
			jLabelGerenciarDepartamento.setBounds(68, 22, 263, 41);
		}
		return jLabelGerenciarDepartamento;
	}
	public JTextField getJTextFieldDados() {
		if (jTextFieldDados == null) {
			jTextFieldDados = new JTextField();
			jTextFieldDados.setFont(new Font("Tahoma", Font.PLAIN, 15));
			jTextFieldDados.setBounds(68, 87, 259, 41);
			jTextFieldDados.setColumns(10);
		}
		return jTextFieldDados;
	}
	public JButton getJButtonConfirmar() {
		if (jButtonConfirmar == null) {
			jButtonConfirmar = new JButton("Confirmar");
			jButtonConfirmar.setForeground(new Color(255, 255, 255));
			jButtonConfirmar.setBackground(new Color(50, 205, 50));
			jButtonConfirmar.setBounds(82, 162, 103, 28);
		}
		return jButtonConfirmar;
	}
	public JButton getJButtonCancelar() {
		if (jButtonCancelar == null) {
			jButtonCancelar = new JButton("Cancelar");
			jButtonCancelar.setForeground(new Color(255, 255, 255));
			jButtonCancelar.setBackground(new Color(169, 169, 169));
			jButtonCancelar.setBounds(217, 162, 98, 28);
		}
		return jButtonCancelar;
	}
}
