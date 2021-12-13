package Day11;

public class Picker<salary> implements Worker {

    private int salary;
    private static final int TASK_SALARY = 88;
    private Warehouse w;
    private boolean isPayed;

    public Picker(Warehouse w) {
        this.w = w;
    }

    public int getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    public void toString(int salary, boolean isPayed) {
        this.salary = salary;
        this.isPayed = isPayed;
    }

    public Picker(int salary, boolean isPayed) {
        this.salary = salary;
        this.isPayed = isPayed;
    }

    @Override
    public void doWork() {
        salary += TASK_SALARY;
        w.incrementPickedOrders();

    }

    @Override
    public void bonus() {
        if (w.getCountPickedOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
            return;
        }
        if (isPayed) {
            System.out.println("<Бонус уже был выплачен");
            return;
        }
        salary += 70000;
        isPayed = true;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

//    test
}
