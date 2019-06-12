package banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.ModelTurma;

public class TurmaBanco {
	
	Connection conexao = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	
	public boolean inserir(ModelTurma tur) {
		
		String sql1 = "insert into turma (dia, hora_inicial, hora_final, Disciplina_codigo, Professor_matricula, Curso_codigo) values (?, ?, ?, ?, ?, ?)";
		conexao = Conexao.conector();
		
		try {
			pst = conexao.prepareStatement(sql1);
			pst.setString(1, tur.getDia());
			pst.setString(2, tur.getHora_inicial() );
			pst.setString(3, tur.getHora_final());
			pst.setLong(4, tur.getDisciplina_codigo());
			pst.setLong(5, tur.getProfessor_matricula());
			pst.setLong(6, tur.getCurso_codigo());
			System.out.println(pst);
			int teste = pst.executeUpdate();

			if(teste > 0) {
					//System.out.println("Inserir1");
				return true;
			}
			conexao.close();
		} catch (Exception e) {
			// TODO: handle exception
				//System.out.println("Erro inserir1"+e);	
		}	
		
		
		return false;
	}

}
