package surprise;
import java.util.Random;
import java.util.ArrayList;
public class Main {
	
	private static BagFactory bag;
	//private static String type;
	
	
	//public static IBag makeBag(String type) {
		
	//	return bag.makeBag(type);
	//}

	public static void main(String[] args) {
		FortuneCookie.generate();
		//s2.enjoy();
		ISurprise c1 = Candies.generate();
		//c1.enjoy();
		
		ISurprise m1 = MinionToy.generate();
		//m1.enjoy();
	
		
		IBag bag2 = new LifoBag();
		
		ISurprise s = GatherSurprises.gather();
		//b3.put(s);
		//b3.size();
		
		IBag b5 = new RandomBag();
		b5.put(c1);
		b5.put(m1);;
		b5.size();
		AbstractGiveSurprises g1 = new GiveSurpriseAndSing("fifo", 4);
		ArrayList<ISurprise> s1 = GatherSurprises.gather(4);
		for(int i = 0; i < s1.size();i++) {
			g1.put(s1.get(i));
		}
		g1.isEmpty();
		g1.giveAll();
		
		AbstractGiveSurprises as1 = new GiveSurpriseAndApplause("LIFO", 5);
		ArrayList<ISurprise> s2 = GatherSurprises.gather(6);
		for(int i = 0; i < s2.size();i++) {
			as1.put(s2.get(i));
		}
		as1.isEmpty();
		as1.giveAll();
		
		AbstractGiveSurprises as2 = new GiveSurpriseAndApplause("FIFO", 5);
		ArrayList<ISurprise> s3 = GatherSurprises.gather(10);
		for(int i = 0; i < s3.size();i++) {
			as2.put(s3.get(i));
		}
		as2.isEmpty();
		as2.giveAll();
		
		
}

}
