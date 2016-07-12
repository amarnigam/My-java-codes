import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AnsFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	String correctanswer;
	String youranswer;
	static int count=0;

private boolean matchAnswer(String youranswer){
	
	if(youranswer.equalsIgnoreCase(correctanswer)){
		
		count++;
		//System.out.println(count);
		if(count>7){
			JOptionPane.showMessageDialog(AnsFrame.this, "You can Play next Level now");
			LogoQuiz.nextLevel.setVisible(true);
			
		}
		return true;
	}
	else{
		return false;
	}
	
	
}
	public AnsFrame(String correctanswer,String imagename,JButton b) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 299);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		this.correctanswer=correctanswer;
		JButton button = new JButton("");
		
		button.setBounds(54, 77, 100, 100);
		button.setIcon(new ImageIcon(LogoQuiz.class.getResource(imagename)));
		contentPane.add(button);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		textField.setBounds(209, 104, 229, 53);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblTypeYourAnswer = new JLabel("TYPE YOUR ANSWER HERE");
		lblTypeYourAnswer.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblTypeYourAnswer.setBounds(177, 50, 317, 61);
		contentPane.add(lblTypeYourAnswer);
		
		JButton submit = new JButton("SUBMIT");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(matchAnswer(youranswer=textField.getText())){
					JOptionPane.showMessageDialog(AnsFrame.this, "Correct Answer");
					AnsFrame.this.setVisible(false);
					AnsFrame.this.dispose();
					b.setEnabled(false);
					
				}
				else{
					JOptionPane.showMessageDialog(AnsFrame.this, "Wrong  Answer,try again");
				}
			}
		});
		submit.setFont(new Font("Tahoma", Font.BOLD, 19));
		submit.setBounds(253, 176, 133, 23);
		contentPane.add(submit);
	}
}
