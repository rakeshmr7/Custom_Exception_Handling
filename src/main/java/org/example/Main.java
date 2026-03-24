package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = s.nextInt();
        try{
            if(age < 0) throw new InvalidAgeException("Age cannot be negative!!");
            else if(age > 100) throw new InvalidAgeException("Age cannot exceed 100!!");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}