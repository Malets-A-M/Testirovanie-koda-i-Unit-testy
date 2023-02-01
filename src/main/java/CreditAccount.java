public class CreditAccount extends Account {
    public CreditAccount(String name) {
        super(name);
    }

    @Override
    public boolean pay(long amount) {
        boolean condition;
        if (amount > 0) {
            balance -= amount;
            condition = true;
        } else {
            condition = false;
        }
        return condition;
    }

    @Override
    public boolean add(long amount) {
        boolean condition;
        if (amount > 0 && (balance + amount) <= 0) {
            balance += amount;
            condition = true;
        } else {
            condition = false;
        }
        return condition;
    }

}
