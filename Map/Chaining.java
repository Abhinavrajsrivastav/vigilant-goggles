import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Chaining {
    public static void main(String[] args) {
        //Chaining Method in HashMap-
        LinkedList[] arr = new LinkedList[10];
        
        for(int i = 0;i<10;i++){
            LinkedList<Integer> list = new LinkedList<>();
            arr[i] = list;
        }

        //input data
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while(flag){
            System.out.println("Enter the value");
            int value = sc.nextInt();
            int hash = value % 10;
            arr[hash].add(value);
            System.out.println("Do you want to continue? Y/N");
            String response = sc.next();
            if(response.equals("N")){
                flag = false;
            }          
        }

        //display data
        for(int i = 0;i<10;i++){
            System.out.println("Index "+i+" : "+arr[i]);
        }


    }
}
