package com.company;

public class Main {

    public static void main(String[] args) {

    printMegaBytesAndKiloBytes(2050);

    }

public static void printMegaBytesAndKiloBytes (int kiloBytes) {

    int megaBytes = (kiloBytes / 1024);
    int remainingKilobytes = (kiloBytes % 1024);

        if(kiloBytes > 0) {

            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKilobytes + " KB");
        }
        else {
            System.out.println("Invalid Value");
        }

}

    }