package alg22no;

class Cokgen{
	int en,boy,yukseklik;
	
	Cokgen(){ //constructer method varsay�lan de�erleri atar
		this.en=5;
		this.boy=10;
		this.yukseklik=15;
	}
	
	Cokgen(int en,int boy, int yukseklik){ //constructer method overload ediliyor
		this.en = en;
		this.boy = boy;
		this.yukseklik = yukseklik;
	}
	
	int hacim() {
		return this.en*this.boy*this.yukseklik;
	}
}

public class ders23_constructer_yapici_methodlar {

	public static void main(String[] args) {
		// Constructer - yapici-  methodlar s�n�flar ile ayn� isimde olan
		// ve nesne olu�tu�u zaman bir kere �al��an methodlard�r.
		// program �al��madan �nce yap�lacak i�lemler bu method ile
		// ger�ekle�tirilir.
		
		Cokgen c = new Cokgen();//constructer ile varsay�lan de�erler atan�r
		System.out.println(c.hacim());
		
		Cokgen c2 = new Cokgen(10,20,30); // burada ise overload edilmi� constructer arac�l��� ile kullan�c� de�erleri belirler
		System.out.println(c2.hacim());
		
	}

}
