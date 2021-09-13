package com.digitalware.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.digitalware.test.dao.IProductoDao;
import com.digitalware.test.model.Producto;

@Service
public class ProductoServiceImpl implements IProductoService {

		@Autowired
		private IProductoDao productoDao;
		
		@Override
		@Transactional(readOnly = true) 
		public List<Producto> findAll() {
			return productoDao.findAll();
		}

}
