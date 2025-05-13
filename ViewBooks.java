package library.management.system;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class ViewBooks extends JFrame implements ActionListener {
    JTable table;
    JButton backButton;

    ViewBooks() {
        setTitle("View Books");
        setLayout(new BorderLayout());
        setSize(600, 400);
        setLocation(400, 150);

        // Table Columns
        String[] columns = {"Title", "Author", "Book Number", "Publisher"};

        // Sample data (you can later load from file or database)
        String[][] data = {
            {"C Programming", "Dennis Ritchie", "9780439136365", "Prentice Hall"},
            {"Head First Java", "Kathy Sierra", "9780261102217", "O Reilly Media"},
            {"Python Crash Course", "Eric Matthes", "9780451524935", "Strach Press"}
        };

        table = new JTable(new DefaultTableModel(data, columns));
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        backButton = new JButton("Back");
        backButton.addActionListener(this);
        add(backButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Home();
    }

    public static void main(String[] args) {
        new ViewBooks();
    }
}
