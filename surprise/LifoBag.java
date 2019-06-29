package surprise;

import java.util.ArrayList;
import java.util.Random;

public class LifoBag implements IBag{

	private ArrayList<ISurprise> lifoList;
	
	public LifoBag() {
		this.lifoList = new ArrayList<ISurprise>();
	}
	@Override
	// adds a surprise in the bag
	public void put(ISurprise newSurprise) {
		this.lifoList.add(newSurprise);
	}

	@Override
	// adds all the surprises from another IBag
	// -> the 'bagOfSurprises' will be empty() afterwards
	public void put(IBag bagOfSurprises) {
		while(bagOfSurprises.size() != 0) {
			ISurprise s = bagOfSurprises.takeOut();
			this.lifoList.add(s);
		}
	}

	@Override
	// removes a surprise from the bag and returns it
	public ISurprise takeOut() {
		ISurprise s = this.lifoList.get(this.lifoList.size()-1);
		this.lifoList.remove(s);
		//s.toString();
		return s;
	}

	@Override
	// Checks if the bag is empty or not
	public boolean isEmpty() {
		if(this.lifoList.size() == 0) {
			System.out.println("True");
			return true;
		}
		System.out.println("False");
		return false;
	}

	@Override
	// Returns the number of surprises
	public int size() {
		System.out.println(this.lifoList.size());
		return this.lifoList.size();
	}
	public void print() {
		for(int i = 0; i < this.lifoList.size(); i++) {
			System.out.println(this.lifoList.get(i) + " ");
		}
		System.out.println();
	}
}
