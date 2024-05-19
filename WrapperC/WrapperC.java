import java.lang.*;


//Example of Wrapper Classes...

class WrapperC{
    public static void main(String[] args) {
        int a = 10;

        //Boxing - Primitive -- > object
        Integer i = Integer.valueOf(a);
        System.out.println(i);
        // System.out.println(i.getClass().getName()); 

        //Unboxing - object -- > Primitive
        int j = i.intValue();
        System.out.println(j);

        //Autoboxing - Automatic conversion of primitive to object
        Integer k = a;

        //Autounboxing - Automatic conversion of object to primitive
        int l = k;
    }
}