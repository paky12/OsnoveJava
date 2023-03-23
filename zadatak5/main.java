import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Evidencija evidencija = new Evidencija();
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("----------------------------");
            System.out.println("1. Add new student");
            System.out.println("2. Search student by indeks");
            System.out.println("3. List all students");
            System.out.println("4. Exit program");

            int usr_input = input.nextInt();
            input.nextLine();

            switch (usr_input){
                case 1:
                    System.out.println("Enter name: ");
                    String name = input.nextLine();
                    System.out.println("Enter surname: ");
                    String surname = input.nextLine();
                    System.out.println("Enter year: ");
                    int year = input.nextInt();
                    input.nextLine();
                    System.out.println("Enter indeks ID: ");
                    String indeks = input.nextLine();

                    Student student = new Student(name, surname, indeks, year);
                    evidencija.addStudent(student);
                    break;
                case 2:
                    System.out.println("Enter indeks ID: ");
                    String search_indeks = input.nextLine();

                    Student findStudent = evidencija.findByIndeks(search_indeks);
                    if (findStudent == null){
                        System.out.println("Student with index number " + search_indeks + " doesn't exist in system!");
                    }else{
                        System.out.println("\nName: " + findStudent.getName() + "\nSurname: " + findStudent.getsurname() +
                                            "\nYear: " + findStudent.getYear() + "\nIndeks ID: " + findStudent.getIndeks());
                    }
                    break;
                case 3:
                    evidencija.printAllStudents();
                    break;
                case 4:
                    System.out.println("Exiting the program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, chose between 1 and 4");
            }
        }

    }
}

