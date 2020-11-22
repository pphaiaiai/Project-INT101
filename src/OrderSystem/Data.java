package OrderSystem;

public class Data {

    private int totalMoney;

    public void Data(int money) {
        this.totalMoney = money;
    }

    public int getRemainingAmount() {
        return totalMoney;
    }

    public void setRemainingAmount(int money) {
        this.totalMoney = money;
    }

    @Override
    public String toString() {
        return "Data{" + "totalMoney=" + totalMoney + '}';
    }

}
