package com.company;

public class Employee_System {

    public static void main(String[] args) {

    Employee worker1=new Employee("Mr. Ovie", "Samson", 25_000);
    Employee worker2=new Employee("Mrs. Alu","Chioma",20_000);

        System.out.println(worker1.getFirst_Name()+" "+worker1.getLast_Name()+"\nYearly Salary= #"+worker1.getyearly_Salary());
        System.out.println(worker2.getFirst_Name()+" "+worker2.getLast_Name()+"\nYearly Salary= #"+worker2.getyearly_Salary());

        double sal_Increase1= worker1.getyearly_Salary()* 0.1;//just to increase the salary by 10%
        double sal_increase2= worker2.getyearly_Salary() * 0.1;

        worker1.setyearly_SalaryIncrease(sal_Increase1 + worker1.getyearly_Salary());
        worker2.setyearly_SalaryIncrease(sal_increase2+ worker2.getyearly_Salary());

        System.out.println("\n\n"+worker1.getFirst_Name()+" "+worker1.getLast_Name()+"\nYearly %10 increase Salary= #"+worker1.getyearly_Salary());
        System.out.println(worker2.getFirst_Name()+" "+worker2.getLast_Name()+"\nYearly %10 increase Salary= #"+worker2.getyearly_Salary());


    }
}
