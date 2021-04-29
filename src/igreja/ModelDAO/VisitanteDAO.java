package igreja.ModelDAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.sql.Date;
import java.util.List;
import igreja.ModelVO.PessoaVO;
import igreja.ModelVO.VisitanteVO;

public class VisitanteDAO<VO extends PessoaVO> extends ConnectBD implements PessoaInterDAO<VO> {

	// Lista os dados dos visitantes existentes no Banco de Dados
	public List<VisitanteVO> listar() {
		String sql = "select * from pessoa inner join visitante where Pessoa.idPessoa = Visitante.idPessoa";
		Statement st;
		ResultSet resultado = null;
		List<VisitanteVO> visitantes = new ArrayList<VisitanteVO>();
		try {
			st = getConnection().createStatement();
			resultado = st.executeQuery(sql);
			while (resultado.next()) {
				VisitanteVO vis = new VisitanteVO();
				vis.setIdPessoa(resultado.getInt("idPessoa"));
				((VisitanteVO) vis).setIdVisitante(resultado.getInt("idVisitante"));
				vis.setNomePessoa(resultado.getString("nomePessoa"));
				vis.setCongregaPessoa(resultado.getInt("congregaPessoa"));
				vis.setLogradouroPessoa(resultado.getString("logradouroPessoa"));
				vis.setBairroPessoa(resultado.getString("bairroPessoa"));
				vis.setCidadePessoa(resultado.getString("cidadePessoa"));
				vis.setDataNascimentoPessoa(toCalendar(resultado.getDate("nascimentoPessoa")));	
				vis.setDataUltVisita(toCalendar(resultado.getDate("dataUltVisita")));
				vis.setCepPessoa(resultado.getString("cepPessoa"));
				vis.setComplementoPessoa(resultado.getString("complementoPessoa"));
				vis.setUfPessoa(resultado.getString("ufPessoa"));
				vis.setPontoReferPessoa(resultado.getString("pontoReferPessoa"));
				vis.setEmailPessoa(resultado.getString("emailPessoa"));
				vis.setFonePessoa(resultado.getString("fonePessoa"));
				vis.setNaturalidadePessoa(resultado.getString("naturalidadePessoa"));
				vis.setSexoPessoa(resultado.getInt("sexoPessoa"));
				vis.setDataCasamentoPessoa(toCalendar(resultado.getDate("dataCasamentoPessoa")));
				vis.setDataEmissaoIdentPessoa(toCalendar(resultado.getDate("dataEmissaoIdentPessoa")));
				vis.setConjugePessoa(resultado.getString("conjugePessoa"));
				vis.setIdentPessoa(resultado.getString("identPessoa"));
				vis.setEscolaridadePessoa(resultado.getInt("escolaridadePessoa"));
				vis.setOrgEmissorIdentPessoa(resultado.getString("orgEmissorIdentPessoa"));
				vis.setNomePaiPessoa(resultado.getString("nomePaiPessoa"));
				vis.setNomeMaePessoa(resultado.getString("nomeMaePessoa"));
				vis.setProfissaoPessoa(resultado.getString("profissaoPessoa"));

				visitantes.add(vis);
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return visitantes;
	}

	public static Calendar toCalendar(Date date){ 
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal;
	}

	@Override
	public void inserir(VO visitante) throws SQLException {
			String sql = "insert into visitante(idVisitante, idPessoa, dataUltVisita) values(?,?,?)";
			PreparedStatement ptst;
			try {
				ptst = getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
				ptst.setInt(1, ((VisitanteVO) visitante).getIdVisitante());
				ptst.setInt(2, visitante.getIdPessoa());
				ptst.setDate(3, new Date(((VisitanteVO) visitante).getDataUltVisita().getTimeInMillis()));

				int affectedRows = ptst.executeUpdate();

				if (affectedRows == 0) {
					throw new SQLException("A inserção falhou. Nenhuma linha foi alterada.");
				}
				ResultSet generatedKeys = ptst.getGeneratedKeys();
				if (generatedKeys.next()) {
					((VisitanteVO) visitante).setIdVisitante(generatedKeys.getInt(1));
				} else {
					throw new SQLException("A inserção falhou. Nenhum id foi retornado.");
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}


	@Override
	public void remover(VO visitante) throws SQLException {
		String sql = "DELETE FROM visitante WHERE idVisitante=?";
		PreparedStatement ptst;
		try {
			ptst = getConnection().prepareStatement(sql);
			ptst.setInt(1, ((VisitanteVO) visitante).getIdVisitante());
			ptst.executeUpdate();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public ResultSet buscar(VO vo) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void alterarEndereco(VO vo) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterarEstadoCivil(VO vo) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterarProfissao(VO vo) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterarEscolaridade(VO pessoa) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterarCongrega(VO pessoa) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void alterarUltimaVisita(VisitanteVO vo) {
		// TODO Auto-generated method stub
		
	}
}
