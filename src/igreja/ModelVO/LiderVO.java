package igreja.ModelVO;

import java.util.Calendar;

public class LiderVO extends ComunVO {
	
	//Variáveis
	private int idLider;
	private Calendar dataPriEleicao;
	private Calendar dataUltEleicao;
	private int cargoOficio;
	private int entidade;
	
	//Métodos Especiais - Getters e Setters
	public int getIdLider() {
		return idLider;
	}
	public void setIdLider(int idLider) {
		this.idLider = idLider;
	}
	public Calendar getDataPriEleicao() {
		return dataPriEleicao;
	}
	public void setDataPriEleicao(Calendar dataPriEleicao) {
		this.dataPriEleicao = dataPriEleicao;
	}
	public Calendar getDataUltEleicao() {
		return dataUltEleicao;
	}
	public void setDataUltEleicao(Calendar dataUltEleicao) {
		this.dataUltEleicao = dataUltEleicao;
	}
	public int getCargoOficio() {
		return cargoOficio;
	}
	public void setCargoOficio(int cargoOficio) {
		this.cargoOficio = cargoOficio;
		
		/*
		 * 1.Pastor Titular
		 * 2.Pastor Auxiliar
		 * 3.Presbítero
		 * 4.Diácono
		 * 5.Presidente
		 * 6.Vice-Presidente
		 * 7.1º Secretário
		 * 8.2º Secretário
		 * 9.Secretário Executivo
		 * 10.Secretário de Causas
		 * 11.Superintendente
		 * 12.Secretário
		 * 13.Professor da Escola Dominical
		 * 14.Coordenador
		 * 15.Tesoureiro
		 * 16.Delegado
		 */
	}
	public int getEntidade() {
		return entidade;
	}
	public final void setEntidade(int entidade) {
		this.entidade = entidade;
		
		/*
		 * 1.Conselho
		 * 2.Diaconia
		 * 3.SAF
		 * 4.UPH
		 * 5.UMP
		 * 6.UPA
		 * 7.UCP
		 * 8.Escola Dominical
		 * 9.Assembleia Geral
		 */
	}
	
	// Métodos Especiais - toString
	@Override
	public String toString() {
		String saida;
		saida = "------------------\nDados de Liderança\n------------------";

		saida += "\nIdMembro: " + getIdComun() + "\tIdLíder: " +getIdLider() + "\nData da primeira eleição: " + sdf.format(getDataPriEleicao().getTime())
		+ "\nData da última eleição: " + sdf.format(getDataUltEleicao().getTime())
		+ "\nOfício/Cargo: " + getCargoOficio() + "\nEntidade/Sociedade: " + getEntidade();
		
		return saida;
	}
}
