public class Main {
    public static void main(String[] args) {
        Client user = new Client("Степан", 5);
        user.addAccount (new CheckingAccount("Зарплатный"));
        user.addMoney (0,100_000);
        user.addAccount (new SavingsAccount("Накопительный", 50_000));
        user.addMoney (1,20000);
        user.addAccount (new CreditAccount("Расточительный"));
        user.addAccount (new CheckingAccount("1"));
        user.addAccount (new CheckingAccount("2"));
        user.addAccount (new CheckingAccount("3"));
        user.addAccount (new CheckingAccount("4"));
        user.addAccount (new CheckingAccount("5"));
        user.print();
        user.pay(500_000);
        user.print();
        user.pay(88_889);
        user.print();
        user.pay(20_000);
        user.print();

    }
}