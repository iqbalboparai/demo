package demo2;

import java.util.Scanner;

public class CheckPowerOf2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number for check:"); 
		int num = in.nextInt();
		
		if(num>0 && (num & (num -1)) == 0 ){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
		if((num & -num) == num){
			System.out.println("Yes two");
		}else{
			System.out.println("No two");
		}
		
		in.close();
	}

}
