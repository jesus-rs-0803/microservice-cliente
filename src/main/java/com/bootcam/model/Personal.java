package com.bootcam.model;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Personal {
	
	@Id
	private String dni;
	
	@NotNull
	private String nombre;
	
	@NotNull
	private String direccion;
	
	
	
	 public String getDni() {
	        return dni;
	    }

	    public void setDni(String dni) {
	        this.dni = dni;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getDireccion() {
	        return direccion;
	    }

	    public void setDireccion(String direccion) {
	        this.direccion = direccion;
	    }


}
