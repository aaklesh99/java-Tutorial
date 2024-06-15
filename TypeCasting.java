
// TypeCasting:
// Manual : Double -> Float -> Long -> Integer -> Char -> Short -> Byte     Down Casting
// Automatic : Byte -> Short -> Char -> Integer -> Long -> Float -> Double  Up Casting

public class TypeCasting {
    public static void main(String[] args) {
        // System.out.println("Type Casting");

        // Automatic TypeCasting         Wide casting
        // byte b = 10;
        // short s = b; // Automatic TypeCasting
        // System.out.println("Short Value: " + s);

        // Manual TypeCasting           Narrow Casting
        // double d = 10.512334232432;
        // float f = (float) d; // Manual TypeCasting
        // long val=(long)f;
        // System.out.println("Float Value: " + f);
        // System.out.println("Long Value: " + val);


            //Advance TypeCasting using String
            // Primitive to non-Premitive
            // int num =5;
            // String str=String.valueOf(num);
            // System.out.print("Integer value : ");
            // System.out.println(num+num);
            // System.out.print("Integer to String : ");
            // System.out.println(str+str);

            // Non-Primitive to Primitive
            // String str1="123";
            // int num1=Integer.parseInt(str1);
            // System.out.print("String to Integer : ");
            // System.out.println(num1+num1);
            // float num2 =Float.parseFloat(str1);
            // System.out.print("String to float : ");
            // System.out.println(num2+num2);

    }
}


