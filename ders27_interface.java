package alg22no;

interface Arayuz {
	//interface - aray�z s�n�f benzeri yap�lard�r.
	//nesnesi olu�turulamaz
	// s�n�flara miras verbilirler
	void belirtec();
	void isaretci();
}

class Mirasci implements Arayuz{

	//Interface i�indeki t�m methodlar subclassta tan�mlanmak zorundad�r.
	
	@Override
	public void belirtec() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void isaretci() {
		// TODO Auto-generated method stub
		
	} //Interface'ler implements ile miras verirler
	
}



public class ders27_interface {

	public static void main(String[] args) {
		//Arayuz arayuz = new Arayuz();  Interface'lerin nesnesi tan�mlanamaz
		
		Mirasci m = new Mirasci();
		m.belirtec();
		
	}

}
