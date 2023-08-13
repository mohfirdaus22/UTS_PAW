package com.uts_paw.uts_paw;

import java.util.Scanner;

public class penilaian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        double nilai = scanner.nextDouble();

        String grade = Grade(nilai);

        System.out.println("Grade: " + grade);

        scanner.close();
    }

    public static String Grade(double nilai) {
        if (nilai >= 80.00 && nilai <= 100) {
            return "A";
        } else if (nilai >= 77.50 && nilai < 79.99) {
            return "A-";
        } else if (nilai >= 75.00 && nilai < 77.49) {
            return "A/B";
        } else if (nilai >= 72.50 && nilai < 74.99) {
            return "B+";
        } else if (nilai >= 70.00 && nilai < 72.49) {
            return "B";
        } else if (nilai >= 67.50 && nilai < 69.99) {
            return "B-";
        } else if (nilai >= 65.00 && nilai < 67.49) {
            return "B/C";
        } else if (nilai >= 62.50 && nilai < 64.99) {
            return "C+";
        } else if (nilai >= 60.00 && nilai < 62.49) {
            return "C";
        } else if (nilai >= 55.00 && nilai < 59.99) {
            return "C-";
        } else if (nilai >= 50.00 && nilai < 54.99) {
            return "C/D";
        } else if (nilai >= 45.00 && nilai < 49.99) {
            return "D+";
        } else if (nilai >= 40.00 && nilai < 44.99) {
            return "D";
        } else {
            return "E";
        }
    }
}
