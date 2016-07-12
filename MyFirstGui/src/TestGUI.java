//import java.awt.BorderLayout;

import java.awt.Component;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFirstScreen extends JFrame{
	JButton ok=new JButton("OK");
	JButton cancel=new JButton("Cancel");
	
	MyFirstScreen(){
		//1. method---Border Layout
		// this.getContentPane().add(ok, BorderLayout.SOUTH);
		// 2.flow layout
		this.getContentPane().setLayout(new FlowLayout());
		this.getContentPane().add(ok);
		this.getContentPane().add(cancel);
		// 3. Null Layout or Flexible Layout
		this.getContentPane().setLayout(null);
		ok.setBounds(20, 20, 70, 50);
		cancel.setBounds(100,20, 70, 50);
		
		
	}
}
public class TestGUI {

	public static void main(String[] args) {
		MyFirstScreen screen=new MyFirstScreen();
        screen.setSize(500, 500);   
        screen.setTitle("My Screen" );
        screen.setVisible(true);
        screen.setLocation(800,200);
	}

}
