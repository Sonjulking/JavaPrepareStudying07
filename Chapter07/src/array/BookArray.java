package array;

public class BookArray {

	public static void main(String[] args) {

		Book[] library = new Book[5];// å 5���� ������ ���� �ƴ϶� å�� ���� �ּ� 5���� ������.

		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}

		library[0] = new Book("�����1", "�۸���");
		library[1] = new Book("�����2", "�۸���");
		library[2] = new Book("�����3", "�۸���");
		library[3] = new Book("�����4", "�۸���");
		library[4] = new Book("�����5", "�۸���");
		
		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]); //�ּҰ� ����
		}
		
		for (int i = 0; i < library.length; i++) {
			library[i].showBookInfo(); //å�̸� ����
		}

	}

}
