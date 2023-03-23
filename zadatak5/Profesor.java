public class Profesor extends Person{
    private String department;

    public Profesor(String name, String surname, String indeks, String department){
        super(name,surname,indeks);
        this.department = department;
    }

    public String getDepartment(){
        return department;
    }
    public void setDepartment(String setDepartment){
        this.department = department;
    }
}

