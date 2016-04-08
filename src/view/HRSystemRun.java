package view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;




public class HRSystemRun {

    public static void main(String[] args) {
		// TODO Auto-generated method stub

        FrameStaff frameStaff = new FrameStaff();
        FrameSupervisor frameSupervisor = new FrameSupervisor();
        frameStaff.setFrameSupervisor(frameSupervisor);

        // make both frames visible
        frameStaff.show();
        frameSupervisor.show();

	}

}
