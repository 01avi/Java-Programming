i
mport java.util.Scanner;
public class DESIGN_MAKING
{
public static void main(String[] args){
   Scanner input=new Scanner(System.in);
    System.out.println("ENTER NUMBER FOR DESIGN:- ");
    int n=input.nextInt();
    int i,j;
    for(i=0;i<=n;i++){
        for(j=0;j<=i;j++){
            System.out.println("*");
        }
        System.out.println("\n");
     }

    }
}
