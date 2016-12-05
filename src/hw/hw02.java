package hw;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		System.out.println("請輸入4個骰子點數:");
		int [] a = new int[4];
		for(int i=0;i<4;i++){
			a[i]=scn.nextInt();
		}
		Arrays.sort(a);
//		for(int i=0;i<4;i++){
//			System.out.println(a[i]);
//		}
		if(a[0]==a[1]){
			System.out.print(a[2]+a[3]);
		}
		else if(a[1]==a[2]){
			System.out.print(a[0]+a[3]);
		}
		else if(a[2]==a[3]){
			System.out.print(a[0]+a[1]);
		}
		else{
			System.out.print("R");
		}
		}}