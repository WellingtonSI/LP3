package banco;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;


import model.ModelDisciplina;



public class DisciplinaBanco {
	
	Connection conexao = null;
	PreparedStatement pst = null;
	ResultSet rs = null;


	public boolean inserir(ModelDisciplina disc) {

	
		// TODO Auto-generated method stub
		String sql1 = "insert into disciplina (codigo, nome, departamento, semestre, carga_horaria, pre_requisito, tipo, Curso_codigo) values (?, ?, ?, ?, ?, ?, ?, ?)";
		conexao = Conexao.conector();

		//aki é o sql1
		try {
			pst = conexao.prepareStatement(sql1);
			pst.setLong(1, disc.getCodigo());
			pst.setString(2, disc.getNome());
			pst.setString(3, disc.getDepartamento());
			pst.setLong(4, disc.getSemestre());
			pst.setString(5, disc.getCarga_horaria());
			pst.setString(6, disc.getPre_requisito());
			pst.setString(7, disc.getTipo());
			pst.setLong(8, disc.getCod_curso());

			int teste = pst.executeUpdate();

			if(teste > 0) {
//					System.out.println("Inserir1");
				return true;
			}
			conexao.close();
		} catch (Exception e) {
			// TODO: handle exception
				System.out.println("Erro inserir disciplina"+e);	
		}								
	
		return false;
	}
	
	
	public ArrayList<String> listarDisciplinas(String stringBusca){
		String sql1 = "SELECT `codigo`, `nome` FROM `disciplina` WHERE `nome` LIKE ?";
		//String sql1 = "SELECT `codigo` FROM `curso` WHERE `codigo` LIKE ?";
		conexao = Conexao.conector();
		ArrayList<String> lista = new ArrayList<String>();
		//lista.add(rs.getString("codcurso"));		
		//aki � o sql1
		try {
			pst = conexao.prepareStatement(sql1);
			pst.setString(1, stringBusca);

			rs = pst.executeQuery();
            while(rs.next()) {
            	//lista.add(rs.getString("nome"));
            	lista.add(rs.getString("codigo")+"-"+rs.getString("nome"));
            }
			conexao.close();
		} catch (Exception e) {
			// TODO: handle exception
//			
			System.out.println("Erro read disciplina"+e);	
		}								
		
		return lista;
		
	}
	
	

}
