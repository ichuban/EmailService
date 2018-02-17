package Week6;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;

public class EmailSender {

    public void sendEmail() {
        String userName = "rsuchodola@gmail.com";
        String password = "djsuchy123";

        String fromAdress = "rsuchodola@gmail.com";
        String toAdress = "ichuban@gmail.com";
        String subject = "Test email";
        String message = "Hello from Apache Mail";

        try {
            Email email = new SimpleEmail();
            email.setHostName(EmailConfiguration.HOST);
            email.setSmtpPort(EmailConfiguration.PORT);
            email.setAuthenticator(new DefaultAuthenticator(userName, password));
            email.setSSLOnConnect(EmailConfiguration.SSL_FLAG);
            email.setFrom(fromAdress);
            email.setSubject(subject);
            email.setMsg(message);
            email.addTo(toAdress);
            email.send();
        } catch (Exception ex) {
            System.out.println("Unable to send email");
            System.out.println(ex);
        }
    }


}
