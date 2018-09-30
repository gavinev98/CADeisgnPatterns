public class BronzeMember implements Accounts {


    @Override
    public String AccountType() {
        return "Bronze Member";
    }

    @Override
    public double subCount() {
        return 100;
    }

    @Override
    public int numViews() {
        return 343;
    }

    @Override
    public int numVids() {
        return 32;
    }

    @Override
    public double tenure() {
        return 3;
    }
}
