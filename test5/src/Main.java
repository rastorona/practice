package com.company;

import java.io.*;

public class Main {
    /*
     * Дано: y - год; 1700 <= y <= 2700
     * Вывести день программиста в этом году. 256 день.
     * Учитывать, что в Этой стране произошла смена календаря в 1918 году, после 31 января настало 14
     * февраля. В обоих календарях случались високосные годы, когда бывает 29 февраля.
     * В Юлианском календаре высокосные года кратны 4. В Григореанском по-прежнему високосным оставался год,
     * номер которого кратен четырём, но исключение делалось для тех, которые были кратны 100. Такие годы были високосными
     * только тогда, когда делились ещё и на 400.
     */


    static String func1(int year) {
        String a="";
        if (year >1918) {
            if (((year % 4 == 0)&&(year % 100 != 0)&&(year % 400!=0))||(year % 400==0)) {
                a = "visokosnii 12.09." + year;
            } else {
                a = "13.09."+ year;
            }
        }else if (year < 1918) {
            if (year % 4 == 0)  {
                a = "visokosnii 12.09."+ year;
            } else {
                a = "13.09."+ year;
            }
        }
        else if (year ==1918){
            a = "26.09."+ year;


        }
        return  a;
    }



    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("out.txt")); //System.getenv("OUTPUT_PATH"))

        int year = Integer.parseInt(bufferedReader.readLine().trim());



        String result = func1(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();

        System.out.println(result);
    }
}
