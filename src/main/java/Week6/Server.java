package Week6;

public class Server {

    private boolean serverON = false;

    public boolean startServer() {
        return serverON = true;
    }

    public boolean stopServer() {
        return serverON = false;
    }

    public boolean isServerON() {
        return serverON;
    }

}