package alg22no;

public class ders21_class_external {

	public static void main(String[] args) {
		// S�n�flar ayn� dosyaya/sayfaya yaz�labilece�i gibi
		// Ba�ka bir dosyadan da �a�r�labilir
		// ayn� paketin i�erisine Hesapla isminde bir s�n�f tan�mlad�m
		
		Hesapla h = new Hesapla(); //object - nesne 
		System.out.println(h.topla(13,25));
		System.out.println(h.cikar(34,22));
		System.out.println(h.carp(12,44));
		System.out.println(h.bol(5.67f,2.13f));
		
		Hesapla.yaz(); // yaz methodunun �n�nde static �neki oldu�u i�in
		// direkt yaz methodu s�n�f ismi �zerinden �a�r�ld�. Hesapla.yaz()
		// Math.pow()  Math.round() Math.sqrt()
	
	}
}
