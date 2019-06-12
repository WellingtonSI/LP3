package model;

import javax.swing.JComboBox;

import view.PainelProfessor;

import banco.ProfessorBanco;

public class ModelProfessor {
	
	private String nome;
	private String area;
	private int matricula;
	private static PainelProfessor painelprofessor;
	private String formaTrabalho;
	ModelProfessor prof;
	ProfessorBanco profb;
	
	public void ModelBanco(int matricula, String nome, String formaTrabalho, String area) {
		this.nome = nome;
		this.area = area;
		this.matricula = matricula;
		this.formaTrabalho = formaTrabalho;
	}
	
	public ModelProfessor(PainelProfessor painelprofessor) {
		super();
		this.painelprofessor = painelprofessor;
	}
	
	public boolean TesteNome() {
		String numeros = "0123457899";
		for (int i = 0; i < 10; i++) {
			//System.out.println(numeros.charAt(i));
			if (painelprofessor.getTxtNome().getText().contains(Character.toString(numeros.charAt(i)))) {
				return false;
			}
		}
		if (painelprofessor.getTxtNome().getText().equals(null)
				|| painelprofessor.getTxtNome().getText().equals("")) {

			return false;
		} else
			return true;

	}
	public boolean TesteMatricula() {
		try {
			int matricula = Integer.parseInt(painelprofessor.getTxtMatricula().getText());
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public boolean TesteComboBoxFormadeTrabalho()
	{
		JComboBox <String> formadetrabalho = painelprofessor.getJcomboboxFormaTrabalho();
		String formatrabalho = (String)  formadetrabalho.getSelectedItem();
		
		if(formatrabalho =="Selecione" )
		{
			
			return false;
		}
		else
		{
			return true;
		}
	}
	
public void GuardandoDados () {

		JComboBox <String> formadetrabalho = painelprofessor.getJcomboboxFormaTrabalho();
		this.formaTrabalho = (String)  formadetrabalho.getSelectedItem();
		
		this.nome = (painelprofessor.getTxtNome().getText().toUpperCase());
		this.matricula = Integer.parseInt(painelprofessor.getTxtMatricula().getText());
		
		//profb = new ProfessorBanco();
		//profb.inserir(this);
}
	
		public String getFormaTrabalho() {
			
			JComboBox <String> formadetrabalho = painelprofessor.getJcomboboxFormaTrabalho();
			String formatrabalho = (String)  formadetrabalho.getSelectedItem();
			
			return formatrabalho;
		}

	public void limpaCampos() {

		getPainelProfessor().getTxtNome().setText("");
		getPainelProfessor().getTxtMatricula().setText("");
		getPainelProfessor().getJcomboboxarea().setSelectedIndex(0);
		getPainelProfessor().getJcomboboxFormaTrabalho().setSelectedIndex(0);
		

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public void FormaTrabalho(String formaTrabalho) {
		this.formaTrabalho = formaTrabalho;
	}

	
	public void setFormaTrabalho(String formaTrabalho) {
		this.formaTrabalho = formaTrabalho;
	}
	
	public static PainelProfessor getPainelProfessor()
	{
		if(painelprofessor == null)
		{
			painelprofessor = new PainelProfessor();
		}
		return painelprofessor;
	}
}
