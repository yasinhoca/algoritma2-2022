package alg22no;

interface Arayuz {
	//interface - arayüz sýnýf benzeri yapýlardýr.
	//nesnesi oluþturulamaz
	// sýnýflara miras verbilirler
	void belirtec();
	void isaretci();
}

class Mirasci implements Arayuz{

	//Interface içindeki tüm methodlar subclassta tanýmlanmak zorundadýr.
	
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
		//Arayuz arayuz = new Arayuz();  Interface'lerin nesnesi tanýmlanamaz
		
		Mirasci m = new Mirasci();
		m.belirtec();
		
	}

}
