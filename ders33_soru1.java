package alg22no;

import java.util.ArrayList;
import java.util.Random;

public class ders33_soru1 {
	
	static ArrayList uret(int bs,int bt,int adet) {
		ArrayList<Integer> s = new ArrayList();
		Random r = new Random();
		for(int i=0;i<adet;i++) s.add(r.nextInt(bt-bs)+bs);
		return s;
	}

	public static void main(String[] args) {
		ArrayList<Integer> s = uret(78,81,20);
		System.out.println(s);
	}

}
