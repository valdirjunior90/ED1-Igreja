package igreja.ModelVO;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class PessoaVO {
	
	SimpleDateFormat sdf = new SimpleDateFormat("d/M/y");

	// Variáveis
	private int idPessoa;
	private String nomePessoa;
	private Calendar dataNascimentoPessoa;
	private String cepPessoa;
	private String logradouroPessoa;
	private String complementoPessoa;
	private String bairroPessoa;
	private String cidadePessoa;
	private String ufPessoa;
	private String pontoReferPessoa;
	private String emailPessoa;
	private String fonePessoa;
	private String naturalidadePessoa;
	private int sexoPessoa;
	/*
	 * 1. Masculino; 2. Feminino
	 */
	private int estCivilPessoa;
	/*
	 * 1.Solteiro; 2. Casado; 3. Divorciado; 4. Viúvo; 5. Separado; 6. União Estável
	 */
	private String conjugePessoa;
	private Calendar dataCasamentoPessoa;
	private String identPessoa;
	private String orgEmissorIdentPessoa;
	private Calendar dataEmissaoIdentPessoa;
	private int escolaridadePessoa;
	/*
	 * 1. Analfabeto; 2. Alfabetizado 3. Ensino Médio/Técnico; 4. Superior; 5. Pós-Graduado
	 */
	private String profissaoPessoa;
	private String nomePaiPessoa;
	private String nomeMaePessoa;
	private int congregaPessoa;

	// Métodos Especiais - Getters e Setters
	public int getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		if (nomePessoa == null)
			nomePessoa = "";
		if (nomePessoa.equals("")) {
			System.out.println("Pessoa sem nome!");
			this.nomePessoa = "Pessoa sem nome";
		} else
			this.nomePessoa = nomePessoa;
	}

	public Calendar getDataNascimentoPessoa() {
		return dataNascimentoPessoa;
	}

	public void setDataNascimentoPessoa(Calendar dataNascimentoPessoa) {
		if (dataNascimentoPessoa == null)
			this.dataNascimentoPessoa = Calendar.getInstance();
		else
			this.dataNascimentoPessoa = dataNascimentoPessoa;
	}

	public String getCepPessoa() {
		return cepPessoa;
	}

	public void setCepPessoa(String cepPessoa) {
		if (cepPessoa == null)
			cepPessoa = "";
		if (cepPessoa.equals("")) {
			System.out.println("Pessoa sem CEP!");
			this.nomePessoa = "59600-000";
		} else
			this.cepPessoa = cepPessoa;
	}

	public String getLogradouroPessoa() {
		return logradouroPessoa;
	}

	public void setLogradouroPessoa(String logradouroPessoa) {
		if (logradouroPessoa == null)
			logradouroPessoa = "";
		if (logradouroPessoa.equals("")) {
			System.out.println("Pessoa sem endereço!");
			this.logradouroPessoa = "Pessoa sem endereço";
		} else
			this.logradouroPessoa = logradouroPessoa;
	}

	public String getComplementoPessoa() {
		return complementoPessoa;
	}

	public void setComplementoPessoa(String complementoPessoa) {
		this.complementoPessoa = complementoPessoa;
	}

	public String getBairroPessoa() {
		return bairroPessoa;
	}

	public void setBairroPessoa(String bairroPessoa) {
		if (bairroPessoa == null)
			bairroPessoa = "";
		if (bairroPessoa.equals("")) {
			System.out.println("Pessoa sem bairro!");
			this.bairroPessoa = "Pessoa sem bairro";
		} else
			this.bairroPessoa = bairroPessoa;
	}

	public String getCidadePessoa() {
		return cidadePessoa;
	}

	public void setCidadePessoa(String cidadePessoa) {
		if (cidadePessoa == null)
			cidadePessoa = "";
		if (cidadePessoa.equals("")) {
			System.out.println("Pessoa sem cidade!");
			this.cidadePessoa = "Pessoa sem cidade";
		} else
			this.cidadePessoa = cidadePessoa;
	}

	public String getUfPessoa() {
		return ufPessoa;
	}

	public void setUfPessoa(String ufPessoa) {
		if (ufPessoa == null)
			ufPessoa = "";
		if (ufPessoa.equals("")) {
			System.out.println("Pessoa sem Estado!");
			this.ufPessoa = "Pessoa sem Estado";
		} else
			this.ufPessoa = ufPessoa;
	}

	public String getPontoReferPessoa() {
		return pontoReferPessoa;
	}

	public void setPontoReferPessoa(String pontoReferPessoa) {
		this.pontoReferPessoa = pontoReferPessoa;
	}

	public String getEmailPessoa() {
		return emailPessoa;
	}

	public void setEmailPessoa(String emailPessoa) {
		if (emailPessoa == null)
			emailPessoa = "";
		if (emailPessoa.equals("")) {
			System.out.println("Pessoa sem E-mail!");
			this.emailPessoa = "Pessoa sem E-mail";
		} else
			this.emailPessoa = emailPessoa;
	}

	public String getFonePessoa() {
		return fonePessoa;
	}

	public void setFonePessoa(String fonePessoa) {
		if (fonePessoa == null)
			fonePessoa = "";
		if (fonePessoa.equals("")) {
			System.out.println("Pessoa sem telefone!");
			this.fonePessoa = "(84) 9.9999-9999";
		} else
			this.fonePessoa = fonePessoa;
	}

	public String getNaturalidadePessoa() {
		return naturalidadePessoa;
	}

	public void setNaturalidadePessoa(String naturalidadePessoa) {
		if (naturalidadePessoa == null)
			naturalidadePessoa = "";
		if (naturalidadePessoa.equals("")) {
			this.naturalidadePessoa = "Pessoa não tem naturalidade!";
		} else
			this.naturalidadePessoa = naturalidadePessoa;
	}

	public int getSexoPessoa() {
		return sexoPessoa;
	}

	public void setSexoPessoa(int sexoPessoa) {
		this.sexoPessoa = sexoPessoa;
	}

	public int getEstCivilPessoa() {
		return estCivilPessoa;
	}

	public void setEstCivilPessoa(int estCivilPessoa) {
		this.estCivilPessoa = estCivilPessoa;
	}

	public String getConjugePessoa() {
		return conjugePessoa;
	}

	public void setConjugePessoa(String conjugePessoa) {
		if (conjugePessoa == null)
			conjugePessoa = "";
		if (conjugePessoa.equals("")) {
			this.conjugePessoa = "Pessoa não tem cônjuge";
		} else
			this.conjugePessoa = conjugePessoa;
	}

	public Calendar getDataCasamentoPessoa() {
		return dataCasamentoPessoa;
	}

	public void setDataCasamentoPessoa(Calendar dataCasamentoPessoa) {
		this.dataCasamentoPessoa = dataCasamentoPessoa;
	}

	public String getIdentPessoa() {
		return identPessoa;
	}

	public void setIdentPessoa(String identPessoa) {
		if (identPessoa == null)
			identPessoa = "";
		if (identPessoa.equals("")) {
			this.identPessoa = "Pessoa não tem identidade";
		} else
			this.identPessoa = identPessoa;
	}

	public String getOrgEmissorIdentPessoa() {
		return orgEmissorIdentPessoa;
	}

	public void setOrgEmissorIdentPessoa(String orgEmissorIdentPessoa) {
		if (getIdentPessoa() == null)
			identPessoa = "";
		if (getIdentPessoa().equals("")) {
			this.orgEmissorIdentPessoa = "Pessoa não tem identidade";
		} else
			this.orgEmissorIdentPessoa = orgEmissorIdentPessoa;
	}

	public Calendar getDataEmissaoIdentPessoa() {
		return dataEmissaoIdentPessoa;
	}

	public void setDataEmissaoIdentPessoa(Calendar dataEmissaoIdentPessoa) {
		// if (identPessoa == null)
		// 	identPessoa = "";
		// if (identPessoa.equals("")) {
		// 	this.dataEmissaoIdentPessoa = null;
		// } else
			this.dataEmissaoIdentPessoa = dataEmissaoIdentPessoa;
	}

	public int getEscolaridadePessoa() {
		return escolaridadePessoa;
	}

	public void setEscolaridadePessoa(int escolaridadePessoa) {
		this.escolaridadePessoa = escolaridadePessoa;
	}

	public String getProfissaoPessoa() {
		return profissaoPessoa;
	}

	public void setProfissaoPessoa(String profissaoPessoa) {
		if (profissaoPessoa == null)
			profissaoPessoa = "";
		if (profissaoPessoa.equals("")) {
			this.profissaoPessoa = "Pessoa não tem profissão";
		} else
			this.profissaoPessoa = profissaoPessoa;
	}

	public String getNomePaiPessoa() {
		return nomePaiPessoa;
	}

	public void setNomePaiPessoa(String nomePaiPessoa) {
		if (nomePaiPessoa == null)
			nomePaiPessoa = "";
		if (nomePaiPessoa.equals("")) {
			this.nomePaiPessoa = "Pessoa não tem nome do pai";
		} else
		this.nomePaiPessoa = nomePaiPessoa;
	}

	public String getNomeMaePessoa() {
		return nomeMaePessoa;
	}

	public void setNomeMaePessoa(String nomeMaePessoa) {
		if (nomeMaePessoa == null)
			nomeMaePessoa = "";
		if (nomeMaePessoa.equals("")) {
			this.nomeMaePessoa = "Pessoa não tem nome da mãe";
		} else
		this.nomeMaePessoa = nomeMaePessoa;
	}

	public int getCongregaPessoa() {
		return congregaPessoa;
	}

	public void setCongregaPessoa(int congregaPessoa) {
		this.congregaPessoa = congregaPessoa;
	}
	
	
	//M�todos Especiais - toString
	@Override
	public String toString() {
		System.out.println("Dados do Pessoais");
		System.out.println("------------------");
		String saida ="\tIdPessoa: " + getIdPessoa() + "\tNome: " + getNomePessoa()+"\nNascimento: "+ sdf.format(getDataNascimentoPessoa().getTime())
				+"\nCEP: " + getCepPessoa() + "\tEndereço: " + getLogradouroPessoa()
				+ "\nComplemento: " + getComplementoPessoa() + "\tBairro: " + getBairroPessoa() + "\tCidade: " + getCidadePessoa() + "\tUF: " + getUfPessoa() 
				+ "\nPonto de referência: " + getPontoReferPessoa() + "\nE-mail: " + getEmailPessoa() + "\tTelefone: " + getFonePessoa() 
				+ "\nNaturalidade: " + getNaturalidadePessoa(); 
				
				if(getSexoPessoa() == 1)
					saida += ("\tSexo: Masculino");
				else if(getSexoPessoa() == 2)
					saida += ("\tSexo: Feminino");
				else
					saida += ("\tValor inexistente!");
				
				if(getEstCivilPessoa()==1)
					saida+= ("\tEstado Cívil: Solteiro(a)");
					else if(getEstCivilPessoa()==2)
						saida+= ("\tEstado Cívil: Casado(a)");
					else if(getEstCivilPessoa()==3)
						saida+= ("\tEstado Cívil: Divorciado(a)");
					else if(getEstCivilPessoa()==4)
						saida+= ("\tEstado Cívil: Viúvo(a)");
					else if(getEstCivilPessoa()==5)
						saida+= ("\tEstado Cívil: Sepadaro(a)");
					else if(getEstCivilPessoa()==6)
						saida+= ("\tEstado Cívil: União estável");
					else
						saida+= ("\tEstado Cívil: valor inexistente");

			saida += "\nCônjuge: " + getConjugePessoa() + "\tData Casamento: " + sdf.format(getDataCasamentoPessoa().getTime())
					+ "\nIdentidade: " + getIdentPessoa() + "\tÓrgão emissor: " + getOrgEmissorIdentPessoa() ; //"\tData da emissão: " + sdf.format(getDataEmissaoIdentPessoa().getTime());
			
			if(getEscolaridadePessoa()==1)
				saida+= ("\nEscolaridade: Não alfabetizado(a)");
				else if(getEscolaridadePessoa()==2)
					saida+= ("\nEscolaridade: Alfabetizado(a)");
				else if(getEscolaridadePessoa()==3)
					saida+= ("\nEscolaridade: Ensino Médio/Técnico");
				else if(getEscolaridadePessoa()==4)
					saida+= ("\nEscolaridade: Ensino Superior");
				else if(getEscolaridadePessoa()==5)
					saida+= ("\nEscolaridade: Pós-graduado");
				else
					saida+= ("\nEscolaridade:  Não informado");

			saida+= "\tProfissão: "	+ getProfissaoPessoa() + "\nNome do Pai: " + getNomePaiPessoa() + "\tNome da Mãe: " + getNomeMaePessoa()
				+ "\nOnde congrega:" + getCongregaPessoa();
			return saida;
	}
}
