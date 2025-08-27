package OPPS.Encapsulation;

import java.lang.reflect.Field;

class Employee{
    private double salary;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
       if(salary>0) {
            this.salary = salary;
            System.out.println(salary);
        }else{
           System.out.println("invalid");
       }
    }
}

public class Encapsu {
    public static void main(String[] args) throws Exception {

          Employee emp = new Employee();

//          As the private variable can't be access normally
//          but one can bypass it using reflection which is illegal practise
//        Field fsalary=Employee.class.getDeclaredField('salary');
//        fsalary.setAccessible(true);
//        System.out.println("salary:"+fsalary.get(emp));

        emp.setSalary(76623);
        System.out.println(emp.getSalary());
    }
}
