package com.bridgelabz.addressBook;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class AddressBookMain {

    static Logger logger = Logger.getLogger(AddressBookMain.class);
    public static void main(String[] args) {
        BasicConfigurator.configure();
        String firstName;
        String lastName;
        String address;
        String cityName;
        String email_Id;
        long phoneNumber;


        Scanner sc = new Scanner(System.in);

        logger.info("Enter first name: ");
        firstName = sc.nextLine();
        logger.info(firstName);

        logger.info("Enter last name: ");
        lastName = sc.nextLine();
        logger.info(lastName);

        logger.info("Enter address: ");
        address = sc.nextLine();
        logger.info(address);

        logger.info("Enter city name: ");
        cityName = sc.nextLine();
        logger.info(cityName);

        logger.info("Enter email_Id: ");
        email_Id = sc.nextLine();
        logger.info(email_Id);


        logger.info("Enter phoneNumber: ");
        phoneNumber = sc.nextLong();
        logger.info(phoneNumber);


        }
}
