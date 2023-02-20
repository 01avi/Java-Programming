import java.util.Scanner;
public class Choose_no
{
public static void main(String[] args){
System.out.println("Press 1 for hindi");
System.out.println("Press 2 for English");
System.out.println("Enter your choice:-");

Scanner sc =new Scanner(System.in);

int choice=sc.nextInt();

switch(choice){
    case 1:System.out.println("YOU HAVE SELECTED HINDI LANGUAGE");
    break;
    case 2:System.out.println("YOU HAVE SELECTED ENGLISH LANGUAGE");
    break;
    default: System.out.println("WRONG INPUT!!");
}
}
}

