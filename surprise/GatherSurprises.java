package surprise;
import java.util.Random;
import java.util.ArrayList;
public final class GatherSurprises {
	
	
	private static ISurprise surprise;
	//private static ArrayList<ISurprise> surpriseList;

	
	private GatherSurprises() {
	}
	
	public static ArrayList<ISurprise> gather(int n) {
		ArrayList<ISurprise> surpriseList = new ArrayList<ISurprise>(n);
		for(int i = 0; i < n; i++) {
			surpriseList.add(gather());
		}
		return surpriseList;
	}
	
	public static ISurprise gather() {
		Random random = new Random();
		int n = random.nextInt(3);
		switch(n) {
			case 0:{
				 surprise = Candies.generate();
				break;
			}
			case 1:{
				surprise = FortuneCookie.generate();
				break;
			}
			case 2:{
				surprise = MinionToy.generate();
				break;
			}
		}
		return surprise;
	}
}
