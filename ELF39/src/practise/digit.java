package practise;

import java.util.Scanner;

public class digit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values");
		int num=sc.nextInt();
		int c=0;
		while(num!=0) {
			c++;
			num=num/10;
		}
		System.out.println(c);
		}
		
	}

