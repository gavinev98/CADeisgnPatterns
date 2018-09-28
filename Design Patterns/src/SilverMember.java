public class SilverMember implements Accounts {
    @Override
    public String AccountType() {
        return "Silver Member";
    }

    @Override
    public double subCount() {
        return 100000;
    }
}
