package control;

import view.JFramePrincipal;

import view.PainelTelaPrincipal;

public class ControlPainelTelaPrincipal {
	
	static JFramePrincipal  jframeprincipal = null;
	PainelTelaPrincipal jpainelTelaPrincipal;

	public ControlPainelTelaPrincipal (JFramePrincipal jframeprincipal ) {
		if(jframeprincipal==null) {
			jframeprincipal = new JFramePrincipal();	
        }
		this.jframeprincipal = jframeprincipal;
		
		if(jpainelTelaPrincipal==null) {
			jpainelTelaPrincipal = new PainelTelaPrincipal();		
		}
		jframeprincipal.setContentPane(jpainelTelaPrincipal);
		jframeprincipal.repaint();
		jframeprincipal.validate();
		
		this.jframeprincipal = jframeprincipal;
		
		
		
	}
	
	

}
