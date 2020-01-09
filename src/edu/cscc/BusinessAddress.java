package edu.cscc;

public class BusinessAddress extends Address{
    private String businessName;
    private String address2;

    public BusinessAddress(String businessName, String city, String state, String zip, String streetAddress, String address2) {
        super(streetAddress, city, state, zip);
        this.businessName = businessName;
        this.address2 = address2;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public void printLabel() {
        System.out.println(businessName+ "\n" + address2+ "\n" +toString());

    }
}
