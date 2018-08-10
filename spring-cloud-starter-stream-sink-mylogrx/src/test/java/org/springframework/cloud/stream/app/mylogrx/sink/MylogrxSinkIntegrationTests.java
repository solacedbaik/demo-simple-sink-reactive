/*
 * 
 * Copyright (c) 2018 Solace Corp.
 * 
 */

package org.springframework.cloud.stream.app.mylogrx.sink;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Integration Tests for the Converter Processor.
 *
 * @author Solace Corp.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@DirtiesContext
@SpringBootTest
public abstract class MylogrxSinkIntegrationTests {


	/**
	 * Validates that the module loads with default properties.
	 */
	public static class UsingNothingIntegrationTests extends MylogrxSinkIntegrationTests {

		@Test
		public void test() {
		}
	}

	@SpringBootApplication
	public static class MylogrxSinkApplication {
		public static void main(String[] args) {
			SpringApplication.run(MylogrxSinkApplication.class, args);
		}
	}

}
