package alg22no;

import java.util.Scanner;

public class ders00_giris {

	public static void main(String[] args) {
		// Açýklama satýrlarý // yazýlýr
		/*
		 * birden fazla açýklama satýrý
		 * için /* kullanýlýr
		 * çok satýrlý açýklama
		 */
		
	// Java'da bloklar { } baþlar biter.	
	// Java'da her projede en az bir tane main
		//method bulunmalýdýr.
		
		int a = 5; //integer tamsayý
		float b = (float)2.5; //float kesirli
		float c = 3.5f; //casting
		
		float d = a + b;
		System.out.println("d deðiþkeni ="+d);
		
		int e = (int) (a + b);
		System.out.println("e deðiþkeni ="+e);
		
		String isim = "ali";
		System.out.println("java'ya hoþgeldin " + isim);

		boolean durum = false;
		System.out.println(durum);
		
		//Veri almak
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayý giriniz:");
		int g = scan.nextInt();
		
		System.out.println("Bir sayý daha giriniz:");
		int h = scan.nextInt();
		
		System.out.println("g + h ="+(g+h));
		
		System.out.println("Ýsminizi giriniz:");
		String ad = scan.next(); // next boþluða kadar okur
		//scan.nextLine(); tüm satýrý okur
		
		
		
	}

}
