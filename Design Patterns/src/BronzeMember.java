public class BronzeMember implements Accounts {


    @Override
    public String AccountType() {
        return "Bronze Member";
    }

    @Override
    public double subCount() {
        return 100;
    }
}
