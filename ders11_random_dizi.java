package alg22no;

import java.util.Random;

public class ders11_random_dizi {

	public static void main(String[] args) {
		// 0-100 arasýnda rastgele sayýlý 
		// 1000 elemanlý dizi oluþturalým
		int[] dizi = new int[10000];
		Random r = new Random();
		int adet,toplam;
		adet = toplam = 0;

		for(int i=0;i<dizi.length;i++) {
			dizi[i] = r.nextInt(100);
			System.out.print(dizi[i]+"  ");
			if(dizi[i]%10==0) {
				adet++;
				toplam += dizi[i];
			}
		}

		System.out.println("\n10'a bölünen sayý adedi = "+adet);
		System.out.println("Toplam = "+toplam);
		if(adet>0) {
			float ort = (float)toplam/adet;
			System.out.println("Ortalama = "+ ort);
			}





	}

}
