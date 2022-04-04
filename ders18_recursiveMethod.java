package alg22no;

public class ders18_recursiveMethod {
	
	static int faktoriyel(int sayi) {
		if(sayi==1 || sayi==0)
			return 1;
		else {
			return sayi*faktoriyel(sayi-1); //6*5*4*3*2
		}
	}
	
	static int ikiSayiAraliginiTopla(int basla,int bitis) {
		if(bitis>basla) {
			return bitis + ikiSayiAraliginiTopla(basla,bitis-1); 
		} else return basla;
	}

	public static void main(String[] args) {
		// Recursive methodlar (özyinelemeli fonksiyonlar)
		int sonuc = faktoriyel(8);
		System.out.println(sonuc);
		
		System.out.println(ikiSayiAraliginiTopla(5,10));
		
	}

}
