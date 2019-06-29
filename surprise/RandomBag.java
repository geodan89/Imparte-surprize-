package surprise;
import java.util.ArrayList;
import java.util.Random;

public class RandomBag implements IBag {
	
	
	
	private ArrayList<ISurprise> randomList;
	
	public RandomBag() {
		this.randomList = new ArrayList<ISurprise>();
	}
	
	@Override
	// adds a surprise in the bag
	public void put(ISurprise newSurprise) {
		this.randomList.add(newSurprise);
	}

	@Override
	// adds all the surprises from another IBag
	// -> the 'bagOfSurprises' will be empty() afterwards
	public void put(IBag bagOfSurprises) {
		while(bagOfSurprises.size() != 0) {
			ISurprise s = bagOfSurprises.takeOut();
			this.randomList.add(s);
		}
	}

	@Override
	// removes a surprise from the bag and returns it
	public ISurprise takeOut() {
		Random random = new Random();
		int n = random.nextInt(this.randomList.size());
		ISurprise s = this.randomList.get(n);
		this.randomList.remove(s);
		//s.toString();
		return s;
	}

	@Override
	// Checks if the bag is empty or not
	public boolean isEmpty() {
		if(this.randomList.size() == 0) {
			System.out.println("True");
			return true;
		}
		System.out.println("False");
		return false;
	}

	@Override
	// Returns the number of surprises
	public int size() {
		System.out.println(this.randomList.size());
		return this.randomList.size();
	}
	
	public void print() {
		for(int i = 0; i < this.randomList.size(); i++) {
			System.out.println(this.randomList.get(i) + " ");
		}
		System.out.println();
	}
}
