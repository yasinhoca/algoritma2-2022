package alg22no;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ders32_listeSoru1 {
	
	static ArrayList<Integer> uret(int baslangic,int bitis,int adet){
		ArrayList<Integer> l = new ArrayList<>();
		Random r = new Random();
		for(int i=0;i<adet;i++) l.add(r.nextInt(bitis-baslangic)+baslangic);
		return l;
	}
	
	static ArrayList<Integer> bolunen(int bolunecek,ArrayList<Integer> l){
		ArrayList<Integer> b = new ArrayList<>();
		for(int i=0;i<l.size();i++) {
			if(l.get(i)%bolunecek==0) b.add(l.get(i));
		}
		return b;
	}
	
	static int toplam(ArrayList<Integer> liste){
		int toplam = 0;
		for(int i:liste) { //l listesinin elemanlarýný tek tek alýp i deðiþkenine atar
			toplam += i;
		}
		return toplam;
	}
	

	public static void main(String[] args) {
		// 50 ile 100 arasýnda rastgele 100
		// sayýdan oluþan bir listenin içerisinde 
		// 5'e tam bölünen sayýlarý yeni bir listeye aktarýnýz
		// ortalamasýný bulunuz?
		// method kullanarak çözelim
		ArrayList<Integer> l = uret(50, 100, 100);
		System.out.println(l);
		ArrayList<Integer> b = bolunen(5, l);
		System.out.println(b);
		
		System.out.println(toplam(b));
		System.out.println((float)toplam(b)/b.size());
		
	}

}
