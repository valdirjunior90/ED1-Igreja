package igreja.ModelDAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.sql.Date;
import java.util.List;
import igreja.ModelVO.UsuarioVO;

public class UsuarioDAO<VO extends UsuarioVO> extends ConnectBD implements UsuarioInterDAO<VO> {

	// Lista os dados dos usuários existentes no Banco de Dados
	public List<UsuarioVO> listar() {
		String sql = "SELECT * FROM igreja.usuario";
		Statement st;
		ResultSet resultado = null;
		List<UsuarioVO> usuarios = new ArrayList<UsuarioVO>();
		try {
			st = getConnection().createStatement();
			resultado = st.executeQuery(sql);
			while (resultado.next()) {
				UsuarioVO usu = new UsuarioVO();
				usu.setIdUsuario(resultado.getInt("idUsuario"));
				usu.setNomeUsuario(resultado.getString("nomeUsuario"));
				usu.setEmailUsuario(resultado.getString("emailUsuario"));
				usu.setLoginUsuario(resultado.getString("loginUsuario"));
				usu.setSenhaUsuario(resultado.getString("senhaUsuario"));
				
				Date dataCadastro = (resultado.getDate("dataCadastroUsuario"));
				Calendar cale = Calendar.getInstance();
				cale.setTime(dataCadastro);
				usu.setDataCadastroUsuario(cale);
				
				usu.setSituacaoUsuario(resultado.getBoolean("situacaoUsuario"));
				usu.setPerfilUsuario((char) resultado.getInt("perfilUsuario"));
				usuarios.add(usu);
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return usuarios;
	}

	public void inserir(VO usuario) {
		String sql = "insert into usuario(nomeUsuario, emailUsuario, loginUsuario, senhaUsuario, dataCadastroUsuario, situacaoUsuario, perfilUsuario) values(?,?,?,?,?,?,?)";
		PreparedStatement ptst;
		try {
			ptst = getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			ptst.setString(1, usuario.getNomeUsuario());
			ptst.setString(2, usuario.getEmailUsuario());
			ptst.setString(3, usuario.getLoginUsuario());
			ptst.setString(4, usuario.getSenhaUsuario());
			ptst.setDate(5, new Date(usuario.getDataCadastroUsuario().getTimeInMillis()));
			ptst.setBoolean(6, usuario.isSituacaoUsuario());
			ptst.setInt(7, usuario.getPerfilUsuario());

			int affectedRows = ptst.executeUpdate();

			if (affectedRows == 0) {
				throw new SQLException("A inserção falhou. Nenhuma linha foi alterada.");
			}
			ResultSet generatedKeys = ptst.getGeneratedKeys();
			if (generatedKeys.next()) {
				usuario.setIdUsuario(generatedKeys.getInt(1));
			} else {
				throw new SQLException("A inserção falhou. Nenhum id foi retornado.");
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	/*
	 * Altera a senha de um usuário específico no Banco de Dados a partir do id do
	 * usuario informado
	 */
	public void alterar(VO usuario) {
		String sql = "UPDATE usuario SET senha=? WHERE login=?";
		PreparedStatement ptst;
		try {
			ptst = getConnection().prepareStatement(sql);
			ptst.setString(1, usuario.getSenhaUsuario());
			ptst.setString(2, usuario.getLoginUsuario());
			ptst.executeUpdate();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	/*
	 * Remove os dados de um usuário específico no Banco de Dados a partir do id do
	 * usuario informado
	 */
	public void remover(VO usuario) {
		String sql = "DELETE FROM usuario WHERE login=?";
		PreparedStatement ptst;
		try {
			ptst = getConnection().prepareStatement(sql);
			ptst.setString(1, usuario.getLoginUsuario());
			ptst.executeUpdate();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	/*
	 * Busca os dados de um usuario expecífico no Banco de Bados a partir do id
	 * informado
	 */
	public ResultSet buscar(VO usuario) {
		String sql = "SELECT * FROM usuario WHERE login=?";
		PreparedStatement ptst;
		ResultSet resultado = null;
		try {
			ptst = getConnection().prepareStatement(sql);
			ptst.setString(1, usuario.getLoginUsuario());
			resultado = ptst.executeQuery();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return resultado;
	}

	public void autenticar(VO usu) {
		String sql = "SELECT * FROM usuario";
		Statement st;
		ResultSet resultado = null;
		String situacao = "Não encontrou usuario";
		try {
			st = getConnection().createStatement();
			resultado = st.executeQuery(sql);
			// encontrar usuario

			while (resultado.next()) {
				// existe e senha ok. Descobrir se é proprietário, funcionário ou administrador
				UsuarioVO usuario = new UsuarioVO();
				usuario.setIdUsuario(resultado.getInt("idUsuario"));
				usuario.setLoginUsuario(resultado.getString("loginUsuario"));
				usuario.setSenhaUsuario(resultado.getString("senhaUsuario"));
				usuario.setPerfilUsuario((char) resultado.getInt("PerfilUsuario"));
				if ((usuario.getLoginUsuario().equals(usu.getLoginUsuario())
						&& (usuario.getSenhaUsuario().equals(usu.getSenhaUsuario())))) {
					if (usuario.getPerfilUsuario() == 1)
						situacao = "Usuário é o Administrador";
					else if (usuario.getPerfilUsuario() == 2)
						situacao = "Usuário é o Responsável";
					else if (usuario.getPerfilUsuario() == 3)
						situacao = "Usuário é o Funcionário";
				}
			}
			System.out.println(situacao);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Deu mal");
		}
	}
}
