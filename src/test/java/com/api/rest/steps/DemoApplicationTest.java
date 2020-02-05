package com.api.rest.steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import io.cucumber.java.pt.Entao;

public class DemoApplicationTest {
	private static final Logger LOG = LoggerFactory.getLogger(DemoApplicationTest.class);

	@Before
	public void setUp() {
		LOG.info("-------------- Spring Context Initialized For Executing Cucumber Tests --------------");
	}

	@Dado("que ao buscar {string}")
	public void queAoBuscar(String string) {
		// Write code here that turns the phrase above into concrete actions
		LOG.info("- OK-1 -");

	}

	@Entao("que a {string} eo {string} sejam o mesmo.")
	public void queAEoSejamOMesmo(String string, String string2) {
		// Write code here that turns the phrase above into concrete actions
		LOG.info("- OK-1 -");

	}
}
