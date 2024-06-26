class Student {
    private String studentId;
    private String name;
    private String address;
    private String email;
    private Course course;

    public Student(String name, String address, String email) {
        this.studentId = generateStudentId();
        this.name = name;
        this.address = address;
        this.email = email;
        this.course = null;
    }

    // Getter functions
    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public Course getCourse() {
        return course;
    }

    // Setter functions
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    private String generateStudentId() {
        // Logic to generate a unique student ID (you can customize this)
        return "S" + System.currentTimeMillis();
    }
}