package dataObjects;

public enum Currency {
	GBP("Pounds Sterling"),
	USD("US Dollars"),
	EUR("Euros");
	 
    private String text;
 
    Currency(String text) {
        this.text = text;
    }
 
    public String getText() {
        return text;
    }
}
