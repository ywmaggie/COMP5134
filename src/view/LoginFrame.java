package view;

import mode.Staff;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

/**
 * Created by zhangyuwei on 4/8/16.
 */
public class LoginFrame extends JFrame {
    private LoginPanel loginPanel;

    public LoginFrame(HashMap<String, Staff> allStaff){
        super("Staff asking for leave");
        this.setSize(500, 300);
        this.setLocation(100, 100);
        Container contentPane = getContentPane();
        loginPanel = new LoginPanel(allStaff);
        contentPane.add(loginPanel);
    }
}
