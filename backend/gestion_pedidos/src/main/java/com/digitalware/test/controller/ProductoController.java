package com.digitalware.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.digitalware.test.dao.IProductoDao;
import com.digitalware.test.model.Producto;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api/producto")
public class ProductoController {
	@Autowired
	private IProductoDao productoDao;

	@GetMapping("/getProductos")
	@ResponseStatus(code = HttpStatus.OK)
	public List<Producto> getProductos() {
		return productoDao.findAll();
		
	}

}
