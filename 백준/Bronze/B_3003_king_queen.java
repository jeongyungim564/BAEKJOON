import java.util.*;
public class B_3003_king_queen {
	public static void main(String[] args) {

	//코드길이가 너무 길어서 배열로 다시
		Scanner sc = new Scanner(System.in);
		int []piece = {1, 1, 2, 2, 2, 8};
		for(int i = 0; i<piece.length;i++) {
			System.out.print(piece[i] -sc.nextInt() + " ");
		}
	}
}
