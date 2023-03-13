import java.util.Scanner;
public class Multiplication
{
public static void main(String[] args){
    int i=0;
    do{
    Scanner Print=new Scanner(System.in);
    System.out.println(" PRESS 0 FOR EXIT (FIRST/SECOND DIGIT)");
    System.out.println("ENTER FIRST DIGIT:-");
    int a=Print.nextInt();
    System.out.println("ENTER SECOND DIGIT:-");
    int b=Print.nextInt();
    
    i=a*b;
    System.out.println(i);
  }while(i!=0);
}
}

