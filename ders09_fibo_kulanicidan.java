package alg22no;

import java.util.Scanner;

public class ders09_fibo_kulanicidan {

	public static void main(String[] args) {
		// kullanýcýnýn istediði aralýktaki fibo
		int a,b,c,baslangic,bitis;
		a=c=0; b=1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Baþlangýç deðeri:");
		baslangic = scan.nextInt();
		System.out.println("Bitiþ deðeri:");
		bitis = scan.nextInt();
		int sayac = 1;
		while(c<bitis) {
			c = a + b;
			if(c>baslangic && c<bitis) {
				System.out.println(sayac +". bulunan Fibo =" +c);	
			}
			sayac++; //kaçýncý fibo olduðunu bulmak için ekledik
			a=b; b=c;
		}
		
		
		

	}

}
