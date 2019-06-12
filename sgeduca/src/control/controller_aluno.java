package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import model.ModelAluno;
import view.PainelAluno;
import view.PainelMoldura;
import view.PainelTelaPrincipal;

public class controller_aluno  {
	 
	//implements ActionListener
	private PainelTelaPrincipal paineltelaprincipal;
	private JPanel PainelTelaPrincipal; 
	private ModelAluno modelaluno;
	private PainelAluno painelaluno;
	private PainelMoldura imagem;
	

	
	public controller_aluno(PainelTelaPrincipal paineltelaprincipal,ModelAluno  modelaluno, PainelAluno painelaluno) {
		
		
		this.modelaluno =  modelaluno;
		this.painelaluno = painelaluno;
		this.paineltelaprincipal = paineltelaprincipal;
		this.PainelTelaPrincipal = PainelTelaPrincipal;
		
		
		this.painelaluno.addCadastrarListener(new AlunoListener());

		
	}

	
		class AlunoListener implements ActionListener{
				
				
				@Override
				public void actionPerformed(java.awt.event.ActionEvent e) {
					
					
					boolean nome =  Modelaluno().TesteNome();
					boolean matricula = Modelaluno().TesteMatricula();
					boolean cpf = Modelaluno().TesteCpf();
					boolean rg = Modelaluno().TesteRg();
					
					//modelaluno.carregandodados();
					
					
					if(!(nome))
					{
						painelaluno.displayErrorMessage("Digite um nome válido");
			
					}
					if(!(matricula))
					{
						painelaluno.displayErrorMessage("Digite um valor válido na matricula");
					}
					if(!(cpf))
					{
						painelaluno.displayErrorMessage("Digite um valor válido no CPF");
					}
					if(!(rg))
					{
						painelaluno.displayErrorMessage("Digite um valor válido no RG");
					}
					else if ( nome && matricula && cpf && rg)
					{
						
						modelaluno.GuardandoDados();
						modelaluno.limpaCampos();
						
						JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");
						
					}
					
					
				}

				
		
			}


	
	private PainelAluno Painelaluno() {
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
	
	private ModelAluno  Modelaluno() {
		if(modelaluno == null)
		{
			modelaluno = new ModelAluno(painelaluno);
		}
		return modelaluno;
	}
	public PainelTelaPrincipal Paineltelaprincipal() {
		if(paineltelaprincipal == null) {
			paineltelaprincipal = new PainelTelaPrincipal();
		}
		return paineltelaprincipal;
	}
	public PainelMoldura getImagem() {
		if(imagem == null)
		{
			imagem = new PainelMoldura();
		}
			
		
		return imagem;
	}
	


	
		
	}
		

	