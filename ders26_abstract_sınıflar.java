package alg22no;

abstract class Soyut{
	//nesnesi oluþturulamaz
	//miras verebilir
	//en az bir tane soyut method barýndýrmalý
	//istediðiniz  kadar somut method tanýmlanabilir
	abstract void belirtec();
	abstract void isaretci();
	
	void yazici() {
		System.out.println("Somut method içinden");
	}
}

class Somut extends Soyut{

	@Override
	void belirtec() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void isaretci() {
		// TODO Auto-generated method stub
		
	}
	
	
}


public class ders26_abstract_sýnýflar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Soyut soyut = new Soyut(); Soyut sýnýfýn nesnesi oluþturulamaz
		Somut somut = new Somut(); // soyut sýnýftan miras alan somut sýnýfýn nesnesini oluþturduk
		somut.belirtec();
	
	}

}
