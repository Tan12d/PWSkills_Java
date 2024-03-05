package TwoDimensionalArray;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

class Employee
{
    private String name;
    private Double salary;
    private Date joiningDate;
    private String gender;

    public Employee()
    {

    }

    public Employee(String name, Double salary, Date joiningDate, String gender)
    {
        this.name=name;
        this.salary=salary;
        this.joiningDate=joiningDate;
        this.gender=gender;
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() { return salary; }

    public void setSalary(Double salary) {
        this.salary=salary;
    }

    public Date getJoiningDate() { return joiningDate; }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate=joiningDate;
    }

    public String getGender() { return gender; }

    public void setGender(String gender) {
        this.gender=gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\''+
                ", salary=" + salary +
                ", joiningDate=" + joiningDate +
                ", gender='" + gender + '\'' +
                '}';
    }
}

public class rough1
{
    public static void main(String[] args) throws ParseException
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        Date joiningDateRam = dateFormat.parse("01-01-2000");
        Date joiningDateSita = dateFormat.parse("15-05-1995");
        Date joiningDateVishnu = dateFormat.parse("10-12-1998");
        Date joiningDateMahesh = dateFormat.parse("20-03-1990");

        List<Employee> emp = Arrays.asList(
                new Employee("Ram", 50000.0, joiningDateRam, "M"),
                new Employee("Sita", 40000.0, joiningDateSita, "F"),
                new Employee("Vishnu", 20000.0, joiningDateVishnu, "M"),
                new Employee("Mahesh", 70000.0, joiningDateMahesh, "M")
        );

        Employee maxSalary = emp.stream().sorted().max((a, b) -> Double.compare(a.getSalary(), b.getSalary())).get();

        System.out.println(maxSalary);


















    }
}

