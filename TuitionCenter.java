import java.util.ArrayList;

public class TuitionCenter {
    private String address;
    private HeadMaster headMaster;
    private ArrayList<Tutor> tutors;
    private ArrayList<Student> students;

    public TuitionCenter(String address, HeadMaster headMaster) {
        this.address = address;
        this.headMaster = headMaster;
        this.tutors = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public String getAddress() {
        return address;
    }

    public HeadMaster getHeadMaster() {
        return headMaster;
    }

    public void addTutor(Tutor tutor) {
        if (tutor != null) {
            tutors.add(tutor);
        }
    }

    public void removeTutor(Tutor tutor) {
        if (tutor != null) {
            tutors.remove(tutor);
        }
    }

    public ArrayList<Tutor> getTutors() {
        return tutors;
    }

    public void addStudent(Student student) {
        if (student != null) {
            students.add(student);
        }
    }

    public void removeStudent(Student student) {
        if (student != null) {
            students.remove(student);
        }
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public int getNumStudents() {
        return students.size();
    }

    public int getNumTutors() {
        return tutors.size();
    }

    public double getAverageMarks() {
        double totalMarks = 0;
        int numStudents = students.size();
        for (Student student : students) {
            totalMarks += student.getAverageScore();
        }
        return totalMarks / numStudents;
    }
}