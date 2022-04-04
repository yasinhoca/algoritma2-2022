package alg22no;

class Cokgen{
	int en,boy,yukseklik;
	
	Cokgen(){ //constructer method varsayýlan deðerleri atar
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
		// Constructer - yapici-  methodlar sýnýflar ile ayný isimde olan
		// ve nesne oluþtuðu zaman bir kere çalýþan methodlardýr.
		// program çalýþmadan önce yapýlacak iþlemler bu method ile
		// gerçekleþtirilir.
		
		Cokgen c = new Cokgen();//constructer ile varsayýlan deðerler atanýr
		System.out.println(c.hacim());
		
		Cokgen c2 = new Cokgen(10,20,30); // burada ise overload edilmiþ constructer aracýlýðý ile kullanýcý deðerleri belirler
		System.out.println(c2.hacim());
		
	}

}
