import java.util.*;
import java.lang.*;

public class Solution<MyObject> {
	/*
	 *  Дано n - число уровней. Построить треугольник из символов #.
	 *  Пример для n = 4:
	 *	   #
	 *	  ##
	 *   ###
	 *  ####
	 */

	static class Wic implements Runnable

	{
		private int n;
		public void SetN ( int a){
			n = a;
		}

		public void run () {
			int k = n;
			String o = "";

			for (int i = 1; i <= n; i++) {
				k = k - 1;
				o = o + "#";
				for (int j = 1; j <= k; j++) {
					System.out.print(" ");
				}
				System.out.print(o);
				System.out.println();
			}
		}
	}



	private static final Scanner scanner = new Scanner(System.in);

	public static void main (String[]args){
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		Wic MyObject = new Wic();
		MyObject.SetN(n);
		Thread myTr = new Thread(MyObject);
		myTr.start();
	}
}