package model;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.sql.Date;

import view.PainelTurma;
import banco.AlunoBanco;
import banco.TurmaBanco;

public class ModelTurma {
	
	private int codigo;
	private String dia;
	private String hora_inicial;
	private String hora_final;
	private int Disciplina_codigo;
	private int Professor_matricula;
	private int Curso_codigo;
	
	ModelTurma modelclasse;
	TurmaBanco turmb;
	
	private static PainelTurma painelturma;
	
	
	
	
	public ModelTurma(int codigo, String dia, String hora_inicial, String hora_final, int Disciplina_codigo, int Professor_matricula, int Curso_codigo){
		super();
		
		this.codigo = codigo;
		this.dia = dia;
		this.hora_final = hora_final;
		this.hora_inicial = hora_inicial;
		this.Disciplina_codigo = Disciplina_codigo;
		this.Professor_matricula = Professor_matricula;
		this.Curso_codigo = Curso_codigo;
	}

	
	public void addNoJlist()
	{
	
		
	}
	public ModelTurma(PainelTurma painelturma) {
		// TODO Auto-generated constructor stub
		
		super();
		this.painelturma = painelturma;
		
	}
	
	public boolean TesteHorario()
	{
			String inicial,fim;
		 inicial = painelturma.getJComboBoxHoraInicial().getItemAt(painelturma.getJComboBoxHoraInicial().getSelectedIndex());
		 fim = painelturma.getJComboBoxHoraFinal().getItemAt(painelturma.getJComboBoxHoraFinal().getSelectedIndex());
		 
		 int resultado = inicial.compareTo(fim);
		 
		 if(resultado>=0)
			 return false;
		 else
			 return true;
		
	}
	
	public boolean TesteDia()
	{
		JComboBox<String> dia = painelturma.getJComboBoxDia();
		String diaa = (String)  dia.getSelectedItem();
		if(diaa == "Selecione")
		{
			return false;
		}
		else 
			return true;
	}
	
	public void adicionarProfessor()
	{
		
	}

	public void GuardandoDados () {
		
		this.Disciplina_codigo = Integer.parseInt(painelturma.getJComboBoxDisciplina() .getSelectedItem().toString().split("-")[0]);
		this.Professor_matricula =  Integer.parseInt(painelturma.getJComboBoxProfessor().getSelectedItem().toString().split("-")[0]);
		this.Curso_codigo = Integer.parseInt(painelturma.getJComboBoxCurso().getSelectedItem().toString().split("-")[0]);
		
		JComboBox <String> dia = painelturma.getJComboBoxCurso();
		this.dia = (String) dia.getSelectedItem();
		
		JComboBox <String> hora_final = painelturma.getJComboBoxHoraFinal();
		this.hora_final = (String) dia.getSelectedItem();
		
		JComboBox <String> hora_inicial = painelturma.getJComboBoxHoraInicial();
		this.hora_final = (String) hora_final.getSelectedItem();
		
		//turmb = new TurmaBanco();
		//turmb.inserir(this);
		
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getDia() {
		return dia;
	}


	public void setDia(String dia) {
		this.dia = dia;
	}


	public String getHora_inicial() {
		return hora_inicial;
	}


	public void setHora_inicial(String hora_inicial) {
		this.hora_inicial = hora_inicial;
	}


	public String getHora_final() {
		return hora_final;
	}


	public void setHora_final(String hora_final) {
		this.hora_final = hora_final;
	}


	public int getDisciplina_codigo() {
		return Disciplina_codigo;
	}


	public void setDisciplina_codigo(int disciplina_codigo) {
		Disciplina_codigo = disciplina_codigo;
	}


	public int getProfessor_matricula() {
		return Professor_matricula;
	}


	public void setProfessor_matricula(int professor_matricula) {
		Professor_matricula = professor_matricula;
	}


	public int getCurso_codigo() {
		return Curso_codigo;
	}


	public void setCurso_codigo(int curso_codigo) {
		Curso_codigo = curso_codigo;
	}
	
	
	/*public JList getList() {
		if (list == null) {
			list = new JList();
		}
		return list;
	}*/
	
	private PainelTurma Painelturma() {
		if(painelturma == null)
		{
			painelturma = new PainelTurma();
		}
		return painelturma;
	}

}
