public class SavingsAccount extends Account {
    protected long minBalance;

    public SavingsAccount(String name, long minBalance) {
        super(name);
        this.minBalance = minBalance;
        balance = minBalance;
    }

    private int counterBonus; // счетчик начисления бонуса
    private int counterCashBack; // счетчик начисления кэшбэка

    @Override
    public boolean add(long amount) {
        boolean condition;
        int bonus = 500;
        if (amount > 0) {
            balance += amount;
            counterBonus++;
            condition = true;
        } else {
            condition = false;
        }
        if (counterBonus == 5) {
            balance += bonus;
            counterBonus = 0;
        }
        return condition;
    }

    @Override
    public boolean pay(long amount) {
        boolean condition;
        int cashBack = 100;
        if (amount > 0 && (balance - amount) >= minBalance)  {
            balance -= amount;
            counterCashBack++;
            condition = true;
        } else {
            condition = false;
        }
        if (counterCashBack == 5) {
            balance += cashBack;
            counterCashBack = 0;
        }
        return condition;
    }
}
