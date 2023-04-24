import java.util.Scanner;

public class Family_member {
    public static void main(String[] args) {
        String n[] = new String[1];
        String m[] = new String[1];
      
        Scanner sc = new Scanner(System.in);
        System.out.println("First enter your Father's name and than enter your Mother's name:- ");
        for (int i = 0; i < 1; i++) {
            n[i] = sc.nextLine();
            m[i] = sc.nextLine();
          
        }
       
        for (int i = 0; i < 1; i++) {
            System.out.println("Your Father's name is:- " + n[i]);
            System.out.println("Your Mother's name is:- " + m[i]);
        }    
    }
}
