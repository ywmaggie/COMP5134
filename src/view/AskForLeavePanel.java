package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by zhangyuwei on 4/8/16.
 */
public class AskForLeavePanel extends JPanel implements ActionListener {
    String startTime;
    String endTime;
    JTextField fromDateTextField;
    JTextField toDateTextField;
    FrameSupervisor frameSupervisor;
    FrameStaff frameStaff;

    public AskForLeavePanel(FrameStaff frameStaff) {
        this.frameStaff = frameStaff;

        add(new JLabel("Wellcome, Please input your leaving time."));
//            aPanel.add(topPanel, BorderLayout.NORTH);
//        JPanel centerPanel = new JPanel(new GridLayout(7, 3, 5, 10));
//        for (int i = 0; i < 6; i++) {
//            centerPanel.add(new JPanel());
//        }
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

    public void setFrameSupervisor(FrameSupervisor frameSupervisor) {
        this.frameSupervisor = frameSupervisor;
    }

    public void actionPerformed(ActionEvent e) {
        startTime = fromDateTextField.getText();
        endTime = toDateTextField.getText();

        int dialogButton = JOptionPane.YES_NO_OPTION;
        String message = "A asks leave from " + startTime + " to " + endTime;
        int dialogResult = JOptionPane.showConfirmDialog (frameSupervisor, message,"Warning",dialogButton);
        if(dialogResult == JOptionPane.YES_OPTION) {
                //TODO: yes
            JOptionPane.showMessageDialog(frameStaff, "supervisor says yes");
        }
        else{
            JOptionPane.showMessageDialog(frameStaff, "supervisor says yes");
        }
    }
}
