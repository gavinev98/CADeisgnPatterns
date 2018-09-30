public class GoldMember implements Accounts {
    @Override
    public String AccountType() {
        return "Gold Member";
    }

    @Override
    public double subCount() {
        return 1000000;
    }

    @Override
    public int numViews() {
        return 15000;
    }

    @Override
    public int numVids() {
        return 10;
    }

    @Override
    public double tenure() {
        return 12;
    }
}
