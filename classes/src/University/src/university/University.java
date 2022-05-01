package University.src.university;

import java.util.ArrayList;
import java.util.List;

public class University {
    public int capacity;
    public List<Student> students;

    public University(int capacity){
        this.capacity = capacity;
        this.students = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Student> getStudents() {
        return students;
    }
    public int getStudentCount(){
        return students.size();
    }
    public String registerStudent(Student student){
        if (this.capacity <= students.size()){
            return "No seats in the university";
        }else if (students.contains(student)){
            return "Student is already in the university";
        }else
            students.add(student);
        return ("Added student "+student.getFirsName()+" "+student.getLastName());
    }

    public String dismissStudent(Student student){
        if(students.contains(student)){
            String removedStud = "Removed student " + student.getFirsName() + " "+ student.getLastName();
            students.remove(student);
            return removedStud;
        }
        return "Student not found";
    }
    public Student getStudent(String firstName, String lastName){
        for (Student stud:students) {
            if (stud.getFirsName().equals(firstName) && stud.getLastName().equals(lastName)){
                return stud;
            }
        }
        return null;
    }

    public String getStatistics(){
        StringBuilder builder = new StringBuilder();
        for (Student stud:students) {
            builder.append("==Student: First Name = ").append(stud.getFirsName())
                    .append(", Last Name = ").append(stud.getLastName())
                    .append(", Best Subject = ").append(stud.getBestSubject())
                    .append(System.lineSeparator());
        }


        return builder.toString().trim();
    }
}
