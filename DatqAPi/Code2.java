import java.sql.Date;

public class Code2 {
    public static void main(String[] args) {
        // Creating a java.sql.Date object representing today's date
        Date today = new Date(System.currentTimeMillis());
        System.out.println("Today's date: " + today);
    }
}
