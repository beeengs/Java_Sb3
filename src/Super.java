public class Super {
    public static void main(String[] args) {

        // super = Refers to the parent class (subclass <- superclass)
        //         Used in constructors and method overriding
        //         Calls the parent constructor to initialize attributes

        Person person = new Person("Tom", "Riddle");

        StudentS studentS = new StudentS("Harry", "Potter", 3.25);

        employeeS EmployeeS = new employeeS("Rubbeus", "Hagrid", 50000);

        System.out.println(studentS.gpa);

        studentS.showGPA();

        person.showName();

        EmployeeS.showSalary();

    }
}
