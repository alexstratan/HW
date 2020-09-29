import java.util.Random;
import java.util.Scanner;

public class CalcSuma{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the max nr. of elements");
        int max=sc.nextInt();
        System.out.println("Enter the first ... nr. of elements");
        int n=sc.nextInt();

        if(n>max){
            System.out.println("This nr. can't be bigger than the max one. Start over;");
            Runtime. getRuntime(). exit(0);
        }

        int[] characters=new int[max];
        int sum=0;
        int iterator=0;
        Random rand=new Random();


        while(iterator<n){
            characters[iterator]=rand.nextInt(100);
            sum+=characters[iterator];
            iterator++;
        }

        System.out.println("The sum of the first "+n+" integers: "+sum);

    }
}