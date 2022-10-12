package com.bolsadeideas.springboot.di.app.models.service;


/*Singletone*/
//@Component("miServicioComplejo")
public class MiServicioComplejo implements IServicio {
	
	@Override
	public String operacion() {
		return "Ejectuando algún proceso complejo";
	}
}
