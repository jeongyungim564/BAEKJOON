import java.util.*;
public class Main{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		long A = sc.nextInt();
		long B= sc.nextInt();
		long calculator = (A+B) * (A-B);
		System.out.println(calculator);
	}
}