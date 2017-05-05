/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ghimire;

import com.ghimire.empl.Employee;
import com.ghimire.eo.EmployeeOptions;
import com.ghimire.impl.EmployeeImpl;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Sushank
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        EmployeeOptions eo=new EmployeeOptions(input, new EmployeeImpl());

        

        //menu
        eo.mainMenu();
        switch (input.nextInt()) {
            case 1:
                while (true){
                eo.menu();
                eo.empOptions();
                }
            case 2:
                

                
        }

        //For SalaryOut
    }

}
