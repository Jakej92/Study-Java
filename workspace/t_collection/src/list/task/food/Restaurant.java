package list.task.food;

import java.util.ArrayList;
import java.util.List;

import list.task.DBConnecter;

public class Restaurant {
//   음식 이름 검사
   public Food checkName(Food anotherFood) {
      for(Food food: DBConnecter.foods) {
         if(food.equals(anotherFood)) {
            return food;
         }
      }
      
      return null;
   }
   
   public Food checkName(String name) {
      for(Food food: DBConnecter.foods) {
         if(food.getName().equals(name)) {
            return food;
         }
      }
      
      return null;
   }
   
//   음식 추가
   public void save(Food food) {
      DBConnecter.foods.add(food);
   }
   
//   음식 이름으로 음식 종류 조회
   public String findKind(String name) {
//      for(Food food: DBConnecter.foods) {
//         if(food.getName().equals(name)) {
//            return food.getType();
//         }
//      }
      Food food = checkName(name);
      
      return food == null ? null : food.getType();
   }
   
//   사용자가 원하는 종류의 음식 전체 조회
   public List<Food> findAllByType(String type){
      ArrayList<Food> results = new ArrayList<Food>();
      
      for(Food food: DBConnecter.foods) {
         if(food.getType().equals(type)) {
            results.add(food);
         }
      }
      
      return results;
   }
   
   
//   음식 종류 수정 후 가격 10% 상승
   public void update(Food newFood) {
      Food food = checkName(newFood);
      
      if(food != null) {
         food.setType(newFood.getType());
         food.setPrice((int)(newFood.getPrice() * 1.1));
      }
   }
   
//   사용자가 원하는 종류의 음식 개수 조회
   public int getCount(String type) {
      int count = 0;
      for(Food food: DBConnecter.foods) {
         if(food.getType().equals(type)) {
            count ++;
         }
      }
      
      return count;
   }
}


















