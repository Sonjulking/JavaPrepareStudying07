package array;

public class BookArray {

	public static void main(String[] args) {

		Book[] library = new Book[5];// 책 5개가 생성된 것이 아니라 책이 들어올 주소 5개가 생성됨.

		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}

		library[0] = new Book("고양이1", "멍멍이");
		library[1] = new Book("고양이2", "멍멍이");
		library[2] = new Book("고양이3", "멍멍이");
		library[3] = new Book("고양이4", "멍멍이");
		library[4] = new Book("고양이5", "멍멍이");
		
		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]); //주소값 보기
		}
		
		for (int i = 0; i < library.length; i++) {
			library[i].showBookInfo(); //책이름 보기
		}

	}

}
