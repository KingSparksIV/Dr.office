package com.company;

public class Main {

    public static void main(String[] args) {

        String patientName = "Stacey Manson";
        String hasInsurance = "false";
        double temp;
        temp = 102.2;
        int numVisits;
        numVisits = 5;
        double amtdue;
        amtdue = 99.99;
        String nxtappt = "January 1, 2021";
        String contnum = "(910)557-6567";


        System.out.println("Patient Details:");
        System.out.println("Name: " + patientName);
        System.out.println("Patient has insurance: " + hasInsurance);
        System.out.println("Body temperature: " + temp);
        System.out.println("Number of visits: " + numVisits);
        System.out.println("Next Copay Amount: $" + amtdue);
        System.out.println("Date of Next Appointment: " + nxtappt);
        System.out.println("Contact Number: " + contnum);
    }
    }
