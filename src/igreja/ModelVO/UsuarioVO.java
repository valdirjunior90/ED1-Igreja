package igreja.ModelVO;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class UsuarioVO {

	SimpleDateFormat sdf = new SimpleDateFormat("d/M/y");
	
	// Variáveis
	private int idUsuario;
	private String nomeUsuario;
	private String loginUsuario;
	private String emailUsuario;
	private String senhaUsuario;
	private Calendar dataCadastroUsuario;
	private boolean situacaoUsuario;
	private int perfilUsuario;

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		if (nomeUsuario == null)
			nomeUsuario = "";
		if (nomeUsuario.equals("")) {
			System.out.println("Usuário sem nome!");
			this.nomeUsuario = "Usuário sem nome";
		} else
			this.nomeUsuario = nomeUsuario;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setLoginUsuario(String loginUsuario) {
		if (loginUsuario == null)
			loginUsuario = "";
		if (loginUsuario.equals("")) {
			System.out.println("Usuário sem login!");
			this.loginUsuario = "Usuário sem login";
		} else
			this.loginUsuario = loginUsuario;
	}

	public String getLoginUsuario() {
		return loginUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		if (emailUsuario == null)
			emailUsuario = "";
		if (emailUsuario.equals("")) {
			System.out.println("Usuário sem e-mail!");
			this.emailUsuario = "Usuário sem e-mail";
		} else
			this.emailUsuario = emailUsuario;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		if (senhaUsuario == null)
			senhaUsuario = "";
		if (senhaUsuario.equals("")) {
			System.out.println("Usuário sem senha!");
			this.senhaUsuario = "Usuário sem senha";
		} else
			this.senhaUsuario = senhaUsuario;
	}

	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	public void setDataCadastroUsuario(Calendar dataCadastroUsuario) {
		if (dataCadastroUsuario == null)
			this.dataCadastroUsuario = Calendar.getInstance();
		else
			this.dataCadastroUsuario = dataCadastroUsuario;
	}

	public Calendar getDataCadastroUsuario() {
		return dataCadastroUsuario;
	}

	public void setSituacaoUsuario(boolean situacaoUsuario) {
		this.situacaoUsuario = situacaoUsuario;
		//False. Inativo; True. Ativo
	}

	public boolean isSituacaoUsuario() {
		return situacaoUsuario;
	}

	public void setPerfilUsuario(int perfilUsuario) {
		this.perfilUsuario = perfilUsuario;
		/*
		 * Nível 1: Pastor (visualiza todas as funcionalidades do sistema);
		 * Nível 2: Secretário (visualiza funcionalidades de Secretário e abaixo);
		 * Nível 3: Liderança (visualiza funcionalidades de Liderança e abaixo);
		 * Nível 4: Comungante (visualiza funcionalidades de Comungantes e abaixo);
		 * Nível 5: Não-Comungante(Visualiza funcionalidades de Não-comungantes);
		 * Nível 6: Visitante (Visualiza apenas funcionalidades de visitantes).
		*/
	}

	public int getPerfilUsuario() {

		return perfilUsuario;
	}

	// Métodos Construtores - com sobrecarga
	public UsuarioVO() {
	} // construtor default

	public UsuarioVO(String loginUsuario, String senhaUsuario) {
		this.loginUsuario = loginUsuario;
		this.senhaUsuario = senhaUsuario;
	}

	public UsuarioVO(int idUsuario, String nomeUsuario, String loginUsuario, 
			String emailUsuario, String senhaUsuario, Calendar dataCadastroUsuario, 
			boolean situacaoUsuario, int perfilUsuario) {
		this.idUsuario = idUsuario;
		this.nomeUsuario = nomeUsuario;
		this.loginUsuario = loginUsuario;
		this.emailUsuario = emailUsuario;
		this.senhaUsuario = senhaUsuario;
		this.dataCadastroUsuario = dataCadastroUsuario;
		this.situacaoUsuario = situacaoUsuario;
		this.perfilUsuario = perfilUsuario;
	}

	public String toString() {
		System.out.println("Dados do Usuario");
		System.out.println("----------------");
		String saida;
		saida = "Id: " + idUsuario + "\tNome: " + nomeUsuario + "\nE-mail: " + emailUsuario + "\nLogin: "
				+ loginUsuario + "\tSenha: " + senhaUsuario + "\nData de Cadastro: "
				+ sdf.format(dataCadastroUsuario.getTime()) + "\n";

		if (getPerfilUsuario() == 1)
			saida += ("Perfil: Pastor");
		else if (getPerfilUsuario() == 2)
			saida += ("Perfil: Secretário");
		else if (getPerfilUsuario() == 3)
			saida += ("Perfil: Liderança");
		else if (getPerfilUsuario() == 4)
			saida += ("Perfil: Comungante");
		else if (getPerfilUsuario() == 5)
			saida += ("Perfil: Não-comungante");
		else if (getPerfilUsuario() == 6)
			saida += ("Perfil: Visitante");
		else
			saida += ("perfil inexistente!");
		if (isSituacaoUsuario() == false)
			saida += ("\nSituação: Usuário inativo");
		else
			saida += ("\nSituação: Usuário ativo\n");
		return saida;
	}
}
