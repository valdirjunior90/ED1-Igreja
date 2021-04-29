package igreja.ModelDAO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import igreja.ModelVO.IgrejaVO;

public class IgrejaDAO extends ConnectBD {


	public void inserir(IgrejaVO igreja) {
		String sql = "insert into igreja (tipoIgreja, nomeIgreja, cepIgreja, logradouroIgreja, bairroIgreja, cidadeIgreja, ufIgreja, "
				+ "foneIgreja, siteIgreja, emailIgreja, cnpjIgreja, escolaDominicalIgreja, cultoIgreja, oficialPastorIgreja, "
				+ "condicaoPastorIgreja, dataOrganizacaoIgreja, presbiterioIgreja, observacaoIgreja) "
				+ "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ptst;
		try {
			ptst = getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			ptst.setInt(1, igreja.getTipoIgreja());
			ptst.setString(2, igreja.getNomeIgreja());
			ptst.setString(3, igreja.getCepIgreja());
			ptst.setString(4, igreja.getLogradouroIgreja());
			ptst.setString(5, igreja.getBairroIgreja());
			ptst.setString(6, igreja.getCidadeIgreja());
			ptst.setString(7, igreja.getUfIgreja());
			ptst.setString(8, igreja.getFoneIgreja());
			ptst.setString(9, igreja.getSiteIgreja());
			ptst.setString(10, igreja.getEmailIgreja());
			ptst.setString(11, igreja.getCnpjIgreja());
			ptst.setString(12, igreja.getEscolaDominicalIgreja());
			ptst.setString(13, igreja.getCultoIgreja());
			ptst.setString(14, igreja.getOficialPastorIgreja());
			ptst.setInt(15, igreja.getCondicaoPastorIgreja());
			ptst.setDate(16, new Date(igreja.getDataOrganizacaoIgreja().getTimeInMillis()));
			ptst.setString(17, igreja.getPresbiterioIgreja());
			ptst.setString(18, igreja.getObservacaoIgreja());

			int affectedRows = ptst.executeUpdate();

			if (affectedRows == 0) {
				throw new SQLException("A inserção falhou. Nenhuma linha foi alterada.");
			}
			ResultSet generatedKeys = ptst.getGeneratedKeys();
			if (generatedKeys.next()) {
				igreja.setIdIgreja(generatedKeys.getInt(1));
			} else {
				throw new SQLException("A inserção falhou. Nenhum id foi retornado.");
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	// Lista os dados das Igrejas existentes na tabela Igreja do Banco de Dados
	public List<IgrejaVO> listar() {
			String sql = "SELECT * FROM test.igreja";
			Statement st;
			ResultSet resultado = null;
			List<IgrejaVO> igrejas = new ArrayList<IgrejaVO>();
			try {
				st = getConnection().createStatement();
				resultado = st.executeQuery(sql);
				while (resultado.next()) {
					IgrejaVO igreja = new IgrejaVO();
					igreja.setIdIgreja(resultado.getInt("idIgreja"));
					igreja.setTipoIgreja((char) resultado.getInt("tipoIgreja"));
					igreja.setNomeIgreja(resultado.getString("nomeIgreja"));
					igreja.setCepIgreja(resultado.getString("cepIgreja"));
					igreja.setLogradouroIgreja(resultado.getString("logradouroIgreja"));
					igreja.setBairroIgreja(resultado.getString("bairroIgreja"));
					igreja.setCidadeIgreja(resultado.getString("cidadeIgreja"));
					igreja.setUfIgreja(resultado.getString("ufIgreja"));
					igreja.setFoneIgreja(resultado.getString("foneIgreja"));
					igreja.setSiteIgreja(resultado.getString("siteIgreja"));
					igreja.setEmailIgreja(resultado.getString("emailIgreja"));
					igreja.setCnpjIgreja(resultado.getString("cnpjIgreja"));
					igreja.setEscolaDominicalIgreja(resultado.getString("escolaDominicalIgreja"));
					igreja.setCultoIgreja(resultado.getString("cultoIgreja"));
					igreja.setOficialPastorIgreja(resultado.getString("oficialPastorIgreja"));
					igreja.setCondicaoPastorIgreja((char) resultado.getInt("condicaoPastorIgreja"));
					Date dataOrganizacao = (resultado.getDate("dataOrganizacaoIgreja"));
					Calendar cale = Calendar.getInstance();
					cale.setTime(dataOrganizacao);
					igreja.setDataOrganizacaoIgreja(cale);
					igreja.setPresbiterioIgreja(resultado.getString("presbiterioIgreja"));
					igreja.setObservacaoIgreja(resultado.getString("observacaoIgreja"));
					igrejas.add(igreja);
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			return igrejas;
		}
	
	// Busca os dados da Igreja pelo nome na tabela Igreja do Banco de Dados
	public ResultSet buscar(IgrejaVO igreja) {
		String sql = "SELECT * FROM igreja WHERE nomeIgreja=?";
		PreparedStatement ptst;
		ResultSet resultado = null;
		try {
			ptst = getConnection().prepareStatement(sql);
			ptst.setString(1, igreja.getNomeIgreja());
			resultado = ptst.executeQuery();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return resultado;
	}

	// Remover os dados da Igreja na tabela Igreja do Banco de Dados
	public void remover(IgrejaVO igreja) {
		String sql = "DELETE FROM igreja WHERE nomeIgreja=?";
		PreparedStatement ptst;
		try {
			ptst = getConnection().prepareStatement(sql);
			ptst.setString(1, igreja.getNomeIgreja());
			ptst.executeUpdate();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	// Altera o nome do pastor e sua condição na tabela Igreja do Banco de Dados
	public void alterarPastor(IgrejaVO igreja) {
		String sql = "UPDATE igreja SET oficialPastorIgreja=?, condicaoPastorIgreja=? WHERE nomeIgreja=?";
		PreparedStatement ptst;
		try {
			ptst = getConnection().prepareStatement(sql);
			ptst.setString(1, igreja.getOficialPastorIgreja());
			ptst.setInt(2, igreja.getCondicaoPastorIgreja());
			ptst.setString(3, igreja.getNomeIgreja());
			ptst.executeUpdate();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	// Altera o tipo da Igreja na tabela Igreja do Banco de Dados
	public void alterarTipo(IgrejaVO igreja) {
		String sql = "UPDATE igreja SET tipoIgreja=? WHERE nomeIgreja=?";
		PreparedStatement ptst;
		try {
			ptst = getConnection().prepareStatement(sql);
			ptst.setInt(1, igreja.getTipoIgreja());
			ptst.setString(2, igreja.getNomeIgreja());
			ptst.executeUpdate();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	// Altera o CEP, o endereço e o bairro da Igreja na tabela Igreja do Banco de Dados
	public void alterarEndereco(IgrejaVO igreja) {
		String sql = "UPDATE igreja SET cepIgreja=?, logradouroIgreja=?, bairroIgreja=? WHERE nomeIgreja=?";
		PreparedStatement ptst;
		try {
			ptst = getConnection().prepareStatement(sql);
			ptst.setString(1, igreja.getCepIgreja());
			ptst.setString(2, igreja.getLogradouroIgreja());
			ptst.setString(3, igreja.getBairroIgreja());
			ptst.setString(4, igreja.getNomeIgreja());					
			ptst.executeUpdate();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	// Altera o telefone, o email e o site da Igreja na tabela Igreja do Banco de Dados
	public void alterarContato(IgrejaVO igreja) {
		String sql = "UPDATE igreja SET emailIgreja=?, foneIgreja=?, siteIgreja=? WHERE nomeIgreja=?";
		PreparedStatement ptst;
		try {
			ptst = getConnection().prepareStatement(sql);
			ptst.setString(1, igreja.getEmailIgreja());
			ptst.setString(2, igreja.getFoneIgreja());
			ptst.setString(3, igreja.getSiteIgreja());
			ptst.setString(4, igreja.getNomeIgreja());					
			ptst.executeUpdate();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	// Altera o campo Observações na tabela Igreja do Banco de Dados
	public void alterarObservacao(IgrejaVO igreja) {
		String sql = "UPDATE igreja SET observacaoIgreja=? WHERE nomeIgreja=?";
		PreparedStatement ptst;
		try {
			ptst = getConnection().prepareStatement(sql);
			ptst.setString(1, igreja.getObservacaoIgreja());
			ptst.setString(4, igreja.getNomeIgreja());					
			ptst.executeUpdate();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}
