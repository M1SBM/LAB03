/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.lab3;

/**
 *
 * @author SATTAM
 */
public class App {
    
    public static void main (String [] args){
        Car c1 = new Car("Honda", "Accord", 2019,null);
        c1.call();
        // print car and recall info
        System.out.println(c1);
        // create a duplicate car object to print the recall info in a table
        Car c2 = c1.cloneCar();
        RecallViewer rv = new RecallViewer(c2);
        rv.printTableView();
    }

}
