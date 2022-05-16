package alg22no;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ders30_stringListe {

	public static void main(String[] args) {
		ArrayList<String> liste = 
				new ArrayList<>(Arrays.asList("ali","betül","cihan"));
		
		System.out.println(liste);
		
		liste.add("deniz");
		liste.add("elif");
		liste.add("cihan");
		System.out.println(liste);
		
		System.out.println(liste.indexOf("cihan"));
		
		System.out.println(liste.get(liste.get(0).length()));
		
		System.out.println(liste.get(4).charAt(0));
		
		liste.add(0,"zeynep");
		liste.add(1,"alkan");
		liste.add(5,"0Zeki");
		liste.add(0,"_zeynep");
		System.out.println(liste);
		Collections.sort(liste);
		System.out.println(liste);
		
		for(String isim:liste) {
			System.out.println(isim);
		}
		
	}

}
