package com.digitalware.test.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.digitalware.test.model.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long> {
	
	public List<Cliente> findAll();

}
