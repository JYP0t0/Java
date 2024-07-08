package sub2;

public class Book {
	//속성
	private String title;
	private String author;
	private String isbn;
	private int availableCopies;
	
	// 생성자
	public Book(String title, String author, String isbn, int availableCopies) {
		this.title = title;
		this.author = author;
		this.isbn = isbn; 
		this.availableCopies = availableCopies;
	}
	public void borrowBook() {
		if(availableCopies > 0) {
			availableCopies --;
			return true;
		}
		return false;
	}
	public void returnBook() {
		availableCopies++;
	}
	public void show() {
		System.out.println("책 제목: " + this.title);
		System.out.println("책 저자: " + this.author);
		System.out.println("책 ISBN" + this.isbn);
		System.out.println("이용 가능한 복사본 수" + this.availableCopies);
	}
	
	get
	set
	
	get
	set
	
	get
	set
	
	get
	set
	
}
