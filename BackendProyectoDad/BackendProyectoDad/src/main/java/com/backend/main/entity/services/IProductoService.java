package com.backend.main.entity.services;

import java.util.List;

import com.backend.main.entity.models.Empleado;
import com.backend.main.entity.models.Producto;

public interface IProductoService {
	public Producto get(long idproducto);
	public List<Producto> getAll();

}
