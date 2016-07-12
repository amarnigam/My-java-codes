import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MainScreen extends JFrame {

	private JPanel contentPane;

	private void launchTicTacToe(){
		TicTacToe tic=new TicTacToe();
		tic.setVisible(true);
	}
	private void launchLogoQuiz(){
		LogoQuiz logo=new LogoQuiz();
		logo.setVisible(true);
	}
	public MainScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,406, 443);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnGames = new JMenu("GAMES");
		mnGames.setForeground(Color.RED);
		mnGames.setBackground(Color.BLACK);
		menuBar.add(mnGames);
		
		JMenuItem mntmTictactoe = new JMenuItem("TIC-TAC-TOE");
		mntmTictactoe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				launchTicTacToe();
				
			}
		});
		mnGames.add(mntmTictactoe);
		
		JMenuItem mntmLogoquiz = new JMenuItem("LOGO-QUIZ");
		mntmLogoquiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				launchLogoQuiz();
			}
		});
		mnGames.add(mntmLogoquiz);
		
		JMenuItem mntmKbc = new JMenuItem("KBC");
		mnGames.add(mntmKbc);
		
		JMenuItem mntmExit = new JMenuItem("EXIT");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainScreen.this.setVisible(false);
				MainScreen.this.dispose();
			}
		});
		mnGames.add(mntmExit);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 406, 413);
		label.setIcon(new ImageIcon(MainScreen.class.getResource("main2.gif")));
		contentPane.add(label);
		
	}
}
