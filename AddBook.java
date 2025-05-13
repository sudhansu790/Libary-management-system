package library.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddBook extends JFrame implements ActionListener {
    JTextField titleField, authorField, bookField, publisherField;
    JButton saveButton, backButton;

    AddBook() {
        setTitle("Add Book");
        setLayout(null);
        setSize(500, 400);
        setLocation(400, 150);
        
        JLabel heading = new JLabel("Add New Book");
        heading.setFont(new Font("Tahoma", Font.BOLD, 22));
        heading.setBounds(150, 20, 300, 30);
        add(heading);

        JLabel title = new JLabel("Title:");
        title.setBounds(50, 80, 100, 30);
        add(title);

        titleField = new JTextField();
        titleField.setBounds(150, 80, 250, 30);
        add(titleField);

        JLabel author = new JLabel("Author:");
        author.setBounds(50, 130, 100, 30);
        add(author);

        authorField = new JTextField();
        authorField.setBounds(150, 130, 250, 30);
        add(authorField);

        JLabel booknumber = new JLabel("Book Number:");
        booknumber.setBounds(50, 180, 100, 30);
        add(booknumber);

        bookField = new JTextField();
        bookField.setBounds(150, 180, 250, 30);
        add(bookField);

        JLabel publisher = new JLabel("Publisher:");
        publisher.setBounds(50, 230, 100, 30);
        add(publisher);

        publisherField = new JTextField();
        publisherField.setBounds(150, 230, 250, 30);
        add(publisherField);

        saveButton = new JButton("Save");
        saveButton.setBounds(150, 290, 100, 30);
        saveButton.addActionListener(this);
        add(saveButton);

        backButton = new JButton("Back");
        backButton.setBounds(270, 290, 100, 30);
        backButton.addActionListener(this);
        add(backButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == saveButton) {
            String title = titleField.getText();
            String author = authorField.getText();
            String booknumber = bookField.getText();
            String publisher = publisherField.getText();
            
              try {
                Conn conn = new Conn();
                String query = "insert into library values('"+title+"', '"+author+"', '"+booknumber+"', '"+publisher+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details added successfully");
                setVisible(false);
                new Home();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
            new Home();
        }


            
    }

    public static void main(String[] args) {
        new AddBook();
    }
}
