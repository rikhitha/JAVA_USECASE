package sales.report.java.com;

import java.util.ArrayList;
import java.util.Scanner;

class Goods {
    private String id;
    private String name;
    private double price;
    private String unit;
    private int count;

    public Goods() {
    }

    public Goods(String id, String name, double price, String unit) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.unit = unit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}


public class SalesReport extends Basemodel
{

	public static void main(String[] args) 
	{
		ArrayList<Goods> list = new ArrayList<>();
        list.add(new Goods("001", "Rice", 15.5, "jin"));
        list.add(new Goods("002", "Sugar", 14.5, "package"));
        list.add(new Goods("003", "Dal", 145.0, "A"));
        list.add(new Goods("004", "Salt", 19.0, "G"));
        list.add(new Goods("005", "Thyme", 179.0, "h"));
        Scanner sc = new Scanner(System.in);

        while (true) {
        	System.out.println("\t \t \t \t \t \t E-Mart");
        	System.out.println(" \t \t \t \t  \t 123 Avenue CA District ");
            System.out.println(" enter what you want to do:");
            System.out.println("1: product list 2: receipt 3: Exit");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    showAllGoods(list);
                    break;
                case 2:
                    payAndShow(list);
                    break;
                case 3:
                    System.out.println("Thank you");
                    System.exit(0);
                default:
                    System.out.println("Input no corresponding operation, please re-enter");
            }
        }


    }

    
    public static void showAllGoods(ArrayList<Goods> list)
    {
    	System.out.println("\t \t \t \t \t \t E-Mart");
    	System.out.println(" \t \t \t \t  \t 123 Avenue CA District ");
        System.out.println("---------------------------");
        System.out.println("Product List\n");
        System.out.println("Commodity id\t\t name\t\t unit price");
        for (int i = 0; i < list.size(); i++) {
            Goods g = list.get(i);
            System.out.println(g.getId() + "\t\t\t" + g.getName() + "\t\t" + g.getPrice() );
        }
        System.out.println("---------------------------");
        System.out.println("enter items purchased (input format: product id-purchase quantity)");
        Scanner sc = new Scanner(System.in);

        while (true) {
            String line = sc.nextLine();
            String[] good = line.split("-");

            if ("end".equals(line)) {
                System.out.println("End of Purchase");
                break;
            }
            if (good.length != 2) {
                System.out.println("The purchase posture you entered is incorrect, please change the posture and try again (format: product id-purchase quantity)");
                continue;
            }
            if (!isIdExist(list, good[0])) {
                System.out.println("The product id you entered does not exist, please enter it again!");
                continue;
            }
            addGoods(list, good[0], Integer.valueOf(good[1]));
        }
    }

    public static boolean isIdExist(ArrayList<Goods> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            Goods g = list.get(i);
            if (g.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    
    public static void addGoods(ArrayList<Goods> list, String id, int count) {
        for (int i = 0; i < list.size(); i++) {
            Goods g = list.get(i);
            if (g.getId().equals(id)) {
                int oldCount = g.getCount();
                g.setCount(oldCount + count);
                return;
            }
        }
    }

    
    public static void payAndShow(ArrayList<Goods> list) {
    	System.out.println("\t \t \t \t \t \t E-Mart");
    	System.out.println(" \t \t \t \t  \t 123 Avenue CA District ");
        System.out.println("---------------------------");
        System.out.println("          Sales Report         ");
        System.out.println("Name\t price\t quantity\t amount");
        int type = 0;
        int all = 0;
        double allMoney = 0.0;
        for (int i = 0; i < list.size(); i++) {
            Goods g = list.get(i);
            int count = g.getCount();
            if (count != 0) {
                type++;
                all += count;
                double price = g.getPrice();
                double money = price * count;
                allMoney += money;
                System.out.println(g.getName() + "\t" + price + "\t\t" + count + "\t" + money);
            }
        }
        System.out.println("---------------------------");
        System.out.println(type + "Items");
        System.out.println("total:" + all + "Piece");
        System.out.println("Total:" + allMoney);
        System.out.println("---------------------------");
        
        for (int i = 0; i < list.size(); i++) {
            list.get(i).setCount(0);
        }
		
	}

}
