import java.util.Scanner;

public class UsingTernaryOperator {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a random number");
        double value=sc.nextDouble();
        String valueDescription = value<=0? "Small": value>=1000000? "Large": "Enough";

        System.out.println("The number "+value+" is "+valueDescription);
    }
}
