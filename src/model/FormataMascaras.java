/**
 * Autor Robson
 * classe para formata��o de mascara para o componente JFormattedTextField uma 
 * homenagem a Remix que duvidou que eu faria uma classe t�o besta como essa 
 */
package model;

import java.text.ParseException;

import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

public class FormataMascaras {
	public MaskFormatter mascara;
	
	// construtor padrao
	void Formata(String formato) {
		try{
			mascara =  new MaskFormatter(formato);
		}catch(ParseException exc){}
	}
	
	// construtor que recebe uma String para o formato da mascara
	
	// retorna a mascara com o formato inserido pelo usuario
	
	// retorna mascara CPF
	public DefaultFormatterFactory getCPF() {
		Formata("###.###.###-##");
		return new DefaultFormatterFactory(mascara);
	}
	
	// retorna m�scara telefone
	public DefaultFormatterFactory getTelefone() {
		Formata("(##) ####-####");
		return new DefaultFormatterFactory(mascara);
	}
	
	// retorna m�scara CEP
	public DefaultFormatterFactory getCEP() {
		Formata("##.###-###");
		return new DefaultFormatterFactory(mascara);
	}
	
	// retorna m�scara Data
	public DefaultFormatterFactory getData() {
		Formata("##/##/####");
		return new DefaultFormatterFactory(mascara);
	}
        
        // retorna m�scara Ano
	public DefaultFormatterFactory getAno() {
		Formata("####");
		return new DefaultFormatterFactory(mascara);
	}
        
        // retorna m�scara RG
	public DefaultFormatterFactory getRG() {
		Formata("##.###.###-##");
		return new DefaultFormatterFactory(mascara);
	}
	public DefaultFormatterFactory getMatricula() {
		Formata("########");
		return new DefaultFormatterFactory(mascara);
	}
	public DefaultFormatterFactory getQuantidadeSemestre() {
		Formata("##");
		return new DefaultFormatterFactory(mascara);
	}
        
     
} // fim da classe FormataMascaras
