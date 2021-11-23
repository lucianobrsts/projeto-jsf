package br.com.medicamentos.service;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import br.com.medicamentos.dao.DAO;
import br.com.medicamentos.model.Medicamento;
import br.com.medicamentos.util.NegocioException;

public class MedicamentoService implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private DAO<Medicamento> dao;
	
	public void salvar(Medicamento m) throws NegocioException {
		if(m.getNome().length() < 3) {
			throw new NegocioException("O nome do medicamento não pode ter menos que 3 caracteres...");
		}
		
		dao.salvar(m);
	}
	
	public void remover(Medicamento m) throws NegocioException {
		dao.remover(Medicamento.class, m.getId());
	}
	
	public List<Medicamento> todosOsMedicamentos() {
		return dao.buscarTodos("select m from Medicamentos m order by m.nome");
	}
 
}
