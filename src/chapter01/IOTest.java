package chapter01;

import java.util.Scanner;

public class IOTest {

	public static void main(String[] args) {
//		System.out.println( "HelloWorld");
//		System.out.print("Hello World\n");
//		System.out.println("Hello World");
//		
//		//줄만 바꿀때
//		System.out.println("");
//		System.out.println("\n");
//		System.out.println("Hello World");
		Scanner scanner=new Scanner(System.in);
		
//		int count1 = scanner.nextInt();
//		int count2 = scanner.nextInt();
//		String str = scanner.next();
//		
//		System.out.println(count1+ ":" + count2+":"+str);
		
		String str2 = scanner.nextLine();
		System.out.println(str2);
		//키드보 자원 정리
		scanner.close();
}
}
