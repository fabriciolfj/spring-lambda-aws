package com.github.fabriciolfj.awslambda;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.function.context.FunctionalSpringApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Supplier;

@SpringBootApplication
public class AwsLambdaApplication {

	public static void main(String[] args) {
		FunctionalSpringApplication.run(AwsLambdaApplication.class, args);
	}

	@Bean
	public Supplier<Customer> customerSupplier() {
		return () -> Customer
				.builder()
				.document("33967386855")
				.name("Lucas")
				.build();
	}

}
