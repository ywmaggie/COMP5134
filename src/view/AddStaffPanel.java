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
public class AddStaffPanel extends JPanel implements ActionListener {
    String staffId;
    String supervisorId;
    JTextField staffIdField;
    JTextField supervisorIdField;
    JButton addButton;
    HashMap<String, Staff> allStaff;

    public AddStaffPanel(HashMap<String, Staff> allStaff) {
        this.allStaff = allStaff;

        add(new JLabel("Add a new staff"));

        add(new JLabel("Staff ID", SwingConstants.RIGHT));
        staffIdField = new JTextField("", 20);
        add(staffIdField);

        add(new JLabel("Supervisor ID", SwingConstants.RIGHT));
        supervisorIdField = new JTextField("", 20);
        add(supervisorIdField);

        addButton = new JButton("Add");
        add(addButton);
        addButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        staffId = staffIdField.getText();
        supervisorId = supervisorIdField.getText();

        if (staffId.trim().equals("") || supervisorId.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Error: something is missing");
        } else if (allStaff.containsKey(staffId)) {
            JOptionPane.showMessageDialog(null, "Error: staff id already exists");
        } else if (!allStaff.containsKey(supervisorId)) {
            JOptionPane.showMessageDialog(null, "Error: supervisor does not exist");
        } else {
            Staff supervisor = allStaff.get(supervisorId);
            Staff staff = new Staff(staffId, supervisor);
            allStaff.put(staffId, staff);
            JOptionPane.showMessageDialog(null, "Add successfully!");
        }
    }
}
