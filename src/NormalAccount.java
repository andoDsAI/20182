public class NormalAccount extends Account{
    private static final float WITHDRAW_FEE = 3000;
    private static final float MIN_BALANCE = 100000;
    private static final float MONThLY_FEE = 10000;

    public NormalAccount(int id, float balance) {
        super(id, balance);
        super.setMIN_BALANCE(MIN_BALANCE);
        super.setMONTHLY_FEE(MONThLY_FEE);
    }

    @Override
    public void withdraw(float amount) throws IllegalArgumentException {
        super.withdraw(amount + WITHDRAW_FEE);
    }
}
