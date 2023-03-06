import java.util.Scanner;
public class LargestSmallest
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want to store:- ");
        int a = sc.nextInt();
        float num[] = new float[a];

        System.out.println("Enter Numbers:- ");
        for (int i = 0; i < a; i++) {
            num[i] = sc.nextFloat();
        }

        float Largest = num[0];
        float Smallest =num[0];
        for (int i = 0; i < a; i++) {
            if (num[i] > Largest) {
                Largest = num[i];
            }
            if (num[i] < Smallest) {
                Smallest = num[i];
            }
        }
        System.out.println("Smallest number in Array is:- " + Smallest);
        System.out.println("Largest number in Array is:- " + Largest);
    }
}
