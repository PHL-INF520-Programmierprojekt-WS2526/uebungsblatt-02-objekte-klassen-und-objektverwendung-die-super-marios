package de.phl.programmingproject.enrollmentsystem;

import java.util.stream.Collectors;

/**
 * PUT YOUR CODE FOR THE EXERCISE 'STUDENT ENROLLMENT SYSTEM' IN THIS CLASS
 */
public class Main {
    public static void main(String[] args) {
        /* 1. Student Objekt  */
        final Student john = new Student("John Doe", "12345"); 
       // 2. Course-Objekt
        final Course intro = new Course("Introduction to Computer Science");

        /* 3. Infos  */ 
        System.out.println("=== Vor der Einschreibung ===");
        System.out.println("Student: " + john.getInfo());
        System.out.println("Kurs:    " + intro.getInfo());

        // 4. Einschreiben & Enrollment merken
        final Enrollment johnInIntro = john.enroll(intro);

        // 5. Infos ausgeben
        System.out.println("\n=== Nach der Einschreibung ===");
        System.out.println("Student: " + john.getInfo());
        System.out.println("Kurs:    " + intro.getInfo());

        // 6. Enrollment-Infos
        System.out.println("\n=== Enrollment-Info ===");
        System.out.println(johnInIntro.getInfo());

        /* 7. Note setzen */ 
        johnInIntro.setGrade(4.0);

        // 8. Enrollment-Infos erneut
        System.out.println("\n=== Enrollment-Info (mit Note) ===");
        System.out.println(johnInIntro.getInfo());

        // 9.  Zweiter Kurs
        final Course oop = new Course("Object-Oriented Programming");
        System.out.println("\n=== Zweiter Kurs erstellt ===");
        System.out.println("Kurs:    " + oop.getInfo());

        // 10. Studenten in den neuen Kurs einschreiben
        final Enrollment johnInOop = john.enroll(oop);
        System.out.println("\n=== 10) Einschreibung in Kurs 2 ===");
        System.out.println(johnInOop.getInfo());

        // 11. Ausgabe der Studenten  (getCourses)
     System.out.println(john.getCourses());


        // 12.  Liste der Studierenden im ersten Kurs (getStudents)
     System.out.println(intro.getStudents());


        // 13.  Studenten aus dem ersten Kurs streichen (drop)
        intro.drop(john);

        // 14. Liste der Studierenden im ersten Kurs erneut ausgeben
       System.out.println(intro.getStudents());

    } 
}
