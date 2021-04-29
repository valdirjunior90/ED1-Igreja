package igreja.ModelVO;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ComunVO extends PessoaVO{
	
	SimpleDateFormat sdf = new SimpleDateFormat("d/M/y");
	
	//Variáveis
	private int idComun;
	private int numOrdem;
	private Calendar dataBatismo;
	private String pastorBatismo;
	private String igrejaBatismo;
	private Calendar dataProfFe;
	private String pastorProfFe;
	private String igrejaProfFe;
	private int tipoMembro;
	private Calendar dataAdmissao;
	private int meioAdmissao;
	private Calendar dataDemissao;
	private int meioDemissao;
	private boolean situacao;
	
	// M�todos Especiais - Getters e Setters
	public int getIdComun() {
		return idComun;
	}
	public void setIdComun(int idComun) {
		this.idComun = idComun;
	}

	public int getNumOrdem() {
		return numOrdem;
	}
	public void setNumOrdem(int numOrdem) {
		this.numOrdem = numOrdem;
	}
	public Calendar getDataBatismo() {
		return dataBatismo;
	}
	public void setDataBatismo(Calendar dataBatismo) {
		if (dataBatismo == null)
			this.dataBatismo = Calendar.getInstance();
		this.dataBatismo = dataBatismo;
	}
	public String getPastorBatismo() {
		return pastorBatismo;
	}
	public void setPastorBatismo(String pastorBatismo) {
		this.pastorBatismo = pastorBatismo;
	}
	public String getIgrejaBatismo() {
		return igrejaBatismo;
	}
	public void setIgrejaBatismo(String igrejaBatismo) {
		this.igrejaBatismo = igrejaBatismo;
	}
	public Calendar getDataProfFe() {
		return dataProfFe;
	}
	public void setDataProfFe(Calendar dataProfFe) {
		if (dataProfFe == null)
			this.dataProfFe = Calendar.getInstance();
		this.dataProfFe = dataProfFe;
	}
	public String getPastorProfFe() {
		return pastorProfFe;
	}
	public void setPastorProfFe(String pastorProfFe) {
		this.pastorProfFe = pastorProfFe;
	}
	public String getIgrejaProfFe() {
		return igrejaProfFe;
	}
	public void setIgrejaProfFe(String igrejaProfFe) {
		this.igrejaProfFe = igrejaProfFe;
	}
	public int getTipoMembro() {
		return tipoMembro;
	}
	public void setTipoMembro(int tipoMembro) {
		this.tipoMembro = tipoMembro;
	}
	public Calendar getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(Calendar dataAdmissao) {
		if (dataAdmissao == null)
			this.dataAdmissao = Calendar.getInstance();
		this.dataAdmissao = dataAdmissao;
	}
	public int getMeioAdmissao() {
		return meioAdmissao;
	}
	public void setMeioAdmissao(int meioAdmissao) {
		this.meioAdmissao = meioAdmissao;
		/*Meio de Admissão
		 *1.Profissão de Fé
		 *2.Profissão de Fé e Batismo
		 *3.Carta de transferência
		 *4.Jurisdição a pedido
		 *5.Jurisdição a ex-officio
		 *6.Restauração
		 *7.Designação do Presbitério
		 */
	}
	public Calendar getDataDemissao() {
		return dataDemissao;
	}
	public void setDataDemissao(Calendar dataDemissao) {
		if (dataDemissao == null)
			this.dataDemissao = Calendar.getInstance();
		this.dataDemissao = dataDemissao;
	}
	public int getMeioDemissao() {
		return meioDemissao;
	}
	
	public void setMeioDemissao(int meioDemissao) {
		this.meioDemissao = meioDemissao;
		/* Meio de demissão;
		 * 1.Carta de transferência
		 * 2.Exclusão por disciplina
		 * 3.Exclusão a pedido
		 * 4.Exclusão por ausência
		 * 5.Jurisdição assumida por outra Igreja
		 * 6.Falecimento
		 */
	}
		
	public boolean isSituacao() {
		return situacao;
	}
	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
		/*
		 * Situação: 1. Ativo 2. Inativo
		 */
	}

	// Métodos Especiais - toString
	@Override
	public String toString() {
		System.out.println("Dados do Comungante");
		System.out.println("-------------------");

		String saida;
		saida = "IdComun: " + getIdComun();

		saida += super.toString();

		saida += "\n-------------------\nDados Eclesiásticos\n-------------------";

		saida += "\nNúmero de ordem: " + getNumOrdem() 
			+ "\nData do batismo: "	+ sdf.format(getDataBatismo().getTime()) + "\nPastor do batismo: " + getPastorBatismo()	+ "\nIgreja do batismo: " + getIgrejaBatismo() 
			+ "\nData de Profissão de Fé: "	+ sdf.format(getDataProfFe().getTime()) + "\nPastor da Profissão de Fé: " + getPastorProfFe() + "\nIgreja da Profissão de Fé: " + getIgrejaProfFe() 
			+"\nData de admissão: "	+ sdf.format(getDataAdmissao().getTime());

		if (getMeioAdmissao() == 1)
			saida += ("\tMeio de Admissão: Profissão de Fé");
		else if (getMeioAdmissao() == 2)
			saida += ("\tMeio de Admissão: Profissão de Fé e Batismo");
		else if (getMeioAdmissao() == 3)
			saida += ("\tMeio de Admissão: Carta de transferência");
		else if (getMeioAdmissao() == 4)
			saida += ("\tMeio de Admissão: Jurisdição a pedido");
		else if (getMeioAdmissao() == 5)
			saida += ("\tMeio de Admissão: Jurisdição a ex-officio");
		else if (getMeioAdmissao() == 6)
			saida += ("\tMeio de Admissão: Restauração");
		else if (getMeioAdmissao() == 7)
			saida += ("\tMeio de Admissão: Designação do Presbitério");
		else
			saida += ("\tMeio de Admissão: valor inexistente");

		saida += "\nData de Demissão: " + sdf.format(getDataDemissao().getTime());

		if (getMeioDemissao() == 1)
			saida += ("\tMeio de Demissão: Carta de transferência");
		else if (getMeioDemissao() == 2)
			saida += ("\tMeio de Demissão: Exclusão por disciplina");
		else if (getMeioDemissao() == 3)
			saida += ("\tMeio de Demissão: Exclusão a pedido");
		else if (getMeioDemissao() == 4)
			saida += ("\tMeio de Demissão: Exclusão por ausência");
		else if (getMeioDemissao() == 5)
			saida += ("\tMeio de Demissão: Jurisdição assumida por outra Igreja");
		else if (getMeioDemissao() == 6)
			saida += ("\tMeio de Demissão: Falecimento");
		else
			saida += ("\tMeio de Demissão: Não demitido")

					+ "\nSituação: " + isSituacao() + "\nTipo Membro: " + getTipoMembro() +"\n";
		return saida;
	}
	
}
