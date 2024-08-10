
package Enum;

import java.util.*;

public class Enums1 {
    enum Din{

        //Constants
        SOMWAR, MANGALWAR, BUDHWAR, GURUWAR, SHUKRAWAR, SHANIVAR, RAVIVAR;

        //constructor of each constant is created when we initialise the enum constant....

        //public static final Din SOMWAR = new Din();
        //public static final Din MANGALWAR = new Din();
        //public static final Din BUDHWAR = new Din();
        //public static final Din GURUWAR = new Din();
        //public static final Din SHUKRAWAR = new Din();
        //public static final Din SHANIVAR = new Din();
        //public static final Din RAVIVAR = new Din();

        //Variable
        int ans;

        //Constructor
        Din(){
            System.out.println("Constuctor is invoked");
        }

        //Method
        public void setAns(int ans){
            this.ans = ans;
        }

        //Method
        public int getAns(){
            return this.ans;
        }
    }
    public static void main(String[] args) {
        Din day = Din.SOMWAR;
        System.out.println(day); 

        // Din.SOMWAR.setAns(20);
        // int val = Din.SOMWAR.getAns();
        // System.out.println(val);

        //we can pass these in a enum
        //1. a variable
        //2. a method
        //3. a constructor
        //4. a class
        //5. an interface
        float d[] = {1,2,3};
    }
}
