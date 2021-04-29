package igreja.ModelBO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import exception.InsertException;
import igreja.ModelDAO.IgrejaDAO;
import igreja.ModelVO.IgrejaVO;

public class IgrejaBO {

	static private IgrejaDAO dao = new IgrejaDAO();

	// Métodos
	public void inserir(IgrejaVO vo) throws InsertException {
		try {
			ResultSet rs = dao.buscar(vo);
			if (rs.next()) {
				throw new InsertException("Impossível inserir, pois já existe uma igreja com esse nome");
			} else {
				dao.inserir(vo);
			}
		} catch (SQLException e) {
			throw new InsertException(e.getMessage());
		}
	}
	
	public void alterarPastor(IgrejaVO vo) throws InsertException {
		try {
			ResultSet rs = dao.buscar(vo);
			if (rs.next()) {
				dao.alterarPastor(vo);
			} else {
				throw new InsertException("Impossível alterar, pois não existe nenhuma Igreja com esse nome");
			}
		} catch (SQLException e) {
			throw new InsertException(e.getMessage());
		}
	}
	
	public void alterarTipo(IgrejaVO vo) throws InsertException {
		try {
			ResultSet rs = dao.buscar(vo);
			if (rs.next()) {
				dao.alterarTipo(vo);
			} else {
				throw new InsertException("Impossível alterar, pois não existe nenhuma Igreja com esse nome");
			}
		} catch (SQLException e) {
			throw new InsertException(e.getMessage());
		}
	}
	
	public void alterarEndereco(IgrejaVO vo) throws InsertException {
		try {
			ResultSet rs = dao.buscar(vo);
			if (rs.next()) {
				dao.alterarEndereco(vo);
			} else {
				throw new InsertException("Impossível alterar, pois não existe nenhuma Igreja com esse nome");
			}
		} catch (SQLException e) {
			throw new InsertException(e.getMessage());
		}
	}
	
	public void alterarContato(IgrejaVO vo) throws InsertException {
		try {
			ResultSet rs = dao.buscar(vo);
			if (rs.next()) {
				dao.alterarContato(vo);
			} else {
				throw new InsertException("Impossível alterar, pois não existe nenhuma Igreja com esse nome");
			}
		} catch (SQLException e) {
			throw new InsertException(e.getMessage());
		}
	}
	
	public void alterarObservacao(IgrejaVO vo) throws InsertException {
		try {
			ResultSet rs = dao.buscar(vo);
			if (rs.next()) {
				dao.alterarObservacao(vo);
			} else {
				throw new InsertException("Impossível alterar, pois não existe nenhuma Igreja com esse nome");
			}
		} catch (SQLException e) {
			throw new InsertException(e.getMessage());
		}
	}
	
	public void remover(IgrejaVO vo) throws InsertException {
		try {
			ResultSet rs = dao.buscar(vo);
			if (rs.next()) {
				dao.remover(vo);
			} else {
				throw new InsertException("Impossível remover, pois não existe nenhuma Igreja com esse nome");
			}
		} catch (SQLException e) {
			throw new InsertException(e.getMessage());
		}
	}
	
	public IgrejaVO buscarIgreja(String nomeIgreja) {
		// toDO
		IgrejaVO igreja = new IgrejaVO();

		return igreja;
	}
	
	public List<IgrejaVO> listar() {
		List<IgrejaVO> igrejas = dao.listar();

		return igrejas;
	}
}
