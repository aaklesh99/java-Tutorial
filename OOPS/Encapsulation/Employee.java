package OOPS.Encapsulation;


    class Employee {
        private String name;
        private int empID;
        private double salary;
        private double incentiveSal;
        private double totalSal=salary+incentiveSal;
    

        Employee(String empName, int emplId, double Sal, double incSal ){           //Parameterized Consturctor
            name=empName;
            empID=emplId;
            salary=Sal;
            incentiveSal=incSal;
            

        }

        Employee(){                                 //Default Constructor
            name="Akki";
            empID=102;
        }

       
        double getSalary(){             //geter
            return salary;
        }
        String getName(){               //geter
            return name="Aklesh";
        }
        int getEmpId(){             //geter
            return empID=101;
        }
        double getIncentive(){              //geter 
            return incentiveSal;
        }
        double getTotalSal(){               //geter               
            return totalSal;
        }

       void setName(String newName){
       name=newName;
       }
        
       void setEmpID(int newId){
        empID=newId;
       }
        
    }


    