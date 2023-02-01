public class Account {
    protected long balance;
    protected String name;

    public String toString(){
        return  "(" + name + ") Ваш баланс: " + balance;
    }

    public Account(String name) {
        this.name = name;
        this.balance = 0;
    }

    public boolean pay(long amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public boolean add(long amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }
}
