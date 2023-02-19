import javax.swing.JOptionPane;
public class Find_greater_one
{
public static void main(String[] args){
    int a=Integer.parseInt(JOptionPane.showInputDialog(null,"ENTER FIRST NUMBER"));
    int b=Integer.parseInt(JOptionPane.showInputDialog(null,"ENTER SECOND NUMBER"));
    if (a>b)
    JOptionPane.showMessageDialog(null,"FIRST NUMBER IS GREATER THEN FIRST");
     else
    JOptionPane.showMessageDialog(null, "SECOND NUMBER IS GREATER THEN FIRST");
    }
}