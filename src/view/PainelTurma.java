package view;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;

import banco.CursoBanco;
import banco.DisciplinaBanco;
import banco.ProfessorBanco;
import model.ModelAluno;
import banco.AlunoBanco;
import javax.swing.border.CompoundBorder;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

public class PainelTurma extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel lblCadastroTurma;
	private JRadioButton radioButtonPeriodoLetivo;

	/*String[] titulosAluno = { "Nome", "Matricula" };
	Object[][] dadosAluno = { { "", "" }, { "", "" }, { "", "" }, { "", "" }, { "", "" }, { "", "" }, { "", "" },
			{ "", "" }, { "", "" }, { "", "" }, { "", "" }, { "", "" }, { "", "" }, { "", "" }, { "", "" }, { "", "" },
			{ "", "" }, { "", "" }, { "", "" }, { "", "" }, { "", "" }, { "", "" }, { "", "" }, { "", "" }, { "", "" },
			{ "", "" }, { "", "" }, { "", "" }, { "", "" }, { "", "" } };
	String[] titulosProfessor = { "Professor", "Matricula" };
	Object[][] dadosProfessor = { { "", "" }, { "", "" } };*/

	private JComboBox<String> JComboBoxCurso;
	private JComboBox<String> JComboBoxDisciplina;
	private JButton JButtonCadastrar;
	private JComboBox<String> JComboBoxProfessor;
	private JComboBox<String> JComboBoxDia;
	private JComboBox<String> JComboBoxHoraInicial;
	private JComboBox<String> JComboBoxHoraFinal;
	private JComboBox<String> JComboBoxAluno;
	private JButton JButtonAdicionarAluno;
	private JButton JButtonAdicionarProfessor;
	private DefaultListModel<String> defaultListModelProfessor, defaultListModelAluno;
	private JScrollPane JScrollPaneAluno, JScrollPaneProfessor;
	private JList<String> jListProfessor, jListAluno;
	String nome;


	public PainelTurma() {

		setLayout(null);
		setVisible(true);
		setBackground(new Color(198,232,245));
		add(getlblCadastroClasse());
		add(getJScrollPaneAluno());
		add(getJScrollPaneProfessor());
		add(getJComboBoxCurso());
		add(getJComboBoxDisciplina());
		add(getJComboBoxProfessor());
		add(getJComboBoxDia());
		add(getJComboBoxHoraInicial());
		add(getJComboBoxHoraFinal());
		add(getJComboBoxAluno());
		add(getJButtonAdicionarAluno());
		add(getJButtonCadastrar());
		add(getJButtonAdicionarProfessor());

	}

	private JLabel getlblCadastroClasse() {
		if (lblCadastroTurma == null) {
			lblCadastroTurma = new JLabel("Cadastro turma");
			lblCadastroTurma.setFont(new Font("Tahoma", Font.BOLD, 23));
			lblCadastroTurma.setBounds(147, 44, 245, 35);
		}
		return lblCadastroTurma;
	}

	public JComboBox<String> getJComboBoxCurso() {
		if (JComboBoxCurso == null) {
			JComboBoxCurso = new JComboBox<String>();
			JComboBoxCurso.setBackground(new Color(198,232,245));
			CursoBanco c = new CursoBanco();

			JComboBoxCurso.setModel(new DefaultComboBoxModel(c.listarCursos("%").toArray()));

			JComboBoxCurso.setBorder(new TitledBorder(
					new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Curso",
					TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			JComboBoxCurso.setBounds(536, 95, 147, 50);
		}
		return JComboBoxCurso;
	}

	public JComboBox<String> getJComboBoxDisciplina() {
		if (JComboBoxDisciplina == null) {
			JComboBoxDisciplina = new JComboBox<String>();
			JComboBoxDisciplina.setBackground(new Color(198,232,245));
			DisciplinaBanco d = new DisciplinaBanco();
			JComboBoxDisciplina.setModel(new DefaultComboBoxModel(d.listarDisciplinas("%").toArray()));

			JComboBoxDisciplina.setBorder(new TitledBorder(
					new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
					"Disciplina", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			JComboBoxDisciplina.setBounds(536, 156, 147, 50);
		}
		return JComboBoxDisciplina;
	}

	public JComboBox<String> getJComboBoxProfessor() {
		if (JComboBoxProfessor == null) {
			JComboBoxProfessor = new JComboBox<String>();
			JComboBoxProfessor.setBackground(new Color(198,232,245));
			ProfessorBanco p = new ProfessorBanco();
			JComboBoxProfessor.setModel(
					new DefaultComboBoxModel(new String[] {"jorge", "mateus", "bruna", "cleiton" }));
			// new DefaultComboBoxModel(p.listarProfessor("%").toArray())

			JComboBoxProfessor.setBorder(new TitledBorder(
					new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
					"Professor", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			JComboBoxProfessor.setBounds(536, 217, 147, 50);
		}
		return JComboBoxProfessor;
	}

	public JComboBox<String> getJComboBoxDia() {
		if (JComboBoxDia == null) {
			JComboBoxDia = new JComboBox<String>();
			JComboBoxDia.setBackground(new Color(198,232,245));
			JComboBoxDia.setModel(new DefaultComboBoxModel(
					new String[] { "Selecione", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sabado" }));
			JComboBoxDia.setBorder(new TitledBorder(
					new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Dia",
					TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			JComboBoxDia.setBounds(536, 288, 147, 50);
		}
		return JComboBoxDia;
	}

	public JComboBox<String> getJComboBoxHoraInicial() {
		if (JComboBoxHoraInicial == null) {
			JComboBoxHoraInicial = new JComboBox<String>();
			JComboBoxHoraInicial.setBackground(new Color(198,232,245));
			JComboBoxHoraInicial.setModel(new DefaultComboBoxModel(new String[] { "07:30", "08:20", "09:10", "10:00", "11:00",
					"11:50", "12:40", "13:10", "14:00", "14:50", "15:40", "16:40", "17:30", "18:20", "19:10", "20:00",
					"20:50", "21:40" }));
			JComboBoxHoraInicial.setBorder(new TitledBorder(
					new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
					"Hora inicial", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			JComboBoxHoraInicial.setBounds(536, 349, 147, 50);
		}
		return JComboBoxHoraInicial;
	}

	public JComboBox<String> getJComboBoxHoraFinal() {
		if (JComboBoxHoraFinal == null) {
			JComboBoxHoraFinal = new JComboBox<String>();
			JComboBoxHoraFinal.setBackground(new Color(198,232,245));
			JComboBoxHoraFinal.setModel(new DefaultComboBoxModel(
					new String[] { "08:20", "09:10", "10:00", "11:00", "11:50", "12:40", "13:10", "14:00", "14:50",
							"15:40", "16:40", "17:30", "18:20", "19:10", "20:00", "20:50", "21:40", "22:30" }));
			JComboBoxHoraFinal.setBorder(new TitledBorder(
					new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
					"Hora final", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			JComboBoxHoraFinal.setBounds(536, 410, 147, 50);
		}
		return JComboBoxHoraFinal;
	}

	public JComboBox<String> getJComboBoxAluno() {
		if (JComboBoxAluno == null) {
			JComboBoxAluno = new JComboBox<String>();
			JComboBoxAluno.setBackground(new Color(198,232,245));
			//AlunoBanco a = new AlunoBanco();
			//jcomboBoxAluno.setModel(new DefaultComboBoxModel(a.listarAlunos("%").toArray()));
			JComboBoxAluno.setModel(new DefaultComboBoxModel(
					new String[] { "Neylan","Roberto","Bruna","Carlos","Ronald","Fausto" }));
			JComboBoxAluno.setBorder(new TitledBorder(
					new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Aluno",
					TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			JComboBoxAluno.setBounds(536, 490, 147, 50);
		}
		return JComboBoxAluno;
	}

	public JButton getJButtonAdicionarAluno() {
		if (JButtonAdicionarAluno == null) {
			JButtonAdicionarAluno = new JButton("Adicionar");
			JButtonAdicionarAluno.setBounds(704, 509, 97, 23);
		}
		return JButtonAdicionarAluno;
	}

	public JButton getJButtonCadastrar() {
		if (JButtonCadastrar == null) {
			JButtonCadastrar = new JButton("Cadastrar");
			JButtonCadastrar.setBounds(561, 586, 97, 23);

		}
		return JButtonCadastrar;
	}

	public JButton getJButtonAdicionarProfessor() {
		if (JButtonAdicionarProfessor == null) {
			JButtonAdicionarProfessor = new JButton("Adicionar");
			JButtonAdicionarProfessor.setBounds(704, 236, 97, 23);
		}
		return JButtonAdicionarProfessor;
	}

	public DefaultListModel<String> getDefaultListModelAluno() {
		if (defaultListModelAluno == null) {
			defaultListModelAluno = new DefaultListModel<String>();
		}
		return defaultListModelAluno;
	}

	public JList<String> getJListAluno() {
		if (jListAluno == null) {
			jListAluno = new JList<String>(getDefaultListModelAluno());
			jListAluno.setBackground(new Color(238, 238, 238));
			jListAluno.setBorder(new TitledBorder(new CompoundBorder(null, new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0))), "Alunos", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
			
		}
		return jListAluno;
	}

	public JList<String> getJListProfessor() {
		if (jListProfessor == null) {
			jListProfessor = new JList<String>(getDefaultListModelProfessor());
			jListProfessor.setBackground(new Color(238, 238, 238));
			jListProfessor.setBorder(new TitledBorder(null, "Professor(es)", TitledBorder.LEFT, TitledBorder.TOP, null, Color.BLACK));
		}
		return jListProfessor;
	}

	

	public DefaultListModel<String> getDefaultListModelProfessor() {
		if (defaultListModelProfessor == null) {
			defaultListModelProfessor = new DefaultListModel<String>();
		}
		return defaultListModelProfessor;
	}

	public JScrollPane getJScrollPaneProfessor() {
		if (JScrollPaneProfessor == null) {
			JScrollPaneProfessor = new JScrollPane(getJListProfessor());
			JScrollPaneProfessor.setBounds(37, 485, 450, 55);
		}
		return JScrollPaneProfessor;
	}

	public JScrollPane getJScrollPaneAluno() {
		if (JScrollPaneAluno == null) {
			JScrollPaneAluno = new JScrollPane(getJListAluno());
			JScrollPaneAluno.setBounds(37, 102, 450, 350);
		}
		return JScrollPaneAluno;
	}
	
	

}
