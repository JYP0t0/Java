package Test02;

public class Product {
	private String productId;
	private String productName;
	private int price;
	private int quantity;
	
	public Product(String productId, String productName, int price, int quantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}

	// 가격 수정 메서드
	public void updatePrice(int newPrice) {
		
		this.price = newPrice;
		System.out.println("키보드 가격 수정 됨");
	}
	
	// 재고 관리 메서드
	public void addStock(int addStock) {
		
		this.quantity += addStock;
		System.out.println("키보드 5개 추가됨");
	}
	
	// 상품 정보 출력 메서드
	public void printProductInfo() {
		System.out.println("상품 ID: " + productId);
		System.out.println("상품 이름: " + productName);
		System.out.println("상품 가격: " + price);
		System.out.println("재고수량: " + quantity);
	}
}
