package view;

import javax.swing.*;

/**
 * Created by zhangyuwei on 4/8/16.
 */
public class FrameSupervisor extends JFrame {
    private FrameStaff frameStaff;

    public FrameSupervisor(){
        super("Supervisor");
        this.setSize(500, 300);
        this.setLocation(100, 100);
    }

    public void setFrameStaff(FrameStaff frameStaff) {
        this.frameStaff = frameStaff;
    }
}
