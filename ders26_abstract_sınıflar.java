package alg22no;

abstract class Soyut{
	//nesnesi olu�turulamaz
	//miras verebilir
	//en az bir tane soyut method bar�nd�rmal�
	//istedi�iniz  kadar somut method tan�mlanabilir
	abstract void belirtec();
	abstract void isaretci();
	
	void yazici() {
		System.out.println("Somut method i�inden");
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


public class ders26_abstract_s�n�flar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Soyut soyut = new Soyut(); Soyut s�n�f�n nesnesi olu�turulamaz
		Somut somut = new Somut(); // soyut s�n�ftan miras alan somut s�n�f�n nesnesini olu�turduk
		somut.belirtec();
	
	}

}
