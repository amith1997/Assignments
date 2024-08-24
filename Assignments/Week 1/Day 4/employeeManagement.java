package com.assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class employeeManagement {
	
	private int empId;
    private String name;
    private String position;

    public  employeeManagement(int empId, String name, String position) {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }

    public int getEmpId() {
        return empId;
    }

    @Override
    public String toString() {
        return "ID: " + empId + ", Name: " + name + ", Position: " + position;
    }
}

class EmployeeManagementSystem {
    private ArrayList<employeeManagement> employees;

    public EmployeeManagementSystem() {
        employees = new ArrayList<>();
    }

    public void addEmployee(int empId, String name, String position) {
    	employeeManagement newEmployee = new employeeManagement(empId, name, position);
        employees.add(newEmployee);
        System.out.println("Employee " + name + " added successfully.");
    }

    public void listEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            System.out.println("List of Employees:");
            for (employeeManagement employee : employees) {
                System.out.println(employee);
            }
        }
    }

    public void deleteEmployee(int empId) {
        for (employeeManagement employee : employees) {
            if (employee.getEmpId() == empId) {
                employees.remove(employee);
                System.out.println("Employee " + employee + " deleted successfully.");
                return;
            }
        }
        System.out.println("No employee found with ID " + empId);
    }


public static void main(String[] args) {
    EmployeeManagementSystem ems = new EmployeeManagementSystem();
    Scanner scanner = new Scanner(System.in);

    while (true) {
        System.out.println("\n1. Add Employee");
        System.out.println("2. List Employees");
        System.out.println("3. Delete Employee");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter Employee ID: ");
                int empId = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                System.out.print("Enter Employee Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Employee Position: ");
                String position = scanner.nextLine();
                ems.addEmployee(empId, name, position);
                break;
            case 2:
                ems.listEmployees();
                break;
            case 3:
                System.out.print("Enter Employee ID to delete: ");
                int deleteId = scanner.nextInt();
                ems.deleteEmployee(deleteId);
                break;
            case 4:
                System.out.println("Exiting...");
                scanner.close();
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}
}
