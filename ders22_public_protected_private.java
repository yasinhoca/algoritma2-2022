package alg22no;

class Dersler{
	int dersNo; // no modifier
	public String dersIsmi;
	protected String dersHocasi;
	private String sifre = "aqws34hr"; // burada atama yapýlabilir
	
	public String getSifre() { // getter setter
		return sifre;
	}
	
	public void setSifre(String sifre) { //encapsulation - kapsülleme
		this.sifre = sifre;
	}
	
	
}

public class ders22_public_protected_private {

	public static void main(String[] args) {
		/*
		 Access Levels 
		 Modifier 	 Class 	Package 	Subclass 	World
		 public 	 Y 		Y 			Y 			Y
		 protected 	 Y 		Y 			Y 			N
		 no modifier Y 		Y 			N 			N
         private 	 Y 		N 			N 			N
		 */
		Dersler d = new Dersler();
		d.dersNo = 105;
		d.dersIsmi = "Algoritma";
		d.dersHocasi = "Yasin";
		//d.sifre = "qas23frt"; private olduðu için atama yapamayýz
		System.out.println(d.getSifre());
		d.setSifre("qwerty1234");
		System.out.println(d.getSifre());
	}

}
