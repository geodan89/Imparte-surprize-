package surprise;
import java.util.Random;

public class FortuneCookie implements ISurprise {

	private String text;
	private static String[] array = {"1. La plăcinte înainte, la război înapoi.\n",  
			"2. La pomul lăudat să nu te duci cu sacul.\n", 
			"3. Lacomului nu-i ajunge, Oltu-n gură de i-ar curge.\n", 
			"4. La/în tot răul este și un bine.\n", 
			"5. La omul sărac, nici boii nu trag.\n",
			"6. Lauda de sine nu miroase a bine.\n" ,
			"7. Laudă-mă gură, că ți-oi da friptură.\n", 
			"8. Lenea e cucoană mare, care cere de mâncare.\n",  
			"9. Leneșul mai mult aleargă și zgârcitul (scumpul) mai mult păgubește.\n",
			"10. Lăcomia pierde omenia.\n", 
			"11. Lăcusta nu are milă de bucate.\n", 
			"12. Lemnul strâmb te necăjește, / omul prost te-mbătrânește.\n",
			"13. Lucrul, odată început, e pe jumătate făcut.\n", 
			"14. Lupul cu slugi nu face gâtul gros.\n",  
			"15. Lupul lup rămâne.\n" , 
			"16. Lupu-și schimbă părul, dar năravul ba.\n",  
			"17. Lumea muncește și sapă și eu duc câinii la apă.\n",
			"18. Nu aduce anul/ziua ce aduce ceasul/ora.\n",
			"19. N-ai carte, n-ai parte.\n",
			"20. Nu da vrabia din mână pentru cioara de pe gard.\n"};
		
	private FortuneCookie (String message) {
		this.text = message;
	}
	
	@Override
	public void enjoy() {
		System.out.println("Mesajul acestei prajituri surpriza este: " + this.text+" ");
	}
	
	public static FortuneCookie generate() {
		Random random = new Random();
		int n = random.nextInt(array.length);
		FortuneCookie s1 = new FortuneCookie(array[n]);
		return s1;
	}
	
	public String toString() {
		return String.format("Fortune Cookie: "+this.text);
	}
}
