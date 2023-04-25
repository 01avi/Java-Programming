import java.util.Scanner;
 public class Age_calculator

 {
 public static void main(String[] args){
     int b;
     do{
     Scanner input=new Scanner(System.in);
     System.out.println("ENTER YOUR BIRTH YEAR:-");
     int a = input.nextInt();
     b=2022-a;
    System.out.println("YOUR AGE IN 2022 IS:-"+b);
    System.out.println("\n");
 } while(b!=0);
}
}
