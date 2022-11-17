package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ranjit1\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver r=new ChromeDriver();
		r.get("https://www.google.com/");
		Thread.sleep(3000);
		r.get("https://www.amazon.in/?ie=UTF8&tag=googinprimeexpt5-21&ascsubtag=_k_CjwKCAjw1ICZBhAzEiwAFfvFhGsn7DIkIJCMgxZCqq-ivepnHldr-DYtryO-kE3_Y4FPRACkvANPshoC7o4QAvD_BwE_k_&gclid=CjwKCAjw1ICZBhAzEiwAFfvFhGsn7DIkIJCMgxZCqq-ivepnHldr-DYtryO-kE3_Y4FPRACkvANPshoC7o4QAvD_BwE");
		Thread.sleep(3000);
		r.navigate().back();
		Thread.sleep(2000);
		r.navigate().forward();
		r.navigate().refresh();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 

	}

}
