public class SilverMember implements Accounts {
    @Override
    public String AccountType() {
        return "Silver Member";
    }

    @Override
    public double subCount() {
        return 100000;
    }

    @Override
    public int numViews() {
        return 1000;
    }

    @Override
    public int numVids() {
        return 1020;
    }

    @Override
    public double tenure() {
        return 2;
    }
}
