public class Employee extends User {
    private static int idCount = 1;
    private int employeeID;

    public Employee(String imie, String nazwisko, int employeeID){
        super(imie, nazwisko);
        this.employeeID = idCount++;
    }
}
