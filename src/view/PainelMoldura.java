package view;

import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//import control.ControlJFramePrincipal;


public  class PainelMoldura extends JPanel {


	/**
	 * 
	 */
	private JLabel labelImagem;  
	private ImageIcon marca;
	private JPanel imagem;
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 * @return 
	 */
	
	
	public  void Moldura() {
		
		//if(imagem==null) {
		// new JPanel();
			setLayout(null);
			setSize(600, 440);
			add(LabelImagem());
			
		//}
		//return imagem;
		
	}
	
	public ImageIcon Imagem(){
        if(marca == null){
        	marca = new ImageIcon(getClass().getResource("marca.png"));
            
        }
        return marca;
    }
	public JLabel LabelImagem() {
        if(labelImagem == null){
            labelImagem = new JLabel();
            labelImagem.setIcon(Imagem());
            labelImagem.setBounds(200,75,800,411);
        }
        return labelImagem;
    }
	/*public static void main(String[] args) {
		new ControlJFramePrincipal();
	}*/

}
