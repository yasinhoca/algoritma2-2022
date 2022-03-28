package alg22no;

public class ders16_methodileortanca {
	
	static int ortanca(int a, int b, int c) {
		int ortanca = 0;
		if((b>a && a>c) || (c>a && a>b)) {
			ortanca = a;
			System.out.println("a ortancadýr");
		} else if((a>b && b>c) || (c>b && b>a)) {
			ortanca = b;
			System.out.println("b ortancadýr");
		} else if((a>c && c>b) || (b>c && c>a)) {
			ortanca = c;
			System.out.println("c ortancadýr");
		}		
		return ortanca;
	}

	public static void main(String[] args) {
		System.out.println(ortanca(3,2,4));
	}

}
