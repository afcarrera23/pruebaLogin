package com.digitalware.test.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.digitalware.test.model.Cliente;
import com.digitalware.test.service.IClienteService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
	
	@Autowired
	private IClienteService clienteService;

	@GetMapping("/getClientes")
	@ResponseStatus(code = HttpStatus.OK)
	public List<Cliente> getClientes() {
		return clienteService.findAll();
		
	}
}