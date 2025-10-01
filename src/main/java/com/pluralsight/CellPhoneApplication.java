package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone phone = new CellPhone();

        Scanner userInput = new Scanner(System.in);
        System.out.print("What is the serial number?");
        int serialNum = userInput.nextInt();
        userInput.nextLine();
        System.out.print("What model is the phone?");
        String phoneModel = userInput.nextLine();
        System.out.print("Who is the carrier?");
        String phoneCarrier = userInput.nextLine();
        System.out.print("What is the phone number?");
        String phoneNum = userInput.nextLine();
        System.out.print("Who is the owner of the phone?");
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
