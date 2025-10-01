package com.pluralsight;

public class CellPhone {
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    public CellPhone(int serialNumber, String model, String carrier, String phoneNumber, String owner) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }

    public CellPhone() {
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber= "";
        this.owner = "";

    } //getter
    public int getSerialNumber() {
        return serialNumber;
    } //setter
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    } //getter
    public String getModel() {
        return model;
    } //setter
    public void setModel(String model) {
        this.model = model;
    } //getter
    public String getCarrier() {
        return carrier;
    } //setter
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    } //getter
    public String getPhoneNumber() {
        return phoneNumber;
    } //setter
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    } //getter
    public String getOwner() {
        return owner;
    } //setter
    public void setOwner(String owner) {
        this.owner = owner;
    }

}

