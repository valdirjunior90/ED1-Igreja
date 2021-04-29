package igreja.ModelVO;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public final class VisitanteVO extends PessoaVO {
	
	SimpleDateFormat sdf = new SimpleDateFormat("d/M/y");

	// Variáveis
	private int idVisitante;
	private int idPessoa;
	private Calendar dataUltVisita;

	public int getIdVisitante() {
		return idVisitante;
	}

	// Métodos Especiais - Getters e Setters
	public void setIdVisitante(int idVisitante) {
		this.idVisitante = idVisitante;
	}

	public int getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public Calendar getDataUltVisita() {
		return dataUltVisita;
	}

	public void setDataUltVisita(Calendar dataUltVisita) {
		if (dataUltVisita == null)
			this.dataUltVisita = Calendar.getInstance();
		else
			this.dataUltVisita = dataUltVisita;
	}

		//Métodos Especiais - toString
	@Override
	public String toString() {
		System.out.println("------------------");
		System.out.println("Dados do Visitante");
		System.out.println("------------------");
		String saida;
		saida = "IdVisitante: " + getIdVisitante();
		
		saida += super.toString();
		
		saida += "\tÚltima visita: " + sdf.format(getDataUltVisita().getTime()) + "\n";
		
		return saida;
	}

}
