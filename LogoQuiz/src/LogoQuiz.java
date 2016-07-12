import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class LogoQuiz extends JFrame {

	private JPanel contentPane;

	static JButton nextLevel;
private void askForAnswer(String correctanswer,String imagename,JButton b){
	AnsFrame ans=new AnsFrame(correctanswer,imagename,b);
	ans.setVisible(true);
	
}
	public static void main(String[] args) {
		
					LogoQuiz frame = new LogoQuiz();
					frame.setVisible(true);
			
	}

	/**
	 * Create the frame.
	 */
	public LogoQuiz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 707, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton b1 = new JButton("");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				askForAnswer("angry bird","angrybird.jpeg",b1);
			}
		});
		b1.setBounds(24, 29, 100, 100);
		b1.setIcon(new ImageIcon(LogoQuiz.class.getResource("angrybird.jpeg")));
		contentPane.add(b1);
		
		JButton b2 = new JButton("");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				askForAnswer("audi","audi.jpeg",b2);
			}
		});
		b2.setBounds(151, 29, 100, 100);
		b2.setIcon(new ImageIcon(LogoQuiz.class.getResource("audi.jpeg")));
		contentPane.add(b2);
		
		JButton b3 = new JButton("");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				askForAnswer("dominos","dominos.jpeg",b3);
			}
		});
		b3.setBounds(277, 29, 100, 100);
		b3.setIcon(new ImageIcon(LogoQuiz.class.getResource("dominos.jpeg")));
		contentPane.add(b3);
		
		JButton b4 = new JButton("");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				askForAnswer("facebook","facebook.jpeg",b4);
			}
		});
		b4.setBounds(404, 29, 100, 100);
		b4.setIcon(new ImageIcon(LogoQuiz.class.getResource("facebook.jpeg")));
		contentPane.add(b4);
		
		JButton b5 = new JButton("");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				askForAnswer("ferrari","ferrari.jpeg",b5);
			}
		});
		b5.setBounds(530, 29, 100, 100);
		b5.setIcon(new ImageIcon(LogoQuiz.class.getResource("ferrari.jpeg")));
		contentPane.add(b5);
		
		JButton b6 = new JButton("");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				askForAnswer("mercedes","mercedes.jpeg",b6);
			}
		});
		b6.setBounds(24, 180, 100, 100);
		b6.setIcon(new ImageIcon(LogoQuiz.class.getResource("mercedes.jpeg")));
		contentPane.add(b6);
		
		JButton b7 = new JButton("");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				askForAnswer("pepsi","pepsi.jpeg",b7);
			}
		});
		b7.setBounds(151, 180, 100, 100);
		b7.setIcon(new ImageIcon(LogoQuiz.class.getResource("pepsi.jpeg")));
		contentPane.add(b7);
		
		JButton b8 = new JButton("");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				askForAnswer("picasa","picasa.jpeg",b8);
			}
		});
		b8.setBounds(277, 180, 100, 100);
		b8.setIcon(new ImageIcon(LogoQuiz.class.getResource("picasa.jpeg")));
		contentPane.add(b8);
		
		JButton b9 = new JButton("");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				askForAnswer("toyota","toyota.jpeg",b9);
			}
		});
		b9.setBounds(404, 180, 100, 100);
		b9.setIcon(new ImageIcon(LogoQuiz.class.getResource("toyota.jpeg")));
		contentPane.add(b9);
		
		JButton b10 = new JButton("");
		b10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				askForAnswer("warner bros","warnerbros.jpeg",b10);
			}
		});
		b10.setBounds(530, 180, 100, 100);
		b10.setIcon(new ImageIcon(LogoQuiz.class.getResource("warnerbros.jpeg")));
		contentPane.add(b10);
		
		nextLevel = new JButton(" go to next level");
		nextLevel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		nextLevel.setBounds(10, 331, 556, 23);
		nextLevel.setVisible(false);
		contentPane.add(nextLevel);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(LogoQuiz.this,"Do you want to Quit")==0){
					LogoQuiz.this.setVisible(false);
					LogoQuiz.this.dispose();
				}
				
				
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnExit.setBounds(592, 331, 89, 23);
		contentPane.add(btnExit);
	}
}
