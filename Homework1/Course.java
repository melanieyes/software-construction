public class Course {
    private String id;
    private String name;
    private int lectureHours;
    private int practiceHours;

    public Course(String id, String name, int lectureHours, int practiceHours) {
        this.id = id;
        this.name = name;
        this.lectureHours = lectureHours;
        this.practiceHours = practiceHours;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getLectureHours() {
        return this.lectureHours;
    }

    public int getPracticeHours() {
        return this.practiceHours;
    }

    public int getTotalHours() {
        return this.lectureHours + this.practiceHours;
    }

    @Override
    public String toString() {
        return this.id + " - " + this.name
                + " (Lecture Hours: " + this.lectureHours
                + ", Practice Hours: " + this.practiceHours
                + ", Total Hours: " + getTotalHours() + ")";
    }
}
