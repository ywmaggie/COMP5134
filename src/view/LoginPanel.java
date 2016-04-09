package view;

import com.sun.org.apache.bcel.internal.generic.AASTORE;
import mode.Staff;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

/**
 * Created by zhangyuwei on 4/8/16.
 */
public class LoginPanel extends JPanel implements ActionListener {
    String staffId;
//    String supervisorId;
    JTextField staffIdField;
//    JTextField supervisorIdField;
    JButton loginButton;
    HashMap<String, Staff> allStaff;
    LoginFrame loginFrame;

    public LoginPanel(HashMap<String, Staff> allStaff, LoginFrame loginFrame) {
        this.allStaff = allStaff;
        this.loginFrame = loginFrame;

        add(new JLabel("Enter your id to login"));

        add(new JLabel("Staff ID", SwingConstants.RIGHT));
        staffIdField = new JTextField("", 20);
        add(staffIdField);

        loginButton = new JButton("Login");
        add(loginButton);
        loginButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        staffId = staffIdField.getText();
//        supervisorId = supervisorIdField.getText();

        if (staffId.trim().equals("")) {
            JOptionPane.showMessageDialog(loginFrame, "Error: something is missing");
        } else if (!allStaff.containsKey(staffId)) {
            JOptionPane.showMessageDialog(loginFrame, "Error: staff does not exist");

        } else {
            JOptionPane.showMessageDialog(loginFrame, "Login successfully!");
            Staff staff = allStaff.get(staffId);
            AskForLeaveFrame askForLeaveFrame = new AskForLeaveFrame(allStaff, staffId);
            staff.setFrame(askForLeaveFrame);
            askForLeaveFrame.show();
        }
    }
}
