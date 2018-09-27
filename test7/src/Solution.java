import java.io.*;
import java.util.*;

public class Solution {

	/*
	* Два кота и мышь в разных позициях на линии. Определить какой кот настигнет мыша первым. 
	* Мышь не двигается, коты бегают с одной скоростью, старт синхронный. В случае одновременного
	* нападения на мышь, коты вступают в бой, а мышь ретируется во-свояси.
	* Если первый кот чемпион - вывести Cat A, если второй кот - Cat B, если мышь удрала - Mouse C.
	* Дано: n - количество картежей координат зверей.
	*		x y z - координата первого кота, второго и мыша.
	*		1 <= n <= 100
	* 		1 <= x, y, z <= 100
	* Пример:
	* 2
	* 1 2 3
	* 1 3 2
	* 
	* Cat B
	* Mouse C
	*/
	
    static String func1(int x, int y, int z) {
	}
	
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("out.txt"));//System.getenv("OUTPUT_PATH")

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] xyz = scanner.nextLine().split(" ");

            int x = Integer.parseInt(xyz[0]);

            int y = Integer.parseInt(xyz[1]);

            int z = Integer.parseInt(xyz[2]);

            String result = func1(x, y, z);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
