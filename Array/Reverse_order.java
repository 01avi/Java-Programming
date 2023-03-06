import java.util.Scanner;
public class Reverse_order
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want to store:- ");
        int a = sc.nextInt();
        int num[] = new int[a];
        int Num[] = new int[a];

        int i;
      
        System.out.println("Enter Numbers:- ");
        for (i = 0; i < a; i++) {
            num[i] = sc.nextInt();
        }
        int j = 0;
        System.out.println();
        System.out.println("Reverse order is:- ");
        for (i = a - 1; i >= 0; i--) {
            Num[i] = num[j];
            j++;
        }
     
        for (i = 0; i < a; i++) {
            System.out.println(Num[i]);
        }
}
}

