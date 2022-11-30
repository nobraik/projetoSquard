package steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Test;
import runner.Executar;

public class Steps extends Executar {



@Test
    @Given("que esteja no formulario")
    public void queEstejaNoFormulario() {
        this.iniciarBrowsers();

    }
    @Given("preencho os dados pessoais")
    public void preenchoOsDadosPessoais() {

    }
    @Given("preencho os dados de endereco")
    public void preenchoOsDadosDeEndereco() {

    }
    @Given("preencho os dados de login")
    public void preenchoOsDadosDeLogin() {

    }
    @When("enviar")
    public void enviar() {

    }
    @Then("formulario enviado com sucesso")
    public void formularioEnviadoComSucesso() {

    }

}
