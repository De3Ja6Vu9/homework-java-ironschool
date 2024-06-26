import java.util.ArrayList;
import java.util.List;

class Teacher {
    private String teacherId;
    private String name;
    private double salary;

    public Teacher(String name, double salary) {
        this.teacherId = generateTeacherId();
        this.name = name;
        this.salary = salary;
    }

    // Getter functions
    public String getTeacherId() {
        return teacherId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Setter functions
    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private String generateTeacherId() {
        // Logic to generate a unique teacher ID (you can customize this)
        return "T" + System.currentTimeMillis();
    }
}