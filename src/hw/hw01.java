package hw;
import java.util.Scanner;

public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		System.out.println("�п�J���X�����:");
		int n =scn.nextInt();
		System.out.println("��J3�����Z:");
		for(int i=0;i<n;i++){
			int a=scn.nextInt();
			int b=scn.nextInt();
			int c=scn.nextInt();
			if (a>=60 && b>=60 && c>=60){
				System.out.println("P");
			}
			else if(a+b+c>=220){
					System.out.println("P");
			}
			else if(a>=60||b>=60||c>=60){
				if(Math.max(Math.max(a, b), c) >= 80){
					System.out.println("M");
				}
//				if(a>=80||b>=80||c>=80){
//					System.out.println("M");
//				}
				else{
					System.out.println("F");
				}
			}
			
			else{
				System.out.println("F");
			}

		}
	}

}
