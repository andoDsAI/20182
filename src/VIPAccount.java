public class VIPAccount extends Account implements IInterested {
    private static final float MIN_BALANCE = 500000;
    private static final float MONThLY_FEE = 50000;
    private static final float INTERESTED_RATE = (float) 0.02;

    public VIPAccount(int id, float balance) {
        super(id, balance);
        super.setMIN_BALANCE(MIN_BALANCE);
        super.setMONTHLY_FEE(MONThLY_FEE);
    }

    @Override
    public float getInterested(float interested_rate) {
        return this.getBalance() * interested_rate;
    }

    public void interested() throws IllegalArgumentException {
        float amount = this.getInterested(INTERESTED_RATE);
        super.deposit(amount);
    }
}
