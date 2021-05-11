package sales.report.java.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;




public class SalesReport implements Basemodel
{
	static Logger log = Logger.getLogger(SalesReport.class.getName());

	public static void main(String[] args) 
	{
		ArrayList<Goods> list = new ArrayList<>();
        list.add(new Goods("001", "Rice", 15.5, "jin"));
        list.add(new Goods("002", "Sugar", 14.5, "package"));
        list.add(new Goods("003", "Dal", 145.0, "A"));
        list.add(new Goods("004", "Salt", 19.0, "G"));
        list.add(new Goods("005", "Thyme", 179.0, "h"));
        Scanner sc = new Scanner(System.in);
        
         while(true)
         {
        	
        
        	log.info("\t \t \t \t \t \t E-Mart");
        	log.info(" \t \t \t \t  \t 123 Avenue CA District ");
        	log.info(" enter what you want to do:");
        	log.info("1: product list 2: receipt 3: Exit");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    showAllGoods(list);
                    
                    break;
                case 2:
                    payAndShow(list);
                    break;
                case 3:
                	log.info("Thank you");
                    System.exit(0);
                    break;
                default:
                	log.info("Input no corresponding operation, please re-enter");
            }
        }


    }

    
    public static void showAllGoods(List<Goods> list)
    {
    	log.info("\t \t \t \t \t \t E-Mart");
    	log.info(" \t \t \t \t  \t 123 Avenue CA District ");
        log.info("---------------------------");
        log.info("Product List\n");
        log.info("Commodity id\t\t name\t\t unit price");
        for (int i = 0; i < list.size(); i++) {
            Goods g = list.get(i);
            log.info(g.getId() + "\t\t\t" + g.getName() + "\t\t" + g.getPrice() );
        }
        log.info("---------------------------");
        log.info("enter items purchased (input format: product id-purchase quantity)");
        Scanner sc = new Scanner(System.in);

        while (true) {
            String line = sc.nextLine();
            String[] good = line.split("-");

            if ("end".equals(line)) {
                log.info("End of Purchase");
                break;
            }
            if (good.length != 2) {
                log.info("The purchase posture you entered is incorrect, please change the posture and try again (format: product id-purchase quantity)");
                continue;
            }
            if (!isIdExist(list, good[0])) {
                log.info("The product id you entered does not exist, please enter it again!");
                continue;
            }
            addGoods(list, good[0], Integer.valueOf(good[1]));
        }
        
    }
   

    public static boolean isIdExist(List<Goods> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            Goods g = list.get(i);
            if (g.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    
    public static void addGoods(List<Goods> list, String id, int count) {
        for (int i = 0; i < list.size(); i++) {
            Goods g = list.get(i);
            if (g.getId().equals(id)) {
                int oldCount = g.getCount();
                g.setCount(oldCount + count);
                return;
            }
        }
    }

    
    public static void payAndShow(List<Goods> list) {
    	log.info("\t \t \t \t \t \t E-Mart");
    	log.info(" \t \t \t \t  \t 123 Avenue CA District ");
        log.info("---------------------------");
        log.info("          Sales Report         ");
        log.info("Name\t price\t quantity\t amount");
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
                log.info(g.getName() + "\t" + price + "\t\t" + count + "\t" + money);
            }
        }
        log.info("---------------------------");
        
        log.log(Level.INFO, "ITEMS: {0} ",type);  
        
        
        
        log.log(Level.INFO, "TOTAL PIECE : {0} ",all);  
        
        
        
        log.log(Level.INFO, "TOTAL: {0} ",allMoney);
        log.info("---------------------------");
        
        for (int i = 0; i < list.size(); i++) {
            list.get(i).setCount(0);
        }
		
	}

}
