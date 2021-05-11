package airvoice.java.streams.com;

import java.util.ArrayList;

import java.util.Scanner;

import java.util.logging.Logger;

public class Airvoice implements BaseClass {
	static Logger log = Logger.getLogger(Airvoice.class.getName());

	public static void main(String[] args)

	{
		ArrayList<Customer> cus = new ArrayList<>();
		Streams filterob = new Streams();

		cus.add(new Customer("c001", "jack", "India", "7871831342", "prepaid", "true"));
		cus.add(new Customer("c002", "kirti", "SouthAfrica", "9956473425", "prepaid", "true"));
		cus.add(new Customer("c003", "Peter", "SouthAfrica", "206300924", "prepaid", "true"));
		cus.add(new Customer("c004", "vishal", "Tanzania", "6256473425", "prepaid", "true"));
		cus.add(new Customer("c005", "preethi", "Austria", "6156473425", "postpaid", "false"));
		cus.add(new Customer("c006", "sam", "Belarus", "9156473425", "prepaid", "false"));
		cus.add(new Customer("c007", "anjali", "Tanzania", "4956473425", "postpaid", "false"));
		cus.add(new Customer("c008", "daisy", "Uganda", "616322924", "prepaid", "true"));

		Scanner sc = new Scanner(System.in);
		log.info("enter choice \n 1)fetch first 5 records \n 2)fetch customers from Tanzania with postpaid connection and no vas enabled \n 3)fetch customers from South Africa with prepaid connection and vas enabled \n 4)fetch customer details whose num starts from 61 and  from Uganda \n 5) Records based on customer id \n 6) Convert customer name to uppercase");

		int op = sc.nextInt();
		switch (op) {
		case 1:
			filterob.firstFive(cus);
			break;

		case 2:
			filterob.customerTanzania(cus);
			break;

		case 3:
			filterob.customerSouthAfrica(cus);
			break;

		case 4:

			filterob.num61(cus);

			break;

		case 5:
			filterob.customerId(cus);
			break;
		case 6:
			filterob.upperCase(cus);

			break;
		default:
			log.info("enter valid choice");

		}
		sc.close();

	}

}
