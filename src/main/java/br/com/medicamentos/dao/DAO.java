package br.com.medicamentos.dao;

import java.io.Serializable;

import javax.persistence.EntityManager;

import br.com.medicamentos.model.Base;

public class DAO<T extends Base> implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private static EntityManager manager = ConnectionFactory.getEntityManager();
	
	

}
