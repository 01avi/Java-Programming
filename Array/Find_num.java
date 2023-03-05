import java.util.Scanner;
public class Find_num
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want to store:- ");
        int a = sc.nextInt();
        int num[] = new int[a];

        int i, count = 0;
        System.out.println("Enter Numbers:- ");
        for (i = 0; i < a; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("Which element you wants to find:- ");
        int n = sc.nextInt();
        for (i = 0; i < a; i++) {
            if (num[i] == n) {
                count++;
            }
        }
        if (count > 0) {

            System.out.println("Item Found "+count+" times" );
        } else {
            System.out.println("Item not found!!!");
        }
    }
}
