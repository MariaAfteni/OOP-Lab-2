import static java.lang.System.out; 

public class System {
    public static void main(String[] args) {
        Admin a1 = new Admin();
        a1.name = "Alice";
        a1.ID = 31245;
        out.print("-----------------------------------------------------------------------");
        out.print("\nAdmin Info");
        out.print("\nName: " + a1.name);
        out.print("\nID: " + a1.ID);
        a1.log();
        a1.add_course("Math 101");
        a1.add_student("Emir", "Math 101");
        out.print("\n-----------------------------------------------------------------------");

        Admin a2 = new Admin();
        a2.name = "Radu";
        a2.ID = 83942;
        out.print("\n-----------------------------------------------------------------------");
        out.print("\nAdmin Info");
        out.print("\nName: " + a2.name);
        out.print("\nID: " + a2.ID);
        a2.log();
        a2.edit_course("OOP");
        a2.delete_student("Elena", "OOP");
        out.print("\n-----------------------------------------------------------------------");

        Admin a3 = new Admin();
        a3.name = "Alice";
        a3.ID = 31245;
        out.print("\n-----------------------------------------------------------------------");
        out.print("\nAdmin Info");
        out.print("\nName: " + a3.name);
        out.print("\nID: " + a3.ID);
        a3.log();
        a3.delete_course("Pascal Basics");
        out.print("\n-----------------------------------------------------------------------");

        Teacher t1 = new Teacher();
        t1.name = "Melissa";
        t1.course = "AMS";
        out.print("\n-----------------------------------------------------------------------");
        out.print("\n Teacher Info");
        out.print("\nName: " + t1.name);
        out.print("\nCourse: " + t1.course);
        t1.log();
        t1.assignment(t1.course);
        out.print("\n-----------------------------------------------------------------------");

        Teacher t2 = new Teacher();
        t2.name = "Victor";
        t2.course = "PC";
        out.print("\n-----------------------------------------------------------------------");
        out.print("\n Teacher Info");
        out.print("\nName: " + t2.name);
        out.print("\nCourse: " + t2.course);
        t2.log();
        t2.attendence("Roman","present");
        t2.grade_assignment("Roman", t2.course);
        out.print("\n-----------------------------------------------------------------------");

        Course c1 = new Course();
        c1.name = "AMS";
        c1.nr_credits = 4;
        c1.teacher = "Melissa";
        out.print("\n-----------------------------------------------------------------------");
        out.print("\nCourse Info");
        out.print("\nName: " + c1.name);
        out.print("\nCredits: " + c1.nr_credits);
        out.print("\nTeacher: " + c1.teacher);
        c1.enrolled("Andrei");
        out.print("\n-----------------------------------------------------------------------");


        Course c2 = new Course();
        c2.name = "OOP";
        c2.nr_credits = 5;
        c2.teacher = "Henry";
        out.print("\n-----------------------------------------------------------------------");
        out.print("\nCourse Info");
        out.print("\nName: " + c2.name);
        out.print("\nCredits: " + c2.nr_credits);
        out.print("\nTeacher: " + c2.teacher);
        c2.fineshed("Elena");
        out.print("\n-----------------------------------------------------------------------");

        Student s1 = new Student();
        s1.name = "Andrei";
        s1.total_credits = 14;
        out.print("\n-----------------------------------------------------------------------");
        out.print("\nStudent Info");
        out.print("\nName: " + s1.name);
        out.print("\nCredits: " + s1.total_credits);
        s1.log();
        s1.enroll("AMS");
        s1.assignment("AMS");
        out.print("\n-----------------------------------------------------------------------");
    }
}

class Admin {
    String name;
    int ID;

    void log() {
        out.print("\nAdmin "+ name + " has logged into the account");
    }

    void add_course(String course_name) {
        out.print("\nAdmin " + name + " added " + course_name + " to courses");
    }

    void edit_course(String course_name) {
        out.print("\nAdmin " + name + " edited " + course_name + " course");
    }

    void delete_course(String course_name) {
        out.print("\nAdmin " + name + " deleted " + course_name + " from courses");
    }

    void add_student(String student_name, String course_name) {
        out.print("\nAdmin " + name + " added " + student_name + " to the " + course_name + " course");
    }

    void delete_student(String student_name, String course_name) {
        out.print("\nAdmin " + name + " deleted " + student_name + " from " + course_name +" course");
    }

}

class Course {
    String name;
    int nr_credits;
    String teacher;

    void enrolled(String student_name){
        out.print("\nStudent " + student_name + " enrolled to the " + name + " course");
    }

    void fineshed(String student_name){
        out.print("\nStudent " + student_name + " finished " + name + " course and recived " + nr_credits + " credits");
    }
}


class Teacher {
    String name;
    String course;

    void log() {
        out.print("\nTeacher " + name + " has logged into the account");
    }

    void assignment(String name_course){
        out.print("\nTeacher " + name + " added an assignment to the " + name_course + " course");
    }

    void grade_assignment(String student_name, String course_name){
        out.print("\nTeacher " + name + " gradded the assignment of " + student_name + " student for the " + course_name + " course");
    }

    void attendence(String student_name, String attendance_status){
        out.print("\nTeacher " + name + " recorded that student " + student_name + " is " + attendance_status);
    }
}

class Student {
    String name;
    int total_credits;

    void log() {
        out.print("\nStudent " + name + " has logged into the account");
    }
    
    void enroll(String course_name){
        out.print("\nStudent " + name + " has enrolled to the " + course_name + " course");
    }

    void assignment(String course_name){
        out.print("\nStudent " + name + " submitted the assignment at " + course_name + " course");
    }
}

