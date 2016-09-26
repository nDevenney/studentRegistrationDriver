package studentRegistrationDriver;

import java.util.ArrayList;

import org.joda.time.DateTime;

import studentRegistrationMain.Course;
import studentRegistrationMain.Module;
import studentRegistrationMain.Student;

public class TestDriver {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        
        Student adam = new Student("Adam", "Graves", "13123457", "4/6/1996", 20);
        Student billy = new Student("Billy", "Morgan", "12654321", "5/6/1995", 21);
        Student caroline = new Student("Caroline", "McCormack", "13098765", "8/9/1995", 21);
        Student david = new Student("David", "Copeland", "11102938", "5/8/1993", 23);

        students.add(adam);
        students.add(billy);
        students.add(caroline);
        students.add(david);

        Module software = new Module("Software Engineering", "CT417", new ArrayList<Student>());
        Module graphics = new Module("Graphics and Image Processing", "CT404", new ArrayList<Student>());
        Module maths = new Module("Topology", "MA342", new ArrayList<Student>());

        DateTime startDate = new DateTime(2016, 9, 5, 8, 0); // 5th September
                                                             // 2016 8am
        DateTime endDate = new DateTime(2017, 5, 10, 18, 0); // 10th May 2017
                                                             // 6pm

        Course csit = new Course("Computer Science and Information Technology", new ArrayList<Module>(), startDate,
                endDate);

        software.addStudent(adam);
        software.addStudent(billy);
        software.addStudent(caroline);
        software.addStudent(david);

        graphics.addStudent(adam);
        graphics.addStudent(caroline);
        graphics.addStudent(david);

        maths.addStudent(billy);

        csit.addModule(software);
        csit.addModule(graphics);
        csit.addModule(maths);

        System.out.println("Students registered for " + csit.getName());
        System.out.println("Course dates: " + startDate.getDayOfMonth() + "/" + startDate.getMonthOfYear() + "/"
                + startDate.getYear() + " - " + endDate.getDayOfMonth() + "/" + endDate.getMonthOfYear() + "/"
                + endDate.getYear() + "\n");
    }

}
