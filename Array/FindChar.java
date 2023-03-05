import java.util.Scanner;
public class FindChar
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many character you want to enter:- ");
        int a = sc.nextInt();
        char alpha[] = new char[a];
        
        int v = 0, c = 0;
        System.out.println("Enter "+a+" Character:- ");
        for (int i = 0; i < a; i++) {
            alpha[i] = sc.next().charAt(0);
        }

      
        for (int i = 0; i < a; i++) {
            if (alpha[i] == 'a' || alpha[i] == 'e' || alpha[i] == 'i' || alpha[i] == 'o' || alpha[i] == 'u'
                    || alpha[i] == 'A' || alpha[i] == 'E' || alpha[i] == 'I' || alpha[i] == 'O' || alpha[i] == 'U') {
                System.out.println("Vowel is:- " + alpha[i]);
               
            } else {
                System.out.println("Consonant is:- " + alpha[i]);
               
            }
        }

        for (int i = 0; i < a; i++) {
            if (alpha[i] == 'a' || alpha[i] == 'e' || alpha[i] == 'i' || alpha[i] == 'o' || alpha[i] == 'u'
                    || alpha[i] == 'A' || alpha[i] == 'E' || alpha[i] == 'I' || alpha[i] == 'O' || alpha[i] == 'U') {
                v++;
            } else {
                c++;
            }
        }
        System.out.println("Total noumber of vowel:- " + v);
        System.out.println("Total noumber of Consonant:- " + c);
       
    }
}
