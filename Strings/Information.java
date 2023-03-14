import java.util.Scanner;
public class Information
{
    
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name:- ");
    String name=sc.nextLine();
    System.out.println("Enter your Father's name:- ");
    String Fname = sc.nextLine();
    System.out.println("Enter your Mother's name:- ");
    String Mname = sc.nextLine();
    System.out.println("Enter your Brother's name:- ");
    String Bname = sc.nextLine();
    System.out.println("Enter your Bother's Wife name:- ");
    String Sname = sc.nextLine();

    System.out.println();

    System.out.println("Your name is:- " + name);
    
    System.out.println("Your  Father's name is:- " + Fname);
    
    System.out.println("Your Mother's name is:- " + Mname);
    
    System.out.println("Your Bother's name is:- " + Bname);
    
    System.out.println("Your Bother's Wife name is:- "+ Sname);


}
}
