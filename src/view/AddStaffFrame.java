package view;

import mode.Staff;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

/**
 * Created by zhangyuwei on 4/8/16.
 */
public class AddStaffFrame extends JFrame {
    private AddStaffPanel addStaffPanel;

    public AddStaffFrame(HashMap<String, Staff> allStaff){
        super("HR system");
        this.setSize(500, 300);
        this.setLocation(100, 100);
        Container contentPane = getContentPane();
        addStaffPanel = new AddStaffPanel(allStaff, this);
        contentPane.add(addStaffPanel);
    }
}
