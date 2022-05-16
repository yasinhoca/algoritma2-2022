package alg22no;

import java.util.ArrayList;
import java.util.Arrays;

public class ders31_Liste_digerTipler {

	public static void main(String[] args) {
		ArrayList<Object> liste = //Object
		new ArrayList<>(Arrays.asList("ali",5,'c',true,2.34f));
		
		System.out.println(liste);
		
		float sayi = (float) liste.get(4);
		System.out.println(sayi);
		
		ArrayList<Character> harfler= new ArrayList<>();
		harfler.add('h');
		System.out.println(harfler);
		
		ArrayList<Boolean> durumlar =
				new ArrayList<>(Arrays.asList(true,false,true,false));
		System.out.println(durumlar);
		
		ArrayList<Float> kesirli = new ArrayList<>();
		kesirli.add(2.34f);
		kesirli.add((float)1.34);
		kesirli.add(5f);
		System.out.println(kesirli);
	}

}
