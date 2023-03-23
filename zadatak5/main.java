import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Evidencija evidencija = new Evidencija();
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("----------------------------");
            System.out.println("1. Add new student");
            System.out.println("2. Search by indeks ID");
            System.out.println("3. List all students");
            System.out.println("4. Add new profesor");
            System.out.println("5. Exit program");

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
                    evidencija.addPerson(student);
                    break;
                case 2:
                    System.out.println("Enter indeks ID: ");
                    String searchIndeks = input.nextLine();

                    Person findPerson = evidencija.findByIndeks(searchIndeks);
                    if (findPerson == null){
                        System.out.println("Person with index number " + searchIndeks + " doesn't exist in system!");
                    }else if(findPerson instanceof Student){
                        System.out.println("\nName: " + findPerson.getName() + "\nSurname: " + findPerson.getSurname() +
                                            "\nYear: " + ((Student) findPerson).getYear() + "\nIndeks ID: " + findPerson.getIndeks());
                    }else {
                        System.out.println("\nName: " + findPerson.getName() + "\nSurname: " + findPerson.getSurname() +
                                            "\nDepartment: " + ((Profesor) findPerson).getDepartment() + "\nIndeks ID: " + findPerson.getIndeks());
                    }
                    break;
                case 3:
                    evidencija.printAllStudents();
                    break;
                case 4:
                    System.out.println("Enter name: ");
                    String name_p = input.nextLine();
                    System.out.println("Enter surname: ");
                    String surname_p = input.nextLine();
                    System.out.println("Enter department: ");
                    String department = input.nextLine();
                    System.out.println("Enter indeks ID: ");
                    String indeks_p = input.nextLine();

                    Profesor profesor = new Profesor(name_p, surname_p, indeks_p, department);
                    evidencija.addPerson(profesor);
                    break;
                case 5:
                    System.out.println("Exiting the program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, chose between 1 and 5");
            }
        }
    }
}
