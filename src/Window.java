public class Window extends Thread{
    private String windowName;
    public Window(String windowName) {
        this.windowName = windowName;
    }

    public void run() {
        this.sellTicket();
    }

    private void sellTicket() {
        for(;;) {
            System12306 system12306 = System12306.getInstance();
            Ticket ticket = system12306.getTicket();
            if(ticket == null) {
                System.out.println("对不起" + windowName + "窗口车票已售完");
                break;
            }
            System.out.println("从" + windowName + "售出：" + ticket);
        }
    }
}
