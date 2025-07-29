public class With_New_KeyWord {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        String str3 = new String("World");
        System.out.println(str1==str2);//false->because they are different objects
        System.out.println(str1==str3);//false->because they are different objects

        System.out.println(str1.equals(str2));//true->because they have the same content
        System.out.println(str1.equals(str3));//false->because they have different content
    }
}
