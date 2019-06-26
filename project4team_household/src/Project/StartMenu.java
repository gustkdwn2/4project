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
			setTitle("*** " + MemberJoin.member.get(i).getId() + "님의 가계부 ***");
			titleLabel = new JLabel(MemberJoin.member.get(i).getId() + "님의 Account Book!");
		}
		titleLabel.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		titleLabel.setHorizontalAlignment(JLabel.CENTER);  // 가운데 정렬
		titleLabel.setBounds(0, 100, 720, 100); // x, y, 가로, 세로
		
		panel.add(titleLabel);

		JButton startButton = new JButton("가계부 작성하기");
		startButton.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		startButton.setBounds(450, 280, 200, 50);
		startButton.setOpaque(false); // 투명하게
		startButton.setBorderPainted(false); // 테두리선 제거
		startButton.setContentAreaFilled(false); // 내용영역 투명
		startButton.setFocusPainted(false); // 선택시 테두리 제거
		panel.add(startButton);
		startButton.addActionListener(new ActionListener() {
			@Override
			
			public void actionPerformed(ActionEvent e) {
				dispose();
				AddAccountBook addbook = new AddAccountBook();
			}
		});
		
		
		
		JButton listButton = new JButton("지출 분석 보고서");
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
				// 작성
				
			}
		});
	}
}
