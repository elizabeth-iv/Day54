import java.nio.charset.IllegalCharsetNameException;

public class Student {
    private Integer id;
    private String name;
    private Integer grade;
    private Integer feesPaid;
    private Integer feesTotal;

    public Student(int id, String name, Integer grade) {
        this.feesPaid = 0;
        this.feesTotal = 0;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public void payFees(Integer fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getGrade() {
        return grade;
    }

    public Integer getFeesPaid() {
        return feesPaid;
    }

    public Integer getFeesTotal() {
        return feesTotal;
    }

    public Integer getRemainingFees() {
        return feesTotal - feesPaid;
    }

    public String toString() {
        return "Student's name: " + name + "\n" + "Total fees paid so far $" + feesPaid;
    }



}
