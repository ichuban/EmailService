package Week6;

public class EmailConfiguration {

    private static final String HOST = "smtp.gmail.com";
    private static final int PORT = 465;
    private static final boolean SSL_FLAG = true;

    public String getHOST()
    {
        return HOST;
    }

    public int getPORT()
    {
        return PORT;
    }

    public boolean isSslFlag()
    {
        return SSL_FLAG;
    }
}