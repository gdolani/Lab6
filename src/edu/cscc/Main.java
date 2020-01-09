package edu.cscc;

public class Main {
//Name: Girma Duresso; Date: 10/12/2019.
// To write a program of BusinessAddress and PersonAddress that derived from Main Class "Address".
    public static void main(String[] args) {
	    Address[] addressList = {
                new BusinessAddress("Columbus State", "Columbus", "OH","43215", "550 East Spring St.", "Eibling 302B"),
                new BusinessAddress("AEP", "Columbus", "OH","43201", null, "EP.O. Box 2075"),
                new BusinessAddress("Bill’s Coffee", "Columbus", "OH","43215", "2079 N. Main St..", null),
                new PersonAddress("1200 N.Fourth St", "Worthington", "OH", "43217", "Saul Goodman"),
                new PersonAddress("207 Main St.", "Reynoldsburg", "OH", "43217", "Mike Ehrmentraut"),
                new PersonAddress("2091 Elm St.", "Pickerington", "OH", "43191", "Gustavo Fring")

        };
	    for (Address address : addressList) {
	        address.printLabel();
            System.out.println("====================");
        }
    }
}
