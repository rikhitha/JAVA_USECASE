package fruitshop.collections.java.com;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;



public class FruitShop implements BaseModel
{
	static Logger log = Logger.getLogger(FruitShop.class.getName());

	public static void main(String[] args) {

		log.info(" choose: \n 1) Add Item,Sort item \n 2) Exit ");

		Scanner scob = new Scanner(System.in);
		int val = scob.nextInt();
		switch (val) {
		case 1:
			log.info("Add Item,Sort item");
			addFruits();
			break;
		case 2:

			System.exit(0);
			break;

		default:
			log.info("enter valid operation");
		}
		scob.close();
	}

	public static void searchFruits(List<Fruits> f) {
		SearchFruits sfob = new SearchFruits();
		sfob.search(f);

	}

	public static void sortFruits(List<Fruits> f) {

		Collections.sort(f, new Sortbycost());

		log.info("\nSorted by fruit cost");
		for (int i = 0; i < f.size(); i++)
			log.info(f.get(i)+" ");
	}

	public static void addFruits() {
		ArrayList<Fruits> list = new ArrayList<>();
		Scanner scnr = new Scanner(System.in);

		for (int j = 0; j <= 1; j++) {

			Fruits fruitob = new Fruits();

			log.info("Enter Fruit Name:");
			fruitob.setfruitname(scnr.nextLine());

			log.info("Enter Fruit Type:"+" ");
			fruitob.setfruittype(scnr.nextLine());

			log.info("Enter Fruit Color:");
			fruitob.setfruitcolor(scnr.nextLine());

			log.info("Enter Fruit Cost:");
			fruitob.setfruitcost(scnr.nextInt());

			list.add(fruitob);

		}
		scnr.close();

		for (int i = 0; i < list.size(); i++) {

			log.info(list.get(i)+" ");

		}

		sortFruits(list);
		searchFruits(list);
	}
}
