package com.api.rest.steps;

import io.cucumber.java.es.Dado;
import io.cucumber.java.pt.Entao;

public class ApiTeste {

    @Dado("que ao buscar {string}")
    public void queAoBuscar(String string) {
        // Write code here that turns the phrase above into concrete actions

    }

    @Entao("que a {string} eo {string} sejam o mesmo.")
    public void queAEoSejamOMesmo(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions

    }
}
