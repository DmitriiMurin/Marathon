package Day11;

public class Courier implements Worker {
    private int salary;
    private static final int TASK_SALARY = 100;
    private Warehouse w;
    private boolean isPayed;

    public Courier(Warehouse w) {
        this.w = w;
    }

    @Override
    public void doWork() {
        salary += TASK_SALARY;
        w.incrementDeliveredOrders();

    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void bonus() {
        if (w.getCountDeliveredOrders() < 10_000) {
            System.out.println("Бонус пока не доступен");
            return;
        }
        else if (isPayed) {
            System.out.println("<Бонус уже был выплачен");
            return;
        }
        salary += 50000;
        isPayed = true;

    }

//    public int getSalary() {
//        return salary;
//    }
//
//    public int getIsPayed() {
//        return isPayed;
//    }
//    public void toString(int salary, int isPayed){
//        this.salary = salary;
//        this.isPayed = isPayed;
//    }
//    public Courier(int salary, int isPayed){
//        this.salary = salary;
//        this.isPayed = isPayed;
//    }
}
