import java.util.Scanner;

public class PrintStringChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:-");
        String st = sc.nextLine();

        System.out.println();
        System.out.println("Entered String:- " + st);

        System.out.println("Character of String " + st + " is:- ");
        for (int i = 0; i < st.length(); i++) {
            System.out.println(st.charAt(i));
        }

    }
}
