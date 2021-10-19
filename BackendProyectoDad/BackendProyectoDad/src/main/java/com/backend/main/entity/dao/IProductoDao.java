package com.backend.main.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.backend.main.entity.models.Producto;

public interface IProductoDao extends CrudRepository<Producto, Long>{

}
