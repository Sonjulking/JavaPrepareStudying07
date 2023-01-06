package arraylist;

import java.util.ArrayList; //자동으로 임포트 하려먼 Ctrl + Shift + O 

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");

		for (String s : list) { // 향상된 포문
			System.out.println(s);
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
