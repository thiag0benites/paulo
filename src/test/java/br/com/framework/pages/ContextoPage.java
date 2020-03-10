package br.com.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.framework.config.hooks;

public class ContextoPage {
	
	protected WebDriver driver;
	
	public ContextoPage() {
		driver = hooks.getDriver();
		PageFactory.initElements(driver, this);
	}


}
