package lesson4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Chat extends JFrame{
    JTextArea textArea;
    JTextField textMassage;

    public Chat() {
        setTitle("Main");
        setBounds(500, 200, 300, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel topPart = new JPanel();
        add(topPart, BorderLayout.CENTER);
        topPart.setBackground(Color.gray);
        topPart.setLayout(new BorderLayout());

        JPanel buttonPanel = new JPanel();
        add(buttonPanel, BorderLayout.SOUTH);
        buttonPanel.setBackground(Color.darkGray);
        buttonPanel.setPreferredSize(new Dimension(1, 50));
        buttonPanel.setLayout(new BorderLayout());

        JButton startButton = new JButton("ОТПРАВИТЬ");
        buttonPanel.add(startButton, BorderLayout.EAST);

        textArea = new JTextArea();
        JScrollPane textAreaScroll = new JScrollPane(textArea);
        topPart.add(textAreaScroll, BorderLayout.CENTER);
        textArea.setEditable(false);

        textMassage = new JTextField();
        buttonPanel.add(textMassage, BorderLayout.CENTER);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addText();
            }
        });

        textMassage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addText();
            }
        });

        setVisible(true);
    }
    void addText() {
        textArea.append(textMassage.getText()+"\n");
        textMassage.setText("");
    }
}
