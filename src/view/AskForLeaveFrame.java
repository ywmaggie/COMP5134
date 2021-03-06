package view;

import mode.Staff;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

/**
 * Created by zhangyuwei on 4/8/16.
 */
public class AskForLeaveFrame extends JFrame {
    private AskForLeavePanel askForLeavePanel;

    public AskForLeaveFrame(HashMap<String, Staff> allStaff, String staffId){
        super("HR system");
        this.setSize(500, 300);
        this.setLocation(100, 100);
        Container contentPane = getContentPane();
        askForLeavePanel = new AskForLeavePanel(allStaff, staffId, this);
        contentPane.add(askForLeavePanel);
    }
}
