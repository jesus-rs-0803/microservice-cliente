package com.bootcam.model;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Bussines {
	    @Id
		private String ruc;
	    
	    @NotNull
		private String razonSocial;
	    
	    @NotNull
		private String direccion;
	    
	    
	    public String getRuc() {
	        return ruc;
	    }

	    public void setRuc(String ruc) {
	        this.ruc = ruc;
	    }

	    public String getRazonSocial() {
	        return razonSocial;
	    }

	    public void setRazonSocial(String razonSocial) {
	        this.razonSocial = razonSocial;
	    }

	    public String getDireccion() {
	        return direccion;
	    }

	    public void setDireccion(String direccion) {
	        this.direccion = direccion;
	    }

	    public Bussines update(Bussines entity) {
	        this.razonSocial = entity.getRazonSocial();
	        this.direccion = entity.getDireccion();
	       
	        return this;
	    }
	    	

}
