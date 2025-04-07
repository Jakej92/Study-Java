package list.task;

import java.util.ArrayList;

import list.task.food.Food;
import list.task.fruit.Fruit;
import list.task.goods.Goods;
import list.task.user.User;

public class DBConnecter { // 데이터들을 저장해주는 데이터베이스 클래스 
   protected DBConnecter() {;} // 기본 생성자
//  등록된 User정보를 저장하고 관리하는 ArrayList
   public static ArrayList<User> users = new ArrayList<User>(); 
//	등록된 Fruit의 정보를 저장하고 관리함
   public static ArrayList<Fruit> fruits = new ArrayList<Fruit>();
//   등록된 Food의 정보를 저장하고 관리함
   public static ArrayList<Food> foods = new ArrayList<Food>();
//   등록된 Goods의 정보를 저장하고 관리함
   public static ArrayList<Goods> goods = new ArrayList<Goods>();
   
}