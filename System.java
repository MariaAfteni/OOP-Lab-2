import static java.lang.System.out;

public class System {
    public static void main(String[] args) {

        Log l1 = new Log();
        l1.user = "Student";
        l1.username = "s.a@gmail.com";
        l1.password = "*******";
        out.print("-----------------------------------------------------------------------");
        out.print("\nLog Info");
        out.print("\nUser: " + l1.user);
        out.print("\nUsername: " + l1.username);
        out.print("\nPassword: " + l1.password);
        l1.log_in("Alina");
        l1.log_out("Alina");
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

        Department d1 = new Department();
        d1.name = "FCIM";
        out.print("\n-----------------------------------------------------------------------");
        out.print("\nDepartment Info");
        out.print("\nName: " + d1.name);
        d1.add_department("Alice");
        d1.delete_department("Alice");
        d1.add_staf("Alice");
        d1.delete_staf("Alice");
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
        t2.attendence("Roman", "present");
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

        Assignment as1 = new Assignment();
        as1.course = "AMS";
        out.print("\n-----------------------------------------------------------------------");
        out.print("\nAssignments");
        out.print("\nCourse: " + as1.course);
        as1.add_assignment("Melissa");
        as1.submit_assignment("Melissa");
        out.print("\n-----------------------------------------------------------------------");

        Grade g1 = new Grade();
        g1.course = "OOP";
        g1.grade = 8;
        out.print("\n-----------------------------------------------------------------------");
        out.print("\nGradding");
        out.print("\nCourse: " + g1.course);
        out.print("\nGrade: " + g1.grade);
        g1.gradded_assignment("Radu", "Catalina");
        out.print("\n-----------------------------------------------------------------------");

        Resources r1 = new Resources();
        r1.course = "PC";
        r1.type = "presentation";
        out.print("\n-----------------------------------------------------------------------");
        out.print("\nResources");
        out.print("\nCourse: " + r1.course);
        out.print("\nType: " + r1.type);
        r1.add_resource("Victor");
        r1.download_resource("Corina");
        out.print("\n-----------------------------------------------------------------------");
    }

}

class Log {
    String user;
    String username;
    String password;

    void log_in(String user_name) {
        out.print("\nThe user " + user_name + " logged into account");
    }

    void log_out(String user_name) {
        out.print("\nThe user " + user_name + " logged out of the account");
    }
}

class Admin {
    String name;
    int ID;

    void log() {
        out.print("\nAdmin " + name + " has logged into the account");
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
        out.print("\nAdmin " + name + " deleted " + student_name + " from " + course_name + " course");
    }

}

class Department {
    String name;

    void add_department(String admin_name) {
        out.print("\nThe admin " + admin_name + " added the " + name + " department");
    }

    void delete_department(String admin_name) {
        out.print("\nThe admin " + admin_name + " deleted the " + name + " department");
    }

    void add_staf(String admin_name) {
        out.print("\nThe admin " + admin_name + " added staf to the department");
    }

    void delete_staf(String admin_name) {
        out.print("\nThe admin " + admin_name + " deleted staf from the department");
    }
}

class Course {
    String name;
    int nr_credits;
    String teacher;

    void enrolled(String student_name) {
        out.print("\nStudent " + student_name + " enrolled to the " + name + " course");
    }

    void fineshed(String student_name) {
        out.print("\nStudent " + student_name + " finished " + name + " course and recived " + nr_credits + " credits");
    }
}

class Teacher {
    String name;
    String course;

    void log() {
        out.print("\nTeacher " + name + " has logged into the account");
    }

    void assignment(String name_course) {
        out.print("\nTeacher " + name + " added an assignment to the " + name_course + " course");
    }

    void grade_assignment(String student_name, String course_name) {
        out.print("\nTeacher " + name + " gradded the assignment of " + student_name + " student for the " + course_name
                + " course");
    }

    void attendence(String student_name, String attendance_status) {
        out.print("\nTeacher " + name + " recorded that student " + student_name + " is " + attendance_status);
    }
}

class Student {
    String name;
    int total_credits;

    void log() {
        out.print("\nStudent " + name + " has logged into the account");
    }

    void enroll(String course_name) {
        out.print("\nStudent " + name + " has enrolled to the " + course_name + " course");
    }

    void assignment(String course_name) {
        out.print("\nStudent " + name + " submitted the assignment at " + course_name + " course");
    }
}

class Assignment {
    String course;

    void add_assignment(String teacher_name) {
        out.print("\nThe teacher " + teacher_name + " added an assignment to the " + course + " course");
    }

    void submit_assignment(String student_name) {
        out.print("\nThe student " + student_name + " submitted an assignment to the " + course + " course");
    }
}

class Grade {
    String course;
    int grade;

    void gradded_assignment(String teacher_name, String student_name) {
        out.print("\nThe teacher " + teacher_name + " gradded an assignment of the " + student_name + " student");
    }
}

class Resources {
    String course;
    String type;

    void add_resource(String teacher_name) {
        out.print("\nThe teacher " + teacher_name + " added " + type + " to the " + course + " course");
    }

    void download_resource(String student_name) {
        out.print("\nThe student " + student_name + " downloaded the " + course + " " + type);
    }
}