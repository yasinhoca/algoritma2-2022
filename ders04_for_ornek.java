package alg22no;

import java.util.Scanner;

public class ders04_for_ornek {

	public static void main(String[] args) {
		// kullanýcýdan aldýðýmýz sayýya kadar olan sayýlarýn toplamýný bulalým
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir sayý giriniz=");
		int sayi = scan.nextInt();
		
		int toplam = 0;
		
		for(int i=0;i<sayi;i++) {
			toplam += i;
		}
		
		System.out.println("0 dan "+sayi+"'e kadar "
				+ "olan sayýlarýn toplamý =" + toplam);
		
	}

}
