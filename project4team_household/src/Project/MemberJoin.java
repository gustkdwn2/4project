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

public class MemberJoin extends JFrame {
	private JTextField nameText;
	private JTextField userText;
	private JTextField passwordText;
	private JTextField phoneText;
	private JButton btnJoin;
	static ArrayList<Member> member = new ArrayList<Member>();

	public MemberJoin() {
		JPanel panel = new JPanel();
		placejoinPanel(panel);
		setTitle("ȸ������");
		setSize(300, 200);
		this.setLocation(350, 300);

		// add
		add(panel);

		// visible
		setVisible(true);
	}

	private void placejoinPanel(JPanel panel) {
		panel.setLayout(null);
		JLabel nameLabel = new JLabel("�̸�");
		nameLabel.setBounds(20, 10, 80, 25);
		panel.add(nameLabel);

		JLabel userLabel = new JLabel("����ڸ�");
		userLabel.setBounds(20, 40, 80, 25);
		panel.add(userLabel);

		JLabel passLabel = new JLabel("��й�ȣ");
		passLabel.setBounds(20, 70, 80, 25);
		panel.add(passLabel);

		JLabel phoneLabel = new JLabel("����ó");
		phoneLabel.setBounds(20, 100, 80, 25);
		panel.add(phoneLabel);

		nameText = new JTextField(20);
		nameText.setBounds(110, 10, 160, 25);
		panel.add(nameText);

		userText = new JTextField(20);
		userText.setBounds(110, 40, 160, 25);
		panel.add(userText);

		passwordText = new JPasswordField(20);
		passwordText.setBounds(110, 70, 160, 25);
		panel.add(passwordText);

		phoneText = new JTextField(20);
		phoneText.setBounds(110, 100, 160, 25);
		panel.add(phoneText);

		btnJoin = new JButton("����");
		btnJoin.setBounds(110, 130, 100, 25);
		panel.add(btnJoin);
		btnJoin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Member mem = new Member(nameText.getText(), userText.getText(), passwordText.getText(),
						phoneText.getText());
				member.add(mem);

				if (isJoinCheck()) {
					dispose();
				}

			}
		});

	}

	public boolean isJoinCheck() {
		// ȸ������ �����̶�� ���ԿϷ� ���� �ݱ�
		boolean flag = false;

		if (!(userText.getText().equals("")) && !(passwordText.getText().equals("")) && !(nameText.getText().equals(""))
				&& !(phoneText.getText().equals(""))) {
			JOptionPane.showMessageDialog(null, "ȸ�� ���� �Ϸ�");
			flag = true;
		} else {
			JOptionPane.showMessageDialog(null, "������ �ȵ˴ϴ�.");
		}

		return flag;
	}

}