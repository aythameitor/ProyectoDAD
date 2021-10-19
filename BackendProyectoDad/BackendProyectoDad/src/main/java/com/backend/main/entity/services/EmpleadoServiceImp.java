package com.backend.main.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.main.entity.dao.IEmpleadoDao;
import com.backend.main.entity.models.Empleado;

@Service
public class EmpleadoServiceImp implements IEmpleadoService{
	@Autowired
	private IEmpleadoDao empleadoDao;
	@Override
	public Empleado get(long id) {

		return empleadoDao.findById(id).get();
	}

	@Override
	public List<Empleado> getAll() {

		return (List<Empleado>) empleadoDao.findAll();
	}

	@Override
	public void post(Empleado empleado) {
		empleadoDao.save(empleado);
		
	}

	@Override
	public void put(Empleado empleado, long id) {
		
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

}
