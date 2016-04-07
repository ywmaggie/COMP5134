package view;

import javax.swing.*;
import java.awt.*;

public class BackWindow extends JFrame{
	
	
	public BackWindow(int staffID) {
        super("Staff Window");
        this.setSize(500, 300);
        this.setLocation(100, 100);

        JPanel aPanel = new JPanel(new BorderLayout());
        JPanel topPanel = new JPanel();
        topPanel.add(new JLabel("Wellcome " + staffID + ", Please input your leaving time."));
        aPanel.add(topPanel, BorderLayout.NORTH);
        JPanel centerPanel = new JPanel(new GridLayout(7, 3, 5, 10));
        for (int i = 0; i < 6; i++) {
            centerPanel.add(new JPanel());
        }
        centerPanel.add(new JLabel("From", SwingConstants.RIGHT));
        
        final JTextField fromDateTextField = new JTextField("", 20);
        centerPanel.add(fromDateTextField);
        
        centerPanel.add(new JLabel("ddmmyyyy", SwingConstants.LEFT));
        centerPanel.add(new JLabel("To", SwingConstants.RIGHT));
        
        final JTextField toDateTextField = new JTextField("", 20);
        centerPanel.add(toDateTextField);
        
        centerPanel.add(new JLabel("ddmmyyyy", SwingConstants.LEFT));
        centerPanel.add(new JPanel());
        
        JButton applyButton = new JButton("Apply");
        centerPanel.add(applyButton);
        centerPanel.add(new JPanel());
        for (int i = 0; i < 6; i++) {
            centerPanel.add(new JPanel());
        }
        aPanel.add(centerPanel, BorderLayout.CENTER);

        this.add(aPanel);
        this.setVisible(true);
        
        this.staffID = staffID;
    }

}
