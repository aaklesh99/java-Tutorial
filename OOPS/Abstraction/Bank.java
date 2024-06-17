package OOPS.Abstraction;

public abstract class Bank {

    String name;
    abstract void readData();       //when we create a abstract class we the function under a abstract class not need to body of a function
    abstract void writeData();
    
}


/**
 * InnerBank
 */
class Admin extends Bank {
    
    void readData(){        //when we extends a class with another class then we have to insilization that function with body

    }
    void writeData(){

    }
    
}

/**
 * Marketing 
 */
class Marketing extends Bank {
    @Override
    void readData() {
        System.out.println("Reading data from Marketing database");
        }
        @Override
        void writeData(){
            System.out.println("Writing data to Marketing database");
        }

    
}
