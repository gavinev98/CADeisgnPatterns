public class GoldMember implements Accounts {
    @Override
    public String AccountType() {
        return "Gold Member";
    }

    @Override
    public double subCount() {
        return 1000000;
    }
}
