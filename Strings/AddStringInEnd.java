import java.util.Scanner;
public class AddStringInEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String:-");
        String st = sc.nextLine();
        StringBuilder sb = new StringBuilder(st);

        System.out.println("Enterd Strings is:- " + sb);
        System.out.println();
        int n;
        do{
        System.out.println("If you want to insert more Strings press 1 else press 0:- ");
        n = sc.nextInt();
        if (n == 1) {
           
            System.out.println("Enter Charecter, You want to insert at end (" +st.length()+ ") position:- ");
            char b = sc.next().charAt(0);
          
            sb.append(b);
            System.out.println("New String is:- "+sb );

        } else {
            System.out.println("Thank you for using!!!");
        }
    } while (n != 0);
}
}
 
