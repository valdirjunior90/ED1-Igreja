package igreja.ModelBO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import exception.AutenticationException;
import exception.InsertException;
import igreja.ModelDAO.UsuarioDAO;
import igreja.ModelVO.UsuarioVO;

public class UsuarioBO {
	static private UsuarioDAO<UsuarioVO> dao = new UsuarioDAO<UsuarioVO>();

	// Métodos
	public void inserir(UsuarioVO vo) throws InsertException {
		try {
			ResultSet rs = dao.buscar(vo);
			if (rs.next()) {
				throw new InsertException("Impossível inserir, pois já existe um usuario com esse login");
			} else {
				dao.inserir(vo);
			}
		} catch (SQLException e) {
			throw new InsertException(e.getMessage());
		}
	}

	public void alterar(UsuarioVO vo) throws InsertException {
		try {
			ResultSet rs = dao.buscar(vo);
			if (rs.next()) {
				dao.alterar(vo);
			} else {
				throw new InsertException("Impossível alterar, pois não existe nenhum usuario com esse login");
			}
		} catch (SQLException e) {
			throw new InsertException(e.getMessage());
		}
	}

	public void remover(UsuarioVO vo) throws InsertException {
		try {
			ResultSet rs = dao.buscar(vo);
			if (rs.next()) {
				dao.remover(vo);
			} else {
				throw new InsertException("Impossível remover, pois não existe nenhum usuario com esse login");
			}
		} catch (SQLException e) {
			throw new InsertException(e.getMessage());
		}

	}

	public UsuarioVO buscarUsuario(String login) {
		// toDO
		UsuarioVO usuario = new UsuarioVO();

		return usuario;
	}

	public List<UsuarioVO> listar() {
		List<UsuarioVO> usuarios = dao.listar();

		return usuarios;
	}

	public UsuarioVO autenticar(UsuarioVO vo) throws AutenticationException {
		try {
			ResultSet rs = dao.buscar(vo);
			if (rs.next()) {
				dao.autenticar(vo);
			} else {
				throw new AutenticationException();
			}
		} catch (SQLException e) {
			throw new AutenticationException();

		}
		return vo;
	}
}
