import java.util.Scanner;
public class Store_numeric
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want to store:- ");
        int a = sc.nextInt();
        int num[] = new int[a];

        int i;
        System.out.println("Enter Numbers:- ");
        for (i = 0; i < a; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("You stored these numbers successfully:- ");
        for (i = 0; i < a; i++) {
            System.out.println(":- " + num[i]);
        }
    }
}
