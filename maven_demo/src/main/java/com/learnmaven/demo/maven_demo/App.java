package com.learnmaven.demo.maven_demo;

/**
 * Hello world!
 *
 */
import org.apache.log4j.Logger;

public class App {
	final static Logger LOGGER = Logger.getLogger(App.class);

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		LOGGER.debug(cal.add(1, 2));
		LOGGER.debug(cal.subtract(3, 2));
		LOGGER.debug(cal.multiply(4, 2));
		LOGGER.debug(cal.divide(10, 2));

	}
}
