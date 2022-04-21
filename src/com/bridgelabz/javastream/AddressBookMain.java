package com.bridgelabz.javastream;

public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("....WELCOME TO ADDRESS BOOK....");
		Contacts newContact = new Contacts();
		newContact.setFirstName("Kishlay \n");
		newContact.setLastName("Kishan \n");
		newContact.setAddress("Area-Aghoria Bazar, Dist-Muzaffarpur, State-Bihar \n");
		newContact.setCity("Muzaffarpur \n");
		newContact.setState("Bihar \n");
		newContact.setZip(842002);
		newContact.setEmail("kishan.kishlay20@gmail.com \n");
		newContact.setPhoneNumber(1234567890);
		System.out.println("The Contact is : \n" + newContact);

		// To add new contact

		AddressBook addressBook = new AddressBook();
		addressBook.operation();

	}
}