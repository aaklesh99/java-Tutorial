package OOPS.Encapsulation;

/**
 * InnerEncapsulation
 */


public class EncapsulationExample {
    public static void main(String[] args) {
        System.out.println("Calling Parameterized coustructor");
        System.out.println("=======================================");
       Employee emp = new Employee("Aklesh",101,30000,2000);
       System.out.println(emp.getEmpId());
       System.out.println(emp.getName());
       System.out.println(emp.getSalary());
       System.out.println(emp.getIncentive());
       System.out.println(emp.getTotalSal());
        
       System.out.println("Calling default coustructor");
       System.out.println("=======================================");
       Employee emp2 = new Employee();
       emp2.setName("Raj");
       emp2.setEmpID(103);
       System.out.println(emp2.getName());
       System.out.println(emp2.getEmpId());
       

        
    }
}
