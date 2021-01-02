package com.savytskyy.Assignment12;

import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> phoneSet = new HashSet<>();

        System.out.println("Please enter the String containing \n multiple phone numbers in arbitrary format:");
        String userInput=sc.nextLine();


        //String userInput="+380676370713 0664829213 380676476183 380502223311 0676370713 380664829213 0502223311";

        Pattern pattern = Pattern.compile("(?:[+38|38|8])?(0\\d{9})");
        Matcher matcher = pattern.matcher(userInput);


        while (matcher.find()) {
            System.out.println();
            phoneSet.add("+38"+matcher.group(1));
        }


        System.out.printf("You entered %d  unique numbers:\n", phoneSet.size());
        phoneSet.forEach(System.out::println);
















    }


}





