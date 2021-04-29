package igreja.ModelVO;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public final class NComunVO extends PessoaVO {
	
	SimpleDateFormat sdf = new SimpleDateFormat("d/M/y");

	// Variáveis
	private int idNComun;
	private int numOrdem;
	private Calendar dataBatismo;
	private String PastorBatismo;
	private String IgrejaBatismo;
	private Calendar dataAdmissao;
	private int meioAdmissao;
	private Calendar dataDemissao;
	private int meioDemissao;
	private boolean situacao;

	// Métodos Especiais - Getters e Setters
	public int getIdNComun() {
		return idNComun;
	}

	public void setIdNComun(int idNComun) {
		this.idNComun = idNComun;
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
		return PastorBatismo;
	}

	public void setPastorBatismo(String pastorBatismo) {
		PastorBatismo = pastorBatismo;
	}

	public String getIgrejaBatismo() {
		return IgrejaBatismo;
	}

	public void setIgrejaBatismo(String igrejaBatismo) {
		IgrejaBatismo = igrejaBatismo;
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
		/*
		 * Meios de Admissão: 
		 * 1. Batismo; 
		 * 2. Carta de transferência dos pais ou responsáveis; 
		 * 3. Jurisdição assumida dos pais ou responsáveis; 
		 * 4. Designação do Presbitério dos pais ou responsáveis.
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
		/*
		 * Meios de Demissão: 
		 * 1.Carta de transferência dos pais ou responsáveis, a juízo do Conselho; 
		 * 2.Carta de transferência nos termos do parágrafo único, in fine, do Art.19; 
		 * 3.Haver atingido a idade de 18 anos; 
		 * 4.Profissão de fé; 
		 * 5.Solicitação dos pais ou responsáveis que tiverem aderido a outra comunidade religiosa, a juízo do Conselho; 
		 * 6. Falecimento.
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

	// M�todos Especiais - toString
	@Override
	public String toString() {
		System.out.println("Dados do Não Comungante");
		System.out.println("-----------------------");

		String saida;
		saida = "IdNComun: " + getIdNComun();

		saida += super.toString();

		saida += "\n-------------------\nDados Eclesiásticos\n-------------------";

		saida += "\nNúmero de ordem: " + getNumOrdem() 
			+ "\tData de batismo: "	+ sdf.format(getDataBatismo().getTime()) + "\tPastor do batismo: " + getPastorBatismo()	+ "\nIgreja do batismo: " + getIgrejaBatismo() 
			+ "\nData de admissão: " + sdf.format(getDataAdmissao().getTime());

		if (getMeioAdmissao() == 1)
			saida += ("\tMeio de Admissão: Batismo");
		else if (getMeioAdmissao() == 2)
			saida += ("\tMeio de Admissão: Carta de transferência dos pais ou responsáveis");
		else if (getMeioAdmissao() == 3)
			saida += ("\tMeio de Admissão: Jurisdição assumida dos pais ou responsáveis");
		else if (getMeioAdmissao() == 4)
			saida += ("\tMeio de Admissão:  Designação do Presbitério dos pais ou respons�veis");
		else
			saida += ("\tMeio de Admissão:  valor inexistente");

		saida += "\nData de Demissão: " + sdf.format(getDataDemissao().getTime());

		if (getMeioDemissao() == 1)
			saida += ("\tMeio de Demissão: Carta de transferência dos pais ou responsáveis, a juízo do Conselho");
		else if (getMeioDemissao() == 2)
			saida += ("\tMeio de Demissão: Carta de transferência nos termos do parágrafo único, in fine, do Art.19");
		else if (getMeioDemissao() == 3)
			saida += ("\tMeio de Demissão: Haver atingido a idade de 18 anos");
		else if (getMeioDemissao() == 4)
			saida += ("\tMeio de Demissão: Profissão de fé");
		else if (getMeioDemissao() == 5)
			saida += ("\tMeio de Demissão: Solicitação dos pais ou responsáveis que tiverem aderido a outra comunidade religiosa");
		else if (getMeioDemissao() == 6)
			saida += ("\tMeio de Demissão: Falecimento");
		else
			saida += ("\tMeio de Demissão: Não demitido")

					+ "\nSituação: " + isSituacao() +"\n";
		return saida;
	}
}
