package edu.cscc;

public class PersonAddress extends Address {

    private String personName;

    public PersonAddress(String streetAddress, String city, String state, String zip, String personName) {
        super(streetAddress, city, state, zip);
        this.personName = personName;
    }

    public String getPersonAddress() {
        return personName;
    }

    public void setPersonAddress(String PersonAddress)
    {
        this.personName = PersonAddress;
    }

    public String personName() {
        return personName;

    }

    public void setPersonName(String PersonAddress) {
        this.personName = PersonAddress;
    }

    public void printLabel() {
        System.out.println(personName+  "\n" +toString());
    }
    }

