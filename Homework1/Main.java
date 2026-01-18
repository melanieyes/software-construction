public class Main {
    public static void main(String[] args) {
        
        Student minh = new Student("Minh","220003");


        Course course1 = new Course("CS203", "Software Construction", 30, 60);
        Course course2 = new Course("CS302", "Natural Language Processing", 40, 60);
        Course course3 = new Course("CS304", "Database Systems", 30,60); 
        Course course4 = new Course("CS402", "VS Capstone II", 4,160);
        Course course5 = new Course("MAT305", "Optimization", 3,60);      



        minh.addCourse(course1);
        minh.addCourse(course2);
        minh.addCourse(course3);
        minh.addCourse(course4);
        minh.addCourse(course5);

        minh.printCourseDetails();



        //handling maximum course load
        Course course6 = new Course("CS305", "Computer Networks", 30,60);
        Course course7 = new Course("VS397", "Game Theory for Political Science", 30,60);   
        

        minh.addCourse(course6); 
        minh.addCourse(course7); // this should print a message indicating max limit reached

        minh.printCourseDetails();
    }
}
