package com.epam.training.Ina_Shah.Java_Classes;

public class Customers implements Comparable <Customers> {
    int id;
    String name;
    String surname;
    String middleName;
    Address address;
    long cardNumber;
    long bankAccountNumber;

    public Customers (int id, String name, String surname, String middleName,Address address)
    {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.address = address;
    }

    public Customers (int id, String name, String surname, String middleName,Address address, long cardNumber,long bankAccountNumber)
    {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.address = address;
        this.cardNumber = cardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public long getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress() {
        this.address = address;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setBankAccountNumber(long bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public String toString() {
        return "Customer "+id+ " { Name: " + name+" "+ middleName+" "+surname +" "+ address.toString()+ " CardNumber: " + cardNumber + ", AccountNumber: " + bankAccountNumber +'}';
    }

    @Override
    public int compareTo(Customers o) {
        if (o instanceof Customers)
            return this.name.compareTo((((Customers) o)).getName());
        else
            throw new IllegalArgumentException("Wrong Array"
                    + this.getClass().getName());
    }
}
