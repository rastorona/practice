package com.company;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.lang.String;
import java.util.logging.SimpleFormatter;

public class Main {

    public static class Mylogger {
        private static final Logger log = Logger.getLogger(com.company.Main.Mylogger.class.getName());
        public static void ConsoleLogger() {
            log.info("Успешное выполнение:1");
        }

        public static void SimpleFileLogger() {
            try {
                FileHandler File;
                File = new FileHandler("C://kop//File.log");
                log.addHandler(File);
                log.info("Успешное выполнение:2");
            } catch (IOException ioex) {
                System.out.println(ioex);
            }
        }

        public static void TimedFileLogger() {
            try {
                FileHandler File;
                File = new FileHandler("C://kop//File.log");
                log.addHandler(File);
                SimpleFormatter formatter = new SimpleFormatter();
                File.setFormatter(formatter);
                log.info("Успешное выполнение:3");
            } catch (IOException ioex) {
                System.out.println(ioex);

            }


        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (n == 1) {
            com.company.Main.Mylogger.ConsoleLogger();
        } else {
            if (n == 2) {
                com.company.Main.Mylogger.SimpleFileLogger();
            } else {
                if (n == 3) {
                    com.company.Main.Mylogger.TimedFileLogger();
                } else {
                    System.out.print("Ошибка");
                }
            }
        }


    }

}