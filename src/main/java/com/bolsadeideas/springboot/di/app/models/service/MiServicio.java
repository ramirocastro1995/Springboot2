package com.bolsadeideas.springboot.di.app.models.service;


import org.springframework.stereotype.Component;

/*Singletone*/
@Component("miServicioSimple")
public class MiServicio implements IServicio {
	
	@Override
	public String operacion() {
		return "Ejectuando algún proceso simple..";
	}
}
