package com.wcoding;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

    private void setHourlyRate(int hourlyRate) {
        if(hourlyRate <= 0 ){
            throw new IllegalArgumentException("Hourly rate can not be less than 0 or less");
        }
        this.hourlyRate = hourlyRate;
    }

    private int getBaseSalary(){
        return baseSalary;
    }

    private void setBaseSalary(int baseSalary){
        if(baseSalary <= 0 ){
            throw new IllegalArgumentException("Salary can not be less than 0 or less");
        }
        this.baseSalary = baseSalary;
    }

    public int calculateWage() {
        return calculateWage(0);
    };

    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    };


}
