package view;
import mode.Staff;

import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Stack;
import javax.swing.*;




public class HRSystemRun {
    public static HashMap<String, Staff> allStaff;

    public static void main(String[] args) {
		// TODO Auto-generated method stub
        allStaff = new HashMap<>();
        Staff director = new Staff("001", null);
        allStaff.put("001", director);

        HRFrame hrFrame = new HRFrame(allStaff);
        hrFrame.show();

	}

}
