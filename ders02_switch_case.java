package alg22no;

import java.util.Scanner;

public class ders02_switch_case {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir seçim yapýnýz\n"+
		"Kalan bakiye için 1'e basýnýz\n"+
		"Borç bilgileri için 2'ye basýnýz\n"+
		"Hesap bilgileri için 3'e basýnýz\n"+
		"Çýkýþ için 0'a basýnýz"
				);
		int secim = scan.nextInt();
		
		switch (secim) {
		case 1:
			System.out.println("Kalan miktar 0 tl");
			break;
		case 2:
			System.out.println("Borç miktarý 1000000 tl");
			break;
		case 3:
			System.out.println("Hesap açýlýþ tarihi 02/03/2022");
			break;
		case 0:
			System.out.println("Çýkýþ");
			break;
		default:
			System.out.println("Lütfen geçerli bir sayý giriniz!");
			break;
		}
		
		
		
		
		
	}

}
