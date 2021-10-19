package com.backend.main.entity.services;

import java.util.List;

import com.backend.main.entity.models.Empleado;

public interface IEmpleadoService {
	public Empleado get(long id);
	public List<Empleado> getAll();
	public void post(Empleado empleado);
	public void put(Empleado empleado, long id);
	public void delete(long id);
	
}
