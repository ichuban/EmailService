package Week6;

import Week6.EmailView.EmailView;

public class main
{
    public static void main( String[] args )
    {
        EmailView eV = new EmailView();

        Server server = new Server();
        EmailSender sender = new EmailSender();

        if(server.isServerON()){
          //  sender.sendSimpleMail();
        }
        else
        {
            server.startServer();
        }



    }
}