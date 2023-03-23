import java.util.ArrayList;

public class Evidencija {
    private ArrayList<Student> students = new ArrayList<>();

    //void zasto??
    public void addStudent(Student student) {
        students.add(student);
    }

    public Student findByIndeks(String indeks){
        for(Student student : students){
            if (student.getIndeks().equals(indeks)){
                return student;
            }
        }
        return null;
    }

    //Zasto mora ici void?
    public void printAllStudents(){
        for (Student student : students){
            System.out.println("\nName: "+ student.getName() + "\nSurname: " + student.getsurname() +
                                "\nYear: " + student.getYear() + "\nIndex: " + student.getIndeks());
        }
    }
}
