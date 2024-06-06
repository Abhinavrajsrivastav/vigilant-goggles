package BigInteger;
import java.math.*;

public class BigI {
//-----BigInteger class - used to store very large integers
//-----Creared by James Gosling

    public static void main(String[] args) {
        BigInteger b1 = new BigInteger("123456789012345678901234567890");
        BigInteger b2 = new BigInteger("987654321098765432109876543210");
        BigInteger b3 = b1.add(b2);
        BigInteger b4 = b1.multiply(b2);
        BigInteger b5 = b1.subtract(b2);
        BigInteger b6 = b1.divide(b2);

//------BigInteger class methods

        // BigInteger b7 = b1.mod(b2);
        // BigInteger b8 = b1.pow(2);
        // BigInteger b9 = b1.gcd(b2);
        // BigInteger b10 = b1.abs();
        // BigInteger b11 = b1.negate();
        // BigInteger b12 = b1.min(b2);    
        // BigInteger b13 = b1.max(b2);
        // BigInteger b14 = b1.shiftLeft(2);
        // BigInteger b15 = b1.shiftRight(2);
        // BigInteger b16 = b1.and(b2);
        // BigInteger b17 = b1.or(b2);
        // BigInteger b18 = b1.xor(b2);
        // BigInteger b19 = b1.not();
         

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
    }

}
