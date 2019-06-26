package Project;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class AddAccountBook extends JFrame {

	public AddAccountBook() {
		for (int i = 0; i < MemberJoin.member.size(); i++) {
			setTitle("*** " + MemberJoin.member.get(i).getId() + "님의 가계부 ***");
		}
		setSize(720, 450);
		this.setLocation(350, 150);

		JPanel panel = new JPanel();
		placeAddBookPanel(panel);

		add(panel);

		setVisible(true);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void placeAddBookPanel(JPanel panel) {
		panel.setLayout(null); // 배치관리자 사용 안함, 절대 위치설정
		JButton backButton = new JButton("HOME");
		backButton.setBounds(20, 10, 80, 25);
		backButton.setFont(new Font(null, Font.BOLD, 12));
		backButton.setBorderPainted(false);
		backButton.setOpaque(false);
		backButton.setContentAreaFilled(false);
		backButton.setFocusPainted(false);
		panel.add(backButton);

		backButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				StartMenu addbook = new StartMenu();

			}
		});

		JLabel dayLabel = new JLabel("월");
		dayLabel.setBounds(50, 60, 80, 25);
		panel.add(dayLabel);

		JLabel monthLabel = new JLabel("일");
		monthLabel.setBounds(150, 60, 80, 25);
		panel.add(monthLabel);

		JLabel listLabel = new JLabel("사용내역");
		listLabel.setBounds(470, 60, 80, 25);
		panel.add(listLabel);

		JLabel moneyLabel = new JLabel("수입/지출");
		moneyLabel.setBounds(50, 110, 80, 25);
		panel.add(moneyLabel);

		JLabel cashCardLabel = new JLabel("현금/카드");
		cashCardLabel.setBounds(50, 160, 80, 25);
		panel.add(cashCardLabel);

		JLabel categoryLabel = new JLabel("카테고리");
		categoryLabel.setBounds(50, 210, 80, 25);
		panel.add(categoryLabel);

		JLabel payLabel = new JLabel("금액");
		payLabel.setBounds(50, 260, 80, 25);
		panel.add(payLabel);

		JLabel memoLabel = new JLabel("메모");
		memoLabel.setBounds(50, 310, 80, 25);
		panel.add(memoLabel);

		String[] month = new String[12];
		for (int i = 0; i < month.length; i++) {
			month[i] = i + 1 + "월";
		}
		JComboBox<String> monthCombo = new JComboBox<String>(month);
		monthCombo.setLocation(70, 60);
		monthCombo.setSize(50, 25);
		monthCombo.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		panel.add(monthCombo);

		String[] day = new String[31];
		for (int i = 0; i < day.length; i++) {
			day[i] = i + 1 + "일";
		}
		JComboBox<String> dayCombo = new JComboBox<String>(day);
		dayCombo.setLocation(170, 60);
		dayCombo.setSize(50, 25);
		dayCombo.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		panel.add(dayCombo);

		// 수입/지출 라디오
		ButtonGroup group = new ButtonGroup();
		JRadioButton inMoney = new JRadioButton("수입", true); // true는 체크가 되어서 나옴
		JRadioButton outMoney = new JRadioButton("지출", false);
		inMoney.setLocation(110, 110);
		inMoney.setSize(60, 25);
		outMoney.setLocation(170, 110);
		outMoney.setSize(60, 25);
		group.add(inMoney);
		group.add(outMoney);
		panel.add(inMoney);
		panel.add(outMoney);

		// 현금/카드 라디오
		ButtonGroup group2 = new ButtonGroup();
		JRadioButton cash = new JRadioButton("현금", false);
		JRadioButton card = new JRadioButton("카드", true);
		cash.setLocation(110, 160);
		cash.setSize(60, 25);
		card.setLocation(170, 160);
		card.setSize(60, 25);
		group2.add(cash);
		group2.add(card);
		panel.add(cash);
		panel.add(card);

		String[] category = { "식비", "데이트", "쇼핑", "교통", "생활", "자기개발", "건강", "세금", "금융", "기타" };
		JComboBox<String> categoryCombo = new JComboBox<String>(category);
		categoryCombo.setLocation(110, 210);
		categoryCombo.setSize(160, 25);
		categoryCombo.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		panel.add(categoryCombo);

		JTextField payText = new JTextField(20); // 텍스트
		payText.setBounds(110, 260, 160, 25);
		panel.add(payText);

		JTextField memoText = new JTextField(20); // 메모
		memoText.setBounds(110, 310, 160, 25);
		panel.add(memoText);

		String[] fieldName = { "번호", "날짜", "수입/지출", "현금/카드", "카테고리", "금액", "메모" };
		String[][] data = { { "1", "0512", "수입", "현금", "쇼핑", "20000", "옷" },
				{ "1", "0512", "수입", "현금", "쇼핑", "20000", "옷" }, { "1", "0512", "수입", "현금", "쇼핑", "20000", "옷" },
				{ "1", "0512", "수입", "현금", "쇼핑", "20000", "옷" }, { "1", "0512", "수입", "현금", "쇼핑", "20000", "옷" },
				{ "1", "0512", "수입", "현금", "쇼핑", "20000", "옷" }, { "1", "0512", "수입", "현금", "쇼핑", "20000", "옷" },
				{ "1", "0512", "수입", "현금", "쇼핑", "20000", "옷" }, { "1", "0512", "수입", "현금", "쇼핑", "20000", "옷" },
				{ "1", "0512", "수입", "현금", "쇼핑", "20000", "옷" }, { "1", "0512", "수입", "현금", "쇼핑", "20000", "옷" },
				{ "1", "0512", "수입", "현금", "쇼핑", "20000", "옷" }, { "1", "0512", "수입", "현금", "쇼핑", "20000", "옷" },
				{ "1", "0512", "수입", "현금", "쇼핑", "20000", "옷" }, { "1", "0512", "수입", "현금", "쇼핑", "20000", "옷" },
				{ "1", "0512", "수입", "현금", "쇼핑", "20000", "옷" }, { "1", "0512", "수입", "현금", "쇼핑", "20000", "옷" } };
		// for 문 써서, 입력한 텍스트값들, 이차원배열에 저장 시켜야함
		DefaultTableModel mod = new DefaultTableModel(data, fieldName) {
			public boolean isCellEditable(int rowIndex, int mColIndex) {
				return false;
			}
		};
		JTable listTable = new JTable(mod);
		listTable.getTableHeader().setReorderingAllowed(false); // 테이블 이동불가
		listTable.getTableHeader().setResizingAllowed(true); // 크기 조절
		JScrollPane listJs = new JScrollPane(listTable);
		listJs.setBorder(BorderFactory.createEmptyBorder());
		getContentPane().add(listJs, "Center");
		listJs.setLocation(300, 110);
		listJs.setSize(400, 250);

		panel.add(listJs);

	}
}
