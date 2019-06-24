package pratice;

import javax.swing.*;
import java.awt.*;

public class test extends JFrame{
	
	
	
	public test() {
        // setting
		setTitle("회원가입");
		setSize(400, 400);
		setResizable(false);
        setLocation(800, 450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		placeMembershipPanel(panel);
		
		// visible
        setVisible(true);
    }

	public void placeMembershipPanel(JPanel panel) {
		panel.setLayout(null);
		
	}
}