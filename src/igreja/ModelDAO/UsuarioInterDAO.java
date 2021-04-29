package igreja.ModelDAO;

import java.sql.SQLException;
import java.util.List;

import igreja.ModelVO.*;

public interface UsuarioInterDAO<VO extends UsuarioVO> extends ConnectBDinterDAO<VO> {
	public void alterar(VO vo) throws SQLException;

	public List<UsuarioVO> listar() throws SQLException;

	public void autenticar(VO vo) throws SQLException;
}
