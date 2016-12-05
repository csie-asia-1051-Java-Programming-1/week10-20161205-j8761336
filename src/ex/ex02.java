package ex;
import java.util.Scanner;
/*
 * Topic: 輸入所使用的度數，換算夏月及非夏月之電費金額。
 * Date: 2016/12/05
 * Author: 105021026 詹佩郡
 */

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		System.out.println("請輸入使用的度數:");
		int a =scn.nextInt();
		int b=0;
		if(a<120){
			System.out.println(a*2.10);
			System.out.println(a*2.10);
		}
		else if(121<=a&&a<=330){
			b=a-120;
			System.out.println(120*2.10+b*3.02);
			System.out.println(120*2.10+b*2.68);
		}
		else if(331<=a&&a<=500){
			b=a-330;
			System.out.println(120*2.10+210*3.02+b*4.39);
			System.out.println(120*2.10+210*2.68+b*3.61);
		}
		else if(501<=a&&a<=700){
			b=a-500;
			System.out.println(120*2.10+210*3.02+170*4.39+b*4.97);
			System.out.println(120*2.10+210*2.68+170*3.61+b*4.01);
		}
		else {
			b=a-700;
			System.out.println(120*2.10+210*3.02+170*4.39+200*4.97+b*5.63);
			System.out.println(120*2.10+210*2.68+170*3.61+200*4.01+b*4.50);
		}
	}

}
