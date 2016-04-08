package view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by zhangyuwei on 4/8/16.
 */
public class FrameStaff extends JFrame {
    private FrameSupervisor frameSupervisor;
    private AskForLeavePanel askForLeavePanel;

    public FrameStaff(){
        super("Staff asking for leave");
        this.setSize(500, 300);
        this.setLocation(100, 100);
        Container contentPane = getContentPane();
        askForLeavePanel = new AskForLeavePanel(this);
        contentPane.add(askForLeavePanel);
    }

    public void setFrameSupervisor(FrameSupervisor frameSupervisor) {
        this.frameSupervisor = frameSupervisor;
        askForLeavePanel.setFrameSupervisor(frameSupervisor);
    }

}
