package alg22no;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ders28_arraylist_giris {

	public static void main(String[] args) {
		// Listeler
		ArrayList<Integer> liste = new ArrayList<>(); //Integer sınıf tipi olmalı
		liste.add(3);
		liste.add(0);
		liste.add(3);
		liste.add(5);
		liste.add(7);
		
		System.out.println(liste);
		//System.out.println(liste.toString());
		
		liste.add(9);
		System.out.println(liste);
		
		liste.add(0, 1);// 0. indise ekler kalanları kaydırır
		System.out.println(liste);
		
		liste.add(3, 4);
		System.out.println(liste);
		
		System.out.println(liste.size());
		
		System.out.println(liste.get(7));
		System.out.println(liste.get(liste.get(4)-3));
		
		liste.remove(7);
		System.out.println(liste);
		
		liste.remove(3);
		System.out.println(liste);
		
		liste.clear(); //tüm elemanları siler
		System.out.println(liste);
		
		Random r = new Random();
		
		for(int i=0;i<10;i++) liste.add(r.nextInt(10));
		System.out.println(liste);
		
		ArrayList<Integer> clone_liste = new ArrayList<>();
		clone_liste = (ArrayList<Integer>) liste.clone();
		System.out.println(clone_liste);
		
		System.out.println(liste.indexOf(1));
		
		liste.set(0, 0);
		liste.set(1, 1);
		System.out.println(liste);
		
		//shuffle
		Collections.shuffle(liste);
		System.out.println(liste);
		
	}

}
