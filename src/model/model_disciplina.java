package model;

import javax.swing.JComboBox;

import banco.DisciplinaBanco;

import view.PainelDisciplina;
import view.PainelProfessor;

public class model_disciplina {
	
	private String nome;
	private String departamento;
	private int codigo;
	private int semestre;
	private String carga_horaria;
	private String pre_requisito;
	private int cod_curso;
	private String tipo;
	
	private DisciplinaBanco discb;
	
	private static PainelDisciplina paineldisciplina;
	
	public model_disciplina(String nome, String departamento, int codigo, int semestre, String carga_horaria, String pre_requisito, String tipo, int cod_curso ) {
		this.nome = nome;
		this.departamento = departamento;
		this.codigo = codigo;
		this.semestre = semestre;
		this.carga_horaria = carga_horaria;
		this.pre_requisito = pre_requisito;
		this.cod_curso = cod_curso;
		this.tipo = tipo;
		
	}
	
	public model_disciplina(PainelDisciplina paineldisciplina) {
		super();
		this.paineldisciplina = paineldisciplina;
	}
	public boolean TesteNome() {
		String numeros = "0123457899";
		for (int i = 0; i < 10; i++) {
		
			if (paineldisciplina.getTextFieldNome().getText().contains(Character.toString(numeros.charAt(i)))) {
				return false;
			}
		}
		if (paineldisciplina.getTextFieldNome().getText().equals(null)
				|| paineldisciplina.getTextFieldNome().getText().equals("")) {

			return false;
		} else
			return true;

	}
	
	public boolean TesteDepartamento() {
		String numeros = "0123457899";
		for (int i = 0; i < 10; i++) {
		
			if (paineldisciplina.getTextFieldDepartamento().getText().contains(Character.toString(numeros.charAt(i)))) {
				return false;
			}
		}
		if (paineldisciplina.getTextFieldDepartamento().getText().equals(null)
				|| paineldisciplina.getTextFieldDepartamento().getText().equals("")) {

			return false;
		} else
			return true;

	}
	
	public boolean TesteCodigoDisciplina() {
		try {
			
			int CodigoDisciplina = Integer.parseInt(paineldisciplina.getTextFieldCodigo().getText());
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean TesteSemestre() {
		try {
			
			int Semestre = Integer.parseInt(paineldisciplina.getTextFieldSemestre().getText());
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean TesteComboBoxCargaHoraria()
	{
		JComboBox <String> Cargahoraria = paineldisciplina.getJcomboboxCargaHoraria();
		String cargahoraria = (String)  Cargahoraria.getSelectedItem();
		
		if(cargahoraria =="Selecione" )
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public boolean TesteComboBoxTipoDisciplina()
	{
		JComboBox <String> tipodedisciplina = paineldisciplina.getJcomboBoxTipo();
		String tipodisciplina = (String)  tipodedisciplina.getSelectedItem();
		
		if(tipodisciplina =="Selecione" )
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	
	public void GuardandoDados () {

		//JComboBox <String> carga_horaria = paineldisciplina.getJcomboboxFormaTrabalho();
		//this.formaTrabalho = (String)  formadetrabalho.getSelectedItem();
		
		this.nome = (paineldisciplina.getTextFieldNome().getText().toUpperCase());
		this.departamento = (paineldisciplina.getTextFieldDepartamento().getText());
		// codigo da disciplina
		this.semestre = Integer.parseInt(paineldisciplina.getTextFieldSemestre().getText());
		
		JComboBox <String> carga_horaria = paineldisciplina.getJcomboboxCargaHoraria();
		this.carga_horaria = (String)  carga_horaria.getSelectedItem();
		
		JComboBox <String> cod_curso = paineldisciplina.getJComboBoxCurso();
		this.cod_curso= Integer.parseInt(paineldisciplina.getJComboBoxCurso().getSelectedItem().toString().split("-")[0]);
		
		
		JComboBox <String> pre_requisito = paineldisciplina.getJcomboBoxPreRequisito();
		this.pre_requisito =  pre_requisito.getSelectedItem().toString().split("-")[1];
		
		JComboBox <String> tipo = paineldisciplina.getJcomboBoxTipo();
		this.tipo = (String)  tipo.getSelectedItem();
		
		
		
		
		//discb = new DisciplinaBanco();
		//discb.inserir(this);
	}
	
	public void limpaCampos() {

		getPainelDisciplina().getTextFieldNome().setText("");
		getPainelDisciplina().getTextFieldCodigo().setText("");
		getPainelDisciplina().getTextFieldDepartamento().setText("");
		getPainelDisciplina().getTextFieldSemestre().setText("");
		getPainelDisciplina().getJcomboboxCargaHoraria().setSelectedIndex(0);
		getPainelDisciplina().getJComboBoxCurso().setSelectedIndex(0);
		getPainelDisciplina().getJcomboBoxPreRequisito().setSelectedIndex(0);
		getPainelDisciplina().getJcomboBoxTipo().setSelectedIndex(0);

	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public String getCarga_horaria() {
		return carga_horaria;
	}

	public void setCarga_horaria(String carga_horaria) {
		this.carga_horaria = carga_horaria;
	}

	public String getPre_requisito() {
		return pre_requisito;
	}

	public void setPre_requisito(String pre_requisito) {
		this.pre_requisito = pre_requisito;
	}

	public int getCod_curso() {
		return cod_curso;
	}

	public void setCod_curso(int cod_curso) {
		this.cod_curso = cod_curso;
	}

	public void cursoscombox(){
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public static PainelDisciplina getPainelDisciplina()
	{
		if(paineldisciplina == null)
		{
			paineldisciplina = new PainelDisciplina();
		}
		return paineldisciplina;
	}
	
	

}
