package com.spring.practise.Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringAnnotations.xml");
		Shape shape = (Shape) context.getBean("circle");
		shape.draw();

	}

}
