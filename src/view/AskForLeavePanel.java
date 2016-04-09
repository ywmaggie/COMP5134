package view;

import mode.LeaveApplication;
import mode.Staff;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

/**
 * Created by zhangyuwei on 4/8/16.
 */
public class AskForLeavePanel extends JPanel implements ActionListener {
    String startTime;
    String endTime;
    JTextField fromDateTextField;
    JTextField toDateTextField;
    AskForLeaveFrame askForLeaveFrame;
    HashMap<String, Staff> allStaff;
    String staffId;

    public AskForLeavePanel(HashMap<String, Staff> allStaff, String staffId, AskForLeaveFrame askForLeaveFrame) {
        if (staffId.equals("001")) {
            add(new JLabel("Wellcome Director!"));
        } else {
            add(new JLabel("Wellcome " + staffId + ", Please input your leaving time."));

            add(new JLabel("From", SwingConstants.RIGHT));

            fromDateTextField = new JTextField("", 20);
            add(fromDateTextField);

            add(new JLabel("ddmmyyyy", SwingConstants.LEFT));
            add(new JLabel("To", SwingConstants.RIGHT));


            toDateTextField = new JTextField("", 20);
            add(toDateTextField);

            add(new JLabel("ddmmyyyy", SwingConstants.LEFT));
            add(new JPanel());
            JButton applyButton = new JButton("Apply");
            add(applyButton);
            applyButton.addActionListener(this);
        }
        this.allStaff = allStaff;
        this.staffId = staffId;
        this.askForLeaveFrame = askForLeaveFrame;

    }


    public void actionPerformed(ActionEvent e) {
        startTime = fromDateTextField.getText();
        endTime = toDateTextField.getText();

        LeaveApplication leaveApplication = new LeaveApplication(staffId, startTime, endTime);
        Staff staff = allStaff.get(staffId);
        boolean response = staff.askForLeave(leaveApplication);

        if (response == true) {
            JOptionPane.showMessageDialog(askForLeaveFrame, "supervisors says yes");
        } else {
            JOptionPane.showMessageDialog(askForLeaveFrame, "supervisors says no");
        }
    }
}
