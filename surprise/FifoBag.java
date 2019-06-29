package surprise;

import java.util.ArrayList;

public class FifoBag implements IBag{
	
	private ArrayList<ISurprise> fifoList;
	
	public FifoBag() {
		this.fifoList = new ArrayList<ISurprise>();
	}
	
	public FifoBag(int n) {
		this.fifoList = new ArrayList<ISurprise>(n);
	}
	@Override
	// adds a surprise in the bag
	public void put(ISurprise newSurprise) {
		this.fifoList.add(newSurprise);
	}

	@Override
	// adds all the surprises from another IBag
	// -> the 'bagOfSurprises' will be empty() afterwards
	public void put(IBag bagOfSurprises) {
		while(bagOfSurprises.size() != 0) {
			ISurprise s = bagOfSurprises.takeOut();
			this.fifoList.add(s);
		}
	}

	@Override
	// removes a surprise from the bag and returns it
	public ISurprise takeOut() {
		ISurprise s = this.fifoList.get(0);
		this.fifoList.remove(s);
		//s.toString();
		return s;
	}

	@Override
	// Checks if the bag is empty or not
	public boolean isEmpty() {
		if(this.fifoList.size() == 0) {
			System.out.println("True");
			return true;
		}
		System.out.println("False");
		return false;
	}

	@Override
	// Returns the number of surprises
	public int size() {
		System.out.println(this.fifoList.size());
		return this.fifoList.size();
	}
	
	public void print() {
		for(int i = 0; i < this.fifoList.size(); i++) {
			System.out.println(this.fifoList.get(i) + " ");
		}
		System.out.println();
	}

}
