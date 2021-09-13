package com.digitalware.test.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.digitalware.test.model.Producto;

public interface IProductoDao extends CrudRepository<Producto, Long> {
		
		public List<Producto> findAll();
		
}
