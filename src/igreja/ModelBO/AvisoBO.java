package igreja.ModelBO;

import java.sql.ResultSet;
import java.sql.SQLException;

import exception.InsertException;
import igreja.ModelDAO.AvisoDAO;
import igreja.ModelVO.AvisoVO;

public class AvisoBO {
	
	static private AvisoDAO dao = new AvisoDAO();

	// Métodos
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
	
	public AvisoVO buscar(String assuntoAviso) {
		// toDO
		AvisoVO aviso = new AvisoVO();

		return aviso;
	}
}
