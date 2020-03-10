package br.com.framework.steps;

import br.com.framework.action.LoginAction;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class LoginSteps {

	// Instaciando a classe Actions para executar as ações na pagina
	LoginAction Login = new LoginAction();

	
	@Dado("^que acesso o site$")
	public void que_acesso_o_site() throws Throwable {
		Login.AcessaSite();
	}

	@Quando("^preenche os dados de login e senha$")
	public void preenche_os_dados_de_login_e_senha() throws Throwable {
		Login.InputUsuario.sendKeys("evans_sp@hotmail.com");
		Login.InputSenha.sendKeys("paulo.0204");
		Login.BtnLogin.click();
	}

	@Então("^Vejo a pagina Home$")
	public void vejo_a_pagina_Home() throws Throwable {
		Login.Login();
	}




}
