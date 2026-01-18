public class Student {
    private String name;
    private String studentId;

    private static final int MAX_COURSES = 6;

    private Course[] courses;
    private int courseCount;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        this.courses = new Course[MAX_COURSES];
        this.courseCount = 0;
    }

    public String getName() {
        return this.name;
    }

    public String getStudentId() {
        return this.studentId;
    }

    public boolean addCourse(Course course) {
        if (this.courseCount >= MAX_COURSES) {
            System.out.println("Cannot add more courses. Maximum limit reached.");
            return false;
        }

        this.courses[this.courseCount] = course; 
        this.courseCount++;
        return true;
    }

    public int getTotalHoursThisSemester() {
        int totalHours = 0;
        for (int i = 0; i < this.courseCount; i++) {
            totalHours += this.courses[i].getTotalHours(); 
        }
        return totalHours;
    }

    public void printCourseDetails() {
        System.out.println("Courses for student: " + this.name + " (" + this.studentId + ")");
        System.out.println("Courses taken: " + this.courseCount + "/" + MAX_COURSES);

        for (int i = 0; i < this.courseCount; i++) {
            System.out.println((i + 1) + ". " + this.courses[i]);
        }

        System.out.println("Total hours this semester: " + getTotalHoursThisSemester());
    }
}
