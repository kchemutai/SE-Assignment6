package edu.mum.cs.cs425.demos.studentrecordsmgmtapp;

import edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model.Student;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyStudentRecordsMgmtApp {
    public static void printListOfStudents(Student [] students){
        Arrays.sort(students, (Student s1, Student s2)->s1.getName().compareTo(s2.getName()));
        for(Student s: students){
            System.out.println(s);
        }
    }

    public static List<Student> getListOfPlatinumAlumniStudents(Student [] students){
        List<Student> platinumStudents = new ArrayList<>();
        for(Student s: students){
            if(Period.between(s.getDateOfAdmission(), LocalDate.now()).getYears() >= 30){
                platinumStudents.add(s);
            }
        }
        return platinumStudents;
    }

    public static void printListOfPlatinumStudents(List<Student> students){
        students.sort((Student s1, Student s2)->s1.getDateOfAdmission().getYear()>s2.getDateOfAdmission().getYear()?1:-1);
        for(Student student: students){
            System.out.println(student);
        }
    }
    public static void main(String[] args) {
        Student [] students = {
                new Student(110001, "Dave", LocalDate.of(1951, 11, 18)),
                new Student(110002, "Anna", LocalDate.of(1990, 12, 7)),
                new Student(110003, "Erica", LocalDate.of(1974, 1, 31)),
                new Student(110004, "Carlos", LocalDate.of(2009, 8, 22)),
                new Student(110005, "Bob", LocalDate.of(1990, 3, 5)),
        };
        System.out.println("List of Students in Ascending Order");
        printListOfStudents(students);
        System.out.println();

        List<Student> platinumStudents = getListOfPlatinumAlumniStudents(students);
        System.out.println("List of Platinum Students in Descending Order ");
        printListOfPlatinumStudents(platinumStudents);
    }
}
