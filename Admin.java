import java.util.ArrayList;

public class Admin extends User{
    private ArrayList<Employee> employees;
    public Admin(String imie, String nazwisko){
        super(imie, nazwisko);
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void removeEmployee(Employee employee){
        employees.remove(employee);
    }
}
