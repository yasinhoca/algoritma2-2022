package alg22no;

public class ders21_class_external {

	public static void main(String[] args) {
		// Sýnýflar ayný dosyaya/sayfaya yazýlabileceði gibi
		// Baþka bir dosyadan da çaðrýlabilir
		// ayný paketin içerisine Hesapla isminde bir sýnýf tanýmladým
		
		Hesapla h = new Hesapla(); //object - nesne 
		System.out.println(h.topla(13,25));
		System.out.println(h.cikar(34,22));
		System.out.println(h.carp(12,44));
		System.out.println(h.bol(5.67f,2.13f));
		
		Hesapla.yaz(); // yaz methodunun önünde static öneki olduðu için
		// direkt yaz methodu sýnýf ismi üzerinden çaðrýldý. Hesapla.yaz()
		// Math.pow()  Math.round() Math.sqrt()
	
	}
}
