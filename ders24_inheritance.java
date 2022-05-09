package alg22no;

import javax.swing.JFrame;

class Cokgenler{
	int kenar_sayisi;
	int yukseklik;
	int taban;
	public String tur;
	
	int alan() {
		return ((taban*yukseklik)/2)*kenar_sayisi;
	}
}

class Ucgen extends Cokgenler{ //üçgen sýnýfý extends ifadesi ile çokgen sýnýfýndan miras alýr.
	int aci_a,aci_b,aci_c;
	
	//cokgenden miras aldýðý alan() methodunu iptal ediyoruz
	// bu olaya override denir.
	int alan() {
		return (taban*yukseklik)/2;
	}
}

class Dikucgen extends Ucgen{
	
}

//varolan sýnýflardan da miras alýnabilir
class UI extends JFrame{
	
}


public class ders24_inheritance {

	public static void main(String[] args) {
		// Inheritance - Miras alma - Kalýtým
		Ucgen u = new Ucgen(); //ucgen sýnýfý extend edilen cokgen sýnýfýndan tüm attributleri alabilir
		u.kenar_sayisi=5;
		u.aci_a = 72; //kendi içindeki attribute
		u.alan();
		
		Dikucgen du = new Dikucgen(); // ucgen sýnýfýndan miras alýr
		//ucgen sýnýfý da cokgen sýnýfýndan miras alýr
		du.alan(); 
		
		UI f = new UI();// javanýn sýnýfý olan JFrame sýnýfýndan miras aldýk.
		f.getBackground();
		
		
	}

}
