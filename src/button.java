
import javax.swing.*;
import java.awt.GridLayout;
public class button {
public static void main(String[] args) {
JPanel windowContent= new JPanel();
GridLayout gl = new GridLayout(1,1,20,20);
windowContent.setLayout(gl);
JButton Button1 = new JButton("");
JTextField field1 = new JTextField(10);
windowContent.add(Button1);
JFrame frame = new JFrame(
"My First Calculator");
frame.setContentPane(windowContent);
frame.setSize(50,50);
frame.setVisible(true);
}
}