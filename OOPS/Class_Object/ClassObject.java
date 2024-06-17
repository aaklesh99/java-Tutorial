package OOPS.Class_Object;

//Calss And Objects
class Animal {
int legs;
void eat(){
    System.out.println("Animal is eating");
}   
}

//Encapsulation
// class Employee {
//     String name;
//     int empId;
//     private long salary;
//     long getsalary(){
//         return salary;
//     }
//     void setsalary(long sals){
//         salary=sals;
//     }  
// }

//Abstraction

public class ClassObject {
    public static void main(String[] args) {
        Animal dog = new Animal();  //Object Creation
        dog.legs=4;
        System.out.println("legs : " +dog.legs);
        dog.eat();

        // Employee emp = new Employee();
        // emp.name="Rahul";
        // emp.empId=101;
        // emp.setsalary(50000);
        // System.out.println("Employee Name : " +emp.name);
        // System.out.println("Employee ID : " +emp.empId);
        // System.out.println("Employee Salary : " +emp.getsalary());


    }
}
