package tests;

public class Config {

	public static final String baseUrl = System.getProperty("baseUrl", "http://the-internet.herokuapp.com");
	public static final String browser = System.getProperty("browser", "firefox");
	public static final String host = System.getProperty("host", "saucelabs");
	public static final String browserVersion = System.getProperty("browserVersion", "50");
	public static final String platform = System.getProperty("platform", "Windows 10");
	public static final String sauceUser = "arviv";
	public static final String sauceKey = "61813363-a7ac-4f55-a975-7a7a60e2c6d5";
}