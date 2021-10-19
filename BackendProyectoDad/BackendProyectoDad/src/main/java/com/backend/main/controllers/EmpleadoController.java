package com.backend.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.backend.main.entity.models.Empleado;
import com.backend.main.entity.services.IEmpleadoService;

@RestController
public class EmpleadoController {
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/*").allowedOrigins("*").allowedMethods("GET", "POST", "PUT", "DELETE");
			}
		};
	}
	@Autowired
	IEmpleadoService empleadoService;
	
	@GetMapping("/empleados")
	public List<Empleado> getAllEmpleados(){
		return empleadoService.getAll();
	}
	
	@GetMapping("/empleado/{id}")
	public Empleado getOne(@PathVariable(value = "id") long id) {
		return empleadoService.get(id);
	}
}
