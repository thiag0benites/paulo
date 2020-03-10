package br.com.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import br.com.framework.config.hooks;

public class LoginPage {

	protected WebDriver driver;

	
	public LoginPage() {
		driver = hooks.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "login_field")
	public WebElement InputUsuario;
	
	@FindBy(id = "password")
	public WebElement InputSenha;
	
	@FindBy(name = "commit")
	public WebElement BtnLogin;
	
	@FindBy(className = "a.btn.btn-sm.btn-primary.text-white")
	public WebElement BtnNew;
	
	@FindBy(css = "div.auth-form-body.mt-3")
	public WebElement FormLogin;
	
	
	

}
