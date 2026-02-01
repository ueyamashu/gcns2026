package jp.co.gcns.batch;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Lotto7 {
	public static void main(String[] args) {

		List<Integer> beforeList = new ArrayList<Integer>();

		Random random = new Random();

		for (int i = 0; i < 7; i++) {
			int inputLotto = random.nextInt(36);
			inputLotto = inputLotto + 1;

			if (beforeList.contains(inputLotto) == true) {
				i--;
			} else {
				beforeList.add(inputLotto);
			}

		}
		
		beforeList.sort(Comparator.comparing(Integer::new));
		System.out.println(beforeList);

		//		int int1= 0;
		//		int int2= 0;
		//		int int3= 0;
		//		int int4= 0;
		//		int int5= 0;
		//		int int6= 0;
		//		int int7= 0;
		//
		//		int1 = random.nextInt(44);
		//		boolean cyoufukuFlg = true;
		//		
		//		while (cyoufukuFlg) {
		//			int2 = random.nextInt(44);
		//			
		//			if (int1 != int2) {
		//				cyoufukuFlg = false;
		//			}
		//		}
		//		
		//		int3 = random.nextInt(44);
		//		int4 = random.nextInt(44);
		//		int5 = random.nextInt(44);
		//		int6 = random.nextInt(44);
		//		int7 = random.nextInt(44);
		//
		//		System.out.println(int1 + ", " + int2 + ", " + int3 + ", " + int4 + ", " + int5 + ", " + int6 + ", " + int7);
		//		
		
		
		
		
		//		for (int i = 0; i < 7; i ++) {
		//			int resultInt = random.nextInt(44);
		//			System.out.print(resultInt + 1);
		//			if (i != 6) {
		//				System.out.print(", ");
		//			}
		//		}

	}
}
