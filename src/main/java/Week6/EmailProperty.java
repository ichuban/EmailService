package Week6;

public class EmailProperty {

    String userName = "rsuchodola@gmail.com";
    String password = "djsuchy123";

    String fromAddress = "rsuchodola@gmail.com";
    String toAddress = "ichuban@gmail.com";
    String subject = "Test Mail";
    String message = "Hello from Apache Mail";

    public EmailProperty(String userName, String password, String fromAddress, String toAddress, String subject, String message) {
        this.userName = userName;
        this.password = password;
        this.fromAddress = fromAddress;
        this.toAddress = toAddress;
        this.subject = subject;
        this.message = message;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getFromAddress()
    {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress)
    {
        this.fromAddress = fromAddress;
    }

    public String getToAddress()
    {
        return toAddress;
    }

    public void setToAddress(String toAddress)
    {
        this.toAddress = toAddress;
    }

    public String getSubject()
    {
        return subject;
    }

    public void setSubject(String subject)
    {
        this.subject = subject;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }
}