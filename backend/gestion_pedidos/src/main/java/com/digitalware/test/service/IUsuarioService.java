package com.digitalware.test.service;

import com.digitalware.test.model.Usuario;

public interface IUsuarioService {
	
	public Usuario findByUser(String userName, String password);

}
