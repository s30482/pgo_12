import java.lang.reflect.Array;
import java.util.ArrayList;

public class BankAccount implements AccountOperations{
    private int stanKonta;
    private ArrayList<Transaction> transakcje = new ArrayList<>();
    public BankAccount(int stanKonta){
        this.stanKonta = stanKonta;
    }
    @Override
    public int getStanKonta() {
        return stanKonta;
    }

    @Override
    public void wplata(int sumaWplaty){
        stanKonta += sumaWplaty;
        System.out.println("Wpłata dokonana, stan konta: " + stanKonta);
    }

@Override
    public void przelew(int sumaPrzel){
        if (sumaPrzel > stanKonta){
            throw new IllegalStateException("Kwota przelewu nie może być większa niż stan konta");
        } if(sumaPrzel <= 0){
            throw new IllegalStateException("Kwota pszelewu nie może być ujemna");
    }
        stanKonta -= sumaPrzel;
        System.out.println("Przelew dokonany, stan konta: " + stanKonta);
    }
}
