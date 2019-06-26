package Project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginView extends JFrame {
	private MainProcess main;
	private StartMenu login;

	private JButton btnLogin;
	private JButton btnInit;
	private JTextField passText;
	private JTextField userText;
	private boolean bLoginCheck;

//	public static void main(String[] args) {
//		new LoginView();
//	}

	public LoginView() {
		// setting
		setTitle("login");
		setSize(280, 150);
		setResizable(false);
		setLocation(800, 450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// panel
		JPanel panel = new JPanel();
		placeLoginPanel(panel);

		// add
		add(panel);

		// visible
		setVisible(true);
	}

	private void placeLoginPanel(JPanel panel) {
		panel.setLayout(null);
		JLabel userLabel = new JLabel("����ڸ�");
		userLabel.setBounds(10, 10, 80, 25);
		panel.add(userLabel);

		JLabel passLabel = new JLabel("��й�ȣ");
		passLabel.setBounds(10, 40, 80, 25);
		panel.add(passLabel);

		userText = new JTextField(20);
		userText.setBounds(100, 10, 160, 25);
		panel.add(userText);

		passText = new JPasswordField(20);
		passText.setBounds(100, 40, 160, 25);
		panel.add(passText);
		passText.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				isLoginCheck();
			}
		});

		btnInit = new JButton("ȸ������");
		btnInit.setBounds(10, 80, 100, 25);
		panel.add(btnInit);
		btnInit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MemberJoin memberjoin = new MemberJoin();
			}
		});

		btnLogin = new JButton("Login");
		btnLogin.setBounds(160, 80, 100, 25);
		panel.add(btnLogin);
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				isLoginCheck();
			}
		});
	}

	public void isLoginCheck() {
		for (int i = 0; i < MemberJoin.member.size(); i++) {
			if (userText.getText().equals(MemberJoin.member.get(i).getId())
					&& passText.getText().equals(MemberJoin.member.get(i).getPw())) {
				bLoginCheck = true;
				
				if (isLogin()) {
					main.showAccountBook(); // ����â �޼ҵ带 �̿��� â�ٿ��
				}
			} else {
				JOptionPane.showMessageDialog(null, "Faild");
			}
			
		}
//		if (userText.getText().equals("test") && new String(passText.getText()).equals("1234")) {
//			JOptionPane.showMessageDialog(null, "Success");
//			bLoginCheck = true;
//
//			// �α��� �����̶�� �Ŵ���â �ٿ��
//			if (isLogin()) {
//				main.showFrameTest(); // ����â �޼ҵ带 �̿��� â�ٿ��
//			}
//		} else {
//			JOptionPane.showMessageDialog(null, "Faild");
//		}

	}

	// mainProcess�� ����
	public void setMain(MainProcess main) {
		this.main = main;
	}

	public boolean isLogin() {
		return bLoginCheck;
	}

}
