public class SavingAccount extends Account implements IInterested {
    private static final float WITHDRAW_FEE = (float) 0.0005;
    private static final float MIN_WITHDRAW_FEE = 20000;
    private static final float MIN_BALANCE = 100000;
    private static final float MONThLY_FEE = 20000;
    private static float INTERESTED_RATE = (float) 0.06;

    public SavingAccount(int id, float balance) {
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

    @Override
    public void withdraw(float amount) throws IllegalArgumentException {
        float fee = WITHDRAW_FEE * amount;
        if (fee > MIN_WITHDRAW_FEE) {
            super.withdraw(amount + WITHDRAW_FEE);
        } else {
            super.withdraw(amount + MIN_WITHDRAW_FEE);
        }
    }

    public static void setInterestedRate(float interestedRate) {
        INTERESTED_RATE = interestedRate;
    }
}
