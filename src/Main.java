import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher Lizzy = new Teacher(1, "Lizzy", 500);
        Teacher Mellisa = new Teacher(2,"Mellisa", 700);
        Teacher Vanderhorn = new Teacher(3, "Vanderhorn", 600);

        List<Teacher> teacherList = new ArrayList<>();

        teacherList.add(Lizzy);
        teacherList.add(Mellisa);
        teacherList.add(Vanderhorn);

        Student Tamasha = new Student(1, "Tamasha", 4);
        Student Rakshith = new Student(2, "Rakshith Vasudev", 12);
        Student Rabbi = new Student(3, "Rabbi", 5);

        List<Student> studentList = new ArrayList<>();

        studentList.add(Tamasha);
        studentList.add(Rabbi);
        studentList.add(Rakshith);


        School GHS = new School(teacherList, studentList);

        Teacher Megan = new Teacher(6, "Megan", 900);

        GHS.addTeacher(Megan);

        Tamasha.payFees(5000);
        Rakshith.payFees(6000);

        System.out.println("GHS has earned $" + GHS.getTotalMoneyEarned() );
        System.out.println(" Making School Pay Salary ");
        Lizzy.receiveSalary( Lizzy.getSalary() );
        System.out.println("GHS has spent for salary to " + Lizzy.getName() + " and now has $" + GHS.getTotalMoneyEarned());

        Vanderhorn.receiveSalary( Vanderhorn.getSalary() );
        System.out.println("GHS has spent for salary to " + Vanderhorn.getName() + " and now has $" + GHS.getTotalMoneyEarned());

        System.out.println(Rakshith);
        Mellisa.receiveSalary(Mellisa.getSalary());
        System.out.println(Mellisa);



    }
}