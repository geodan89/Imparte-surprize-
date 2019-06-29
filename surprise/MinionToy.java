package surprise;

import java.util.Random;

public class MinionToy implements ISurprise {
	
	private String minionName;
	private static String[] array = {"Dave", "Carl", "Kevin", "Stuart", "Jerry", "Tim"};
	private static int counter;
	
	private MinionToy(String minionName) {
		this.minionName = minionName;
	}
	@Override
	public void enjoy() {
		System.out.println("Surprise!!! You have received minion: " + this.minionName + "! ");
	}

	public static MinionToy generate() {
		MinionToy m1 = new MinionToy(array[counter]);
		counter++;
		if(counter == array.length) {
			counter = 0;
		}
		return m1;
	}
	
	public String toString() {
		return String.format("Minion name: "+this.minionName);
	}
}
