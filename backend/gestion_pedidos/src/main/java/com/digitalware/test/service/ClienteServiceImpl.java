package com.digitalware.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.digitalware.test.dao.IClienteDao;
import com.digitalware.test.model.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private IClienteDao clienteDao;
	
	@Override
	@Transactional(readOnly = true) 
	public List<Cliente> findAll() {
		return clienteDao.findAll();
	}

}
