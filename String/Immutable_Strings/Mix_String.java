public class Mix_String {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = "Hello";
        String str3 = "World";
        
        System.out.println(str1 == str2); // false -> because str1 is a new object
        System.out.println(str1.equals(str2)); // true -> because they have the same content
        
        System.out.println(str2 == str3); // false -> different content
        System.out.println(str2.equals(str3)); // false -> different content
    }
}
