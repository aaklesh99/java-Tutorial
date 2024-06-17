public class Strings {
    public static void main(String[] args) {
        //Strings are immutable in java
        //Advantage of string pool
        String str1="ABC";
        String str2="ABC";
        System.out.println(str1==str2);
        String str3=new String("ABC");
        System.out.println(str1==str3);
        System.out.println(str1.equals(str3));


        // Use of StringBuffer
        StringBuffer sb = new StringBuffer("Aklesh");
        sb.append(" Kumar");
        System.out.println(sb);
        // System.out.println(sb.toString());

        sb.delete(0,1);
        System.out.println(sb);

        sb.insert(0,'A');
        System.out.println(sb);
    }
    
}
