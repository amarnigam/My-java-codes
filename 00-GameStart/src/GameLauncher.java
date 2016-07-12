import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;

public class GameLauncher extends JWindow{

	private JPanel contentPane;
	JProgressBar progressBar = new JProgressBar();
	final int MAX_PROGRESS=100;
	int currentProgress=0;
	final int MAX_DELAY=100;
	Timer timer;
	private JLabel lblGame;
	int color=1;

	public static void main(String[] args) {
		
					GameLauncher frame = new GameLauncher();
					frame.setVisible(true);
				frame.animation();
				
				
	}
private void animation(){
	ActionListener listener=new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
			progressBar.setValue(currentProgress);
			currentProgress=currentProgress+3;
			if(currentProgress>=MAX_PROGRESS){
				timer.stop();
				GameLauncher.this.setVisible(false);
				GameLauncher.this.dispose();
				MainScreen frame = new MainScreen();
				frame.setVisible(true);
				
			}
			
			if(color>5){
				color=1;
			}
			switch(color){
			case 1:
				lblGame.setForeground(Color.red);
				break;
			case 2:
				lblGame.setForeground(Color.blue);
				break;
			case 3:
				lblGame.setForeground(Color.GREEN);
				
				break;
			case 4:
				lblGame.setForeground(Color.pink);
				
				break;
			case 5:
				lblGame.setForeground(Color.cyan);
				break;
				default:
					lblGame.setForeground(Color.BLACK);
					break;
			}
			color++;
			
		}
		
	};
	timer=new Timer(MAX_DELAY,listener);
	timer.start();
	
}
	public GameLauncher() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 200, 378, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 378, 236);
		label.setIcon(new ImageIcon(GameLauncher.class.getResource("main1.gif")));
		contentPane.add(label);
		
	
		progressBar.setStringPainted(true);
		progressBar.setFont(new Font("Tahoma", Font.PLAIN, 22));
		progressBar.setForeground(Color.GREEN);
		progressBar.setBounds(0, 280, 378, 20);
		contentPane.add(progressBar);
		
		lblGame = new JLabel("GAME LOADING.....");
		lblGame.setHorizontalAlignment(SwingConstants.CENTER);
		lblGame.setFont(new Font("Tempus Sans ITC", Font.BOLD, 22));
		lblGame.setForeground(Color.RED);
		lblGame.setBounds(0, 239, 368, 30);
		contentPane.add(lblGame);
	}
}
