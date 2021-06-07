/*
 *   UCF COP3330 SUMMER 2021 ASSIGNMENT 16 SOLUTION
 *   COPYRIGHT 2021 RAYME PERSAD
 */

/*Write a program that asks the user for their age and compare it to the legal driving age of sixteen.
If the user is sixteen or older, then the program should display "You are old enough to legally drive." If the user is under sixteen, the program should display "You are not old enough to legally drive."
 */




package org.example;
import java.util.Scanner;
public class practiceexample16 {

    public class Main {
        public static void main(String[] args) {

            int age;
            Scanner sc = new Scanner(System.in);
            System.out.print("What is your age? ");  //prompt for age input
            age = sc.nextInt();
            if (age >= 16)           //check if age>=16, if true, then print prompt "old enough"
                System.out.println("You are old enough to legally drive");
            else               //if false, i.e. if age<16, print "not old enough"
                System.out.println("You are not old enough to legally drive");

        }
    }
