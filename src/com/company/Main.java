package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int sk;

        System.out.print("Iveskite skaiciu: ");
        sk = in.nextInt();

        if(sk % 7 == 0){
            System.out.print("Dalinasi is 7 ");
        }
        if (sk % 5 == 0){
            System.out.print("Dalinasi is 5 ");
        }else if (sk % 3 == 0){
            System.out.print("Dalinasi is 3 ");
        }else {
            System.out.println("Nesidalina nei is 3, nei is 5, nei is 7");
        }

    }
}
