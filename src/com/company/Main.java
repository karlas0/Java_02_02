package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Sveiki, iveskite betkoki zodi");

        Scanner sc = new Scanner(System.in);

        String zodis = sc.nextLine();

        System.out.println("zodis turi simboliu");

        System.out.println(zodis.length());

    }
}
