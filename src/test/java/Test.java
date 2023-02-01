import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class Test {


    @org.junit.jupiter.api.Test
    public void creditAccountPay(){
        Account user = new CreditAccount("Credit");
        boolean result = user.pay(-100);
        Assertions.assertFalse(result);
    }
    @org.junit.jupiter.api.Test
    public void creditAccountAdd(){
        Account user = new CreditAccount("Credit");
        boolean result = user.add(1000);
        Assertions.assertFalse(result);
    }
    @org.junit.jupiter.api.Test
    public void savingAccountPay(){
        Account user = new SavingsAccount("Save", 1000);
        boolean result = user.pay(100);
        Assertions.assertFalse(result);
    }
    @org.junit.jupiter.api.Test
    public void savingAccountAdd(){
        Account user = new SavingsAccount("Save", 1000);
        boolean result = user.add(1000);
        Assertions.assertTrue(result);
    }

}
