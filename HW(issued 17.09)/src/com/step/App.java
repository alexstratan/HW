package com.step;

import com.step.model.Employee;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class App { // in cerinta de pe MyStat nu era conditia cu ce facem cu App, asa ca am facut initierea unor obiecte Employee
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array length: ");
        int arrayLength = sc.nextInt();
        Employee[] employees = new Employee[arrayLength];
        String tempName, tempSurname;
        Date tempBirthdate;
        int daysFromNow = 0;
        System.out.print("Initialize the employees: ");

        for (int i = 0; i < employees.length; i++) {

            System.out.println("\n--> Employee " + i + "<--\n");

            System.out.print("Name: ");
            tempName = sc.next();//am folosit next() ca sa nu dea conflict cu randurile urmatoare (cu nextLine() dadea conflict, iar daca curateam bufferul sacnnerul, valoarea tempName disparea)

            System.out.print("Surname: ");
            tempSurname = sc.next();

            while (true) {
                boolean success;
                try {
                    System.out.print("Days since birth: ");
                    success = true;
                    daysFromNow = sc.nextInt();
                } catch (Exception e) {
                    System.out.println("This is not a number (Error::" + e.getMessage() + ") \nTry again: ");
                    success = false;
                    sc.nextLine();
                }
                if (success) {
                    break;
                }
            }

            tempBirthdate = java.sql.Date.valueOf(LocalDate.now().minusDays(daysFromNow));
            employees[i] = new Employee(tempName, tempSurname, tempBirthdate);
        }

        System.out.println("\n-> Our employees: \n");
        for (Employee e : employees) {
            System.out.println("Employee: " + e.getName() + " " + e.getSurname() + " | Birthdate: " + e.getBirthdate());
        }
    }
}
