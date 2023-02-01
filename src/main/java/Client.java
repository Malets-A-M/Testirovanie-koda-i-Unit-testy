import java.util.Arrays;

public class Client {
    protected String name;
    protected Account[] accounts;
    protected int maxAccounts;


    public Client(String name, int maxAccounts){
        this.name = name;
        this.maxAccounts = maxAccounts;
        accounts = new Account[maxAccounts];
    }
    public void addAccount(Account account) {
        for (int i = 0; i < accounts.length; i++){
            if (accounts[i] == null) {
                accounts[i] = account;
                return;
            }
        }
        System.out.println("Мест для добавления нового счёта нет! :(");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        for (int i = 0; i < accounts.length; i++){
            System.out.println(accounts[i]);
            if (i == accounts.length - 1) {
                System.out.println("===============================");
            }
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(accounts);
    }

    public boolean pay(long amount) {
        for (Account account : accounts) {
            if (account.pay(amount)) {
                return true;
            }
        }
        return false;
    }

    public boolean addMoney(int numAccount, long amount) {
        if (numAccount < 0 && numAccount > maxAccounts) {
            System.out.println ("Неверный номер счета");
        }
        return accounts[numAccount].add (amount);
    }
}
