public class SchoolApplication {
    public static void main(String[] args) {
        // Initialize school name
        String schoolName = "My School";

        // Create teachers
        Teacher teacher1 = new Teacher("John Doe", 50000.0);
        Teacher teacher2 = new Teacher("Jane Smith", 55000.0);

        // Create courses
        Course mathCourse = new Course("Mathematics", 100.0);
        Course physicsCourse = new Course("Physics", 120.0);

        // Create students
        Student student1 = new Student("Alice", "123 Main St", "alice@example.com");
        Student student2 = new Student("Bob", "456 Elm St", "bob@example.com");

        // Enroll students in courses
        student1.setCourse(mathCourse);
        student2.setCourse(physicsCourse);

        // Assign teachers to courses
        mathCourse.setTeacher(teacher1);
        physicsCourse.setTeacher(teacher2);

        // Execute commands (e.g., SHOW COURSES, LOOKUP COURSE, etc.)
        // ...

        // Calculate profit
        double totalMoneyEarned = mathCourse.getMoneyEarned() + physicsCourse.getMoneyEarned();
        double totalTeacherSalaries = teacher1.getSalary() + teacher2.getSalary();
        double profit = totalMoneyEarned - totalMoneyEarned - totalMoneyEarned;
    }
}