package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone phone = new CellPhone();
        CellPhone anotherPhone = new CellPhone(555555,"Nokia", "T-Mobile", "252-455-8632","Thomas");
        // print short way
        System.out.println(anotherPhone.getSerialNumber());

        // print of variable stored
        String output = anotherPhone.getModel();
        System.out.println(output);

        //printf
        System.out.printf("%s %s %s", anotherPhone.getCarrier(), anotherPhone.getPhoneNumber(), anotherPhone.getOwner());

        Scanner userInput = new Scanner(System.in);
        System.out.println("What is the serial number?");
        int serialNum = userInput.nextInt();
        userInput.nextLine();

        System.out.println("What model is the phone?");
        String phoneModel = userInput.nextLine();
        System.out.println("Who is the carrier?");
        String phoneCarrier = userInput.nextLine();
        System.out.println("What is the phone number?");
        String phoneNum = userInput.nextLine();
        System.out.println("Who is the owner of the phone?");
        String phoneOwner = userInput.nextLine();

        phone.setSerialNumber(serialNum);
        System.out.println(phone.getSerialNumber());

        phone.setModel(phoneModel);
        System.out.println(phone.getModel());

        phone.setCarrier(phoneCarrier);
        System.out.println(phone.getCarrier());

        phone.setPhoneNumber(phoneNum);
        System.out.println(phone.getPhoneNumber());

        phone.setOwner(phoneOwner);
        System.out.println(phone.getOwner());
    }
}
