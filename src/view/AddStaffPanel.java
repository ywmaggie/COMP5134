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
    JButton deleteButton;
    HashMap<String, Staff> allStaff;
    AddStaffFrame addStaffFrame;

    public AddStaffPanel(HashMap<String, Staff> allStaff, AddStaffFrame addStaffFrame) {
        this.allStaff = allStaff;
        this.addStaffFrame = addStaffFrame;

        add(new JLabel("Add or delete a staff"));

        add(new JLabel("Staff ID", SwingConstants.RIGHT));
        staffIdField = new JTextField("", 20);
        add(staffIdField);

        add(new JLabel("Supervisor ID", SwingConstants.RIGHT));
        supervisorIdField = new JTextField("", 20);
        add(supervisorIdField);

        addButton = new JButton("Add");
        add(addButton);
        addButton.addActionListener(this);

        deleteButton = new JButton("Delete");
        add(deleteButton);
        deleteButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        staffId = staffIdField.getText();
        supervisorId = supervisorIdField.getText();

        Object source = e.getSource();
        if(source == addButton) { // add a staff
            if (staffId.trim().equals("") || supervisorId.trim().equals("")) {
                JOptionPane.showMessageDialog(addStaffFrame, "Error: something is missing");
            } else if (allStaff.containsKey(staffId)) {
                JOptionPane.showMessageDialog(addStaffFrame, "Error: staff id already exists");
            } else if (!allStaff.containsKey(supervisorId)) {
                JOptionPane.showMessageDialog(addStaffFrame, "Error: supervisor does not exist");
            } else {
                Staff supervisor = allStaff.get(supervisorId);
                Staff staff = new Staff(staffId, supervisor);
                allStaff.put(staffId, staff);
                JOptionPane.showMessageDialog(addStaffFrame, "Add successfully!");
            }
        }else{ //delete a staff
            if(!allStaff.containsKey(staffId)){
                JOptionPane.showMessageDialog(addStaffFrame, "Error: staff does not exist");
            }else{
                allStaff.remove(staffId);
                JOptionPane.showMessageDialog(addStaffFrame, "Delete successfully!");
            }
        }
    }
}
