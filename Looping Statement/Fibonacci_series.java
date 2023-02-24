import javax.swing.JOptionPane;
public class Fibonacci_series
{
public static void main(String[] args){ 

    int num=Integer.parseInt(JOptionPane.showInputDialog(null, "ENTER DIGIT FOR FIBONACCI SERIES:-"));

    int a,b,c,i=3;
    a=0;
    b=1;
    if(num==1)
JOptionPane.showMessageDialog(null, "FIBONACCI SERIES IS:-"+a);

   if(num>=2)
   JOptionPane.showMessageDialog(null, "FIBONACCI SERIES IS:-"+a);
   JOptionPane.showMessageDialog(null, "FIBONACCI SERIES IS:-"+b);
   

   while(i<=num){
       c=a+b;
       JOptionPane.showMessageDialog(null, "FIBONACCI SERIES IS:-"+c);
        a=b;
        b=c;
        i++;
   }

}
}



