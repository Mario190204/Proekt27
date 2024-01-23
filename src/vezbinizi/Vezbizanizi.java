package vezbinizi;

import java.util.Scanner;
public class Vezbizanizi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Da se ispecatat: clenovi na niza koi ne se delivi so 3");
		System.out.println("Vnesi broj na clenovi vo nizata");
		int n = input.nextInt();
		
		int niza[] = new int[n];
		for (int i=0; i <niza.length; i++) {
			if(i % 3 !=0) {
				System.out.println (i + "");
			}
		}
	}
}
	


