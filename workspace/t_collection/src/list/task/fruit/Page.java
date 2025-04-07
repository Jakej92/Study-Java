package list.task.fruit;

import list.task.DBConnecter;

public class Page {
	   public static void main(String[] args) {
		      Fruit fruit = new Fruit();
		      Market market = new Market();
		      fruit.setName("사과");
		      fruit.setPrice(500);
		      
		      market.save(fruit);
		      System.out.println(DBConnecter.fruits);
		      
		      Fruit fruit1 = new Fruit();
		      fruit1.setName("망고");
		      fruit1.setPrice(1000);
		      
		      market.save(fruit1);
		      System.out.println(DBConnecter.fruits);

		
	}
}
