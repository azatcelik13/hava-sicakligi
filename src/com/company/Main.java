package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int c ;

        System.out.println("hava sıcıklığını giriniz");
        c=inp.nextInt();
        if (c>0&&c<=5){
            System.out.println("Kayak yapmaya ne dersin");

        }else if (c>=5&&c<=15){
            System.out.println("Sinemaya gidebilirsin");
        }else if (c>=15&&c<=25){
            System.out.println("Pikniğe git baba");
        }else if (c>=25){
            System.out.println("Yüzmeye gidebilirsin");
        }else {
            System.out.println("Donuyorsunuz");

        }


    }
}
