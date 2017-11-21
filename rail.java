import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
//RailFence Technique Done using Swings
class rail extends JFrame implements ActionListener
{
JTextField t1,t2;
JButton b1;
JLabel l1,l2;
Container c;
railfence()
{
c=getContentPane();
c.setLayout(new GridLayout(3,2,2,3));
t1=new JTextField(10);
t2=new JTextField(10);
l1=new JLabel("Enter Your Message to Encrypt:");
l2=new JLabel("Encrypted Text:");
/*manual prepared by www.gr-solution.blogspot.com*/
t2.setEditable(false);
b1=new JButton("Submit");
b1.addActionListener(this);
c.add(l1); c.add(t1);
c.add(l2); c.add(t2);
c.add(b1);
setTitle("RailFence Technique");
setVisible(true);
pack();
}
public void actionPerformed()
{
encrypt();
}
void encrypt()
{
String s=t1.getText();
intlen=s.length();
String s1="";
String s2="";
for(inti=0;i<len;i=i+2)
{
s1=s1+""+s.charAt(i);
}
for(int j=1;j<len;j=j+2)
{
s2=s2+""+s.charAt(j);
}
s1=s1+s2;
t2.setText(s1);
}
/*manual prepared by www.gr-solution.blogspot.com*/
public static void main(String args[])
{
new rail();
}
}
