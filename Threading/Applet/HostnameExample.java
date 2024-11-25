package Threading.Applet;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class HostnameExample {
    public static void main(String[] args) {
        try {
            // Get the InetAddress object for localhost
            InetAddress localHost = InetAddress.getLocalHost();

            // Print the host name and canonical host name
            System.out.println("Host Name: " + localHost.getHostName());
            System.out.println("Canonical Host Name: " + localHost.getCanonicalHostName());
        } catch (UnknownHostException e) {
            System.err.println("Error occurred while getting host information: " + e.getMessage());
        }
    }
}