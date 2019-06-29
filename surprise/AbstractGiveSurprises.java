package surprise;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;

public abstract class AbstractGiveSurprises extends BagFactory{
	
	private IBag bag;
	private int waitTime;
	private ISurprise s;
	
	public AbstractGiveSurprises(String type, int waitTime) {
		
		this.bag = makeBag(type);
		this.waitTime = waitTime;
	}
	
	/*public AbstractGiveSurprises(String type, int waitTime) {
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
		this.waitTime = waitTime;
	}*/
	
	////Adauga o noua surpriza in container.
	public void put(ISurprise newSurprise) {
		this.bag.put(newSurprise);
		
	}
	
	//Muta toate surprizele din container-ul parametru in acest container.
	void put(IBag surprises) {
		this.bag.put(surprises);
	}
	
	//Ofera o surpriza. Obs: ordinea de distribuire a surprizelor depinde de tipul tolbei.
	public void give() {
		giveWithPassion();
		this.bag.takeOut().enjoy();
	}
	
	//Ofera toate surprizele din tolba, pe rand.
	//Dupa fiecare surpriza oferita, se asteapta un interval de timp corespunzator waitTime.
	protected void waitTime() {
		try {
			  TimeUnit.SECONDS.sleep(waitTime); 
			} catch (InterruptedException e) {
			  e.printStackTrace();
			}
	}
	
	public ISurprise giveAll() {
		while(this.bag.size()>0) {
			 give();
			waitTime();
		}
		return this.s;
	}
	
	//Intoarce true daca tolba este goala, false altfel.
	public boolean isEmpty() {
		return this.bag.isEmpty();
	}
	
	public IBag get() {
		return this.bag;
	}
	
	public void print() {
		this.bag.print();
	}
	
	protected abstract void giveWithPassion();
}
