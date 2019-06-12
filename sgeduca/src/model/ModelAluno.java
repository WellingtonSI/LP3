package model;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JComboBox;

import banco.AlunoBanco;
import view.PainelAluno;

public class ModelAluno {

	private String nome;
	private int matricula;
	private String cpf;
	private String rg;
	private int turma;
	private int curso;
	ModelAluno alu;
	AlunoBanco alub;
	
	private static PainelAluno painelaluno;
	

	public void ModelBanco(int matricula, String cpf, String rg, String nome, int turma, int curso) {
		this.matricula = matricula;
		this.cpf = cpf;
		this.rg = rg;
		this.nome = nome;
		this.turma = turma;
		this.curso = curso;
	}
	
	public ModelAluno(PainelAluno painelaluno) {
		super();
		this.painelaluno = painelaluno;
	}
	

	public boolean TesteNome() {
		String numeros = "0123457899";
		for (int i = 0; i < 10; i++) {
			//System.out.println(numeros.charAt(i));
			if (painelaluno.getTextFieldnome().getText().contains(Character.toString(numeros.charAt(i)))) {
				return false;
			}
		}
		if (painelaluno.getTextFieldnome().getText().equals(null)
				|| painelaluno.getTextFieldnome().getText().equals("")) {

			return false;
		} else
			return true;

	}

	public boolean TesteMatricula() {
		try {
			int matricula = Integer.parseInt(painelaluno.getTextFieldmatricula().getText());
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean TesteCpf() {
		
			Pattern padrao = Pattern.compile("^([0-9]{3}\\.?){3}\\-?[0-9]{2}$");
			Matcher matcher = padrao.matcher(getPainelAluno().getFormattedTextFieldCPF().getText());
			if( matcher.matches() )
				return true;
			else
				return false;
			
	
	}

	public boolean TesteRg() {
			Pattern padrao = Pattern.compile("[0-9]{2}\\.?[0-9]{3}\\.?[0-9]{3}-?[0-9]{2}");
			Matcher matcher = padrao.matcher(getPainelAluno().getFormattedTextFieldRg().getText());
			if( matcher.matches() )
				return true;
			else
				return false;
			
	}
	
	public void GuardandoDados () {
		
		this.nome = (painelaluno.getTextFieldnome().getText().toUpperCase());
		this.matricula = Integer.parseInt(painelaluno.getTextFieldmatricula().getText());
		this.cpf = (painelaluno.getFormattedTextFieldCPF().getText().toUpperCase());
		this.rg = (painelaluno.getFormattedTextFieldRg().getText().toUpperCase());
		
		JComboBox <String> turma = painelaluno.getJcomboboxTurma();
		this.turma= Integer.parseInt(painelaluno.getJcomboboxTurma().getSelectedItem().toString());
		
		JComboBox <String> curso = painelaluno.getJComboBoxCurso();
		this.curso= Integer.parseInt(painelaluno.getJComboBoxCurso().getSelectedItem().toString().split("-")[0]);
		
		alub = new AlunoBanco();
		alub.inserir(this);
		
	}
	public void limpaCampos() {

		getPainelAluno().getTextFieldmatricula().setText("");
		getPainelAluno().getTextFieldnome().setText("");
		getPainelAluno().getFormattedTextFieldCPF().setText("");
		getPainelAluno().getFormattedTextFieldRg().setText("");
		getPainelAluno().getJComboBoxCurso().setSelectedIndex(0);
		getPainelAluno().getJcomboboxTurma().setSelectedIndex(0);

	}


	public String getNome() {
		return this.nome;
	}

	public int getMatricula() {
		return this.matricula;
	}

	public String getCpf() {
		return this.cpf;
	}

	public String getRg() {
		return this.rg;
	}

	public int getCurso() {
		return this.curso;
	}

	
	public int getTurma() {
		return turma; 
	}



	public void setTurma(int turma) {
		this.turma = turma;
	}

	
	public static PainelAluno getPainelAluno()
	{
		if(painelaluno == null)
		{
			try {
				painelaluno = new PainelAluno();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return painelaluno;
	}

}
