package util;

public class CurrencyConverter {
	public double dollar_price;
	public double dollar_comp;
	public static double iof = .06;
	
	public double resultado() {
		return dollar_price * dollar_comp * (1 + iof);
	}
}
