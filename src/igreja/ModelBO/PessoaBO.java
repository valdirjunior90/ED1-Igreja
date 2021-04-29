package igreja.ModelBO;

import java.sql.ResultSet;
import java.sql.SQLException;
import exception.InsertException;
import igreja.ModelDAO.PessoaDAO;
import igreja.ModelVO.PessoaVO;



public class PessoaBO {
	static private PessoaDAO<PessoaVO> dao = new PessoaDAO<PessoaVO>();

	// Métodos
	public void inserir(PessoaVO vo) throws InsertException {
		try {
			ResultSet rs = dao.buscar(vo);
			if (rs.next()) {
				throw new InsertException("Impossível inserir, pois já existe uma pessoa com esse nome");
			} else {
				dao.inserir(vo);
			}
		} catch (SQLException e) {
			throw new InsertException(e.getMessage());
		}
	}

	public void alterarEndereco(PessoaVO vo) throws InsertException {
		try {
			ResultSet rs = dao.buscar(vo);
			if (rs.next()) {
				dao.alterarEndereco(vo);
			} else {
				throw new InsertException("Impossível alterar, pois não existe nenhuma pessoa com esse nome");
			}
		} catch (SQLException e) {
			throw new InsertException(e.getMessage());
		}
	}
	
	public void alterarEstadoCivil(PessoaVO vo) throws InsertException {
		try {
			ResultSet rs = dao.buscar(vo);
			if (rs.next()) {
				dao.alterarEstadoCivil(vo);
			} else {
				throw new InsertException("Impossível alterar, pois não existe nenhuma pessoa com esse nome");
			}
		} catch (SQLException e) {
			throw new InsertException(e.getMessage());
		}
	}
	
	public void alterarEscolaridade(PessoaVO vo) throws InsertException {
		try {
			ResultSet rs = dao.buscar(vo);
			if (rs.next()) {
				dao.alterarEscolaridade(vo);
			} else {
				throw new InsertException("Impossível alterar, pois não existe nenhuma pessoa com esse nome");
			}
		} catch (SQLException e) {
			throw new InsertException(e.getMessage());
		}
	}
	
	public void alterarProfissao(PessoaVO vo) throws InsertException {
		try {
			ResultSet rs = dao.buscar(vo);
			if (rs.next()) {
				dao.alterarProfissao(vo);
			} else {
				throw new InsertException("Impossível alterar, pois não existe nenhuma pessoa com esse nome");
			}
		} catch (SQLException e) {
			throw new InsertException(e.getMessage());
		}
	}
	
	public void remover(PessoaVO vo) throws InsertException {
		try {
			ResultSet rs = dao.buscar(vo);
			if (rs.next()) {
				dao.remover(vo);
			} else {
				throw new InsertException("Impossível remover, pois não existe nenhuma pessoa com esse nome");
			}
		} catch (SQLException e) {
			throw new InsertException(e.getMessage());
		}
	}
}
