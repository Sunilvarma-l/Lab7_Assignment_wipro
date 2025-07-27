package ArrayEx;
import java.util.Arrays;
public class StringArray {
	public static void main(String[] args) {
		String[] Products= {"laptop","mobile","ear buds","speaker","smart watch","camera"};
		
		Arrays.sort(Products);
		
		System.out.println("soretd products:");
		for(String x :Products) {
			System.out.println(x);
		}
		
	}

}
