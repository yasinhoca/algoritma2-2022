package alg22no;

class Ogrenci{
	
	String ad = "Bet�l";  //static �neki varsa nesne tan�mlamadan �a�r�labilir
	String soyad = "Bilir";
	int numara = 1002;
	
	/*
	static String ad = "Bet�l";  //static �neki varsa nesne tan�mlamadan �a�r�labilir
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
		//S�n�flar (classlar)
		//Bu �rnekte ayn� sayfa i�erisinde class olu�turulucak
		// �stteki Ogrenci s�n�f�ndan nesne olu�turaca��z
		
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
