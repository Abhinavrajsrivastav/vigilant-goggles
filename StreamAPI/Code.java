import java.lang.*;
import java.util.*;

public class Code {
    public static void main(String[] args) {
        // String str = "Hello";

        // str += "Abhinav";

        // StringBuilder   sb = new StringBuilder(str);
        // sb += "Abhinav";

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(j>=n-i-1){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
