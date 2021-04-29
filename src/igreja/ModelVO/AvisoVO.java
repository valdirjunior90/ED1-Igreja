package igreja.ModelVO;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AvisoVO {
	
	SimpleDateFormat sdf = new SimpleDateFormat("d/M/y");
	
	//Variáveis
	private int idAviso;
	private Calendar dataAviso;
	private String origemAviso;
	private String destinoAviso;
	private String assuntoAviso;
	private String conteudoAviso;
	private int idLider;
	
	//Métodos Especiais - Getters e Setters
	public int getIdAviso() {
		return idAviso;
	}
	public void setIdAviso(int idAviso) {
		this.idAviso = idAviso;
	}
	public Calendar getDataAviso() {
		return dataAviso;
	}
	public void setDataAviso(Calendar dataAviso) {
		this.dataAviso = dataAviso;
	}

	public String getOrigemAviso() {
		return origemAviso;
	}
	public void setOrigemAviso(String origemAviso) {
		this.origemAviso = origemAviso;
	}
	public String getDestinoAviso() {
		return destinoAviso;
	}
	public void setDestinoAviso(String destinoAviso) {
		this.destinoAviso = destinoAviso;
	}
	public String getAssuntoAviso() {
		return assuntoAviso;
	}
	public void setAssuntoAviso(String assuntoAviso) {
		this.assuntoAviso = assuntoAviso;
	}
	public String getConteudoAviso() {
		return conteudoAviso;
	}
	public void setConteudoAviso(String conteudoAviso) {
		this.conteudoAviso = conteudoAviso;
	}
	public int getIdLider() {
		return idLider;
	}
	public void setIdLider(int idLider) {
		this.idLider = idLider;
	}
	
	// Métodos Especiais - toString
	@Override
	public String toString() {
		String saida;
		
		saida = "\n------------------\n       Aviso\n------------------";
		saida += "\nidAviso: " + getIdAviso() + "\nData do Aviso: " + sdf.format(getDataAviso().getTime()) 
				+ "\nOrigem: " + getOrigemAviso() + "\nDestino: " + getDestinoAviso() + "\nAssunto: " + getAssuntoAviso()
				+ "\nConteúdo: " + getConteudoAviso() + "\nIdLíder: " + getIdLider();
		return saida;
	}

}
