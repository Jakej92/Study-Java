package list.task.goods;

import java.util.List;

import list.task.DBConnecter;

public class GoodsService {
//	상품 검사
	public Goods checkName(String name) {
		for(Goods goods: DBConnecter.goods) {
			if(goods.getName().equals(name)) {
				return goods;
			}
		}return null;
	}
	
//	상품 추가
	public void addGoods(Goods goods) {
		if(checkName(goods.getName())==null) {
			DBConnecter.goods.add(goods);
			System.out.println("상품 추가 완료: " + goods.getName());
		}else {
			System.out.println("이미 판매중인 상품은 추가할 수 없습니다.");
		}
	}

//	상품 조회
	public Goods findGoods(String name) {
		for(Goods goods: DBConnecter.goods) {
			if(goods.getName().equals(name)) {
				return goods;
			}
		} return null;
	}
	
//	상품 목록
	public List<Goods> goodsList() {
		return DBConnecter.goods;
	}
	
//	상품 수정
	public void edit(String name, Goods update) {
        Goods goods = findGoods(name);
        if (goods != null) {
            // 기존 상품 정보를 업데이트 (필요에 따라 다른 필드들도 추가 업데이트 가능)
            goods.setName(update.getName());
            goods.setPrice(update.getPrice());
            goods.setQuantity(update.getQuantity());
        } else {
            System.out.println("해당 상품이 존재하지 않습니다.");
        }
    }
	
//	상품 삭제
	public void delete(String name) {
		Goods goods = findGoods(name);
		if (goods != null) {
			DBConnecter.goods.remove(goods);
			System.out.println("삭제된 품목: " + goods.getName());
		}
	}
	
}
