import java.util.Scanner;
public class Find_neg_pos_num
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want to store:- ");
        int a = sc.nextInt();
        int num[] = new int[a];

        int i;
        int positive = 0;
        int negative = 0;
        int odd = 0;
        int even = 0;
        int zero = 0;
       
        
        System.out.println("Enter Numbers:- ");
        for (i = 0; i < a; i++) {
            num[i] = sc.nextInt();

            if (num[i] > 0) {
                positive++;
            } else if (num[i] < 0) {
                negative++;

            } else {
                zero++;
           
            }
            if (num[i] % 2 == 0) {
                even++;

            } else {
                odd++; 
            }
             System.out.println("Total positive Number is:- " + positive);
             System.out.println("Total negative number is:- " + negative);
             System.out.println("Total even number is:- " + even);
             System.out.println("Total odd number is:- " + odd);
             System.out.println("Total zero is:- " + zero);

        }
    }
}

