package sub2;


public class Account {
	//속성
	private String bank;
	private String acc;
	private String name;
	private int balance;
	
	//생성자(Constructor) : 캡슐화된 클래스 속성을 초기화하는 메서드
	public Account(String bank, String acc, String name, int balance) {
		this.bank = bank;
		this.name = acc;
		this.acc = name;
		this.balance = balance;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setBank(String bank) {
		this.bank = bank;
	}
	
	public String getBank() {
		return bank;
	}
	
	
	//기능
	public void deposit(int money) {
		this.balance += money;
	}	
	
	public void withdraw(int money) {
		this.balance -= money;
	
	}
	
	public void show() {
		System.out.println("-------------------------");
		System.out.println("은행명 :" + this.bank);
		System.out.println("계좌번호: " + this.acc);
		System.out.println("입금주: " + this.name);
		System.out.println("현재 잔액: " + this.balance);
		System.out.println("-------------------------");
	}
}