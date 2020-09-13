package waya_kodtest;

public class main {


	public static void main(String[] args) {

		FruitBasket cherry1 = new FruitBasket("cherry",10.9);
		FruitBasket cherry2 = new FruitBasket("cherry",11.8);
		FruitBasket peach1 = new FruitBasket("peach",12.9);
		FruitBasket peach2 = new FruitBasket("peach",31.8);
		FruitBasket peach3 = new FruitBasket("peach",35.8);

		FruitStand [] stands= new FruitStand [] {new FruitStand("Gothenburg", cherry1, peach3 ), 
				new FruitStand("Kungsbacka", cherry2, peach1),
				new FruitStand("Varberg", cherry1, peach2),
				new FruitStand("Falkenberg", cherry1, peach1), //should be cheapest
				new FruitStand("Halmstad", cherry2, peach2),
				new FruitStand("Helsingborg", cherry1, peach1)
		};

		FruitStand cheapest = smallestTotalCost(stands);
		System.out.println("Staden med billigaste: "+ cheapest.getCityName());
		System.out.println("Körsbär: "+ cheapest.getCherry().getPrice() + " kr " + "Persikor: " + cheapest.getPeach().getPrice()+ " kr");		
	}


	private static FruitStand smallestTotalCost(FruitStand[] stands) {

		FruitStand cheapest = stands[0];

		double smallestPrice = stands[0].getCherry().getPrice() + stands[0].getPeach().getPrice();

		for(FruitStand i : stands ) {

			double cost = i.getCherry().getPrice() + i.getPeach().getPrice();

			if(cost < smallestPrice && cost >= 0) {
				smallestPrice = cost;
				cheapest = i;
			}		
		}

		return cheapest;
	}
}