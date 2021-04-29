package igreja.ModelVO;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class IgrejaVO {

	SimpleDateFormat sdf = new SimpleDateFormat("d/M/y");

	// Variáveis
	private int idIgreja;
	private int tipoIgreja;
	private String nomeIgreja;
	private String cepIgreja;
	private String logradouroIgreja;
	private String bairroIgreja;
	private String cidadeIgreja;
	private String ufIgreja;
	private String foneIgreja;
	private String siteIgreja;
	private String emailIgreja;
	private String cnpjIgreja;
	private String escolaDominicalIgreja;
	private String cultoIgreja;
	private String oficialPastorIgreja;
	private int condicaoPastorIgreja;
	private Calendar dataOrganizacaoIgreja;
	private String presbiterioIgreja;
	private String observacaoIgreja;

	//Métodos construtores
	public IgrejaVO() {}
	public IgrejaVO(SimpleDateFormat sdf, int idIgreja, int tipoIgreja, String nomeIgreja, String cepIgreja,
			String logradouroIgreja, String bairroIgreja, String cidadeIgreja, String ufIgreja, String foneIgreja,
			String siteIgreja, String emailIgreja, String cnpjIgreja, String escolaDominicalIgreja, String cultoIgreja,
			String oficialPastorIgreja, int condicaoPastorIgreja, Calendar dataOrganizacaoIgreja,
			String presbiterioIgreja, String observacaoIgreja) {
		super();
		this.sdf = sdf;
		this.idIgreja = idIgreja;
		this.tipoIgreja = tipoIgreja;
		this.nomeIgreja = nomeIgreja;
		this.cepIgreja = cepIgreja;
		this.logradouroIgreja = logradouroIgreja;
		this.bairroIgreja = bairroIgreja;
		this.cidadeIgreja = cidadeIgreja;
		this.ufIgreja = ufIgreja;
		this.foneIgreja = foneIgreja;
		this.siteIgreja = siteIgreja;
		this.emailIgreja = emailIgreja;
		this.cnpjIgreja = cnpjIgreja;
		this.escolaDominicalIgreja = escolaDominicalIgreja;
		this.cultoIgreja = cultoIgreja;
		this.oficialPastorIgreja = oficialPastorIgreja;
		this.condicaoPastorIgreja = condicaoPastorIgreja;
		this.dataOrganizacaoIgreja = dataOrganizacaoIgreja;
		this.presbiterioIgreja = presbiterioIgreja;
		this.observacaoIgreja = observacaoIgreja;
	}

	// Métodos Getters e Setters
	public int getIdIgreja() {
		return idIgreja;
	}
	public void setIdIgreja(int idIgreja) {
		this.idIgreja = idIgreja;
	}
	public int getTipoIgreja() {
		return tipoIgreja;
	}
	public void setTipoIgreja(int tipoIgreja) {
		this.tipoIgreja = tipoIgreja;
		/*
		 * RN01 - 1. Igreja; 2. Congregação; 3. Ponto de Pregação
		 */
	}
	public String getNomeIgreja() {
		return nomeIgreja;
	}
	public void setNomeIgreja(String nomeIgreja) {
		if (nomeIgreja == null)
			nomeIgreja = "";
		if (nomeIgreja.equals("")) {
			System.out.println("Igreja sem nome!");
			this.nomeIgreja = "Igreja Presbiteriana";
		} else
			this.nomeIgreja = nomeIgreja;
	}
	public String getCepIgreja() {
		return cepIgreja;
	}
	public void setCepIgreja(String cepIgreja) {
		if (cepIgreja == null)
			cepIgreja = "";
		if (cepIgreja.equals("")) {
			System.out.println("Igreja sem CEP!");
			this.nomeIgreja = "59600-000";
		} else
			this.cepIgreja = cepIgreja;
	}
	public String getLogradouroIgreja() {
		return logradouroIgreja;
	}
	public void setLogradouroIgreja(String logradouroIgreja) {
		if (logradouroIgreja == null)
			logradouroIgreja = "";
		if (logradouroIgreja.equals("")) {
			System.out.println("Igreja sem endereço!");
			this.nomeIgreja = "Igreja sem endereço";
		} else
			this.logradouroIgreja = logradouroIgreja;
	}
	public String getBairroIgreja() {
		return bairroIgreja;
	}
	public void setBairroIgreja(String bairroIgreja) {
		if (bairroIgreja == null)
			bairroIgreja = "";
		if (bairroIgreja.equals("")) {
			System.out.println("Igreja sem bairro!");
			this.nomeIgreja = "Igreja sem bairro";
		} else
			this.bairroIgreja = bairroIgreja;
	}
	public String getCidadeIgreja() {
		return cidadeIgreja;
	}
	public void setCidadeIgreja(String cidadeIgreja) {
		if (cidadeIgreja == null)
			cidadeIgreja = "";
		if (cidadeIgreja.equals("")) {
			System.out.println("Igreja sem cidade!");
			this.nomeIgreja = "Igreja sem cidade";
		} else
			this.cidadeIgreja = cidadeIgreja;
	}
	public String getUfIgreja() {
		return ufIgreja;
	}
	public void setUfIgreja(String uf) {
		this.ufIgreja = uf;
	}
	public String getFoneIgreja() {
		return foneIgreja;
	}
	public void setFoneIgreja(String foneIgreja) {
		if (foneIgreja == null)
			foneIgreja = "";
		if (foneIgreja.equals("")) {
			System.out.println("Igreja sem telfone!");
			this.foneIgreja = "(84) 9.9999-9999";
		} else
			this.foneIgreja = foneIgreja;
	}
	public String getSiteIgreja() {
		return siteIgreja;
	}
	public void setSiteIgreja(String siteIgreja) {
		if (siteIgreja == null)
			siteIgreja = "";
		if (siteIgreja.equals("")) {
			System.out.println("\nIgreja sem site!");
			this.siteIgreja = "Igreja sem site";
		} else
			this.siteIgreja = siteIgreja;
	}
	public String getEmailIgreja() {
		return emailIgreja;
	}
	public void setEmailIgreja(String emailIgreja) {
		if (emailIgreja == null)
			emailIgreja = "";
		if (emailIgreja.equals("")) {
			System.out.println("\nIgreja sem E-mail!");
			this.emailIgreja = "Igreja sem E-mail";
		} else
			this.emailIgreja = emailIgreja;
	}
	public String getCnpjIgreja() {
		return cnpjIgreja;
	}
	public void setCnpjIgreja(String cnpjIgreja) {
		if (cnpjIgreja == null)
			cnpjIgreja = "";
		if (cnpjIgreja.equals("")) {
			System.out.println("\nIgreja sem CNPJ!");
			this.cnpjIgreja = "Igreja sem CNPJ";
		} else
			this.cnpjIgreja = cnpjIgreja;
	}
	public String getEscolaDominicalIgreja() {
		return escolaDominicalIgreja;
	}
	public void setEscolaDominicalIgreja(String escolaDominicalIgreja) {
		if (escolaDominicalIgreja == null)
			escolaDominicalIgreja = "Igreja não tem horário de Escola Dominical";
		else
			this.escolaDominicalIgreja = escolaDominicalIgreja;
	}
	public String getCultoIgreja() {
		return cultoIgreja;
	}
	public void setCultoIgreja(String cultoIgreja) {
		if (escolaDominicalIgreja == null)
			escolaDominicalIgreja = "Igreja não tem horário de Culto";
		else
			this.cultoIgreja = cultoIgreja;
	}
	public String getOficialPastorIgreja() {
		return oficialPastorIgreja;
	}
	public void setOficialPastorIgreja(String oficialPastorIgreja) {
		if (oficialPastorIgreja == null)
			oficialPastorIgreja = "";
		if (oficialPastorIgreja.equals("")) {
			System.out.println("Igreja sem pastor!");
			this.oficialPastorIgreja = "Igreja sem pastor";
		} else
			this.oficialPastorIgreja = oficialPastorIgreja;
	}
	public int getCondicaoPastorIgreja() {
		return condicaoPastorIgreja;
	}
	public void setCondicaoPastorIgreja(int condicaoPastorIgreja) {
		this.condicaoPastorIgreja = condicaoPastorIgreja;
		//1. Pastor-efetivo; 2. Pastor-auxiliar; 3. Pastor-evangelista ou 4. Missionário 
	}
	public Calendar getDataOrganizacaoIgreja() {
		return dataOrganizacaoIgreja;
	}
	public void setDataOrganizacaoIgreja(Calendar dataOrganizacaoIgreja) {
		if (dataOrganizacaoIgreja == null)
			dataOrganizacaoIgreja = Calendar.getInstance();
		else
			this.dataOrganizacaoIgreja = dataOrganizacaoIgreja;
	}
	public String getPresbiterioIgreja() {
		return presbiterioIgreja;
	}
	public void setPresbiterioIgreja(String presbiterioIgreja) {
		if (presbiterioIgreja == null)
			presbiterioIgreja = "";
		if (presbiterioIgreja.equals("")) {
			System.out.println("\nIgreja sem presbiterio!");
			this.presbiterioIgreja = "Igreja sem presbitério";
		} else
			this.presbiterioIgreja = presbiterioIgreja;
	}
	public String getObservacaoIgreja() {
		return observacaoIgreja;
	}
	public void setObservacaoIgreja(String observacaoIgreja) {
		this.observacaoIgreja = observacaoIgreja;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cnpjIgreja == null) ? 0 : cnpjIgreja.hashCode());
		result = prime * result + ((nomeIgreja == null) ? 0 : nomeIgreja.hashCode());
		result = prime * result + tipoIgreja;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IgrejaVO other = (IgrejaVO) obj;
		if (cnpjIgreja == null) {
			if (other.cnpjIgreja != null)
				return false;
		} else if (!cnpjIgreja.equals(other.cnpjIgreja))
			return false;
		if (nomeIgreja == null) {
			if (other.nomeIgreja != null)
				return false;
		} else if (!nomeIgreja.equals(other.nomeIgreja))
			return false;
		if (tipoIgreja != other.tipoIgreja)
			return false;
		return true;
	}
	@Override
	public String toString() {
		System.out.println("Dados da Igreja");
		System.out.println("---------------");
		String saida;
		saida = "Id: " + idIgreja;
		if (getTipoIgreja() == 1)
			saida += ("\tTipo: Igreja");
		else if (getTipoIgreja() == 2)
			saida += ("\tTipo: Congregação");
		else if (getTipoIgreja() == 3)
			saida += ("\tTipo: Ponto de Pregação");
		else
			saida += ("\tTipo: não informado");

		saida = saida + "\nNome da Igreja: " + nomeIgreja + "\nCEP: " + cepIgreja + "\tEndereço: " + logradouroIgreja
				+ "\tBairro: " + bairroIgreja + "\tCidade: " + cidadeIgreja + "\tUF: " + ufIgreja + "\nTelefone: "
				+ foneIgreja + "\tSite: " + siteIgreja + "\tE-mail: " + emailIgreja + "\nCNPJ: " + cnpjIgreja
				+ "\nEscola Dominical: " + escolaDominicalIgreja + "\tCulto: " + cultoIgreja + "\tPastor: "
				+ oficialPastorIgreja;
		if (getCondicaoPastorIgreja() == 1)
			saida += ("\tCondição: Pasto-efetivo");
		else if (getCondicaoPastorIgreja() == 2)
			saida += ("\tCondição: Pastor-auxiliar");
		else if (getTipoIgreja() == 3)
			saida += ("\tCondição: Pastor Evangelista");
		else if (getTipoIgreja() == 4)
			saida += ("\tCondição: Missionário");
		else
			saida += ("\tCondição: não informado");
		saida = saida + "\nData de Organização: " + (sdf.format(dataOrganizacaoIgreja.getTime())) + "\tPresbiterio: "
				+ presbiterioIgreja + "\nObservações: " + observacaoIgreja + "\n";
		return saida;
	}
}

