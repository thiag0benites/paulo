package br.com.framework.action;

import br.com.framework.config.hooks;
import br.com.framework.generics.GenericMethods;
import br.com.framework.pages.LoginPage;
import cucumber.api.Scenario;

//Estender a classe Pages
public class LoginAction extends LoginPage {

	Scenario scenario = hooks.getScenario();
	// Instanciar os métodos genéricos para serem utilizados nesta classe
	GenericMethods generic = new GenericMethods(driver, scenario);

	public void AcessaSite() {
		driver.navigate().to("https://github.com/login");
		generic.aguardar(5);
	}

	public void Login() {
		generic.escreveRelatorio(true, "OK", true);
	}

}
