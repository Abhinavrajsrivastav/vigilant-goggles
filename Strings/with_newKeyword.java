package Strings;

public class with_newKeyword {
    public static void main(String[] args) {
        String s = new String("Hello");
        String t = new String("Hello");
        
        if(s==t) System.out.println("equal refference");
        else System.out.println("not equal refference");
        
        
        //same hashcode will be printed for both s and t
        //because in Heap area new object is created for each new keyword...
        System.out.println(t.hashCode());
        System.out.println(s.hashCode());
    }
}
