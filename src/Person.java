package src;

/*
Name: Grant Hartley
Student ID: 678984
Email: ghartley@una.edu
Course Information: CIS 315-01
Program Source File Name: Person.java
Programming Assignment: #1
Program Description: This program is a simple Person class
References:
Due Date: 1 Decemnber 2023
In keeping with the honor code policies of the University of University of North Alabama, the
School of Business, and the Department of Computer Science and Information Systems, I
affirm that I have neither given nor received on this programming assignment. This
assignment
represents my individual, original effort.
... My Signature is on File.
*/
public class Person {
    private String name;
    private String address;

    Person(String n, String a) {
        name = n;
        address = a;

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String a) {
        this.address = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}
