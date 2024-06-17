public class Method {
    //Without return Type without parameter
    static void voidMethod(){
        System.out.println("Void method is calling..");
    }


    //With return Type with parameter
    static void voidMethodWithArgument(int rent)
    {
        System.out.println("I will Give you rent plese Come :");
    }
    

    //With return Type without parameter
    static String returnTypeMethodWithoutArgument(){
        return "Return type with parameter";
    }

    
    // with return type with parameter
        static int returnTypeMethodWithArgument(int a, int b){
            System.out.println("The sum of two parameter : ");
        return a+b;
        }



    public static void main(String[] args) {
        System.out.println("We are calling Method.....");
        // Method calling
        Method.voidMethod();
        voidMethod();
        System.out.println("=======================================");
        voidMethodWithArgument(5000);
        System.out.println("=======================================");

        String result = returnTypeMethodWithoutArgument();
        System.out.println("=======================================");
        System.out.println("Return Type Method : "+result);
        System.out.println("=======================================");
        int res = returnTypeMethodWithArgument(10, 20);
        System.out.println(res);
    }
}
