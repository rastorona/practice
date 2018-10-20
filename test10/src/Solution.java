import java.io.*;
import java.util.*;

/*
* На торте стоит несколько свечей разной высоты. Вы сумеете задуть только самые высокие. Посчитать сколько свечей 
* будет задуто.
* Дано: n - количество свечей
* 	ar - массив высот свечей 
*	1 <= n <= 100 000
*	1 <= ar[i] <= 10 000 000
* Пример:
* 	4
*	3 2 1 3 
* Ответ:
*	2
*/


public class Solution {

    static int func(int[] ar) {
    
}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = func(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
