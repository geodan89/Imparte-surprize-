package surprise;

import java.util.Random;

public class Candies implements ISurprise{
	
	private int numberOfCandies;
	private String candiesType;
	private static String[] array = {"chocolate", "jelly", "fruits", "vanilla", "cocos"};
	
	
	private Candies(int nCandies, String candiesType) {
		this.numberOfCandies = nCandies;
		this.candiesType = candiesType;
	}
	@Override
	public void enjoy() {
		System.out.println("Surprise!!! You have received "+ this.numberOfCandies + " of "+ this.candiesType +" candies!");
	}
	@Override
	public String toString() {
		return String.format(this.numberOfCandies+ " "+this.candiesType);
	}
	
	public static Candies generate() {
		Random random = new Random();
		int candiesType = random.nextInt(5);
		int numberOfCandies = random.nextInt(50);
		if(numberOfCandies == 0) {
			numberOfCandies = random.nextInt(50);
		}
		Candies c1 = new Candies(numberOfCandies, array[candiesType]);
		return c1;
	}
}
