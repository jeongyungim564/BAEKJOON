import java.util.*;
public class B_3003_king_queen {
	public static void main(String[] args) {

	//�ڵ���̰� �ʹ� �� �迭�� �ٽ�
		Scanner sc = new Scanner(System.in);
		int []piece = {1, 1, 2, 2, 2, 8};
		for(int i = 0; i<piece.length;i++) {
			System.out.print(piece[i] -sc.nextInt() + " ");
		}
	}
}
