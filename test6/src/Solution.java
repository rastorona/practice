import java.io.*;
import java.util.*;

public class Solution {
	/*
	* Дано: n - число элементов в строке
	*		s - строка
	* 		2 <= n <= 10e6
	*		s[i]= {UD}
	* Эта строка описывает движение человека с уровня 0. D - шаг вниз; U - шаг вверх.
	* Человек прошел долину, если спустился вниз и вернулся на уровень 0.
	* Вывести число долин на пути следования.
	* Пример:
	* 8
	* UDDDUDUU
	* 1
	*
	*_/\      _
	*   \    /
    *	 \/\/
	*/

    static int func1(int n, String s) {
     
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("out.txt")); //System.getenv("OUTPUT_PATH")

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = func1(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}