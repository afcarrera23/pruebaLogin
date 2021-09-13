package com.digitalware.test.dao;

import org.springframework.data.repository.CrudRepository;

import com.digitalware.test.model.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {
	
	public Usuario findByUserNameAndPasswordAndEstado(String userName, String password, String estado);

}
