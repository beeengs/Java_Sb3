public class employeeS extends Person{

    int salary;

    employeeS(String first,String last, int salary){

        super(first, last);
        this.salary = salary;

    }

    void showSalary(){
        System.out.println(this.first + "'s salary is $" + this.salary);
    }
}
