package alg22no;

class Ogrenci{
	
	String ad = "Betül";  //static öneki varsa nesne tanýmlamadan çaðrýlabilir
	String soyad = "Bilir";
	int numara = 1002;
	
	/*
	static String ad = "Betül";  //static öneki varsa nesne tanýmlamadan çaðrýlabilir
	static String soyad = "Bilir";
	static int numara = 1002;
	*/
	
	void yaz(String ad,String soyad,int numara) {
		System.out.println(ad+" - "+soyad+" - "+numara);	
	}
	
	 
	
	/*void yaz() {
		System.out.println(this.ad+" - "+this.soyad+" - "+this.numara);	
	} */
	
}

public class ders20_classlara_giris {

	public static void main(String[] args) {
		//Sýnýflar (classlar)
		//Bu örnekte ayný sayfa içerisinde class oluþturulucak
		// üstteki Ogrenci sýnýfýndan nesne oluþturacaðýz
		
		Ogrenci o1 = new Ogrenci();
		o1.ad = "ali";
		o1.soyad = "altan";
		o1.numara = 1003;
		o1.yaz(o1.ad,o1.soyad,o1.numara);
		//o1.yaz();
		
		Ogrenci o2 = new Ogrenci();
		o2.yaz(o2.ad,o2.soyad,o2.numara);
		
		
	}

}
