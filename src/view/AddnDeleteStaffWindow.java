package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This is the UserInterface for HRStaff to add/delete staff, and for staff to login
 * @author Jianuo YANG
 */
public class AddnDeleteStaffWindow extends JFrame{

	public AddnDeleteStaffWindow() {
		super("HR System");
        this.setSize(500, 300);
        this.setLocation(100, 100);
        
        
        JPanel aPanel = new JPanel(new BorderLayout());
        JPanel topPanel = new JPanel();
        topPanel.add(new JLabel("Welcome to HR System"));
        JPanel centerPanel = new JPanel(new GridLayout(7, 3, 5, 10));
        for (int i = 0; i < 6; i++) {
            centerPanel.add(new JPanel());
        }
        
        centerPanel.add(new JLabel("StaffID", SwingConstants.RIGHT));
        final JTextField staffIDTextField = new JTextField("", 20);
        centerPanel.add(staffIDTextField);
        centerPanel.add(new JPanel());                

        centerPanel.add(new JLabel("SupervisorID", SwingConstants.RIGHT));
        final JTextField supervisorIDTextField = new JTextField("", 20);
        centerPanel.add(supervisorIDTextField);
        centerPanel.add(new JPanel());
        centerPanel.add(new JPanel());
        JButton addStaffButton = new JButton("Add");
        centerPanel.add(addStaffButton);
        centerPanel.add(new JPanel());
        centerPanel.add(new JPanel());
        JButton deleteStaffButton = new JButton("Delete");
        centerPanel.add(deleteStaffButton);
        centerPanel.add(new JPanel());
        for (int i = 0; i < 2; i++) {
            centerPanel.add(new JPanel());
        }
        
        JButton loginButton = new JButton("Login");
        /**
         * loginButton function
         */
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (stafflist.contains(staffIDTextField.getText())) {
                    JOptionPane.showMessageDialog(MyWindow.this, "Hello " + usernameTextField.getText());
                } else {
                    JOptionPane.showMessageDialog(MyWindow.this, "Wrong username or password!");
                }
            }
        });
        centerPanel.add(loginButton);
        
        aPanel.add(centerPanel, BorderLayout.CENTER);
        
        this.add(aPanel);
        this.setVisible(true);
	}

}
