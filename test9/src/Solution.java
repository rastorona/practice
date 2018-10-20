import java.io.*;
import java.util.*;

public class Solution {

	/*
	* Реализовать функцию вычисляющую высоту дерева. Дерево растет в два цикла каждый год. Каждую весну его высота удваевается,
	* каждое лето дерево прибавляет один метр. Дерево высаживается высотой 1 метр. 
	* Вычислить высоту дерева через n - циклов роста.
	*
	* Дано: t - количество тестовых примеров
	*	n - количество циклов роста
	*  	1 <= t <= 10
	* 	0 <= t <= 60
	* Пример:
	*       2
	*	0
	*	4
	*
	* Решение:
	*	1
	*	7
	*/
	
    static int func(int n) {
   
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int result = func(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
