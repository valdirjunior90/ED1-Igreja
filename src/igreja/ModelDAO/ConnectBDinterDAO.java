package igreja.ModelDAO;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface ConnectBDinterDAO<VO> {
	public void inserir(VO vo) throws SQLException;

	public void remover(VO vo) throws SQLException;

	public ResultSet buscar(VO vo) throws SQLException;

	

}
