package com.company;

public class Employee {
    private String first_Name;
    private String last_Name;
    private double yearly_Salary;

    public Employee(String fName, String lName,int salary){//this is a user defined constructor method
        first_Name=fName;
        last_Name=lName;
        if(salary>0){
            yearly_Salary=salary * 12;
        }else{
            yearly_Salary=0;
        }

    }

    //line 15 to 24 are the setter methods for the three private data in the code
    public void setFirst_Name(String f_Name){
        first_Name=f_Name;
    }
    public void setLast_Name(String l_Name ){
        last_Name=l_Name;
    }
    public void setyearly_SalaryIncrease(double sal) {
        yearly_Salary=sal;
    }

    // line 26 34 are the getter methods for all private data within the class
    public String getFirst_Name(){
        return first_Name;
    }
    public String getLast_Name(){
        return last_Name;
    }
    public double getyearly_Salary(){
        return yearly_Salary;
    }
}
