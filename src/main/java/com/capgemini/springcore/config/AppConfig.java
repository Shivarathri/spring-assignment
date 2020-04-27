package com.capgemini.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.capgemini.springcore.beans.Car;
import com.capgemini.springcore.beans.Engine;

@Configuration
public class AppConfig {
	@Bean
	public Car getCar() {
		Car car =new Car();
		car.setId(111);
		car.setName("Innova");
		return car;
	}
	@Bean
	@Scope("prototype")
	public Engine getEngine() {
		Engine engine = new Engine();
		engine.setEngNo(123);
		engine.setEngName("Innova Engine");
		return engine;
	}
	
	
}
