package function;

import java.util.Scanner;

public class FuncClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter three numbers: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		int higher = max(n1, n2, n3); 
		
		showResult(higher);

		sc.close();

	}
	public static int max(int x, int y, int z) {
		int higher = 0;
		if (x > y && x > z) {
			higher = x;
		}
		else if (y > z) {
			higher = y;
		}
		else {
			higher = z;
		}
		return higher;
	}
	public static void showResult(int value){
		System.out.println(value);
	}
}
