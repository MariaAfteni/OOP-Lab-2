# OOP-Lab-2
Public Class System is the main class of the poject where are created all the objects using the classes that are described below it. 

Class Log has the methods : Log In and Log Out. Has the attributes user - the type of the user(student/admin/teacher), username and password;

Class Admin describes the attributes and the methods of the Admin actor. The admin has the most power over the system, therefore he has the biggest number of methods. The attributes of the class are name of admin and hi ID. The Admin methods are : log into account, add/edit/delete a course and add/delete a student from the course.

Class Department contains the info about faculty departments. Has the atribute name of the department. THe admin can add/delete a department and add/delete staf.

Class Course describes the name, teacher and number of credits that you get after finishing the class. Through methods student can be enrolled or can finish a course.

Class Teacher has the teacher name and the course as attributes. The teacher can log into account, add and grade an assignment and record attendance through methods described in the class.

Class Studend attributes are name and total credits of a student. A student can log into system, enroll into a course and submit assignments.

Class Assignments contains the course name. A teacher using the methods can add an ssignment and  a student can submit them.

Class Grade describes the courses and the grade as attributes. Has amethod that describes how the teacher grades a student.

Class Resources contains atributes of the course name and the type of resource. Methods describe how a teacher can add a resource and how a student can download it.
