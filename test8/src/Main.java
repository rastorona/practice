import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    static ArrayList a = new ArrayList();

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("out.txt"));//System.getenv("OUTPUT_PATH")

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");


        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a.add(aItem);
        }

        int result = Solution.func1(a);

        System.out.println(result);

        bufferedWriter.write(String.valueOf(result));

        bufferedWriter.close();
        scanner.close();
    }
}
