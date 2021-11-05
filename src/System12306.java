import java.util.Vector;

public class System12306 {
    private System12306(){};
    private static final System12306 system12306 = new System12306();
    public static System12306 getInstance() {
        return system12306;
    }

    // 线程安全使用 vector
    private Vector<Ticket> tickets = new Vector();

    {
        for (int i = 0; i < 100; i++) {
            tickets.add(new Ticket("北京" + i, "上海" + i, (float) (Math.random() * 100F)));
        }
    }

    public Ticket getTicket() {
     try {
         Ticket ticket = this.tickets.remove(0);
         return ticket;
     } catch (Exception e) {
         return null;
     }
    }
}
