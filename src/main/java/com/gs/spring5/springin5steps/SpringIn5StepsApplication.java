package com.gs.spring5.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication
				.run(SpringIn5StepsApplication.class, args);
		BinarySearchImpl binarySearchImpl = context.getBean(BinarySearchImpl.class);

		int search = binarySearchImpl.binarySearch(new int[]{10, 1, 6}, 10);
		System.out.println(search);

	}
}
