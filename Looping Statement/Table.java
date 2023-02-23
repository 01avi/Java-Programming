import java.util.Scanner;
public class Table
{
public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("ENTER NUMBER FOR TABLE:-");
    int b;
    int a=input.nextInt();
    int i;
    for(i=1;i<=10;i++){
        b=a*i;
        System.out.println("TABLE IS:-  "+b);
    }


}
}
