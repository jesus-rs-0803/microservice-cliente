package com.bootcam.entities;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

import lombok.Data;

public class Client implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String name;
	
	

}
