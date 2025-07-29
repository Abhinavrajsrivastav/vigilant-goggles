class With_out_New_KeyWord {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "Word";
        System.out.println(str1==str2);// true -> because they refer to the same object in the string pool
        System.out.println(str1==str3);// false -> because they are different strings

        System.out.println(str1.equals(str3));
    }
}
