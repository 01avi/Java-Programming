import javax.swing.JOptionPane;
public class Find_multiple_of_number
{
public static void main(String[] args){
    int a=Integer.parseInt(JOptionPane.showInputDialog(null,"ENTER NUMBER"));
    if(a%3==0)
    JOptionPane.showMessageDialog(null,"NUMBER IS MULTIPLE OF 3");
    else
    JOptionPane.showMessageDialog(null, "NUMBER IS NOT MULTIPLE OF 3");
} 
}
