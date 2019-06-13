package banco;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.ModelAluno;
import model.ModelCurso;

public class CursoBanco {
	
	Connection conexao = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	
	public boolean inserir(ModelCurso curs) {
		// TODO Auto-generated method stub
		String sql1 = "insert into curso (IdCurso, nome, semestres, tipo, modalidade) values (?,?, ?, ?, ?)";
		conexao = Conexao.conector();

		//aki é o sql10
		try {
			pst = conexao.prepareStatement(sql1);
			pst.setString(1, curs.getNome());
			pst.setLong(2, curs.getSemestres());
			pst.setString(3, curs.getTipo());
			pst.setString(4, curs.getModalidade());

			int teste = pst.executeUpdate();

			if(teste > 0) {
//					System.out.println("Inserir1");
				return true;
			}
			conexao.close();
		} catch (Exception e) {
			// TODO: handle exception
//			
			System.out.println("Erro inserir curso"+e);	
		}								
	
		return false;
	}
	
	
	public ArrayList<String> listarCursos(String stringBusca){
		//String sql1 = "SELECT `nome` FROM `curso` WHERE `nome` LIKE ?";
		String sql1 = "SELECT `codigo`, `nome` FROM `curso` WHERE `codigo` LIKE ?";
		conexao = Conexao.conector();
		ArrayList<String> lista = new ArrayList<String>();
		//lista.add(rs.getString("codcurso"));		
		//aki � o sql1
		try {
			pst = conexao.prepareStatement(sql1);
			pst.setString(1, stringBusca);

			rs = pst.executeQuery();
            while(rs.next()) {
            	lista.add(rs.getString("codigo")+"-"+rs.getString("nome"));
            	//lista.add(rs.getString("nome"));
            	//lista.add(rs.getString("codigo"));
            }
			conexao.close();
		} catch (Exception e) {
			// TODO: handle exception
//			
			System.out.println("Erro read curso"+e);	
		}								
		
		return lista;
		
	}


}
