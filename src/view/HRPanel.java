package view;

import mode.Staff;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

/**
 * Created by zhangyuwei on 4/8/16.
 */
public class HRPanel extends JPanel implements ActionListener {

    private JButton addButton;
    private JButton loginButton;
    private HashMap<String, Staff> allstaff;

    public HRPanel(HashMap<String, Staff> allStaff) {
        add(new JLabel("Wellcome to HR system!"));

        addButton = new JButton("Add a new staff");
        add(addButton);
        addButton.addActionListener(this);

        loginButton = new JButton("Login");
        add(loginButton);
        loginButton.addActionListener(this);

        this.allstaff = allStaff;
    }


    public void actionPerformed(ActionEvent e) {

        Object source = e.getSource();
        if(source == addButton){ // someone clicks add button
            AddStaffFrame addStaffFrame = new AddStaffFrame(allstaff);
            addStaffFrame.show();
        }else{ //someone clicks login button
            LoginFrame loginFrame = new LoginFrame(allstaff);
            loginFrame.show();
        }

    }
}
