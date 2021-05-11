package fruit.java.generics.com;

import java.util.*;
import java.util.logging.Logger;
import java.util.stream.Collectors;

class Sortbycost implements Comparator<Fruits> {

	public int compare(Fruits a, Fruits b) {
		return b.fruitcost - a.fruitcost;
	}
}

class SortbyName implements Comparator<Fruits> {
	@Override
	public int compare(Fruits a, Fruits b) {
		return b.fruitname.compareTo(a.fruitname);
	}
}

public class Fruitshopgeneric implements Base {
	static Logger log = Logger.getLogger(Fruitshopgeneric.class.getName());

	public static void main(String[] args) {

		ArrayList<Fruits> ar = new ArrayList<>();
		ar.add(new Fruits("apple", "cit", "green", "ROHINI'S  FOOD PRODUCTS", 230));
		ar.add(new Fruits("grapes", "cit", "black", "IG INTERNATIONAL", 90));
		ar.add(new Fruits("mango", "cit", "yellow", "ANMOL FRUIT DISTRIBUTORS", 110));
		ar.add(new Fruits("banana", "cit", "Red", "ROHINI'S FOOD PRODUCTS", 80));

		Scanner sc = new Scanner(System.in);
		log.info("choose : \n 1)VIEW PRODUCT DETAILS \n 2) SORT BY COST \n 3) SORT BY NAME \n 4) SEARCH PRODUCTS");
		int op = sc.nextInt();
		switch (op) {
		case 1:
			log.info("Product Details");
			for (int i = 0; i < ar.size(); i++)
				log.info(ar.get(i) + " ");
			break;
		case 2:
			Collections.sort(ar, new Sortbycost());

			log.info("\nSorted by fruit cost");
			for (int i = 0; i < ar.size(); i++)
				log.info(ar.get(i) + " ");

			break;
		case 3:
			Collections.sort(ar, new SortbyName());

			log.info("\nSorted by fruit name");
			for (int i = 0; i < ar.size(); i++)

				log.info(ar.get(i) + " ");

			break;
		case 4:
			log.info("SEARCH PRODUCTS");
			log.info("1) Search By Fruitname \n 2)Search by Distributor ");
			Scanner f = new Scanner(System.in);
			int searchnum = f.nextInt();
			switch (searchnum) 
			{
			case 1:
				log.info("enter fruitname");
				Scanner d = new Scanner(System.in);
				String fruitname = d.nextLine();
				switch (fruitname) {
				case "mango":

					List<Fruits> result1 = ar.stream().filter(x -> "mango".equals(x.getFruitname()))
							.collect(Collectors.toList());
					for (int i = 0; i < result1.size(); i++) {
						log.info(result1.get(i) + "\n");
					}
					break;
				case "banana":

					List<Fruits> result2 = ar.stream().filter(x -> "banana".equals(x.getFruitname()))
							.collect(Collectors.toList());
					for (int i = 0; i < result2.size(); i++) {
						log.info(result2.get(i) + "\n");
					}
					break;
				case "grapes":
					List<Fruits> result3 = ar.stream().filter(x -> "grapes".equals(x.getFruitname()))
							.collect(Collectors.toList());
					for (int i = 0; i < result3.size(); i++) {
						log.info(result3.get(i) + "\n");
					}
					break;
				case "apple":
					List<Fruits> result4 = ar.stream().filter(x -> "apple".equals(x.getFruitname()))
							.collect(Collectors.toList());
					for (int i = 0; i < result4.size(); i++) {
						log.info(result4.get(i) + "\n");
					}
					break;
				default:
					log.info("product not in stock");
				}
				break;
			case 2:
				log.info("enter fruitname");
				Scanner da = new Scanner(System.in);
				log.info(
						"Choose Distributor \n 1)ROHINI'S FOOD PRODUCTS \n 2)IG INTERNATIONAL \n 3)ANMOL FRUIT DISTRIBUTORS");
				int distributorname = da.nextInt();
				switch (distributorname) {
				case 1:

					List<Fruits> result1 = ar.stream()
							.filter(x -> "ROHINI'S FOOD PRODUCTS".equals(x.getDistributorname()))
							.collect(Collectors.toList());
					for (int i = 0; i < result1.size(); i++) {
						log.info(result1.get(i) + "\n");
					}

					break;
				case 2:

					List<Fruits> result2 = ar.stream().filter(x -> "IG INTERNATIONAL".equals(x.getDistributorname()))
							.collect(Collectors.toList());
					for (int i = 0; i < result2.size(); i++) {
						log.info(result2.get(i) + "\n");
					}

					break;
				case 3:

					List<Fruits> result3 = ar.stream()
							.filter(x -> "ANMOL FRUIT DISTRIBUTORS".equals(x.getDistributorname()))
							.collect(Collectors.toList());

					for (int i = 0; i < result3.size(); i++) {
						log.info(result3.get(i) + "\n");
					}

					break;
				default:
					log.info("enter a valid option");
				}

			}
			sc.close();
        break;
		default:
			log.info("enter valid option");

		}

	}

}
