package com.adi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener {

    private final JRadioButton econRadio = new JRadioButton("Economy");
    private final JRadioButton acRadio = new JRadioButton("AC");

    private final String[] econCity = {"Islamabad", "Murree", "Multan"};
    private final String[] acCity = {"Gujrat", "Gujranwala", "Faisalabad"};
    private final JComboBox<String> list = new JComboBox<>(econCity);

    private final JTextField totalSeats = new JTextField();

    private final JButton btn = new JButton("Compute Fare");

    public Frame() {

        super("Calculator");

        setSize(350, 350);
        getContentPane().setBackground(new Color(184, 198, 75));
        setLayout(new FlowLayout(FlowLayout.CENTER, 7, 20));

        JTextField departureCity = new JTextField();
        departureCity.setText("Lahore");
        departureCity.setPreferredSize(new Dimension(210,20));
        departureCity.setEnabled(false);

        totalSeats.setPreferredSize(new Dimension(180,24));

        list.setPreferredSize(new Dimension(300,24));
        btn.setPreferredSize(new Dimension(150,30));

        econRadio.addActionListener(this);
        acRadio.addActionListener(this);
        btn.addActionListener(this);

        JLabel departureCityLabel = new JLabel("Departure City:");
        add(departureCityLabel);
        add(departureCity);

        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(econRadio);
        radioGroup.add(acRadio);
        JLabel radioLabel = new JLabel("Class");
        add(radioLabel);
        add(econRadio);
        add(acRadio);

        JLabel comoBoxLabel = new JLabel("Arrival City");
        add(comoBoxLabel);
        add(list);

        JLabel departureCityList = new JLabel("Total Seats");
        add(departureCityList);

        add(totalSeats);

        add(btn);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == econRadio) {
            list.removeAllItems();
            for(String city: econCity) {
                list.addItem(city);
            }
        }

        if(e.getSource() == acRadio) {
                list.removeAllItems();
            for(String city: acCity) {
                list.addItem(city);
            }
        }

        if (e.getSource() == btn) {

            int seats = Integer.parseInt(this.totalSeats.getText());

            int fare = switch (list.getItemAt(list.getSelectedIndex())) {
                case "Islamabad" -> 2500;
                case "Murree" -> 3500;
                case "Multan" -> 2000;
                case "Gujrat" -> 700;
                case "Gujranwala" -> 850;
                case "Faisalabad" -> 550;
                default -> 0;
            };

            String message = "Bill = "  + fare + " * " + seats + " : " + (fare * seats);
            JOptionPane.showMessageDialog(null, message, "Your Fare", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
