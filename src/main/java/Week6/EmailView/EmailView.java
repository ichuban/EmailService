package Week6.EmailView;

import Week6.EmailProperty;
import Week6.EmailSender;
import Week6.Server;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmailView extends JFrame {
    private JPanel mainPanel;


    private JButton wyślijButton;
    private JTextField podajImięTextField;
    private JTextField podajNazwiskoTextField;
    private JPasswordField podajHasłoPasswordField;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JCheckBox serwerONOFFCheckBox;
    private EmailSender sender = new EmailSender();
    private Server server = new Server();

    public EmailView() {
        initView();
        initListener();


        podajImięTextField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(podajImięTextField.getText());
            }
        });
        podajHasłoPasswordField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(podajHasłoPasswordField.getPassword());
            }
        });
        podajNazwiskoTextField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(podajNazwiskoTextField.getText());
            }
        });
        textField1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(textField1.getText());
            }
        });
        textField2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(textField2.getText());
            }
        });
        textField3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(textField3.getText());
            }
        });
        serwerONOFFCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (serwerONOFFCheckBox.isSelected()){
                    server.startServer();

                }
                else server.stopServer();
            }
        });
    }

    private void initListener() {
        wyślijButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Co ma sie dziać po kliknieciu
                String userID = podajImięTextField.getText();
                String userPassword = podajHasłoPasswordField.getText();
                String emailFrom = podajNazwiskoTextField.getText();
                String emailTo = textField1.getText();
                String subject = textField2.getText();
                String message = textField3.getText();

                EmailProperty ep = new EmailProperty(userID, userPassword, emailFrom, emailTo, subject, message);

                if(server.isServerON()){
                      sender.sendSimpleMail(ep);
                    JOptionPane.showMessageDialog(new JFrame(),"Email wysłany");
                }
                else
                {
                    server.startServer();
                    JOptionPane.showMessageDialog(new JFrame(),"Serwery wyłączone");
                }




            }
        });
    }

    private void initView() {
        setTitle("Email Sender");
        add(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(300, 400);
    }
}
