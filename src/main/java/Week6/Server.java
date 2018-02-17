package Week6;

import java.util.logging.Logger;

public class Server {

    private boolean isRunning = false;

    private EmailSender service = new EmailSender();
    public static final Logger log = Logger.getLogger(EmailSender.class.getName());

    {
        if (isRunning = true) {
            service.sendEmail();
        }
       else {
            log.warning("Serwer jest wyłączony!");
        }
    }


    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }


}