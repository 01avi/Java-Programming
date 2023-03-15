import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:-");
        String st = sc.nextLine();
        System.out.println();
        System.out.println("Entered String:- "+st);
        System.out.println("Length of String " +  st + " is:- " + st.length());
    }
}
