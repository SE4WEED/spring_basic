package com.mjkimspring.learnspringframework.examples.f1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class SomeClass{
	
	
}



@Configuration
@ComponentScan
public class PrePostAttotationsContextLauncherApplication {
	
	public static void main(String[] args) {

		try(var context = 
				new AnnotationConfigApplicationContext
				(PrePostAttotationsContextLauncherApplication.class)){
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
		}
	}
}
