package com.bolsadeideas.springboot.di.app.models.service;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/*Singletone*/
@Component("miServicioComplejo")
@Primary
public class MiServicioComplejo implements IServicio {
	
	@Override
	public String operacion() {
		return "Ejectuando algún proceso complejo";
	}
}
