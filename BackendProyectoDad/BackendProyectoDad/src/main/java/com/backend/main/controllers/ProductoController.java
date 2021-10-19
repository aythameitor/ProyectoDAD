package com.backend.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.backend.main.entity.models.Producto;

import com.backend.main.entity.services.IProductoService;
@RestController
public class ProductoController {
	@Autowired
	IProductoService productoService;
	
	@GetMapping("/productos")
	public List<Producto> getAllEmpleados(){
		return productoService.getAll();
	}
	
	@GetMapping("/producto/{id}")
	public Producto getOne(@PathVariable(value = "id") long id) {
		return productoService.get(id);
	}
}
