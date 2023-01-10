package com.game.gamerunner;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GameRunnerApplication {

	public static void main(String[] args) {
		try (
				AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(GameRunnerConfiguration.class);
		){
			System.out.println(applicationContext.getBean("MarioGame"));
		}

	}

}
