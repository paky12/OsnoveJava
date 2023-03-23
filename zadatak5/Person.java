public class Person {
    private String name, surname, indeks;

    public Person(String name, String surname, String indeks){
        this.name = name;
        this.surname = surname;
        this.indeks = indeks;
    }

    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getIndeks(){
        return indeks;
    }
    public void setIndeks(String indeks){
        this.indeks = indeks;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String indeks){
        this.surname = surname;
    }
}

