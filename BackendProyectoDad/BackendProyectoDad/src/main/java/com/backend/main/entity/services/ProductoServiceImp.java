package com.backend.main.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.main.entity.dao.IProductoDao;
import com.backend.main.entity.models.Empleado;
import com.backend.main.entity.models.Producto;

@Service
public class ProductoServiceImp implements IProductoService{
	@Autowired
	private IProductoDao productoDao;
	@Override
	public Producto get(long id) {
		
		return productoDao.findById(id).get();
	}

	@Override
	public List<Producto> getAll() {
		
		return (List<Producto>) productoDao.findAll();
	}

}
