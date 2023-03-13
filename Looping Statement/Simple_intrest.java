import java.util.Scanner;
public class Simple_intrest
{
public static void main(String[] args){
    float SI;
    float d;
    do{
        Scanner input=new Scanner(System.in);
        System.out.println("ENTER PRIMARY AMMOUNT:- ");
        float b=input.nextFloat();
        System.out.println("ENTER RATE OF INTREST:- ");
        float a=input.nextFloat();
        System.out.println("ENTER TIME PERIOD (in years format):- ");
        float c=input.nextFloat();

        SI=(a*b*c)/100;
        d=(SI+b);
        System.out.println("\n");
        System.out.println( "SIMPLE INTREST ON AMMOUNT IS:-"+SI);
        System.out.println("TOTAL AMMOUNT WITH INTREST IS:- "+d);
        System.out.println("\n");
      
        }while(SI!=0);
    }
}
