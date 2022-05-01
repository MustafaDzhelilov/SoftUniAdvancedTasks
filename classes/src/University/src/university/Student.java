package University.src.university;

public class Student {

    public String firsName;
    public String lastName;
    public String bestSubject;

    public Student(String firsName, String lastName, String bestSubject){
        this.firsName = firsName;
        this.lastName = lastName;
        this.bestSubject = bestSubject;
    }

    public String getFirsName() {
        return firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBestSubject() {
        return bestSubject;
    }

    @Override
    public String toString() {
        return String.format("Student: %s %s, %s",getFirsName(),getLastName(),getBestSubject());
    }
}
