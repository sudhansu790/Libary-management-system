package library.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RemoveBook extends JFrame implements ActionListener {
    JTextField booknumberField;
    JLabel bookDetails;
    JButton searchButton, removeButton, backButton;

    // Mock book data
    String sampleBOOKNUMBER = "9780451524935";
    String sampleTitle = "1984";
    String sampleAuthor = "George Orwell";

    RemoveBook() {
        setTitle("Remove Book");
        setLayout(null);
        setSize(500, 350);
        setLocation(400, 150);

        JLabel heading = new JLabel("Remove Book");
        heading.setFont(new Font("Tahoma", Font.BOLD, 22));
        heading.setBounds(160, 20, 200, 30);
        add(heading);

        JLabel isbnLabel = new JLabel("Enter BOOK NUMBER:");
        isbnLabel.setBounds(50, 80, 100, 30);
        add(isbnLabel);

        booknumberField = new JTextField();
        booknumberField.setBounds(150, 80, 200, 30);
        add(booknumberField);

        searchButton = new JButton("Search");
        searchButton.setBounds(360, 80, 80, 30);
        searchButton.addActionListener(this);
        add(searchButton);

        bookDetails = new JLabel("");
        bookDetails.setBounds(50, 130, 400, 30);
        add(bookDetails);

        removeButton = new JButton("Remove");
        removeButton.setBounds(150, 180, 100, 30);
        removeButton.setEnabled(false);
        removeButton.addActionListener(this);
        add(removeButton);

        backButton = new JButton("Back");
        backButton.setBounds(270, 180, 100, 30);
        backButton.addActionListener(this);
        add(backButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == searchButton) {
            String isbn = booknumberField.getText();
            if (isbn.equals(sampleBOOKNUMBER)) {
                bookDetails.setText("Book Found: " + sampleTitle + " by " + sampleAuthor);
                removeButton.setEnabled(true);
            } else {
                bookDetails.setText("Book not found.");
                removeButton.setEnabled(false);
            }
        } else if (ae.getSource() == removeButton) {
            // In real app, delete from file or database
            JOptionPane.showMessageDialog(null, "Book removed successfully.");
            bookDetails.setText("");
            removeButton.setEnabled(false);
        } else if (ae.getSource() == backButton) {
            setVisible(false);
            new Home();
        }
    }

    public static void main(String[] args) {
        new RemoveBook();
    }
}


 
