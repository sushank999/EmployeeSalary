/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ghimire.empl;

/**
 *
 * @author Sushank
 */
public class Employee {
    private int code;
    private String Fname,Lname;
    private double salary;

    public Employee() {
    }

    public Employee(int code, String Fname, String Lname, double salary) {
        this.code = code;
        this.Fname = Fname;
        this.Lname = Lname;
        this.salary = salary;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
}
