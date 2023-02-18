import javax.swing.JOptionPane;

public class Area_of_circle{
public static void main(String[] args){
  float a=Float.parseFloat(JOptionPane.showInputDialog(null,"ENTER RADIUS OF CIRCLE:-"));
     
    double b=(a*a)*Math.PI;
JOptionPane.showMessageDialog(null,"AREA OF CIRCLE:-"+b);
}
}
