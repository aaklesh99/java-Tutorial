package OOPS.Abstraction;

interface MyBank {  //when we declare a function with interface the we not need to inilization the body of function
    void write(); 
    void read();
    void fetch();
     
}

/**
 * SBIBank 
 */
class SBIRead implements MyBank {       //when we implements a class with another class then we have to insilization that function with body


    public void write(){
        System.out.println("This is SBI read function");
    }
    public void read(){
        System.out.println("This is SBI read function");
    }
    public void fetch(){ 
        System.out.println("This is SBI fetch function");
        }
    
}
