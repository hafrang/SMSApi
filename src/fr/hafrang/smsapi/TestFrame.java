package fr.hafrang.smsapi;

import fr.hafrang.smsapi.exceptions.SMSSendingException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Fenêtre de test
 */
public class TestFrame extends JFrame {

    private SMSManager smsManager = new SMSManager();
    private JTextField login;
    private JTextField pass;
    private JTextArea message;

    public TestFrame() {
        setTitle("Envoyer un message");
        setBackground(Color.WHITE);
        setSize(700, 350);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel loginPanel = new JPanel();
        loginPanel.setBackground(Color.WHITE);
        loginPanel.setBorder(BorderFactory.createTitledBorder("Identifiant"));
        login = new JTextField();
        login.setPreferredSize(new Dimension(200, 25));
        loginPanel.add(login);

        JPanel passPanel = new JPanel();
        passPanel.setBackground(Color.WHITE);
        passPanel.setBorder(BorderFactory.createTitledBorder("Clé d'authentification"));
        pass = new JTextField();
        pass.setPreferredSize(new Dimension(200, 25));
        passPanel.add(pass);

        JPanel authPanel = new JPanel();
        authPanel.setBackground(Color.WHITE);
        authPanel.setPreferredSize(new Dimension(300, 250));
        authPanel.add(loginPanel, BorderLayout.WEST);
        authPanel.add(passPanel, BorderLayout.WEST);
        authPanel.setBorder(BorderFactory.createTitledBorder("Identification"));

        JPanel messagePanel = new JPanel();
        messagePanel.setBackground(Color.WHITE);
        messagePanel.setPreferredSize(new Dimension(300, 250));
        message = new JTextArea();
        message.setPreferredSize(new Dimension(280, 210));
        message.setEditable(true);
        message.setFont(new Font("TimesRoman", Font.PLAIN, 18));
        messagePanel.add(message, BorderLayout.CENTER);
        messagePanel.setBorder(BorderFactory.createTitledBorder("Message"));

        JButton send = new JButton("Envoyer");
        send.setBackground(Color.GRAY);
        send.setPreferredSize(new Dimension(200, 25));
        send.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                User user = new User(login.getText(), pass.getText());
                try {
                    smsManager.send(user, message.getText());
                    JOptionPane.showMessageDialog(null, "Le message a été envoyé avec succès !", "Succès", JOptionPane.INFORMATION_MESSAGE);
                } catch (SMSSendingException exception) {
                    JOptionPane.showMessageDialog(null, exception.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JPanel content = new JPanel();
        content.setBackground(Color.WHITE);
        content.setPreferredSize(getSize());
        content.add(authPanel);
        content.add(messagePanel);
        content.add(send);

        setContentPane(new JPanel());
        getContentPane().setBackground(Color.WHITE);
        getContentPane().add(content, BorderLayout.CENTER);

        setVisible(true);
    }

}
