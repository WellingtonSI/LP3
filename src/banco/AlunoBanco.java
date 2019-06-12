package banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.ModelAluno;

public class AlunoBanco {
	
	
	Connection conexao = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	
	public boolean inserir(ModelAluno alu) {
		// TODO Auto-generated method stub
		String sql1 = "insert into aluno (matricula, cpf, rg, nome, codigo_turma, Curso_codigo) values (?, ?, ?, ?, ?, ?)";
		conexao = Conexao.conector();

		//aki é o sql1
		try {
			pst = conexao.prepareStatement(sql1);
			pst.setLong(1, alu.getMatricula());
			pst.setString(2, alu.getCpf());
			pst.setString(3, alu.getRg());
			pst.setString(4, alu.getNome());
			pst.setLong(5, alu.getTurma());
			pst.setLong(6, alu.getCurso());
			System.out.println(pst);
			int teste = pst.executeUpdate();

			if(teste > 0) {
					//System.out.println("Inserir1");
				return true;
			}
			conexao.close();
		} catch (SQLException e) {
			// TODO: handle exception
			
				e.printStackTrace();	
		}
		
		finally{
			try {
				conexao.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
		return false;
	}
	
	public ArrayList<String> listarAlunos(String stringBusca){
		//String sql1 = "SELECT `nome` FROM `curso` WHERE `nome` LIKE ?";
		String sql1 = "SELECT `matricula`, `nome` FROM `aluno` WHERE `matricula` LIKE ?";
		conexao = Conexao.conector();
		ArrayList<String> lista = new ArrayList<String>();
		//lista.add(rs.getString("codcurso"));		
		//aki � o sql1
		try {
			pst = conexao.prepareStatement(sql1);
			pst.setString(1, stringBusca);

			rs = pst.executeQuery();
            while(rs.next()) {
            	lista.add(rs.getString("matricula")+"-"+rs.getString("nome"));
            	//lista.add(rs.getString("nome"));
            	//lista.add(rs.getString("codigo"));
            }
			conexao.close();
		} catch (Exception e) {
			// TODO: handle exception
//			
			System.out.println("Erro inserir aluno"+e);	
		}								
		
		return lista;
		
	}

}
