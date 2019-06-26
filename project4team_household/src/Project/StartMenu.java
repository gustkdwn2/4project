package Project;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StartMenu extends JFrame {
	
	public StartMenu() {
		setSize(720, 450);
		this.setLocation(350, 150);

		JPanel panel = new JPanel();
		placeBookPanel(panel);

		add(panel);
		setVisible(true);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void placeBookPanel(JPanel panel) {
		panel.setLayout(null);
		JLabel titleLabel = null;
		for (int i = 0; i < MemberJoin.member.size(); i++) {
			setTitle("*** " + MemberJoin.member.get(i).getId() + "���� ����� ***");
			titleLabel = new JLabel(MemberJoin.member.get(i).getId() + "���� Account Book!");
		}
		titleLabel.setFont(new Font("���� ���", Font.BOLD, 25));
		titleLabel.setHorizontalAlignment(JLabel.CENTER);  // ��� ����
		titleLabel.setBounds(0, 100, 720, 100); // x, y, ����, ����
		
		panel.add(titleLabel);

		JButton startButton = new JButton("����� �ۼ��ϱ�");
		startButton.setFont(new Font("���� ���", Font.BOLD, 16));
		startButton.setBounds(450, 280, 200, 50);
		startButton.setOpaque(false); // �����ϰ�
		startButton.setBorderPainted(false); // �׵θ��� ����
		startButton.setContentAreaFilled(false); // ���뿵�� ����
		startButton.setFocusPainted(false); // ���ý� �׵θ� ����
		panel.add(startButton);
		startButton.addActionListener(new ActionListener() {
			@Override
			
			public void actionPerformed(ActionEvent e) {
				dispose();
				AddAccountBook addbook = new AddAccountBook();
			}
		});
		
		
		
		JButton listButton = new JButton("���� �м� ����");
		listButton.setFont(new Font(null, Font.BOLD, 16));
		listButton.setBounds(450, 330, 200, 50);
		listButton.setBorderPainted(false);
		listButton.setOpaque(false);
		listButton.setContentAreaFilled(false);
		listButton.setFocusPainted(false);
		panel.add(listButton);
		
		listButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// �ۼ�
				
			}
		});
	}
}
