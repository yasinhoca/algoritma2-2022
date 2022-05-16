package alg22no;

import java.util.ArrayList;
import java.util.Collections;

public class ders29_sayisal_loto {

	public static void main(String[] args) {
		// 1-49 arasýnda tekrar etmeyen 6 sayý seçelim
		// listeler kullanýlacak
		
		ArrayList<Integer> liste = new ArrayList<>();
		
		for(int i=1;i<50;i++) liste.add(i);
		System.out.println(liste);
		
		Collections.shuffle(liste);
		System.out.println(liste);
		
		ArrayList<Integer> altili = new ArrayList<>(6); // maximum 6 eleman alacaðýný belirttik
		for(int i=0;i<6;i++) altili.add(liste.get(i)); //karýlmýþ listenin ilk 6 elemanýný aldýk
		
		Collections.sort(altili); //sýralama yaptýk
		System.out.println(altili);
		

	}

}
