package list.task.goods;

import list.task.DBConnecter;

public class Page {
	public static void main(String[] args) {
		GoodsService service = new GoodsService();

//		상품 추가
//		Goods mouse = new Goods();
//		mouse.setName("마우스");
//		mouse.setPrice(50000);
//		mouse.setQuantity(15);
//		service.addGoods(mouse);
//		System.out.println(DBConnecter.goods);
		
		Goods goods = new Goods("마우스", 50000, 15);
		service.addGoods(goods);
//		System.out.println("상품 추가 완료: " + goods.getName());

		Goods goods1 = new Goods("노트북", 1500000, 5);
        service.addGoods(goods1);
//        System.out.println("상품 추가 완료: " + goods1.getName());
        
        Goods goods2 = new Goods("마우스", 1500000, 5);
        service.addGoods(goods2);
//        System.out.println("상품 추가 완료: " + goods2.getName());
 
        Goods goods3 = new Goods("모니터", 180000, 7);
        service.addGoods(goods3);
//        System.out.println("상품 추가 완료: " + goods3.getName());
        
        System.out.println(DBConnecter.goods);
        
//      상품 조회
        Goods foundGoods = service.findGoods("노트북");
        if(foundGoods != null) {
            System.out.println("조회된 상품: " + foundGoods);
        } else {
            System.out.println("상품을 찾을 수 없습니다.");
        }
        
//      상품 목록
        System.out.println("현재 상품 목록:");
        for (Goods goodsList : service.goodsList()) {
            System.out.println(goodsList);
        }
        
//      // 상품 수정
        // 기존 "노트북" 상품의 가격과 설명을 수정하는 예제
        Goods update = new Goods("노트북", 1300000, 2);
        service.edit("노트북", update);
        System.out.println("상품 수정 후:");
        System.out.println(service.findGoods("노트북"));

        // 5. 상품 삭제
        service.delete("노트북");
        System.out.println("상품 삭제 후 목록:");
//        System.out.println(DBConnecter.goods);
        for (Goods g : service.goodsList()) {
            System.out.println(g);
        }
	}

}
