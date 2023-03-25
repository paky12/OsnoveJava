public class Employee {
    private String name, surname;
    private double hourlyRate, hoursWorked;


    public Employee(String name, String surname, double hourlyRate, double hoursWorked){
        this.name = name;
        this.surname = surname;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    /**
     *funckija koja baca warning za nekorektnu vrijednost satnice ili ukupno radnih sata
     * izracunava placu na temelju te 2 vrijednosti koje moraju biti pozitivne
     * zaokruzuje rezultat na 2 decimale
     ***/


    public double calculateSalary() throws ExceptionSalaryCalculator{
        if(hoursWorked < 0 || hourlyRate <= 0){
            throw new ExceptionSalaryCalculator("Invalid hourlyRate or worked hours");
        }
        double salary = hourlyRate * hoursWorked;
        salary = Math.round(salary*100.0) / 100.0;
        if (salary < 0){
            throw new ExceptionSalaryCalculator("Salary cannot be negative.");
        }
        return salary;
    }

    public String getFullName(){
        return name + " " + surname;
    }

}

