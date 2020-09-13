package waya_kodtest;


public class FruitStand {
	
	private String cityName;
	private FruitBasket cherry;
	private FruitBasket peach;

	
	public FruitStand(String cityName,FruitBasket cherry, FruitBasket peach ) {
		this.cityName = cityName;
		this.cherry = cherry;
		this.peach = peach;
	}	
	public String getCityName() {return cityName;}
	
	public FruitBasket getCherry() {return cherry;}
	
	public FruitBasket getPeach() {	return peach;}
	
}
