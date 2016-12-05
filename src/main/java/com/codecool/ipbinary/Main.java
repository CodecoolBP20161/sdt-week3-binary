package com.codecool.ipbinary;

import com.codecool.ipbinary.model.BinaryIP;
import com.codecool.ipbinary.model.BinaryInteger;

public class Main {

    public static void main(String[] args) {

        int i = 254;

        print(i, new BinaryInteger(i).getStringValue());

        i = 1;

        print(i, new BinaryInteger(i).getStringValue());

        String ip = "172.16.254.1";

        printIP(ip, new BinaryIP(ip).getBinaryValue());

        // TODO reverse process: Binary -> Decimal.

    }

    private static void printIP(String ip, String s){
        String toPrintTemplate = "IP: %15s as binary String: %35s";
        System.out.println(String.format(toPrintTemplate, ip, s));
    }

    private static void print(int i, String s){
        String toPrintTemplate = "Number: %3d as binary String: %8s";
        System.out.println(String.format(toPrintTemplate, i, s));
    }

}
