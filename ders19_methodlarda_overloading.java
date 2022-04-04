package alg22no;

public class ders19_methodlarda_overloading {
	
	static int topla(int a,int b) {
		return a+b;
	}
	
	static int topla(int a,int b,int c) { //�stteki method ile ayn� isimde
		return a+b+c;    // fakat giri� parametrelerinin say�s� farkl�
	}
	
	static float topla(float a,float b) {
		return (float)a+b;
	}
	

	public static void main(String[] args) {
		// methodlarda overloading (a��r� y�kleme)
		System.out.println(topla(5,8));
		System.out.println(topla(3,5,9));
		System.out.println(topla(3.14f,5f)); // f ile casting (float) yapt�k
	}

}
