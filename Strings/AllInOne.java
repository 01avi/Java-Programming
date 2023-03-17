import java.util.Scanner;

public class AllInOne {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num; 
        do {
        System.out.println("For Print String's all charecter        press 1");
        System.out.println("For string length                       press 2");
        System.out.println("Pick sub String from original String    press 3");
        System.out.println("for adding String at last position      press 4");
        System.out.println("insert String In original string        press 5");
        System.out.println("Delete String from original string      press 6");
        System.out.println("for Reverse the string                  press 7");
        System.out.println("For compare two String                  press 8");
        System.out.println("For exit                                press 0");

        
            System.out.println(":- ");
            num = sc.nextInt();
            if (num == 8) {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter first String:- ");
                String a = s.nextLine();
                System.out.println("Enter second String:- ");
                String b = s.nextLine();
                System.out.println();
                if (a.compareTo(b) > 0) {
                    System.out.println("Greater String is:-  " + a);
                } else if (a.compareTo(b) < 0) {
                    System.out.println("Greater String is:-  " + b);
                } else {
                    System.out.println("Both Strings " + a + " and " + b + " are equal");
                }

            } else if (num == 1) {
                Scanner w = new Scanner(System.in);
                System.out.println("Enter String:- ");
                String c = w.nextLine();
                System.out.println();
                System.out.println("Character of String " + c + " is:- ");
                for (int i = 0; i < c.length(); i++) {
                    System.out.println(c.charAt(i));

                }

            } else if (num == 2) {
                Scanner y = new Scanner(System.in);
                System.out.println("Enter String:- ");
                String d = y.nextLine();
                System.out.println("Length of String " + d + " is:- " + d.length());

            } else if (num == 3) {
                Scanner x = new Scanner(System.in);
                System.out.println("Enter String:- ");
                String e = x.nextLine();
                System.out.println("Enter begining Index of wanted String:- ");
                int f = x.nextInt();

                System.out.println("Enter end Index of wanted String:- ");
                int g = x.nextInt();
                String ss = e.substring(f, g);
                System.out.println("You pick:- " + ss);

            } else if (num == 4) {
                Scanner v = new Scanner(System.in);
                System.out.println("Enter String:- ");
                String h = v.nextLine();
                StringBuilder sb = new StringBuilder(h);
                System.out.println("Enterd Strings is:- " + sb);
                System.out.println();
                int n;

                System.out.println("If you want to insert more Strings press 1 else press 0:- ");
                n = v.nextInt();
                if (n == 1) {

                    System.out.println("Enter Charecter, You want to insert at end (" + h.length() + ") position:- ");
                    char b = v.next().charAt(0);

                    sb.append(b);
                    System.out.println("New String is:- " + sb);

                } else if (n == 0) {
                    System.out.println("Thank you for using!!!");
                }
            } else if (num == 5) {
                Scanner u = new Scanner(System.in);
                System.out.println("Enter String:- ");
                String i = u.nextLine();
                StringBuilder sb = new StringBuilder(i);
                System.out.println("Enterd Strings is:- " + sb);
                System.out.println();
                int n;

                System.out.println("If you want to insert more Strings press 1 else press 0:- ");
                n = u.nextInt();
                if (n == 1) {

                    System.out.println("Enter begining Index:- ");
                    int f = u.nextInt();
                    System.out.println("Enter Charecter, You want to insert at " + f + " position:- ");
                    char g = u.next().charAt(0);
                    sb.insert(f, g);
                    System.out.println("New String is:- " + sb);

                } else if (n == 0) {
                    System.out.println("Thank you for using!!!");
                }

            } else if (num == 6) {
                Scanner t = new Scanner(System.in);
                System.out.println("Enter String:- ");
                String j = t.nextLine();
                StringBuilder sb = new StringBuilder(j);
                System.out.println("Enterd Strings is:- " + sb);
                System.out.println();
                int n;

                System.out.println("If you want to delete Strings press 1 else press 0:- ");
                n = t.nextInt();
                if (n == 1) {

                    System.out.println("Enter begining Index of wanted String:- ");
                    int f = t.nextInt();

                    System.out.println("Enter end Index of wanted String:- ");
                    int g = t.nextInt();
                    sb.delete(f, g);
                    System.out.println("New String is:- " + sb);

                } else if (n == 0) {
                    System.out.println("Thank you for using!!!");
                }

            } else if (num == 7) {
                Scanner q = new Scanner(System.in);
                System.out.println("Enter String:-");
                String h = q.nextLine();
                StringBuilder sb = new StringBuilder(h);

                for (int i = 0; i < sb.length() / 2; i++) {
                    int front = i;
                    int back = sb.length() - 1 - i;
                    char frontChar = sb.charAt(front);
                    char backChar = sb.charAt(back);

                    sb.setCharAt(front, backChar);
                    sb.setCharAt(back, frontChar);
                }

                System.out.println("New Reverse String:- " + sb);
            } else {
                System.out.println("Thanks for using!!!");
            }
            System.out.println();
        } while (num != 0);
    }
}