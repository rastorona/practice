import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {
    /*
	* Дано: n - количество чисел в массиве
	*		ar - массив чисел
	* 		1 <= n <= 10
	*		0 <= ar[i] <= 10e10
	*		Вычислить сумму чисел.
	* Пример:
	* 5
	* 1000000001 1000000002 1000000003 1000000004 1000000005
	*/
    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
   
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
            throws IOException
    {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("out.txt"));

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long[] ar = new long[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            long arItem = Long.parseLong(arItems[i]);
            ar[i] = arItem;
        }

        long result = aVeryBigSum(ar);

        bufferedWriter.write(String.valueOf(result));

        bufferedWriter.close();
        scanner.close();
    }
}
