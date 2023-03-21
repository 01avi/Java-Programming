import java.util.Scanner;
public class DeleteString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String:-");
        String st = sc.nextLine();
        StringBuilder sb = new StringBuilder(st);

        System.out.println("Enterd Strings is:- " + sb);
        System.out.println();
        System.out.println("If you want to insert more Strings press 1 else press 0:- ");
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("Enter string's  begining place number(MAX. VALUE = " +st.length()+"):- ");
            int a = sc.nextInt();
            System.out.println("Enter string's end place number(MAX. VALUE = " +st.length()+"):- ");
            int b = sc.nextInt();
          
            sb.delete(a, b);
            System.out.println("New String is:- "+sb );

        } else {
            System.out.println("Thank you for using!!!");
        }
    }
}
 
