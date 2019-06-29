package surprise;

public class BagFactory implements IBagFactory{

	private IBag bag;


	public IBag makeBag(String type) {
		if(type.equalsIgnoreCase("Random")){
			this.bag = new RandomBag();
		}
		else if(type.equalsIgnoreCase("Fifo")) {
			this.bag = new FifoBag();
		}
		else if(type.equalsIgnoreCase("Lifo")){
			this.bag = new LifoBag();
		}else {
			System.out.println("Please write type of bag: RANDOM or FIFO or LIFO.");
		}
		return this.bag;
	}
	
	/*public IBag makeBag(String type) {
	switch(type) {
		case "RANDOM" :
			return new RandomBag();
		case "FIFO":
			return new FifoBag();
		case "LIFO":
			return new LifoBag();
		default:{
			System.out.println("Please write type of bag: RANDOM or FIFO or LIFO.");
			return null;
		}
	}
}*/
}
