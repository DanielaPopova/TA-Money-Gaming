package core;

public enum Url {
	MONEY_GAMING("https://moneygaming.qa.gameaccount.com");
 
    private String url;
 
    Url(String url) {
        this.url = url;
    }
 
    public String getUrl() {
        return url;
    }
}
