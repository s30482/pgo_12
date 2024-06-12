public class Client extends User{
    private BankAccount konto;
    private static int clientIDcount = 1;
    private int cliendID;
    public Client(String imie, String nazwisko, BankAccount konto, int clientID){
        super(imie,nazwisko);
        this.konto = konto;
        this.cliendID = clientIDcount++;
    }
}
