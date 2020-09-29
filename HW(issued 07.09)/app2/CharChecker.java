import java.util.Scanner;

public class CharChecker {

    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
	System.out.println("Enter a char value:");
        char element=sc.next().charAt(0);

        if((element>=65&&element<=90)||(element>=97&&element<=122)){
            if(element=='a'||element=='e'|| element=='i'||element=='o'||element=='u'||
                    element=='A'||element=='E'|| element=='I'||element=='O'||element=='U'){
                System.out.println("Litera este vocala");
            }
            else{
                System.out.println("Litera este consoana");
            }
        }
        else{
            System.out.println("Caracterul nu este o litera");
        }
    }
}