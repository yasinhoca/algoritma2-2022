package alg22no;

public class ders01_if_else {

	public static void main(String[] args) {
		int a,b,c;
		a = 4;
		b = 5;
		c = 7;

		if (a>b) {
			System.out.println("A sayýsý B sayýsýndan büyüktür");
		}else if(b>a) {
			System.out.println("B sayýsý A sayýsýndan büyüktür");
		}else {
			System.out.println("Ýki sayý eþittir");
		}

		//üç sayýdan en büyüðünü bulalým
		if(a>=b && a>=c) { 
			if(a==b) {
				System.out.println("A = B en büyük");
			} else if(a==c) {
				System.out.println("A = C en büyük");
			} else {
				System.out.println("A en büyük");}

		}else if(b>=a && b>=c) {
			if(a==b) {
				System.out.println("A = B en büyük");
			} else if(b==c) {
				System.out.println("B = C en büyük");
			} else {
				System.out.println("B en büyük");}

		} else {
			if(a==c) {
				System.out.println("A = C en büyük");
			} else if(b==c) {
				System.out.println("B = C en büyük");
			} else {
				System.out.println("C en büyük");}

		}


	}//main bloðunun sonu

}//class'ýn sonu
