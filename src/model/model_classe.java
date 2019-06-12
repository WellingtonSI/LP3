package model;

public class model_classe {
	
	private String professor;
	private String aluno;
	private String disciplina;
	
	public model_classe(String professor, String aluno, String disciplina) {
		super();
		this.professor = professor;
		this.aluno = aluno;
		this.disciplina = disciplina;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public String getAluno() {
		return aluno;
	}

	public void setAluno(String aluno) {
		this.aluno = aluno;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	

}
