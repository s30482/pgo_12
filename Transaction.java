public class Transaction {
    private int kwotaTransakcji;
    private BankAccount kontoWyjscia;
    private BankAccount kontoWejscia;

    public Transaction(int kwotaTransakcji, BankAccount kontoWyjscia, BankAccount kontoWejscia) {
        this.kwotaTransakcji = kwotaTransakcji;
        this.kontoWyjscia = kontoWyjscia;
        this.kontoWejscia = kontoWejscia;
    }

    public int getKwotaTransakcji() {
        return kwotaTransakcji;
    }

    public BankAccount getKontoWyjscia() {
        return kontoWyjscia;
    }

    public BankAccount getKontoWejscia() {
        return kontoWejscia;
    }
}
