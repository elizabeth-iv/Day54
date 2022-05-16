import java.util.List;
public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static Integer totalMoneyEarned;
    private static Integer totalMoneySpent;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    public List<Teacher> getTeachers(Teacher teacher) {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }


    public List<Student> getStudents(Student student) {
        return students;
    }

    public void addStudents(Student student) {
        students.add(student);
    }
    public Integer getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static void updateTotalMoneyEarned(Integer MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    public Integer getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public static void updateTotalMoneySpent(Integer moneySpent) {
        totalMoneyEarned -= moneySpent;
    }








}
