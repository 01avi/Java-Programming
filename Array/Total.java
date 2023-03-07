import java.util.Scanner;

public class Total {
    public static void main(String[] args) {

        double sum = 0;
        double P = 0;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("ENTER TOTAL NUMBER OF SUBJECTS");
            int arrayBlocks = input.nextInt();
            int marks[] = new int[arrayBlocks];

            for (int i = 0; i < marks.length; i++) {
                Scanner put = new Scanner(System.in);
                System.out.println("ENTER MARKS ONE BY ONE OUT OF 100:- ");
                marks[i] = input.nextInt();
                sum += marks[i];
            }
            System.out.println("TOTAL MARKS IS:- " + sum);

            for (int i = 0; i < marks.length; i++) {
                P = (sum / arrayBlocks);
            }
            System.out.println("PERCENTAGE IS:- " + P);

        } while (sum != 0);

    }

}
