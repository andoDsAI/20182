public abstract class Account {
    private int id;
    private float balance;
    private float MIN_BALANCE;
    private float MONTHLY_FEE;

    public Account(int id, float balance) {
        this.id = id;
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    private void setBalance(float newBalance) {
        this.balance = newBalance;
    }

    public void withdraw(float amount) throws IllegalArgumentException {
        if (amount > 0) {
            if (this.balance - amount >= MIN_BALANCE) {
                setBalance(this.balance - amount);
            } else {
                throw new IllegalArgumentException("Remain balance is not enough");
            }
        } else {
            throw new IllegalArgumentException("Can not withdraw a Zero or Negative amount");
        }
    }

    public void deposit(float amount) throws IllegalArgumentException {
        if (amount > 0) {
            setBalance(this.balance + amount);
        } else {
            throw new IllegalArgumentException("Can not deposit a Zero or Negative amount");
        }
    }

    public void minus_fee() {
        this.setBalance(this.balance - this.MONTHLY_FEE);
    }

    protected void setMIN_BALANCE(float MIN_BALANCE) {
        this.MIN_BALANCE = MIN_BALANCE;
    }

    protected void setMONTHLY_FEE(float MONTHLY_FEE) {
        this.MONTHLY_FEE = MONTHLY_FEE;
    }
}
