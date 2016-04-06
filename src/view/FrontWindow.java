package view;

import javax.swing.*;
import java.awt.*;

/**
 * This is the UserInterface for staff
 * @author Jianuo
 */
public class FrontWindow extends JFrame{

	public FrontWindow() {
		super("HR System");
        this.setSize(500, 300);
        this.setLocation(100, 100);
        
        JPanel aPanel = new JPanel(new BorderLayout());
        JPanel topPanel = new JPanel();
        topPanel.add(new JLabel("Welcome to HR System"));
        JPanel centerPanel = new JPanel(new GridLayout(8, 3, 5, 10));
        for (int i = 0; i < 6; i++) {
            centerPanel.add(new JPanel());
        }
        centerPanel.add(new JLabel("StaffID", SwingConstants.RIGHT));
        final JTextField staffIDTextField = new JTextField("", 20);
        centerPanel.add(staffIDTextField);
        JButton loginButton = new JButton("Login");
        centerPanel.add(loginButton);
        centerPanel.add(new JLabel("SupervisorID", SwingConstants.RIGHT));
        final JTextField supervisorIDTextField = new JTextField("", 20);
        centerPanel.add(supervisorIDTextField);
        centerPanel.add(new JPanel());
        JButton addStaffButton = new JButton("Add");
        centerPanel.add(addStaffButton);
        centerPanel.add(new JPanel());
        JButton deleteStaffButton = new JButton("Delete");
        centerPanel.add(deleteStaffButton);
        for (int i = 0; i < 9; i++) {
            centerPanel.add(new JPanel());
        }
        aPanel.add(centerPanel, BorderLayout.CENTER);
        
        this.add(aPanel);
        this.setVisible(true);
	}

}
