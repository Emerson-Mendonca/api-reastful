package com.api.rest.steps;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import io.cucumber.java.pt.Entao;



@RunWith(SpringRunner.class)
@SpringBootTest
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
		LOG.info("- OK-2 -");

	}
}
