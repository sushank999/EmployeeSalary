/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ghimire.eo;

import com.ghimire.EmployeeDAO;
import com.ghimire.empl.Employee;
import java.util.Scanner;

/**
 *
 * @author Sushank
 */
public class EmployeeOptions {

    private Scanner input;
    private EmployeeDAO employeeDAO;

    public EmployeeOptions(Scanner input, EmployeeDAO employeeDAO) {
        this.input = input;
        this.employeeDAO = employeeDAO;
    }

    public void mainMenu() {
        System.out.println("1. Employee Section");
        System.out.println("2. Salary Section");
        System.out.println("3. Report");
        System.out.println("4. Exit");
        System.out.println("Enter your choice[1-4]");

    }

    public void menu() {
        System.out.println("--------Welcome to employee section--------");
        System.out.println("1. Add employee");
        System.out.println("2. Delete employee");
        System.out.println("3. Show all employees");
        System.out.println("4. Search by code");
        System.out.println("5. Return to main menu");
        System.out.println("Enter your choice[1-5]");

    }

    private void addEmployee() {

        Employee emp = new Employee();

        while (true) {
            System.out.println("-------Welcome to employee section------");
            System.out.println("Enter Following Credentials");

            System.out.println("Code: ");
            emp.setCode(input.nextInt());

            System.out.println("First Name:");
            emp.setFname(input.next());
            System.out.println("Last Name:");
            emp.setLname(input.next());
            System.out.println("Salary: ");
            emp.setSalary(input.nextDouble());

            employeeDAO.insert(emp);
            System.out.println("Add more[Y/N]?");
            if (input.next().equalsIgnoreCase("n")) {
                break;
            }

        }
    }

    private void showEmployees() {
        for (Employee em : employeeDAO.getAll()) {
            System.out.println("The current employees are:");
            System.out.println("Code : " + em.getCode());
            System.out.println("First Name : " + em.getFname());
            System.out.println("Last Name : " + em.getLname());
            System.out.println("Current Salary : " + em.getSalary());
        }
    }

    private void searchEmployee() {

        System.out.println("Enter code to search:");
        Employee em = employeeDAO.getbyCode(input.nextInt());
        if (em != null) {
            System.out.println("The current employee is:");
            System.out.println("Code : " + em.getCode());
            System.out.println("First Name : " + em.getFname());
            System.out.println("Last Name : " + em.getLname());
            System.out.println("Current Salary : " + em.getSalary()); 
        }else{
            System.out.println("Not found");
        }
    }

    public void empOptions() {
        switch (input.nextInt()) {
            case 1:
                addEmployee();
                break;
            case 2:

                break;
            case 3:
                showEmployees();
                break;
            case 4:
                searchEmployee();
                break;
            case 5:
                System.exit(0);
                break;
        }
    }

    private void deleteEmployee() {

    }
}
