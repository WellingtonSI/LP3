package control;

import java.awt.event.ActionEvent;


import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.ModelCurso;
import view.GerenciarDepartamento;
import view.JFramePrincipal;
import view.PainelCurso;
import view.PainelMoldura;
import view.FrameGerenciarDepartamento;

import banco.CursoBanco;


public class ControlCurso implements ActionListener{
	
   private PainelMoldura frame;
   private PainelCurso PainelCurso;
   private ModelCurso modelcurso;
   private static JFramePrincipal jFramePrincipal; 
   private GerenciarDepartamento gerenciarDepartamento;
   private static FrameGerenciarDepartamento FrameGerenciarDepartamento;
	
	
	public ControlCurso(PainelCurso PainelCurso, JFramePrincipal jFramePrincipal) {

		this.PainelCurso = PainelCurso;
		this.jFramePrincipal = jFramePrincipal;

		
		addEventos();
		
	}
	
		private void addEventos() {
				
			PainelCurso().getjButtonCadastrar().addActionListener(this);
			PainelCurso().getJButtonAdicionarDepartamento().addActionListener(this);
			PainelCurso().getJButtonExcluirDepartamento().addActionListener(this);
			PainelCurso().getJButtonAlterarDepartamento().addActionListener(this);
		}
			

		

		public void actionPerformed(ActionEvent e) {
			
			boolean nome = Modelcurso().TesteNome();
			//boolean quantidade  = Modelcurso().TesteQuantidadeSemestre();
			boolean tipocurso = Modelcurso().TesteTipodeCurso();
			boolean modalidadensino = Modelcurso().ModalidadeDeEnsino();
			
			if (e.getSource() == PainelCurso().getjButtonCadastrar()) {
			
				if (!(nome)) {
					PainelCurso.displayErrorMessage("Digite um nome válido");
	
				}
				/*if (!(quantidade)) {
					PainelCurso.displayErrorMessage("Preencha o campo de quantidade de semestre");
				}*/
				if (!(tipocurso)) {
					PainelCurso.displayErrorMessage("Escolha um tipo de curso");
				}
				if (!(modalidadensino)) {
					PainelCurso.displayErrorMessage("Escolha uma modalidade de ensino");
				}
				else if(nome /*&& quantidade*/ && tipocurso && modalidadensino )
				{
					Modelcurso().GuardandoDados();
					Modelcurso().limpaCampos();
					
					JOptionPane.showMessageDialog(null, "Curso cadastrado com sucesso!");
				}
			
				
			}
			else if(e.getSource()  == PainelCurso().getJButtonAdicionarDepartamento())
			{
				gerenciarDepartamento=null;
				FrameGerenciarDepartamento=null;
				getGerenciarDepartamento().getJButtonConfirmar().addActionListener(this);
				getGerenciarDepartamento().getJButtonCancelar().addActionListener(this);
				getFrameGerenciarDepartamento().setContentPane(getGerenciarDepartamento());
				getFrameGerenciarDepartamento().repaint();
				getFrameGerenciarDepartamento().validate();
				
				
				
			}
			
			
		}

	

	private PainelCurso PainelCurso() {
		if(PainelCurso == null)
		{
			PainelCurso = new PainelCurso();
		}
		return PainelCurso;
	}
	
	private ModelCurso Modelcurso() {
		if(modelcurso == null)
		{
			modelcurso = new ModelCurso(PainelCurso);
		}
		return modelcurso;
	}
	
	public static JFramePrincipal getJFramePrincipal() {
		if (jFramePrincipal == null) {
			jFramePrincipal = new JFramePrincipal();
		}
		return jFramePrincipal;
	}
	
	private GerenciarDepartamento getGerenciarDepartamento() {
		if(gerenciarDepartamento == null)
		{
			gerenciarDepartamento = new GerenciarDepartamento();
		}
		return gerenciarDepartamento;
	}

	public static FrameGerenciarDepartamento getFrameGerenciarDepartamento() {
		if (FrameGerenciarDepartamento == null) {
			FrameGerenciarDepartamento = new FrameGerenciarDepartamento();
		}
		return FrameGerenciarDepartamento;
	}
}
