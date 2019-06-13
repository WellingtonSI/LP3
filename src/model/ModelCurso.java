package model;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JComboBox;

import banco.CursoBanco;
import view.PainelCurso;



public class ModelCurso {
	
	private String nome;
	private int semestres;
	private String tipo;
	private String modalidade;
	
	ModelCurso curs;
	CursoBanco curb;
	
	
	private static PainelCurso painelcurso;
	
	public void ModelBanco(String nome, int semestres, String tipo, String modalidade) {
		this.nome = nome;
		this.semestres = semestres;
		this.tipo = tipo;
		this.modalidade = modalidade;
	}
	
	public ModelCurso(PainelCurso painelcurso) {
		super();
		this.painelcurso = painelcurso;

	}
	
	public boolean TesteNome() {
		String numeros = "0123457899";
		for (int i = 0; i < 10; i++) {
		
			if (painelcurso.getJLabelNomeCurso().getText().contains(Character.toString(numeros.charAt(i)))) {
				return false;
			}
		}
		if (painelcurso.getJLabelNomeCurso().getText().equals(null)
				|| painelcurso.getJLabelNomeCurso().getText().equals("")) {

			return false;
		} else
			return true;

	}

	/*public boolean TesteQuantidadeSemestre() {
		if(painelcurso.getJtextFieldQuantidadeDeSemestre().getText().equals(""))
			return false;
		else
			return true;
	}*/
	
	public boolean TesteTipodeCurso() {
		
		JComboBox <String> tipodecurso = painelcurso. getJcomboBoxTipodeCurso();
		String tipocurso = (String)  tipodecurso.getSelectedItem();
		
		if(tipocurso =="Selecione" )
		{
			return false;
		}
		else
		{
			return true;
		}
		
	}
	public boolean ModalidadeDeEnsino() {
			
			JComboBox <String> modalidadeDeEnsino = painelcurso.getJcomboBoxModalidadeDeEnsino();
			String modalidaensino = (String)  modalidadeDeEnsino.getSelectedItem();
			
			if(modalidaensino =="Selecione" )
			{
				return false;
			}
			else
			{
				return true;
			}
			
		}
	
public void GuardandoDados () {
			
	this.nome = (painelcurso.getJLabelNomeCurso().getText().toUpperCase());
	//this.semestres = Integer.parseInt(painelcurso.getJtextFieldQuantidadeDeSemestre().getText().toUpperCase());
	
	JComboBox <String> tipo = painelcurso.getJcomboBoxTipodeCurso();
	this.tipo = (String)  tipo.getSelectedItem();
	
	JComboBox <String> modalidade = painelcurso.getJcomboBoxModalidadeDeEnsino();
	this.modalidade = (String)  modalidade.getSelectedItem();
	
	curb = new CursoBanco();
	curb.inserir(this);
}

public void limpaCampos() {

	getPainelCurso().getJLabelNomeCurso().setText("");
	//getPainelCurso().getJtextFieldQuantidadeDeSemestre().setText("");
	getPainelCurso().getJcomboBoxTipodeCurso().setSelectedIndex(0);
	getPainelCurso().getJcomboBoxModalidadeDeEnsino().setSelectedIndex(0);
	

}




	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getSemestres() {
		return semestres;
	}
	
	public void setSemestres(int semestres) {
		this.semestres = semestres;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getModalidade() {
		return modalidade;
	}
	
	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	
	public static PainelCurso getPainelCurso()
	{
		if(painelcurso == null)
		{
			painelcurso = new PainelCurso();
		}
		return painelcurso;
	}

	

}
