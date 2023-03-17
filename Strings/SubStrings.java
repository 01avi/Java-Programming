import java.util.Scanner;

public class SubStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:-");
        String st = sc.nextLine();

        System.out.println("Enter begining Index of wanted String:- ");
        int a = sc.nextInt();

        System.out.println("Enter end Index of wanted String:- ");
        int b = sc.nextInt();

        String name = st.substring(a, b);
        System.out.println("Your wanted String is:- "+name);

    }
}



