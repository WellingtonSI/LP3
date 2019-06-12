package banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.ModelProfessor;

public class ProfessorBanco {
	
	Connection conexao = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	
	public boolean inserir(ModelProfessor prof) {
		// TODO Auto-generated method stub
		String sql1 = "insert into professor (matricula, nome, forma_trabalho, area) values (?, ?, ?, ?)";
		conexao = Conexao.conector();

		//aki é o sql1
		try {
			pst = conexao.prepareStatement(sql1);
			pst.setLong(1, prof.getMatricula());
			pst.setString(2, prof.getNome());
			pst.setString(3, prof.getFormaTrabalho());
			pst.setString(4, prof.getArea());

			int teste = pst.executeUpdate();

			if(teste > 0) {
//					System.out.println("Inserir1");
				return true;
			}
			conexao.close();
		} catch (Exception e) {
			// TODO: handle exception
//				System.out.println("Erro inserir1"+e);	
		}								
	
		return false;
	}
	
	public ArrayList<String> listarProfessor(String stringBusca){
		//String sql1 = "SELECT `nome` FROM `curso` WHERE `nome` LIKE ?";
		String sql1 = "SELECT `matricula`, `nome` FROM `professor` WHERE `matricula` LIKE ?";
		conexao = Conexao.conector();
		ArrayList<String> lista = new ArrayList<String>();
		try {
			pst = conexao.prepareStatement(sql1);
			pst.setString(1, stringBusca);

			rs = pst.executeQuery();
            while(rs.next()) {
            	lista.add(rs.getString("matricula")+"-"+rs.getString("nome"));
            	
            }
			conexao.close();
		} catch (Exception e) {
			// TODO: handle exception

			System.out.println("Erro inserir1"+e);	
		}								
		
		return lista;
		
	}

}
