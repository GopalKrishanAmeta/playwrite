package com.demo.playwright;

import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
 
public class PlayWright_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Playwright playwright = Playwright.create();
		
	 Browser browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	 
	 Page page = browser.newPage();
	 
	 page.navigate("https://cadautest.demoe2.com/");
	 
	 System.out.println(page.title());
	 
	 page.locator("//*[@id=\"main-container\"]/header/div[1]/div/div[3]/ul/li[4]/a/img").click();
	 
	 page.locator("//*[@id=\"user_name\"]").type("07071992");
	 
	 page.locator("//*[@id=\"password\"]").type("123456");
		
 
	 
	}

}
