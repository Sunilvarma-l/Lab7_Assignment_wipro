package ArrayEx;
import java.util.Collections;
import java.util.ArrayList;

public class StringArrayList {
    public static void main(String[] args) {
    	ArrayList<String> Products=new ArrayList();
    	
    	Products.add("laptop");
    	Products.add("mobile");
    	Products.add("speaker");
    	Products.add("smart watch");
    	Products.add("web cam");
    	
    	Collections.sort(Products);
    	
    	System.out.println("soretd products:");
    	for(String x:Products) {
    		System.out.println(x);
    	}
		
	}

}
