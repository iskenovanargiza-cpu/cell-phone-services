package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        CellPhone userPhone = new CellPhone();
        CellPhone userPhone2 = new CellPhone();

        userPhone2.setSerialNumber(888);
        userPhone2.setModel("Iphone Pro Max");
        userPhone2.setCarrier("Verizon");
        userPhone2.setPhoneNumber("813-619-2498");
        userPhone2.setOwner("Nargiza");

        //exercise 3
        CellPhone anotherPhone = new CellPhone(555555,"Nokia", "T-Mobile", "252-455-8632","Thomas");
        // print short way
        System.out.println(anotherPhone.getSerialNumber());

        //print of variable stored
        String output = anotherPhone.getModel();
        System.out.println(output);

        //printf
        System.out.printf("%s %s %s\n", anotherPhone.getCarrier(), anotherPhone.getPhoneNumber(), anotherPhone.getOwner());

        System.out.println("What is the serial number?");
        int serialNum = userInput.nextInt();
        userInput.nextLine();
        userPhone.setSerialNumber(serialNum);

        System.out.println("What model is the phone?");
        String phoneModel = userInput.nextLine();
        userPhone.setModel(phoneModel);

        System.out.println("Who is the carrier?");
        String phoneCarrier = userInput.nextLine();
        userPhone.setCarrier(phoneCarrier);

        System.out.println("What is the phone number?");
        String phoneNum = userInput.nextLine();
        userPhone.setPhoneNumber(phoneNum);

        System.out.println("Who is the owner of the phone?");
        String phoneOwner = userInput.nextLine();
        userPhone.setOwner(phoneOwner);

        userPhone.dial("252-455-8632");
        userPhone2.dial("813-455-8632");
        display(userPhone);
        display(userPhone2);
    } //exercise 2
    public static void display(CellPhone userPhone) {
        System.out.println("Serial number:" + userPhone.getSerialNumber());
        System.out.println("Model:" + userPhone.getModel());
        System.out.println("Carrier:" + userPhone.getCarrier());
        System.out.println("Phone number:" + userPhone.getPhoneNumber());
        System.out.println("Owner:" + userPhone.getOwner());
}}
