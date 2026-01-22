package com.company.attendance;

import java.util.Scanner;

public class AttendanceApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Check-In");
        System.out.println("2. Check-Out");

        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        if (choice == 1) {
            AttendanceService.markAttendance(name, "CHECK-IN");
            System.out.println("Check-In Successful");
        } else {
            AttendanceService.markAttendance(name, "CHECK-OUT");
            System.out.println("Check-Out Successful");
        }
        sc.close();
    }
}
