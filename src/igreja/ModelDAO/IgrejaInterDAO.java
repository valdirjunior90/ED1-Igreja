package igreja.ModelDAO;

import java.sql.SQLException;
import java.util.List;

import igreja.ModelVO.IgrejaVO;

public interface IgrejaInterDAO<VO extends IgrejaVO> extends ConnectBDinterDAO<VO> {
	public void alterar(VO vo) throws SQLException;

	public List<IgrejaVO> listar() throws SQLException;

}
