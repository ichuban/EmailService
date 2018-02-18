package Week6;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;

public class EmailSender {

    public void sendSimpleMail(EmailProperty E_property) {

        EmailConfiguration E_configuration = new EmailConfiguration();


        try {
            Email email = new SimpleEmail();
            email.setHostName(E_configuration.getHOST());
            email.setSmtpPort(E_configuration.getPORT());
            email.setAuthenticator(new DefaultAuthenticator(E_property.getUserName(), E_property.getPassword()));
            email.setSSLOnConnect(E_configuration.isSslFlag());
            email.setFrom(E_property.getFromAddress());
            email.setSubject(E_property.getSubject());
            email.setMsg(E_property.getMessage());
            email.addTo(E_property.getToAddress());
            email.send();
        } catch (Exception ex) {
            System.out.println("Unable to send email");
            System.out.println(ex);
        }
    }
}