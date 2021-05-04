package igreja.ModelDAO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import igreja.ModelVO.AvisoVO;

public class AvisoDAO extends ConnectBD {

	// Inserir aviso na tabela aviso do Banco de Dados
	public void inserir(AvisoVO aviso) {
		String sql = "insert into aviso (dataAviso, origemAviso, destinoAviso, assuntoAviso, conteudoAviso, idLider)"
				+ "values (?,?,?,?,?,?)";
		PreparedStatement ptst;
		try {
			ptst = getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			ptst.setDate(1, new Date(aviso.getDataAviso().getTimeInMillis()));
			ptst.setString(2, aviso.getOrigemAviso());
			ptst.setString(3, aviso.getDestinoAviso());
			ptst.setString(4, aviso.getAssuntoAviso());
			ptst.setString(5, aviso.getConteudoAviso());
			ptst.setInt(6, aviso.getIdLider());

			int affectedRows = ptst.executeUpdate();

			if (affectedRows == 0) {
				throw new SQLException("A inserção falhou. Nenhuma linha foi alterada.");
			}
			ResultSet generatedKeys = ptst.getGeneratedKeys();
			if (generatedKeys.next()) {
				aviso.setIdAviso(generatedKeys.getInt(1));
			} else {
				throw new SQLException("A inserção falhou. Nenhum id foi retornado.");
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	public static Calendar toCalendar(Date date){ 
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal;
	}

	// Listar os avisos existentes na tabela aviso do Banco de Dados
	public List<AvisoVO> listar() {
		String sql = "SELECT * FROM aviso";
		Statement st;
		ResultSet resultado = null;
		List<AvisoVO> avisos = new ArrayList<AvisoVO>();
		try {
			st = getConnection().createStatement();
			resultado = st.executeQuery(sql);
			while (resultado.next()) {
				AvisoVO aviso = new AvisoVO();
				aviso.setIdAviso(resultado.getInt("idAviso"));

				// Date dataAviso = (resultado.getDate("dataAviso"));
				// Calendar cale = Calendar.getInstance();
				// cale.setTime(dataAviso);

				aviso.setDataAviso(toCalendar(resultado.getDate("dataAviso")));
				aviso.setOrigemAviso(resultado.getString("origemAviso"));
				aviso.setDestinoAviso(resultado.getString("destinoAviso"));
				aviso.setAssuntoAviso(resultado.getString("assuntoAviso"));
				aviso.setConteudoAviso(resultado.getString("conteudoAviso"));
				aviso.setIdLider(resultado.getInt("idLider"));
				avisos.add(aviso);
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return avisos;
	}

	// Busca os dados do aviso pelo assunto na tabela aviso do Banco de Dados
	public ResultSet buscarAvisoporAssunto(AvisoVO aviso) {
		String sql = "SELECT * FROM aviso WHERE assuntoAviso=?";
		PreparedStatement ptst;
		ResultSet resultado = null;
		try {
			ptst = getConnection().prepareStatement(sql);
			ptst.setString(1, aviso.getAssuntoAviso());
			resultado = ptst.executeQuery();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return resultado;
	}

	public ResultSet buscarAvisoporId(AvisoVO aviso) {
		String sql = "SELECT * FROM aviso WHERE idAviso=?";
		PreparedStatement ptst;
		ResultSet resultado = null;
		try {
			ptst = getConnection().prepareStatement(sql);
			ptst.setString(1, aviso.getAssuntoAviso());
			resultado = ptst.executeQuery();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return resultado;
	}

	// Remover os dados do aviso na tabela aviso do Banco de Dados por assunto
	public void removerAvisoporAssunto(AvisoVO aviso) {
		String sql = "DELETE FROM aviso WHERE assuntoAviso=?";
		PreparedStatement ptst;
		try {
			ptst = getConnection().prepareStatement(sql);
			ptst.setString(1, aviso.getAssuntoAviso());
			ptst.executeUpdate();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	// Remover os dados do aviso na tabela aviso do Banco de Dados por Id
	public void removerAvisoporId(AvisoVO aviso) {
		String sql = "DELETE FROM aviso WHERE idAviso=?";
		PreparedStatement ptst;
		try {
			ptst = getConnection().prepareStatement(sql);
			ptst.setInt(1, aviso.getIdAviso());
			ptst.executeUpdate();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	// Altera o assunto e o conteúdo do aviso na tabela aviso do Banco de Dados
	public void alterarAviso(AvisoVO aviso) {
		String sql = "UPDATE aviso SET assuntoAviso=?, conteudoAviso=? WHERE idAviso=?";
		PreparedStatement ptst;
		try {
			ptst = getConnection().prepareStatement(sql);
			ptst.setString(1, aviso.getAssuntoAviso());
			ptst.setString(2, aviso.getConteudoAviso());
			ptst.setInt(3, aviso.getIdAviso());
			ptst.executeUpdate();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}
