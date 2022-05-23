package alg22no;

import java.util.ArrayList;
import java.util.Random;

public class ders34_soru2 {

	static String uret(int hs) {
		String s="";
		Random r = new Random();
		int bk;
		char harf;

		for(int i=0;i<hs;i++) {
			bk= r.nextInt(2);
			if(bk==0) {
				harf=(char)((char) r.nextInt(26)+97);
			} else {
				harf=(char)((char) r.nextInt(26)+65);
			}
			s+=harf;
		}
		return s;
	}
	
	static int bul(char b,char k,ArrayList<String> s) {
		int sayac=0;
		for(int i=0;i<s.size();i++) {
			if(s.get(i).charAt(0)==k||s.get(i).charAt(0)==b) sayac++;
		}
		return sayac;
	}


	public static void main(String[] args) {
		ArrayList<String> s = new ArrayList<>();
		for(int i=0;i<1000;i++) s.add(uret(5));
		
		System.out.println(s);
		
		
		System.out.println(bul('Z','z',s));
		
	}

}
