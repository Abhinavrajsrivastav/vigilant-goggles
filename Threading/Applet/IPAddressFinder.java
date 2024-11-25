package Threading.Applet;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAddressFinder {
    public static void main(String[] args) {
        try {
            // Get the local host address
            InetAddress localhost = InetAddress.getLocalHost();
            System.out.println("Local Host IP Address: " + localhost.getHostAddress());

            // Get the IP address of a specific host (e.g., www.google.com)
            InetAddress googleAddress = InetAddress.getByName("www.google.com");
            System.out.println("Google IP Address: " + googleAddress.getHostAddress());
        } catch (UnknownHostException e) {
            System.err.println("Error occurred while finding IP address: " + e.getMessage());
        }
    }
}
