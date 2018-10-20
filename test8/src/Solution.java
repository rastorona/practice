import java.util.ArrayList;
import java.util.Collections;


public class Solution {
    static int func1(ArrayList a) {
        Collections.sort(a);
        int max = 0, pmax = 1,i = 0,j = 1;
        while (i < a.size()) {
            if (max < pmax)
                max = pmax;
            pmax = 1;
            while (j < a.size() && Math.abs((int)a.get(i) - (int)a.get(j)) <= 1) {
                pmax += 1;
                j += 1;
            }
            i += 1;
            j = i + 1;
        }
        return max;
    }
}
