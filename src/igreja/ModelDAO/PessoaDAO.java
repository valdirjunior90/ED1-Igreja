package igreja.ModelDAO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import igreja.ModelVO.PessoaVO;
import igreja.ModelVO.VisitanteVO;


public class PessoaDAO<VO extends PessoaVO> extends ConnectBD implements PessoaInterDAO<VO> {	

	public void inserir(VO pessoa) throws SQLException {
		String sql = "insert into pessoa(idPessoa, nomePessoa, nascimentoPessoa, cepPessoa, logradouroPessoa, complementoPessoa, "
				+ "bairroPessoa, cidadePessoa, ufPessoa, pontoReferPessoa, emailPessoa, fonePessoa, naturalidadePessoa, "
				+ "sexoPessoa, estCivilPessoa, conjugePessoa, dataCasamentoPessoa, identPessoa, orgEmissorIdentPessoa, "
				+ "dataEmissaoIdentPessoa, escolaridadePessoa, profissaoPessoa, nomePaiPessoa, nomeMaePessoa, congregaPessoa) "
				+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ptst;
		try {
			ptst = getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			ptst.setInt(1, pessoa.getIdPessoa());
			ptst.setString(2, pessoa.getNomePessoa());
			ptst.setDate(3, new Date(pessoa.getDataNascimentoPessoa().getTimeInMillis()));
			ptst.setString(4, pessoa.getCepPessoa());
			ptst.setString(5, pessoa.getLogradouroPessoa());
			ptst.setString(6, pessoa.getComplementoPessoa());
			ptst.setString(7, pessoa.getBairroPessoa());
			ptst.setString(8, pessoa.getCidadePessoa());
			ptst.setString(9, pessoa.getUfPessoa());
			ptst.setString(10, pessoa.getPontoReferPessoa());
			ptst.setString(11, pessoa.getEmailPessoa());
			ptst.setString(12, pessoa.getFonePessoa());
			ptst.setString(13, pessoa.getNaturalidadePessoa());
			ptst.setInt(14, pessoa.getSexoPessoa());
			ptst.setInt(15, pessoa.getEstCivilPessoa());
			ptst.setString(16, pessoa.getConjugePessoa());
			ptst.setDate(17, new Date(pessoa.getDataCasamentoPessoa().getTimeInMillis()));
			ptst.setString(18, pessoa.getIdentPessoa());
			ptst.setString(19, pessoa.getOrgEmissorIdentPessoa());
			ptst.setDate(20, new Date(pessoa.getDataEmissaoIdentPessoa().getTimeInMillis()));
			ptst.setInt(21, pessoa.getEscolaridadePessoa());
			ptst.setString(22, pessoa.getProfissaoPessoa());
			ptst.setString(23, pessoa.getNomePaiPessoa());
			ptst.setString(24, pessoa.getNomeMaePessoa());
			ptst.setInt(25, pessoa.getCongregaPessoa());
	
			int affectedRows = ptst.executeUpdate();

			if (affectedRows == 0) {
				throw new SQLException("A inser��o falhou. Nenhuma linha foi alterada.");
			}
			ResultSet generatedKeys = ptst.getGeneratedKeys();
			if (generatedKeys.next()) {
				((PessoaVO) pessoa).setIdPessoa(generatedKeys.getInt(1));
			} else {
				throw new SQLException("A inser��o falhou. Nenhum id foi retornado.");
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void remover(VO pessoa) throws SQLException {
		String sql = "DELETE FROM pessoa WHERE idPessoa=?";
		PreparedStatement ptst;
		try {
			ptst = getConnection().prepareStatement(sql);
			ptst.setInt(1, pessoa.getIdPessoa());
			ptst.executeUpdate();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public ResultSet buscar(VO pessoa) throws SQLException {
		String sql = "SELECT * FROM pessoa WHERE nomePessoa=?";
		PreparedStatement ptst;
		ResultSet resultado = null;
		try {
			ptst = getConnection().prepareStatement(sql);
			ptst.setString(1, pessoa.getNomePessoa());
			resultado = ptst.executeQuery();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return resultado;
	}

	@Override
	public void alterarEndereco(VO pessoa) throws SQLException {
		String sql = "UPDATE pessoa SET cepPessoa=?, logradouroPessoa=?, complementoPessoa=?, bairroPessoa=?, cidadePessoa=?, "
				+ "ufPessoa=?, pontoReferPessoa=?, fonePessoa=?  WHERE idPessoa=?";
		PreparedStatement ptst;
		try {
			ptst = getConnection().prepareStatement(sql);
			ptst.setString(1, pessoa.getCepPessoa());
			ptst.setString(2, pessoa.getLogradouroPessoa());
			ptst.setString(3, pessoa.getComplementoPessoa());
			ptst.setString(4, pessoa.getBairroPessoa());
			ptst.setString(5, pessoa.getCidadePessoa());
			ptst.setString(6, pessoa.getUfPessoa());
			ptst.setString(7, pessoa.getPontoReferPessoa());
			ptst.setString(8, pessoa.getFonePessoa());
			ptst.setInt(9, pessoa.getIdPessoa());
			
			ptst.executeUpdate();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
		
	@Override
	public void alterarEstadoCivil(VO pessoa) throws SQLException {
		String sql = "UPDATE pessoa SET estCivilPessoa=?, conjugePessoa=?, dataCasamentoPessoa=? WHERE idPessoa=?";
		PreparedStatement ptst;
		try {
			ptst = getConnection().prepareStatement(sql);
			ptst.setInt(1, pessoa.getEstCivilPessoa());
			ptst.setString(2, pessoa.getConjugePessoa());
			ptst.setDate(3, new Date(pessoa.getDataCasamentoPessoa().getTimeInMillis()));
			ptst.setInt(4, pessoa.getIdPessoa());
			
			ptst.executeUpdate();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	@Override
	public void alterarEscolaridade(VO pessoa) throws SQLException {
		String sql = "UPDATE pessoa SET escolaridadePessoa=? WHERE idPessoa=?";
		PreparedStatement ptst;
		try {
			ptst = getConnection().prepareStatement(sql);
			ptst.setInt(1, pessoa.getEscolaridadePessoa());
			ptst.setInt(2, pessoa.getIdPessoa());
			
			ptst.executeUpdate();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
		@Override
	public void alterarProfissao(VO pessoa) throws SQLException {
		String sql = "UPDATE pessoa SET profissaoPessoa=? WHERE idPessoa=?";
		PreparedStatement ptst;
		try {
			ptst = getConnection().prepareStatement(sql);
			ptst.setString(1, pessoa.getProfissaoPessoa());
			ptst.setInt(2, pessoa.getIdPessoa());
			
			ptst.executeUpdate();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
		
	@Override
	public void alterarCongrega(VO pessoa) throws SQLException {
		String sql = "UPDATE pessoa SET congregaPessoa=? WHERE idPessoa=?";
		PreparedStatement ptst;
		try {
			ptst = getConnection().prepareStatement(sql);
			ptst.setInt(1, pessoa.getCongregaPessoa());
			ptst.setInt(2, pessoa.getIdPessoa());
			
			ptst.executeUpdate();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	@Override
	public List<VisitanteVO> listar() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
}
