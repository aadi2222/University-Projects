package com.saad;
// Saad Mukhtar
//sp20-bcs-124
public abstract class Employee {
    private String name;
    private int SSN;
    private double hourlyIncome;
    private Date birthdate;

    public Employee(){
        name="Ali";
        SSN =7688;
        hourlyIncome=50;
        birthdate=new Date(5,5,1998);
    }
    public Employee(String name,int empID,double hourlyIncome,Date birthdate){
        this.SSN =empID;
        this.name=name;
        this.hourlyIncome=hourlyIncome;
        this.birthdate=birthdate;
    }
    public double earnings(){

        return 0;
    }
    public String toString(){

        return String.format("\nEmployee:%s \nSSN: %d)",name, SSN);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public int getSSN() {
        return SSN;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public String getName() {
        return name;
    }

    public double getHourlyIncome() {
        return hourlyIncome;
    }
}
