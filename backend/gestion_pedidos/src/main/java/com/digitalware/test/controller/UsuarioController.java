package com.digitalware.test.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digitalware.test.model.Usuario;
import com.digitalware.test.service.IUsuarioService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {
	
	@Autowired
	private IUsuarioService usuarioService;

	@PostMapping("/getUsuario")
	public ResponseEntity<?> getUsuario(@RequestBody Usuario usuario) {
		
		Map<String, Object> response = new HashMap<>();
		Usuario user = null;
		
		try {			
			user = usuarioService.findByUser(usuario.getUserName(), usuario.getPassword());			
		} catch(DataAccessException e) {
			response.put("mensaje", "Error al realizar la consulta del usuario en la bd");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
		}
		
		if (user == null) {
			response.put("mensaje", "El usuario:".concat(usuario.getUserName().concat(" no existe en la base de datos")));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Usuario>(user, HttpStatus.OK);
	}
	
}
