package igreja.ModelBO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import exception.InsertException;
import igreja.ModelDAO.AvisoDAO;
import igreja.ModelVO.AvisoVO;

public class AvisoBO {

	static private AvisoDAO dao = new AvisoDAO();

	public void inserir(AvisoVO vo) throws InsertException {
		try {
			ResultSet rs = dao.buscarAvisoporAssunto(vo);
			if (rs.next()) {
				throw new InsertException("Impossível inserir, pois já existe um aviso com esse título");
			} else {
				dao.inserir(vo);
			}
		} catch (SQLException e) {
			throw new InsertException(e.getMessage());
		}
	}

	public List<AvisoVO> listar() {
		List<AvisoVO> aviso = dao.listar();

		return aviso;
	}

	public void AlterarAviso(AvisoVO vo) throws InsertException {
		try {
			ResultSet rs = dao.buscarAvisoporAssunto(vo);
			if (rs.next()) {
				dao.alterarAviso(vo);
			} else {
				throw new InsertException("Impossível alterar, pois não existe nenhum aviso com esse nome");
			}
		} catch (SQLException e) {
			throw new InsertException(e.getMessage());
		}
	}

	public void removerAvisoporAssunto(AvisoVO vo) throws InsertException {
		try {
			ResultSet rs = dao.buscarAvisoporAssunto(vo);
			if (rs.next()) {
				dao.removerAvisoporAssunto(vo);
			} else {
				throw new InsertException("Impossível remover, pois não existe nenhum aviso com esse nome");
			}
		} catch (SQLException e) {
			throw new InsertException(e.getMessage());
		}
	}

	public void removerAvisoporId(AvisoVO vo) throws InsertException {
		try {
			ResultSet rs = dao.buscarAvisoporId(vo);
			if (rs.next()) {
				dao.removerAvisoporId(vo);
			} else {
				throw new InsertException("Impossível remover, pois não existe nenhum aviso com esse ID");
			}
		} catch (SQLException e) {
			throw new InsertException(e.getMessage());
		}
	}

}
