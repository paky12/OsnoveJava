public class Student {
    private String name, surname, indeks;
    private int year;

    //konstruktor
    public Student(String name, String surname,String indeks,int year){
        this.name = name;
        this.surname = surname;
        this.indeks = indeks;
        this.year = year;
    }

    //Geteri
    public String getName() { return name; }
    public String getsurname() { return surname; }

    public String getIndeks() { return indeks; }

    public int getYear() { return year; }

    //Seteri
    public void setName(String name) { this.name = name; }

    public void setsurname(String surname) { this.surname = surname; }

    public void setIndeks(String indeks) {
        this.indeks = indeks;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
