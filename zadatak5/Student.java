public class Student extends Person{
    private int year;

    //konstruktor
    public Student(String name, String surname,String indeks,int year){
        super(name,surname,indeks);
        this.year = year;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
}

