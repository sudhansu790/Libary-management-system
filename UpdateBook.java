package library.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UpdateBook extends JFrame implements ActionListener {
    JTextField booknumberSearchField, titleField, authorField, publisherField;
    JButton searchButton, updateButton, backButton;

    // Mock data
    String sampleBOOKNUMBER = "9780451524935";
    String sampleTitle = "1984";
    String sampleAuthor = "George Orwell";
    String samplePublisher = "Signet Classics";

    UpdateBook() {
        setTitle("Update Book");
        setLayout(null);
        setSize(500, 450);
        setLocation(400, 150);

        JLabel heading = new JLabel("Update Book Details");
        heading.setFont(new Font("Tahoma", Font.BOLD, 20));
        heading.setBounds(140, 20, 300, 30);
        add(heading);

        JLabel booknumberLabel = new JLabel("Enter BOOK NUMBER:");
        booknumberLabel.setBounds(50, 80, 100, 30);
        add(booknumberLabel);

        booknumberSearchField = new JTextField();
        booknumberSearchField.setBounds(150, 80, 200, 30);
        add(booknumberSearchField);

        searchButton = new JButton("Search");
        searchButton.setBounds(360, 80, 80, 30);
        searchButton.addActionListener(this);
        add(searchButton);

        JLabel titleLabel = new JLabel("Title:");
        titleLabel.setBounds(50, 140, 100, 30);
        add(titleLabel);

        titleField = new JTextField();
        titleField.setBounds(150, 140, 250, 30);
        add(titleField);

        JLabel authorLabel = new JLabel("Author:");
        authorLabel.setBounds(50, 190, 100, 30);
        add(authorLabel);

        authorField = new JTextField();
        authorField.setBounds(150, 190, 250, 30);
        add(authorField);

        JLabel publisherLabel = new JLabel("Publisher:");
        publisherLabel.setBounds(50, 240, 100, 30);
        add(publisherLabel);

        publisherField = new JTextField();
        publisherField.setBounds(150, 240, 250, 30);
        add(publisherField);

        updateButton = new JButton("Update");
        updateButton.setBounds(150, 300, 100, 30);
        updateButton.addActionListener(this);
        add(updateButton);

        backButton = new JButton("Back");
        backButton.setBounds(270, 300, 100, 30);
        backButton.addActionListener(this);
        add(backButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == searchButton) {
            String booknumber = booknumberSearchField.getText();
            if (booknumber.equals(sampleBOOKNUMBER)) {
                titleField.setText(sampleTitle);
                authorField.setText(sampleAuthor);
                publisherField.setText(samplePublisher);
            } else {
                JOptionPane.showMessageDialog(null, "Book not found.");
            }
        } else if (ae.getSource() == updateButton) {
            String updatedTitle = titleField.getText();
            String updatedAuthor = authorField.getText();
            String updatedPublisher = publisherField.getText();

            // Here you would update the record in a file or database
            JOptionPane.showMessageDialog(null, "Book Updated:\nTitle: " + updatedTitle + "\nAuthor: " + updatedAuthor + "\nPublisher: " + updatedPublisher);
        } else if (ae.getSource() == backButton) {
            setVisible(false);
            new Home();
        }
    }

    public static void main(String[] args) {
        new UpdateBook();
    }
}
