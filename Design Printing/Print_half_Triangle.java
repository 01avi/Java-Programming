import java. util.Scanner;
public class Print_half_Triangle
{
public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of Triangle:- ");
        int n= input.nextInt();
    
        for(int i=1;i<=n;i++){
             for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    } 
}
