package array;

public class TwoDimensionArray {

	public static void main(String[] args) {

//		int[][] arr = new int[2][3]; 
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };
		System.out.println(arr.length); // 행의 길이가 출력이 됐음.
		System.out.println(arr[0].length);// 0행의 열 길이
		System.out.println(arr[1].length);// 1행의 열 길이

		System.out.println("---------------------");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}

	//알파벳 출력?	char[][] alphabets = new char[13][2];
	}

}
