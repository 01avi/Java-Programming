import java.util.Scanner;
public class Sum_of_OddNum_till
{
public static void main(String[] args){
        int sum=0, n, i;
      
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number till:- ");
        n = input.nextInt();
           
        for( i=1; i<=n; i++)
        {
            if(i%2!=0)
            {
              sum+= i;
            }
            
        }
            System.out.println("SUM OF odd NUMBERS:- " +sum);
            System.out.println();
    }
}
