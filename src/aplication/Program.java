package aplication;

import entites.Student;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student[] vector = new Student[10];

        System.out.println("How many rooms will be rented?");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Rent #" + i + 1 + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();

            vector[roomNumber] = new Student(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms: ");
        for (int i = 0; i < 10; i++) {
            if (vector[i] != null) {
                System.out.println(i + ": " + vector[i]);
            }
        }
        
        sc.close();
    }
}