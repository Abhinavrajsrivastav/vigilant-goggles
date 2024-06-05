
package Enum;

class Enums{

    public enum Day{
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        Day day = Day.SUNDAY;
        System.out.println(day); 

        int indexOfMonday = Day.MONDAY.ordinal();
        System.out.println(indexOfMonday); //1
    }
}


//Enum-------------------

//Enum is predefined set of constants.
//1. An enum (short for "enumeration") in Java is a special data type that 
//2. enables a variable to be a set of predefined constants.
//3. We can use enum to define named constant.
//4. The enum keyword in Java was introduced in JDK 1.5.