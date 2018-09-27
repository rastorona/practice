import java.util.*;

public class Solution {
	/*
 	* Дано: n - количество чисел в массиве
	*		ar - массив чисел
	* 		0 < n < 100
	*		-100 <= ar[i] <= 100
	* Вычислить нормализованное количество положительных, отрицательных и нулевых элементов 
	* Пример: 
	*	6
	*	-4 3 -9 0 4 1         
	*	
	*	Output
	*	0.500000
	*	0.333333
	*	0.166667
	*/
	
	
    static void func1(int[] arr) {
   
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        func1(arr);

        scanner.close();
    }
}