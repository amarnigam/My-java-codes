import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

public class TicTacToe extends JFrame {
	
	boolean isXorZero=false;
	private JPanel contentPane;
	JButton b1 = new JButton("");
	JButton b2 = new JButton("");
	JButton b3 = new JButton("");
	JButton b4 = new JButton("");
	JButton b5 = new JButton("");
	JButton b6 = new JButton("");
	JButton b7 = new JButton("");
	JButton b8 = new JButton("");
	JButton b9 = new JButton("");
	private final JButton btnRestart = new JButton("RESTART");
	private final JButton btnExit = new JButton("EXIT");
	
private void printXORZERO(JButton b){
	
	
if(isButtonBlank(b)){
	if(isXorZero){
		b.setText("0");
		
	}
	else{
		b.setText("X");
	}
	isXorZero=!isXorZero;
	if(isGameOver()){
		JOptionPane.showMessageDialog(this,"Game OVER"+" "+b.getText()+"  "+"U Win");
		
		reset();
	}
	if(isDraw()){
		JOptionPane.showMessageDialog(this,"Game Draw");
		reset();
	}
		
}

}private boolean isButtonBlank(JButton b){
	if(b.getText().trim().length()==0){
		return true;
	}
	else{
		return false;
	}
}
private boolean isRowBlank(JButton b1,JButton b2,JButton b3){
	if(isButtonBlank(b1) && isButtonBlank(b2) && isButtonBlank(b3)){
		return true;
	}
	else {
		return false;
	}
	
}
private boolean isRowMatch(JButton b1,JButton b2,JButton b3){
	if(!isRowBlank(b1,b2,b3)){
		if(b1.getText().equals(b2.getText()) &&b1.getText().equals(b3.getText()) ){
			return true;
		}
		else{
			return false;
		}
		
	}
	else{
		return false;
	}
	
}
private boolean isGameOver(){
	if(isRowMatch(b1,b2,b3)){
		return true;
		
	}
	else
		if(isRowMatch(b4,b5,b6)){
			return true;
		}
	else
	if(isRowMatch(b7,b8,b9)){
		return true;
	}
	else
	if(isRowMatch(b1,b4,b7)){
		return true;
	}
	else
	if(isRowMatch(b2,b5,b8)){
		return true;
	}
	else
	if(isRowMatch(b3,b6,b9)){
		return true;
	}
	else
	if(isRowMatch(b1,b5,b9)){
		return true;
	}
	else
	if(isRowMatch(b3,b5,b7)){
		return true;
	}
	else{
		return false;
	}
}
private void reset(){
	b1.setText("");
	b2.setText("");
	b3.setText("");
	b4.setText("");
	b5.setText("");
	b6.setText("");
	b7.setText("");
	b8.setText("");
	b9.setText("");
	isXorZero=false;
}
private boolean isDraw(){
	if(!isButtonBlank(b1) && !isButtonBlank(b2) && !isButtonBlank(b3) && !isButtonBlank(b4) && !isButtonBlank(b5) && !isButtonBlank(b6) && !isButtonBlank(b7) && !isButtonBlank(b8) && !isButtonBlank(b9)){
		return true;
	}
	else{
		return false;
	}
}
	public static void main(String[] args) {
		
					TicTacToe frame = new TicTacToe();
					frame.setVisible(true);
				
	}

	/**
	 * Create the frame.
	 */
	public TicTacToe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 200, 336, 368);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		b1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		b1.setForeground(Color.DARK_GRAY);
		b1.setBackground(Color.RED);
		
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printXORZERO(b1);
				
			}
		});
		b1.setBounds(10, 11, 89, 49);
		contentPane.add(b1);
		b2.setFont(new Font("Times New Roman", Font.BOLD, 22));
		b2.setBackground(Color.RED);
		
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printXORZERO(b2);
			}
		});
		b2.setBounds(119, 11, 89, 49);
		contentPane.add(b2);
		b3.setFont(new Font("Times New Roman", Font.BOLD, 22));
		b3.setBackground(Color.RED);
		
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printXORZERO(b3);
			}
		});
		b3.setBounds(226, 11, 89, 49);
		contentPane.add(b3);
		b4.setFont(new Font("Times New Roman", Font.BOLD, 22));
		b4.setBackground(Color.RED);
		
		
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				printXORZERO(b4);
				
			}
		});
		b4.setBounds(10, 82, 89, 49);
		contentPane.add(b4);
		b5.setFont(new Font("Times New Roman", Font.BOLD, 22));
		b5.setBackground(Color.RED);
		
		
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printXORZERO(b5);
			}
		});
		b5.setBounds(119, 82, 89, 49);
		contentPane.add(b5);
		b6.setFont(new Font("Times New Roman", Font.BOLD, 22));
		b6.setBackground(Color.RED);
		
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printXORZERO(b6);
			}
		});
		b6.setBounds(226, 82, 89, 49);
		contentPane.add(b6);
		b7.setFont(new Font("Times New Roman", Font.BOLD, 22));
		b7.setBackground(Color.RED);
		
		
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printXORZERO(b7);
			}
		});
		b7.setBounds(10, 153, 89, 49);
		contentPane.add(b7);
		b8.setFont(new Font("Times New Roman", Font.BOLD, 22));
		b8.setBackground(Color.RED);
		
		
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printXORZERO(b8);
			}
		});
		b8.setBounds(119, 153, 89, 49);
		contentPane.add(b8);
		b9.setFont(new Font("Times New Roman", Font.BOLD, 22));
		b9.setBackground(Color.RED);
		
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printXORZERO(b9);
			}
		});
		b9.setBounds(226, 153, 89, 49);
		contentPane.add(b9);
		btnRestart.setBackground(Color.GREEN);
		btnRestart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset();
			}
		});
		btnRestart.setBounds(48, 243, 89, 49);
		
		contentPane.add(btnRestart);
		btnExit.setBackground(Color.GREEN);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(TicTacToe.this,"Do You want to Quit")==0){
					TicTacToe.this.setVisible(false);
					TicTacToe.this.dispose();
				}
			}
		});
		btnExit.setBounds(161, 243, 89, 49);
		
		contentPane.add(btnExit);
	}
}
