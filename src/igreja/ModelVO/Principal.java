package igreja.ModelVO;



import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import igreja.ModelDAO.AvisoDAO;
import igreja.ModelDAO.IgrejaDAO;
import igreja.ModelDAO.PessoaDAO;
import igreja.ModelDAO.UsuarioDAO;
import igreja.ModelDAO.VisitanteDAO;

public class Principal {
	public static void main(String[] args) throws SQLException {
	
		// // Novo usuário
		
		// UsuarioDAO<UsuarioVO> usuDAO = new UsuarioDAO<UsuarioVO>();
		// UsuarioVO usu = new UsuarioVO();
		// usu.setIdUsuario(3);
		// usu.setNomeUsuario("Arthur Gilles Costa Guimarães");
		// usu.setEmailUsuario("arthurgilles@hotmail.com");
		// usu.setLoginUsuario("arthur");
		// usu.setSenhaUsuario("123456");
		// Calendar data = Calendar.getInstance();
		// usu.setDataCadastroUsuario(data);
		// usu.setPerfilUsuario(6);
		// /*
		//  * 1: Pastor; 2: Secretário; 3: Liderança; 
		//  * 4: Comungante; 5: Não-Comungante; 6: Visitante.
		// */

		// usu.setSituacaoUsuario(true);
		// //False. Inativo; True. Ativo

		// //usuDAO.inserir(usu);
		// //System.out.println(usu.toString());

		// // Listar Todos os Usuários
		// List<UsuarioVO> usuarios = usuDAO.listar();
		// for (UsuarioVO usu2 : usuarios) {
		// 	System.out.println(usu2.toString());
		// 	// System.out.println(usu2.getIdUsuario() + "\t" + usu2.getLoginUsuario() + "\t"
		// 	// + usu2.getSenhaUsuario() + "\t" + usu2.getPerfilUsuario());
		// }

		// // Cadastro de Igrejas
		// IgrejaDAO igreDAO = new IgrejaDAO();
		// IgrejaVO igreja = new IgrejaVO();
		// igreja.setIdIgreja(1);
		// igreja.setTipoIgreja(1);
		//  //1. Igreja; 2. Congregação; 3. Congregação Presbiterial; 4. Campo Missionário; 5. Ponto de Pregação
		// igreja.setNomeIgreja("Igreja Presiteriana ");
		// igreja.setCepIgreja("59603-340");
		// igreja.setLogradouroIgreja("Rua Felipe Camarão, 711");
		// igreja.setBairroIgreja("Doze Anos");
		// igreja.setCidadeIgreja("Mossoró");
		// igreja.setUfIgreja("RN");
		// igreja.setFoneIgreja("(84) 3321-2698");
		// igreja.setSiteIgreja(null);
		// igreja.setEmailIgreja(null);
		// igreja.setCnpjIgreja(null);
		// igreja.setEscolaDominicalIgreja("9h");
		// igreja.setCultoIgreja("18h");
		// igreja.setOficialPastorIgreja("Samuel Bezerra Ribeiro");
		// igreja.setCondicaoPastorIgreja(1);
		// //1. Efetivo; 2. Designado; 3. Missionário */
		// igreja.setDataOrganizacaoIgreja(new GregorianCalendar(2020,01,15));
		// igreja.setPresbiterioIgreja("PROR");
		// igreja.setObservacaoIgreja("Isso é para teste");

		// //igreDAO.inserir(igreja);
		// //System.out.println(igreja.toString());

		// igreDAO.alterarPastor(igreja);
		// // Listar todas as Igrejas
		// List<IgrejaVO> igrejas = igreDAO.listar();
		// for (IgrejaVO igre2 : igrejas) {
		// 	System.out.println(igre2.toString());
		// 	System.out.println(igre2.getIdIgreja() + "\t" + igre2.getNomeIgreja() + "\t"
		// 			+ igre2.getOficialPastorIgreja() + "\t" + igre2.getFoneIgreja());
		// }
		
		
//		System.out.println(pessoa.toString());
		

		VisitanteDAO<VisitanteVO> visDAO = new VisitanteDAO<VisitanteVO>();
		PessoaDAO<PessoaVO> pessoaDAO = new PessoaDAO<PessoaVO>();
		VisitanteVO vis = new VisitanteVO();
		vis.setIdVisitante(3);
		vis.setIdPessoa(3);
		vis.setNomePessoa("Arthur Gilles Costa Guimarães");
		vis.setDataNascimentoPessoa(new GregorianCalendar(2003, 3, 21));
		vis.setCepPessoa("59628-395");
		vis.setLogradouroPessoa("Rua Raimundo Firmino de Oliveira, 507");
		vis.setComplementoPessoa("Casa 11");
		vis.setBairroPessoa("Costa e Silva");
		vis.setCidadePessoa("Mossoró");
		vis.setUfPessoa("RN");
		vis.setPontoReferPessoa("Próximo ao supermercado Queiroz");
		vis.setEmailPessoa("webminst@hotmail.com");
		vis.setFonePessoa("(84) 9.9660-9271");
		vis.setNaturalidadePessoa("Mossoró");
		vis.setSexoPessoa(1);
		//1. Masculino; 2. Feminino ou M. Masculino; 2. F. Feminino	 
		vis.setEstCivilPessoa(1);
		//1.Solteiro; 2. Casado; 3. Divorciado; 4. Viúvo; 5. Separado; 6. União Estável
		vis.setConjugePessoa("");
		vis.setDataCasamentoPessoa(new GregorianCalendar(1990, 0, 1));
		vis.setIdentPessoa("3.367.387");
		vis.setOrgEmissorIdentPessoa("SSP/RN");
		vis.setDataEmissaoIdentPessoa(new GregorianCalendar(2012, 0, 14));
		vis.setEscolaridadePessoa(4);
		//1. Analfabeto; 2. Alfabetizado 3. Ensino Médio/Técnico; 4. Superior; 5. Pós-Graduado
		vis.setProfissaoPessoa("Estudante");
		vis.setNomePaiPessoa("Giovanni Moreira Guimaraes");
		vis.setNomeMaePessoa("Abilene da Silva Costa Guimarães");
		vis.setCongregaPessoa(1);

		vis.setDataUltVisita(new GregorianCalendar(2020, 06, 15));
		
		System.out.println(vis.toString());
		
		visDAO.inserir(vis);
		pessoaDAO.inserir(vis);
		//pessoaDAO.alterarEndereco(vis);
		//pessoaDAO.alterarEstadoCivil(vis);
		//pessoaDAO.alterarProfissao(vis);
		//pessoaDAO.alterarEscolaridade(vis);
		//pessoaDAO.alterarCongrega(vis);
		//pessoaDAO.remover(vis);
		//pessoaDAO.buscar(vis);
		
		visDAO.remover(vis);
		
		//Listar Todos os Visitantes
		// List<VisitanteVO> visitantes = visDAO.listar();
		// for (VisitanteVO vis2 : visitantes) {
		// 	//System.out.println(vis2.toString());
		// 	System.out.println(vis2.getIdPessoa() + "\t" + vis2.getNomePessoa() + "\t"
		// 	+ vis2.getLogradouroPessoa() + "\t" +  vis2.getBairroPessoa());
		// }
		
		
		
	// 	//Cadastro de Não-comungante
	// 	NComunVO nc = new NComunVO();
	// 	nc.setIdNComun(1);
	// 	nc.setIdPessoa(5);
	// 	nc.setNomePessoa("Benjamin Vitor Nunes da Costa");
	// 	nc.setDataNascimentoPessoa(new GregorianCalendar(2014, 11, 9));
	// 	nc.setCepPessoa("59628-395");
	// 	nc.setLogradouroPessoa("Rua Raimundo Firmino de Oliveira, 507");
	// 	nc.setComplementoPessoa("Casa 7");
	// 	nc.setBairroPessoa("Costa e Silva");
	// 	nc.setCidadePessoa("Mossoró");
	// 	nc.setUfPessoa("RN");
	// 	nc.setPontoReferPessoa("Próximo ao supermercado Queiroz");
	// 	nc.setEmailPessoa("");
	// 	nc.setFonePessoa("(84) 9.9660-9271");
	// 	nc.setNaturalidadePessoa("Mossoró");
	// 	nc.setSexoPessoa('1');
	// 	//1. Masculino; 2. Feminino ou M. Masculino; 2. F. Feminino	 
	// 	nc.setEstCivilPessoa('1');
	// 	//1.Solteiro; 2. Casado; 3. Divorciado; 4. Viúvo; 5. Separado; 6. União Estável
	// 	nc.setConjugePessoa("");
	// 	nc.setDataCasamentoPessoa(new GregorianCalendar());
	// 	nc.setIdentPessoa("");
	// 	nc.setOrgEmissorIdentPessoa("");
	// 	nc.setDataEmissaoIdentPessoa(new GregorianCalendar());
	// 	nc.setEscolaridadePessoa('2');
	// 	//1. Analfabeto; 2. Alfabetizado 3. Ensino Médio/Técnico; 4. Superior; 5. Pós-Graduado
	// 	nc.setProfissaoPessoa("Estudante");
	// 	nc.setNomePaiPessoa("Anselmo Rodrigues da Costa Júnior");
	// 	nc.setNomeMaePessoa("Haysla Nunes da Costa");
	// 	nc.setCongregaPessoa(1);

	// 	nc.setNumOrdem(453);
	// 	nc.setDataBatismo(new GregorianCalendar(2017, 8, 24));;
	// 	nc.setPastorBatismo("Anselmo Rodrigues da Costa");
	// 	nc.setIgrejaBatismo("Igreja Presbiteriana Central de Mossoró");
	// 	nc.setDataAdmissao(new GregorianCalendar(2018,07,18));
	// 	nc.setMeioAdmissao(2);
	// 	nc.setDataDemissao(new GregorianCalendar());
	// 	nc.setMeioDemissao(0);
	// 	nc.setSituacao(true);
		
	// 	System.out.println(nc.toString());

		
		
	// 	//Cadastro de Comungante
	// 	ComunVO comun = new ComunVO();
	// 	comun.setIdComun(1);
	// 	comun.setIdPessoa(6);
	// 	comun.setNomePessoa("Giulia Elisa Costa Guimarães");
	// 	comun.setDataNascimentoPessoa(new GregorianCalendar(2001, 8, 26));
	// 	comun.setCepPessoa("59628-395");
	// 	comun.setLogradouroPessoa("Rua Raimundo Firmino de Oliveira, 507");
	// 	comun.setComplementoPessoa("Casa 11");
	// 	comun.setBairroPessoa("Costa e Silva");
	// 	comun.setCidadePessoa("Mossoró");
	// 	comun.setUfPessoa("RN");
	// 	comun.setPontoReferPessoa("Próximo ao supermercado Queiroz");
	// 	comun.setEmailPessoa("giuliaelisaguimaraes@hotmail.com");
	// 	comun.setFonePessoa("(84) 9.9660-9271");
	// 	comun.setNaturalidadePessoa("Santarém-PA");
	// 	comun.setSexoPessoa(2);
	// 	//1. Masculino; 2. Feminino ou M. Masculino; 2. F. Feminino	 
	// 	comun.setEstCivilPessoa(1);
	// 	//1.Solteiro; 2. Casado; 3. Divorciado; 4. Viúvo; 5. Separado; 6. União Estável
	// 	comun.setConjugePessoa("");
	// 	comun.setDataCasamentoPessoa(new GregorianCalendar(1980, 0, 01));
	// 	comun.setIdentPessoa("");
	// 	comun.setOrgEmissorIdentPessoa("SSP/RN");
	// 	comun.setDataEmissaoIdentPessoa(new GregorianCalendar());
	// 	comun.setEscolaridadePessoa(4);
	// 	//1. Analfabeto; 2. Alfabetizado 3. Ensino Médio/Técnico; 4. Superior; 5. Pós-Graduado
	// 	comun.setProfissaoPessoa("Estudante");
	// 	comun.setNomePaiPessoa("Giovanni Moreira Guimarães");
	// 	comun.setNomeMaePessoa("Abilene da Silva Costa Guimarães");
	// 	comun.setCongregaPessoa(1);

	// 	comun.setNumOrdem(89);
	// 	comun.setDataBatismo(new GregorianCalendar(2001, 11, 20));;
	// 	comun.setPastorBatismo("Anselmo Rodrigues da Costa");
	// 	comun.setIgrejaBatismo("Igreja Presbiteriana Central de Mossoró");
	// 	comun.setDataProfFe(new GregorianCalendar(2014,05,06));
	// 	comun.setPastorProfFe("Giovanni Moreira Guimarães");
	// 	comun.setIgrejaProfFe("Igreja Presbiteriana do Carnaubal");
	// 	comun.setTipoMembro(1);
	// 	comun.setDataAdmissao(new GregorianCalendar(2019,0,18));
	// 	comun.setMeioAdmissao(3);
	// 	comun.setDataDemissao(new GregorianCalendar());
	// 	comun.setMeioDemissao(0);
	// 	comun.setSituacao(true);
		
	// 	System.out.println(comun.toString());
		

	// 	LiderVO lider = new LiderVO();
	// 	lider.setIdPessoa(6);
	// 	lider.setIdComun(2);
	// 	lider.setIdLider(1);
	// 	lider.setNomePessoa("Giovanni Moreira Guimarães");
	// 	lider.setDataPriEleicao(new GregorianCalendar(2018,11,01));
	// 	lider.setDataUltEleicao(new GregorianCalendar(2020,11,03));
	// 	lider.setCargoOficio(5);
	// 	lider.setEntidade(5);
		
	// 	System.out.println(lider);
		
	
	// 	AvisoDAO avisoDAO = new AvisoDAO();
	// 	AvisoVO aviso = new AvisoVO();
	// 	aviso.setIdAviso(17);
	// 	aviso.setDataAviso(Calendar.getInstance());

	// 	aviso.setOrigemAviso("Presb. Bento da Silva");
	// 	aviso.setDestinoAviso("UPH - União Presbiteriana de Homens");
	// 	aviso.setAssuntoAviso("Alterando assunto");
	// 	aviso.setConteudoAviso("Alterando o assunto alteramos o conteúdo dos avisos");
	// 	aviso.setIdLider(1);
		
	// 	//avisoDAO.inserir(aviso);
	// 	avisoDAO.buscarAvisoporAssunto(aviso);
	// 	avisoDAO.alterarAviso(aviso);
	// 	//avisoDAO.removerAvisopoId(aviso);
		
	// 	//Listar avisos por Assunto
	// 	List<AvisoVO> avisos = avisoDAO.listar();
	//         for(AvisoVO avi2: avisos) {
	//             System.out.println(avi2.getIdAviso() + "\t" + avi2.getOrigemAviso() + "\t" + avi2.getDestinoAviso() + "\t" + avi2.getAssuntoAviso() + "\n" + avi2.getConteudoAviso());
	//         }	

	// 	System.out.println(aviso.toString());
	}

}
