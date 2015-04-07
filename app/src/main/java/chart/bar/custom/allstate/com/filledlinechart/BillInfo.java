package chart.bar.custom.allstate.com.filledlinechart;

/**
 * Created by ofaro on 4/7/2015.
 */
public class BillInfo {
    private int total;
    private int car1;
    private int car2;
    private int car3;
    private int car4;

    public BillInfo(int total, int car1, int car2, int car3) {
        this.total = total;
        this.car1 = car1;
        this.car2 = car2;
        this.car3 = car3;

    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCar1() {
        return car1;
    }

    public void setCar1(int car1) {
        this.car1 = car1;
    }

    public int getCar2() {
        return car2;
    }

    public void setCar2(int car2) {
        this.car2 = car2;
    }

    public int getCar3() {
        return car3;
    }

    public void setCar3(int car3) {
        this.car3 = car3;
    }

    public int getCar4() {
        return car4;
    }

    public void setCar4(int car4) {
        this.car4 = car4;
    }
}
