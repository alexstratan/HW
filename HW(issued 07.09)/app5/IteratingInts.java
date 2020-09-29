
import java.util.Scanner;
import java.lang.Runtime;

public class IteratingInts{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a positive value:");
		int value=sc.nextInt();
		System.out.println();
		
		if(value<=0){
			System.out.println("This is not a positive value. Start over.");
			Runtime. getRuntime(). exit(0);
		}

		for(int i=0;i<value;i++){
			for(int l=0;l<=i;l++){
				System.out.print(i+1);
			}
			System.out.println();
		}

		
	}
}