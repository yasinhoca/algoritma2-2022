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

class Ucgen extends Cokgenler{ //��gen s�n�f� extends ifadesi ile �okgen s�n�f�ndan miras al�r.
	int aci_a,aci_b,aci_c;
	
	//cokgenden miras ald��� alan() methodunu iptal ediyoruz
	// bu olaya override denir.
	int alan() {
		return (taban*yukseklik)/2;
	}
}

class Dikucgen extends Ucgen{
	
}

//varolan s�n�flardan da miras al�nabilir
class UI extends JFrame{
	
}


public class ders24_inheritance {

	public static void main(String[] args) {
		// Inheritance - Miras alma - Kal�t�m
		Ucgen u = new Ucgen(); //ucgen s�n�f� extend edilen cokgen s�n�f�ndan t�m attributleri alabilir
		u.kenar_sayisi=5;
		u.aci_a = 72; //kendi i�indeki attribute
		u.alan();
		
		Dikucgen du = new Dikucgen(); // ucgen s�n�f�ndan miras al�r
		//ucgen s�n�f� da cokgen s�n�f�ndan miras al�r
		du.alan(); 
		
		UI f = new UI();// javan�n s�n�f� olan JFrame s�n�f�ndan miras ald�k.
		f.getBackground();
		
		
	}

}
