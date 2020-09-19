package core;

public class DriverManagerFactory {

	public static DriverManager getDriverManager(DriverType driverType) {
		DriverManager driverManager;
		switch (driverType) {
		case CHROME: {
			driverManager = new ChromeDriverManager();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + driverType.name());
		}
		
		return driverManager;
	}
}
