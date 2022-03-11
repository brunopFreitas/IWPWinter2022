package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Bruno Freitas", true, "Rob Pattison", 200000.00));
        employees.add(new Employee("Frodo Baggins", true, "Gandalf The Gray", 150000.00));
        employees.add(new Employee("Luke Skywalker", true, "Leia Skywalker", 300000.00));

        for(int i=0; i<employees.size();i++) {
            System.out.println(employees.get(i).getEmployeeReport());
        }
    }
}
