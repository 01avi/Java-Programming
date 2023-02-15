import java.util.Scanner;
public class Icard
{
public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("ENTER YOUR NAME:-");
    String a=input.nextLine();

    System.out.println("ENTER YOUR FATHER'S NAME:-");
    String c=input.nextLine();
   
    
    System.out.println("ENTER YOUR MOTHER'S NAME:-");
    String e=input.nextLine();
   
    
    System.out.println("ENTER YOUR COLLAGE NAME:-");
    String d=input.nextLine();
    

    System.out.println("ENTER YOUR ROLL NUMBER:-");
    int b=input.nextInt();

    System.out.println("\n");
    System.out.println("NAME:-          "+a);
    System.out.println("FATHER'S NAME:- "+c);
    System.out.println("MOTHER'S NAME:- "+e);
    System.out.println("ROLL NO.:-      "+b);
    System.out.println("COLLAGE:-       "+d);
}
}
