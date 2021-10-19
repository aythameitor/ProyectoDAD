package com.backend.main.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.backend.main.entity.models.Empleado;

public interface IEmpleadoDao extends CrudRepository<Empleado, Long>{
	
}
