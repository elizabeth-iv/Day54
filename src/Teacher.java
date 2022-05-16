import java.util.List;
public class Teacher {

    private Integer id;
    private String name;
    private Integer salary;
    private Integer salaryEarned;

    public Teacher(Integer id, String name, Integer salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public void receiveSalary(Integer salary) {
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    public String toString() {
        return "Name of the Teacher: " + name + "\n" + "Total salary earned so far $" + salaryEarned;
    }




}
