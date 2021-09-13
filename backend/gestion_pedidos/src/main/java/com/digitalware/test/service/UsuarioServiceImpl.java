package com.digitalware.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.digitalware.test.dao.IUsuarioDao;
import com.digitalware.test.model.Usuario;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

	@Autowired
	private IUsuarioDao usuarioDao;
	
	@Override
	@Transactional
	public Usuario findByUser(String userName, String password) {
		return usuarioDao.findByUserNameAndPasswordAndEstado(userName, password, "A");
	}

}
