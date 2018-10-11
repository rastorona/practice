package com.company;
import java.util.*;
public class Normal {
    static ArrayList func1(int[] arr) {
        ArrayList vvv = new ArrayList();
        float pol = 0;
        float nul = 0;
        float otr = 0;

        for (int i : arr) {
            if (i > 0)
                pol = pol + 1;
            else if (i == 0)
                nul = nul + 1;
            else if (i < 0)
                otr = otr + 1;
        }
        System.out.println("Output:");
        vvv.add(pol / arr.length);
        vvv.add(otr / arr.length);
        vvv.add(nul / arr.length);
        return vvv;
    }
}


