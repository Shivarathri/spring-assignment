package com.capgemini.springcore.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.springcore.beans.Car;
import com.capgemini.springcore.config.AppConfig;

public class AnnotationBased {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext contex = new AnnotationConfigApplicationContext(AppConfig.class);
		Car car = contex.getBean(Car.class);
		car.print();
	}
}
