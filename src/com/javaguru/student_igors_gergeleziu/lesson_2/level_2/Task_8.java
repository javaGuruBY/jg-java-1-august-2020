package com.javaguru.student_igors_gergeleziu.lesson_2.level_2;
import java.util.Scanner;
import java.lang.String;

public class Task_8 {
    public static void main(String[] args) {
        Scanner userNameInput = new Scanner(System.in);
        System.out.println("Please input your user name: ");
        String userName = userNameInput.nextLine();
        System.out.println("Hello, " + userName+"!");
    }
}
