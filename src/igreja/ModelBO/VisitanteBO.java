package igreja.ModelBO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import exception.InsertException;
import igreja.ModelDAO.VisitanteDAO;
import igreja.ModelVO.VisitanteVO;

public class VisitanteBO {
	static private VisitanteDAO<VisitanteVO> dao = new VisitanteDAO<VisitanteVO>();

	// Métodos
	public void inserir(VisitanteVO vo) throws InsertException {
		try {
			ResultSet rs = dao.buscar(vo);
			if (rs.next()) {
				throw new InsertException("Impossível inserir, pois já existe um visitanteus com esse id");
			} else {
				dao.inserir(vo);
			}
		} catch (SQLException e) {
			throw new InsertException(e.getMessage());
		}
	}

	public void alterar(VisitanteVO vo) throws InsertException {
		try {
			ResultSet rs = dao.buscar(vo);
			if (rs.next()) {
				dao.alterarUltimaVisita(vo);
			} else {
				throw new InsertException("Impossível alterar, pois não existe nenhum visitante com esse id");
			}
		} catch (SQLException e) {
			throw new InsertException(e.getMessage());
		}
	}

	public void remover(VisitanteVO vo) throws InsertException {
		try {
			ResultSet rs = dao.buscar(vo);
			if (rs.next()) {
				dao.remover(vo);
			} else {
				throw new InsertException("Impossível remover, pois não existe nenhum visitante com esse id");
			}
		} catch (SQLException e) {
			throw new InsertException(e.getMessage());
		}

	}

	public VisitanteVO buscarVisitante(int idVisitante) {
		// toDO
		VisitanteVO visitante = new VisitanteVO();

		return visitante;
	}

	public List<VisitanteVO> listar() {
		List<VisitanteVO> visitantes = dao.listar();

		return visitantes;
	}

}
