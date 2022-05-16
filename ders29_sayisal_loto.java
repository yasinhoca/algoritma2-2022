package alg22no;

import java.util.ArrayList;
import java.util.Collections;

public class ders29_sayisal_loto {

	public static void main(String[] args) {
		// 1-49 aras�nda tekrar etmeyen 6 say� se�elim
		// listeler kullan�lacak
		
		ArrayList<Integer> liste = new ArrayList<>();
		
		for(int i=1;i<50;i++) liste.add(i);
		System.out.println(liste);
		
		Collections.shuffle(liste);
		System.out.println(liste);
		
		ArrayList<Integer> altili = new ArrayList<>(6); // maximum 6 eleman alaca��n� belirttik
		for(int i=0;i<6;i++) altili.add(liste.get(i)); //kar�lm�� listenin ilk 6 eleman�n� ald�k
		
		Collections.sort(altili); //s�ralama yapt�k
		System.out.println(altili);
		

	}

}
