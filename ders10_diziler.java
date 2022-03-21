package alg22no;

public class ders10_diziler {

	public static void main(String[] args) {
		// Arrays - Diziler
		// Java'da primitive yapýdaki diziler Array olarak adlandýrýlýr
		// Nesne tipi ise Listeler (ArrayList) olarak adlandýrýlýr.
		int[] sayilar = {3,5,6,8,9,1,0}; // 7 elemanlý bir dizi tanýmlayýp deðerleri atadýk  
		System.out.println(sayilar[0]);//3
		System.out.println(sayilar[2]);//6
		System.out.println(sayilar[2+3]);//sayilar[5]
		//System.out.println(sayilar[7]);//taþma hatasý
		//System.out.println(sayilar[sayilar.length]);//taþma hatasý
		System.out.println(sayilar[sayilar.length-1]);// 6. indis
		System.out.println(sayilar[sayilar.length-sayilar.length]);// 7-7
		System.out.println(sayilar[167-163]);
		
		
		int[] dizi = new int[3]; //3 elemanlý bir dizi alanýný Ram'de rezerve ettik
		dizi[0] = 5;
		dizi[1] = 0;
		dizi[2] = 1;
		dizi[0] = 7;
		//dizi[3] = 12; taþma hatasý alýrýz
	
	}

}
