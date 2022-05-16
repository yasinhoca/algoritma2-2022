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
		for(int i:liste) { //l listesinin elemanlar�n� tek tek al�p i de�i�kenine atar
			toplam += i;
		}
		return toplam;
	}
	

	public static void main(String[] args) {
		// 50 ile 100 aras�nda rastgele 100
		// say�dan olu�an bir listenin i�erisinde 
		// 5'e tam b�l�nen say�lar� yeni bir listeye aktar�n�z
		// ortalamas�n� bulunuz?
		// method kullanarak ��zelim
		ArrayList<Integer> l = uret(50, 100, 10);
		System.out.println(l);
		ArrayList<Integer> b = bolunen(5, l);
		System.out.println(b);
		
		System.out.println(toplam(b));
		System.out.println((float)toplam(b)/b.size());
		
	}

}
