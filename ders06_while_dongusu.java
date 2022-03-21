package alg22no;

import java.util.Scanner;

public class ders06_while_dongusu {

	public static void main(String[] args) {
		//while
		//do-while döngüleri
		int sayac = 0;

		while (sayac<10) {
			System.out.println(sayac + ". adým");
			sayac++;
		}

		//en az bir adým atar
		int sayac2 = 11;
		do {
			System.out.println(sayac2+" sayac2 deðeri");
			//sayac2++;
		} while (sayac2<10);

		int sifre = 1234;
		int pass = 0;
		Scanner scan = new Scanner(System.in);
		
		while(sifre != pass) {			
			System.out.print("Þifreyi giriniz:");
			pass = scan.nextInt();
			if(sifre==pass) break; //tek satýr olduðu için {} blok açmadým
			else System.out.println("Yanlýþ þifre!");
		}

	}
}
