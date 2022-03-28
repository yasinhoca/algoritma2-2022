package alg22no;

public class ders12_fibo_10k_bolum {

	public static void main(String[] args) {
		int[] dizi; //dinamik dizi tanýmlayalým
		float[] bolum;
		
		int a,b,c;
		b=1; a=c=0;
		int sayac = 0;
		
		while(c<10000) {
			c = a+b;
			a=b;
			b=c;
			if(c>10000) break;
			System.out.print(c+" ");
			sayac++;
		}
		
		System.out.println("\n"+ sayac + " adet Fibo bulundu!");
		
		dizi = new int[sayac];
		bolum = new float[sayac-1];
		
		a=c=0; b=1;
		sayac=0;
		while(c<10000) {
			c = a+b;
			a=b;
			b=c;
			if(c>10000) break;
			dizi[sayac]=c;
			//System.out.print(c+" ");
			sayac++;
		}
		
		for(int i=0;i<dizi.length-1;i++) {
			bolum[i] = (float) dizi[i+1]/dizi[i];
			System.out.print(bolum[i]+" - ");
		}
		
		
	}

}
