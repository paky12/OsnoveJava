import java.util.ArrayList;

public class Evidencija {
    private ArrayList<Person> people = new ArrayList<>();

    //void zasto??
    public void addPerson(Person person) {
        people.add(person);
    }

    public Person findByIndeks(String indeks){
        for(Person person : people){
            if (person.getIndeks().equals(indeks)){
                return person;
            }
        }
        return null;
    }

    //Zasto mora ici void?
    public void printAllStudents(){
        for (Person person : people){
            if(person instanceof Student){
                Student student = (Student) person;
                System.out.println("\nName: "+ student.getName()+ "\nSurname: " + student.getSurname() +
                        "\nYear: " + student.getYear() + "\nIndex: " + student.getIndeks());
            }
        }
    }
    public void addStudent(Student student){
        addPerson(student);
    }
    public void addProfesor(Profesor profesor){
        addPerson(profesor);
    }
}

