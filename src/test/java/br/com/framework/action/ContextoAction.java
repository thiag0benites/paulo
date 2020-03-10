package br.com.framework.action;

import br.com.framework.config.hooks;
import br.com.framework.generics.GenericMethods;
import br.com.framework.pages.ContextoPage;

public class ContextoAction extends ContextoPage{
	String url = "https://github.com/login";
	GenericMethods generic = new GenericMethods(driver, hooks.getScenario());


	public void acessarSistema() {
		driver.navigate().to(url);
		generic.aguardar(10);
	}
}
