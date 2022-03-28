package alg22no;

import java.util.Random;

public class ders13_cok_boyutlu_dizi {

	public static void main(String[] args) {
		// çok boyutlu diziler
		int[][] matris = new int[3][3];
		
		//3x3 matris tanýmladýk
		//   5  6  1
		//   2  0  1
		//   2  1  4
		
		Random r = new Random();
		
		int i,j;
		
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				matris[i][j] = r.nextInt(10);
				System.out.print(matris[i][j]+" ");
			}
			System.out.println("");
		}
		
		
		
		
		

	}

}
