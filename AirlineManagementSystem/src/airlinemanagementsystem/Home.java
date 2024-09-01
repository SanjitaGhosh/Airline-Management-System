package airlinemanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener{

    public Home() {
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("airlinemanagementsystem/icons/front2.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(-60, 0, 1600, 800);
        add(image);

        JLabel heading = new JLabel("AZURE AIRLINES WELCOMES YOU");
        heading.setBounds(550, 100, 1000, 40);
        heading.setForeground(Color.BLACK);
        heading.setFont(new Font("arial", Font.PLAIN, 40));
        image.add(heading);

        JMenuBar menubar = new JMenuBar();
        setJMenuBar(menubar);

        JMenu details = new JMenu("Details");
        menubar.add(details);

        JMenuItem flightDetails = new JMenuItem("Flight Details");
        flightDetails.addActionListener(this);
        details.add(flightDetails);

        JMenuItem customerDetails = new JMenuItem("Add Customer Details");
        customerDetails.addActionListener(this);
        details.add(customerDetails);

        JMenuItem bookFlight = new JMenuItem("Book Flight");
        bookFlight.addActionListener(this);
        details.add(bookFlight);

        JMenuItem journeyDetails = new JMenuItem("Journey Details");
        journeyDetails.addActionListener(this);
        details.add(journeyDetails);

        JMenuItem ticketCancellation = new JMenuItem("Cancel Ticket");
        ticketCancellation.addActionListener(this);
        details.add(ticketCancellation);

        JMenu ticket = new JMenu("Ticket");
        menubar.add(ticket);

        JMenuItem boardingPass = new JMenuItem("Boarding Pass");
        boardingPass.addActionListener(this);
        ticket.add(boardingPass);


        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String text = ae.getActionCommand();

        if (text.equals("Add Customer Details")) {
            new AddCustomer();
        } else if (text.equals("Flight Details")) {
            new Flight();
        } else if (text.equals("Book Flight")) {
            new Book_Flight();
        } else if (text.equals("Journey Details")) {
            new Journey_Details();
        } else if (text.equals("Cancel Ticket")) {
            new Cancel_Ticket();
        } else if (text.equals("Boarding Pass")) {
            new Boarding_Pass();
        }

    }

    public static void main(String[] args) {
        new Home();
    }
}