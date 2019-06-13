package control;

import view.PainelHistorico;

public class ControlHistorico {
	
	
	private PainelHistorico painelHistorico;
	
	
	
	public ControlHistorico(PainelHistorico painelHistorico)
	{
		this.painelHistorico = painelHistorico;
		
	}
	
	public PainelHistorico getPainelHistorico() {
		
		if(painelHistorico==null)
		{
			painelHistorico = new PainelHistorico();
		}
		
		return painelHistorico;
	}

}
