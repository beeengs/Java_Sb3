public class StudentS extends Person{

    double gpa;

    StudentS(String first, String last, double gpa){
        super(first, last);

        this.first = first;
        this.last = last;
        this.gpa = gpa;

    }

    void showGPA(){
        System.out.println(this.first + " 's gpa is: " + this.gpa);
    }

}
