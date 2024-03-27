package Strings;

class Without_newKeyword {
    public static void main(String[] args) {
        String s = "Hello";
        String t = "Hello";
        //same hashcode will be printed for both s and t
        //because in SCP region only one object is created, duplicates are not allowed....
        System.out.println(t.hashCode());
        System.out.println(s.hashCode());


        String s1 = "Bruce";
        String s2 = s1.concat("Wayne");
        //s1 will lies in SCP region, because it's a string literal.
        //s2 will lies in heap memory, because it's a new object...
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}